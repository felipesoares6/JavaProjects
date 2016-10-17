
import model.*;


/**
 *
 * @author felipesoares
 */
public class Aplic {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Felipe", "43432");
        Aluno aluno2 = new Aluno("Luiz", "42222");
        
        Professor professor = new Professor("Ronaldo", "2321");
        Curso curso = new Curso("ADS", "Analise e Desenvolvimento de Sistemas", "666");
        Turma turma = new Turma("D12", 51);
        
        aluno.setEscolaridade(10);
        aluno2.setEscolaridade(6);
        aluno.setTurma(turma);
        aluno2.setTurma(turma);
        
        professor.setTurma(turma);
        
        curso.setTurma(turma);
        
        turma.setProfessor(professor);
        turma.setCurso(curso);
        turma.addAluno(aluno);
        turma.addAluno(aluno2);
        
        turma.listarAlunos();
        
        
        
        
    }
    
}
