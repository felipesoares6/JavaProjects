package fatec.poo.model;

/**
 *
 * @author felipesoares
 */
public class Departamento {
    private String Sigla;
    private String nome;

    public Departamento(String Sigla, String nome) {
        this.Sigla = Sigla;
        this.nome = nome;
    }

    public String getSigla() {
        return Sigla;
    }

    public String getNome() {
        return nome;
    }
    
    
    
    
}
