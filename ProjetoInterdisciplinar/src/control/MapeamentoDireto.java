package control;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.*;

public class MapeamentoDireto {

    private GerenciamentoCache cache;
    private GerenciamentoPrincipal principal;
    private List<Instrucao> cpu;
    private String dado = "11111111111111111111111111111111";
    private double hit, miss, acerto = 0;
    private int tag, linha, bloco;

    public MapeamentoDireto(String path) {
        lerConfiguracoes(path);
        this.cache = new GerenciamentoCache(this.tag, this.linha, this.bloco);
        this.principal = new GerenciamentoPrincipal();
        this.cpu = new ArrayList<>();
    }

    public void lerConfiguracoes(String path) {
        FileReader arq = null;
        try {
            arq = new FileReader(path);
            BufferedReader lerArq = new BufferedReader(arq);
            String linha = lerArq.readLine();
            String[] auxiliar = linha.split("=");
            String memoria = auxiliar[1].trim();
            linha = lerArq.readLine();
            auxiliar = linha.split("=");
            String memoriaSize = auxiliar[1].trim();
            linha = lerArq.readLine();
            auxiliar = linha.split("=");
            String cache = auxiliar[1].trim();
            linha = lerArq.readLine();
            auxiliar = linha.split("=");
            String cacheSize = auxiliar[1].trim();
            linha = lerArq.readLine();
            auxiliar = linha.split("=");
            String bloco = auxiliar[1].trim();
            linha = lerArq.readLine();
            auxiliar = linha.split("=");
            String blocoSize = auxiliar[1].trim();
            executarCalculos(memoria, memoriaSize, cache, cacheSize, bloco, blocoSize);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(MapeamentoDireto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MapeamentoDireto.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                arq.close();
            } catch (IOException ex) {
                Logger.getLogger(MapeamentoDireto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void executarCalculos(String memoria, String memoriaSize, String cacheS, String cacheSize, String blocoS, String blocoSize) {
            double ram = Integer.parseInt(memoria)*retornaValor(memoriaSize);
            double cache = Integer.parseInt(cacheS)*retornaValor(cacheSize);
            double bloco = Integer.parseInt(blocoS)*retornaValor(blocoSize);
            this.tag = (int) bits(ram/cache);
            this.linha = (int) bits(cache);
            this.bloco = (int) bits(bloco);
            System.out.println("TAG: "+ this.tag);
            System.out.println("LINHA: "+ this.linha);
            System.out.println("BLOCO: "+this.bloco);
            
    }

    public double bits(double valor){
        System.out.println("Chegou o valor: "+valor);
        double potencia = 1;
        double auxiliar = 1;
        while(auxiliar != valor){
            if(auxiliar < valor){
                potencia++;
                auxiliar = Math.pow(2, potencia);
            }
            else{
                System.out.println("Não eh uma potencia de 2 bla");
                return 0;
            }
        }
        
        return potencia;
    }
    
    public long retornaValor(String valor) {
        switch (valor) {
            case "KB":
                return 1024;
            case "MB":
                return 1048576;
            case "GB":
                return 1073741824;
        }
        return 0;
    }

    public int getTag() {
        return this.cache.getTag();
    }

    public int getLinha() {
        return this.cache.getLinha();
    }

    public int getBloco() {
        return this.cache.getBloco();
    }

    public void imprimeCpu() {
        System.out.println("CPU:");
        for (Instrucao i : this.cpu) {
            System.out.println("" + i.getOperacao() + " - " + i.getEndereco());
        }
    }

    public void mapeamento() {
        Iterator<Instrucao> iterator = this.cpu.iterator();
        while(iterator.hasNext()) {
            Instrucao i = iterator.next(); //se quiser usar a iteração atual
            if (i.getOperacao().compareToIgnoreCase("S") == 0) {
                System.out.println("STORE");
                this.cache.addCache(i.getEndereco(), dado);
                this.principal.addPrincipal(i.getEndereco(), dado);
            } else {

                System.out.println("LOAD");
                try {
                    String dado = this.cache.procuraCache(i.getEndereco());
                    System.out.println("Cache HIT: " + dado);
                    hit++;
                } catch (CacheException e) {
                    System.out.println(e.getMessage());
                    miss++;
                    try {
                        this.cache.addCache(i.getEndereco(),
                                this.principal.getPrincipal(i.getEndereco()).getDado());
                    } catch (PrincipalException ex) {
                        Logger.getLogger(MapeamentoDireto.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    System.out.println("Inseriu na cache " + i.getEndereco());
                }
            }
        }
        double acerto = (hit / (hit + miss)) * 100.0;
        System.out.println("HIT: " + String.valueOf(hit));
        System.out.println("MISS: " + String.valueOf(miss));
        System.out.println("PERCENTUAL DE ACERTO: " + String.valueOf(acerto));
    
    }

    public double getHit() {
        return this.hit;
    }

    public double getMiss() {
        return this.miss;
    }

    public String executarInstrucao() throws CPUException {
        if (quantidadeCPU() > 0) {
            Instrucao i = this.cpu.remove(0);
            if (i.getOperacao().compareToIgnoreCase("S") == 0) {
                System.out.println("STORE");
                this.cache.addCache(i.getEndereco(), dado);
                this.principal.addPrincipal(i.getEndereco(), dado);
            } else {

                System.out.println("LOAD");
                try {
                    String dado = this.cache.procuraCache(i.getEndereco());
                    System.out.println("Cache HIT: " + dado);
                    hit++;
                    return "HIT";
                } catch (CacheException e) {
                    System.out.println(e.getMessage());
                    miss++;
                    try {
                        this.cache.addCache(i.getEndereco(),
                                this.principal.getPrincipal(i.getEndereco()).getDado());
                    } catch (PrincipalException ex) {
                        Logger.getLogger(MapeamentoDireto.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    System.out.println("Inseriu na cache " + i.getEndereco());
                    return "MISS";
                }
            }
        } else {
            throw new CPUException();
        }

//        double acerto = (hit/(hit+miss))*100.0;
//        System.out.println("HIT: "+String.valueOf(hit));
//        System.out.println("MISS: "+String.valueOf(miss));
//        System.out.println("PERCENTUAL DE ACERTO: "+String.valueOf(acerto));
        return "STORE";
    }

    public int quantidadeCPU() {
        return this.cpu.size();
    }

    public void addCpu(String operacao, String endereco) {
        System.out.println("Chamou o add CPU");
        Instrucao instrucao = new Instrucao(operacao, endereco);
        this.cpu.add(instrucao);
    }

    public void addPrincipal(String linha, String dado) {
        MemoriaPrincipal memoria = new MemoriaPrincipal(linha, dado);
        this.principal.addPrincipal(linha, memoria);
    }

    public void addPrincipal(String path) {
        FileReader arq = null;
        try {
            arq = new FileReader(path);
            BufferedReader lerArq = new BufferedReader(arq);
            String linha = lerArq.readLine();
            while (linha != null) {
                String[] auxiliar = linha.split("\t");
                MemoriaPrincipal dado = new MemoriaPrincipal(auxiliar[0].trim(), auxiliar[1].trim());
                this.principal.addPrincipal(dado.getLinha(), dado);
                linha = lerArq.readLine();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MapeamentoDireto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MapeamentoDireto.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                arq.close();
            } catch (IOException ex) {
                Logger.getLogger(MapeamentoDireto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void addCpu(String path) {
        FileReader arq = null;
        try {
            arq = new FileReader(path);
            BufferedReader lerArq = new BufferedReader(arq);
            String linha = lerArq.readLine();
            while (linha != null) {
                String[] auxiliar = linha.split("\t");
                Instrucao dado = new Instrucao(auxiliar[0].trim(), auxiliar[1].trim());
                this.cpu.add(dado);
                linha = lerArq.readLine();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MapeamentoDireto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MapeamentoDireto.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                arq.close();
            } catch (IOException ex) {
                Logger.getLogger(MapeamentoDireto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Chamou o addCpu");
    }

    public List<Instrucao> getCpu() {
        ArrayList<String> cpuImprimivel = new ArrayList<>();
        for (Instrucao i : cpu) {
            cpuImprimivel.add(i.getOperacao() + i.getEndereco());
        }
        return this.cpu;
    }

    public Instrucao getProximaInstrucao(int i) throws InstrucaoException {
        if (this.cpu.size() > 0) {
            return this.cpu.get(i);
        } else {
            throw new InstrucaoException();
        }
    }

    public List<MemoriaPrincipal> getRAM() {
        return this.principal.imprimePrincipalDesign();
    }

    public List<MemoriaCache> getCache() {
        return this.cache.imprimeCacheDesign();
    }

    public double getPorcentagem() {

        return ((this.hit) / (this.miss + this.hit) * 100);
    }
}
