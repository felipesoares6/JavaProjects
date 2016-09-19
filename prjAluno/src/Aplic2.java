
import java.util.Scanner;


/**
 *
 * @author felipesoares
 */
public class Aplic2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Aluno MatAluno[] = new Aluno[4];
        int cont;
        
        for(cont=0; cont< MatAluno.length; cont++){
            
            MatAluno[cont] = new Aluno();
            
            System.out.println("Digite o RA: ");
            MatAluno[cont].setRa(entrada.nextInt());
            System.out.println("Digite a nota da prova 1");
            MatAluno[cont].setNtPrv1(entrada.nextDouble());
            System.out.println("Digite a nota da prova 2");
            MatAluno[cont].setNtPrv2(entrada.nextDouble());
            System.out.println("Digite a nota do trabalho 1");
            MatAluno[cont].setNtTrab1(entrada.nextDouble());
            System.out.println("Digite a nota do trabalho 2");
            MatAluno[cont].setNtTrab2(entrada.nextDouble());
            
        }
        
        for(cont=0; cont< MatAluno.length; cont++){
            System.out.println("Aluno " + cont+1);
            System.out.println("RA: " + MatAluno[cont].getRa());
            System.out.println("A media de prova: " + MatAluno[cont].calcMediaProva());
            System.out.println("A media de trabalho: " + MatAluno[cont].calcMediaProva());
            System.out.println("A media final: " + MatAluno[cont].calcMediaFinal());
            if(MatAluno[cont].isAprovado())
                System.out.println("O aluno foi aprovado");
            else
                System.out.println("O aluno foi reprovado");
        }
    }
    
}
