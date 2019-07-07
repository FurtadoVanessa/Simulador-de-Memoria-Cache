package control;

import java.util.HashMap;
import java.util.Map;
import model.*;

public class GerenciamentoPrincipal {
    
    HashMap<String, MemoriaPrincipal> principal;
    
    public GerenciamentoPrincipal(){
        this.principal = new HashMap<String, MemoriaPrincipal>();
    }
    
    public MemoriaPrincipal getPrincipal(String linha) throws PrincipalException{
        MemoriaPrincipal auxiliar = this.principal.get(linha);
        if(auxiliar == null){
            throw new PrincipalException();
        }
        else{
            return auxiliar;
        }
    }
    
    
    public void addPrincipal(String linha, MemoriaPrincipal dado){
        this.principal.put(linha, dado);
    }
    
    public void addPrincipal(String linha, String dado){
        this.principal.put(linha, new MemoriaPrincipal(linha, dado));
        System.out.println("Adicionou na principal na linha "+linha+" o dado "+dado);
    }
    
    public HashMap<String, MemoriaPrincipal> imprimePrincipal(){
        System.out.println("Memoria Principal:");
        this.principal.entrySet().forEach((entry) -> {
            String key = entry.getKey();
            MemoriaPrincipal value = entry.getValue();
            System.out.println(key+" : "+value.getDado());
        });
     return this.principal;   
    }
}
