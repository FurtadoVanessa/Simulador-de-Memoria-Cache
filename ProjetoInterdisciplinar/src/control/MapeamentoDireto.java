
package control;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.*;

public class MapeamentoDireto {
    
    GerenciamentoCache cache;
    GerenciamentoPrincipal principal;
    List<Instrucao> cpu;
    private String dado = "11111111111111111111111111111111";
    
    
    public MapeamentoDireto(){
        this.cache = new GerenciamentoCache(6, 14, 0);
        this.principal = new GerenciamentoPrincipal();
        this.cpu = new ArrayList<>();
    }
    
    
    public void imprimeCpu(){
        System.out.println("CPU:");
        for(Instrucao i : this.cpu){
            System.out.println(""+i.getOperacao()+" - "+i.getEndereco());
        }
    }
    
    
    public void mapeamento(){
        double hit=0, miss =0;
        for(Instrucao i : this.cpu){
            
            if(i.getOperacao().compareToIgnoreCase("S")==0){
                System.out.println("STORE");
                this.cache.addCache(i.getEndereco(), dado);
                this.principal.addPrincipal(i.getEndereco(), dado);
            }else{
                
                System.out.println("LOAD");
                try{
                    String dado = this.cache.procuraCache(i.getEndereco());
                    System.out.println("Cache HIT: "+dado);
                    hit++;
                }   
                catch(CacheException e){
                    System.out.println(e.getMessage());
                    miss++;
                    try {
                        this.cache.addCache(i.getEndereco(),
                                this.principal.getPrincipal(i.getEndereco()).getDado());
                    } catch (PrincipalException ex) {
                        Logger.getLogger(MapeamentoDireto.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    System.out.println("Inseriu na cache "+i.getEndereco());
                }
            }
        }
        double acerto = (hit/(hit+miss))*100.0;
        System.out.println("HIT: "+String.valueOf(hit));
        System.out.println("MISS: "+String.valueOf(miss));
        System.out.println("PERCENTUAL DE ACERTO: "+String.valueOf(acerto));
    }
    
    
    public void addCpu(String operacao, String endereco){
        Instrucao instrucao = new Instrucao(operacao, endereco);
        this.cpu.add(instrucao);
    }
    
    public void addPrincipal(String linha, String dado){
        MemoriaPrincipal memoria = new MemoriaPrincipal(linha, dado);
        this.principal.addPrincipal(linha, memoria);
    }
    
    public void addPrincipal(String path){
       FileReader arq = null;
        try {
            arq = new FileReader(path);
            BufferedReader lerArq = new BufferedReader(arq);
            String linha = lerArq.readLine();
            while(linha!=null){
                String[] auxiliar = linha.split(" ");
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
    
    public void addCpu(String path){
       FileReader arq = null;
        try {
            arq = new FileReader(path);
            BufferedReader lerArq = new BufferedReader(arq);
            String linha = lerArq.readLine();
            while(linha!=null){
                String[] auxiliar = linha.split(" ");
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
    }
}
