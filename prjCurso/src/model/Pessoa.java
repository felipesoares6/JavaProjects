package model;

/**
 *
 * @author felipesoares
 */
public class Pessoa {

    private String nome;
    private String dtNascimento;
    private String endereco;
    private String cidade;
    
    Pessoa (String nome) {
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getCidade(){
        return cidade;
    }
    
    public String getDtNascimento(){
        return dtNascimento;
    }
    
    public String getEndereco(){
        return endereco;
    }
    
}
