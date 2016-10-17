
package model;

/**
 *
 * @author felipesoares
 */
public class Aluno extends Pessoa {

    private String ra;
    private int escolaridade;
    private Turma turma;
    
    Aluno(String ra, String nome){
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
    
    
}
