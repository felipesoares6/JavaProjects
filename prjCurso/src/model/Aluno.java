
package model;

/**
 *
 * @author felipesoares
 */
public class Aluno extends Pessoa {

    private String ra;
    private int escolaridade;
    private Turma turma;
    
    public Aluno(String nome, String ra){
        super(nome);
        this.ra = ra;
    }
    
    public void setTurma(Turma turma){
        this.turma = turma;
    }
    
    public Turma getTurma(){
       return turma;
    }

    public String getRa() {
        return ra;
    }

    public int getEscolaridade() {
        return escolaridade;
    }
    
    public void setEscolaridade(int escolaridade) {
        this.escolaridade =  escolaridade;
    }
    
    
}
