package model;

public class Instrucao {
    
    private String operacao;
    private String endereco;
    
    public Instrucao(){}
    
    public Instrucao(String operacao, String endereco){
    
        this.endereco = endereco;
        this.operacao = operacao;
    
    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    
    
}
