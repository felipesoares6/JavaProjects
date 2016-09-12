
import java.util.Scanner;


/**
 *
 * @author felipesoares
 */
public class Aplic2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Aluno MatAluno[] = new Aluno[4];
        int ra, cont;
        double prv1, prv2, trab1, trab2; 
        
        for(cont=0; cont< MatAluno.length; cont++){
            System.out.println("Digite o RA: ");
            ra = entrada.nextInt();
            System.out.println("Digite a nota da prova 1");
            prv1 = entrada.nextDouble();
            System.out.println("Digite a nota da prova 2");
            prv2 = entrada.nextDouble();
            System.out.println("Digite a nota do trabalho 1");
            trab1 = entrada.nextDouble();
            System.out.println("Digite a nota do trabalho 2");
            trab2 = entrada.nextDouble();
            
            MatAluno[cont] = new Aluno();
            
            MatAluno[cont].setNtPrv1(prv1);
            MatAluno[cont].setNtPrv2(prv2);
            MatAluno[cont].setNtTrab1(trab1);
            MatAluno[cont].setNtTrab2(trab2);
        }
        
        for(cont=0; cont< MatAluno.length; cont++){
            System.out.println("Aluno " + cont+1);
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
