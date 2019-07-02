package model;

public class MemoriaCache {
    
    private String tag;
    private String linha;
    private String bloco;
    private String dado;
    
    
    
    public MemoriaCache(String tag, String linha, String bloco, String dado){
        this.tag = tag;
        this.linha = linha;
        this.bloco = bloco;
        this.dado = dado;
    }
    
    public MemoriaCache(){}

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getLinha() {
        return linha;
    }

    public void setLinha(String linha) {
        this.linha = linha;
    }

    public String getBloco() {
        return bloco;
    }

    public void setBloco(String bloco) {
        this.bloco = bloco;
    }

    public String getDado() {
        return dado;
    }

    public void setDado(String dado) {
        this.dado = dado;
    }
}
