
package model;

/**
 *
 * @author felipesoares
 */
public class Curso {

    private String sigla;
    private String descricao;
    private String cargaHoraria;
    private Turma turma;
    
    Curso(String sigla, String descricao, String cargaHoraria){
        this.sigla = sigla;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
    

    public String getSigla() {
        return sigla;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getCargaHoraria() {
        return cargaHoraria;
    }
    
    
}
