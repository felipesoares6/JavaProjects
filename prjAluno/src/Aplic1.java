
import java.util.Scanner;

/**
 *
 * @author felipesoares
 */
public class Aplic1 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        Aluno objAluno;
        objAluno = new Aluno();
        
        int Ra;
        double NtPrv1, NtPrv2;
        double NtTrab1, NtTrab2;
        
        System.out.println("Digite o RA do aluno: ");
        Ra = entrada.nextInt();
        System.out.println("Digite a nota da 1a prova do aluno: ");
        NtPrv1 = entrada.nextDouble();
        System.out.println("Digite a nota da 2a prova do aluno: ");
        NtPrv2 = entrada.nextDouble();
        System.out.println("Digite a nota da 1o trabalho do aluno: ");
        NtTrab1 = entrada.nextDouble();
        System.out.println("Digite a nota da 2o trabalho do aluno: ");
        NtTrab2 = entrada.nextDouble();
        
        
        objAluno.setRa(Ra);
        objAluno.setNtPrv1(NtPrv1);
        objAluno.setNtPrv2(NtPrv2);
        objAluno.setNtTrab1(NtTrab1);
        objAluno.setNtTrab2(NtTrab2);
        
        System.out.println("A media das provas é: " + objAluno.calcMediaProva());
        System.out.println("A media dos trabalhos é: " + objAluno.calcMediaTrab());
        System.out.println("A media final é: " + objAluno.calcMediaFinal());
        
        if(objAluno.isAprovado()){
            System.out.println("Situação: Aprovado!");
        }else{
            System.out.println("Situação: Reprovado!");
        }
        
        
    }
    
}
