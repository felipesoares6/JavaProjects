
package model;

/**
 *
 * @author felipesoares
 */
public class Professor extends Pessoa{

    private String regFunc;
    private int titularidade;
    private int areaAtuacao;
    private Turma turma;
    
    Professor(String regFunc, String nome){
        super(nome);
        this.regFunc = regFunc;
    }
    
    public void setTurma(Turma turma){
        this.turma = turma;
    }
    
    public Turma getTurma(){
        return turma;
    }

    public String getRegFunc() {
        return regFunc;
    }

    public int getTitularidade() {
        return titularidade;
    }

    public int getAreaAtuacao() {
        return areaAtuacao;
    }
    
    
}
