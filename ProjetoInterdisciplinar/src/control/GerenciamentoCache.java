package control;

import java.util.HashMap;
import java.util.Map;
import model.*;

public class GerenciamentoCache {
    
    private int tagTamanho;
    private int linhaTamanho;
    private int blocoTamanho;
    private HashMap<String, MemoriaCache> cache;
    
    public GerenciamentoCache(int tag, int linha, int bloco){
        this.tagTamanho = tag;
        this.linhaTamanho = linha;
        this.blocoTamanho = bloco;
        this.cache = new HashMap<>();
    }
    
    public String procuraCache(String endereco) throws CacheException{
        String tag = endereco.substring(0, tagTamanho);
        String linha = endereco.substring(tagTamanho, tagTamanho+linhaTamanho);
        String bloco = endereco.substring(tagTamanho+linhaTamanho);
        
        System.out.println("A Tag do endereco eh "+tag);
        System.out.println("A Linha do endereco eh "+linha);
        System.out.println("O bloco do endereco eh "+bloco);
        
        MemoriaCache cacheAuxiliar = new MemoriaCache();
        cacheAuxiliar = this.cache.get(linha);
        if(this.cache.get(linha) != null){
        if(cacheAuxiliar.getTag().compareTo(tag)==0){
            return cacheAuxiliar.getDado();
        }
        else{
            throw new CacheException();
            
        }
        }else{
            throw new CacheException();
        }
    }    
        public void addCache(String endereco, String dado){
        MemoriaCache auxiliar = new MemoriaCache(endereco.substring(0, tagTamanho), 
        endereco.substring(tagTamanho, tagTamanho+linhaTamanho),
        endereco.substring(tagTamanho+linhaTamanho), dado);
        this.cache.put(auxiliar.getLinha(), auxiliar);
        System.out.println("Inseriu na Cache no endereco   " +endereco+" o valor  "+dado);
    }
        
        
        public void imprimeCache(){
                    for(Map.Entry<String, MemoriaCache> entry : this.cache.entrySet()) {
                String key = entry.getKey();
                MemoriaCache value = entry.getValue();
                System.out.println(value.getTag()+" - "+key+" : "+value.getBloco()+"  ->  "+value.getDado());
        }
        }
        
    
    
}
