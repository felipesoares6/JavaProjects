
package model;

/**
 *
 * @author felipesoares
 */
public class Turma {

   private String turma;
   private int qtdeVagas;
   private int numAlu;
   private Curso curso;
   private Professor professor;
   private Aluno[] alunos;
   
   public Turma(String turma, int qtdeVagas){
       this.turma = turma;
       this.qtdeVagas = qtdeVagas;
       alunos = new Aluno[2];
   }

    public String getTurma() {
        return turma;
    }

    
    public int getQtdeVagas() {
        return qtdeVagas;
    }

    
    public int getNumAlu() {
        return numAlu;
    }

    public void setNumAlu(int numAlu) {
        this.numAlu = numAlu;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void addAluno(Aluno aluno){
        alunos[numAlu++] = aluno;
    }
    
    public void listarAlunos(){
        System.out.println("Lista de Frequência");
        System.out.print("Sigla do Curso: \t" + curso.getSigla());
        System.out.println("\t\t Nome do Curso: \t" + curso.getDescricao());
        System.out.println("Sigla Turma: \t" + turma);
        System.out.println("Nome do Professor: \t" + professor.getNome());
        
        System.out.println("\n\t\t Alunos\n");
        
        for(int i=0; i<numAlu; i++){
            System.out.print( (i+1) + " - ");
            System.out.println(alunos[i].getNome() + "\tRA:" + alunos[i].getRa()+ "\tEscolaridade:" + alunos[i].getEscolaridade());
            
        }
    }
   
}
