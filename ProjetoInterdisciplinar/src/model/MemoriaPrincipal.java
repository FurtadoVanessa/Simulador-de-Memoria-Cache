package model;

public class MemoriaPrincipal {
    
    private String linha;
    private String dado;
    
    public MemoriaPrincipal(){}

    public MemoriaPrincipal(String linha, String dado){
        this.dado = dado;
        this.linha = linha;
    
    }
    
    public String getLinha() {
        return linha;
    }

    public void setLinha(String linha) {
        this.linha = linha;
    }

    public String getDado() {
        return dado;
    }

    public void setDado(String dado) {
        this.dado = dado;
    }
   
}
