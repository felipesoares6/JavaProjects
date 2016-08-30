
import java.util.Scanner;


/**
 *
 * @author felipesoares
 */
public class Aplic1 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        ContaTelefonica objContaTelefonica;
        objContaTelefonica = new ContaTelefonica();
        
        int Numero;
        int Tipo;
        int QtdePulsos;
        int QtdeInter;
        int QtdeServDesp;
        
        System.out.println("Digite o Numero do telefone: ");
        Numero = entrada.nextInt();
        System.out.println("Digite o tipo: 1- Residencial 2- Comercial ");
        Tipo = entrada.nextInt();
        System.out.println("Digte a quantidade de pulsos: ");
        QtdePulsos = entrada.nextInt();
        System.out.println("Digite a quantidade de ligações interurbanas: ");
        QtdeInter = entrada.nextInt();
        System.out.println("Digite a quantidade de serviços de despertador: ");
        QtdeServDesp = entrada.nextInt();
        
        
        objContaTelefonica.setNumero(Numero);
        objContaTelefonica.setTipo(Tipo);
        objContaTelefonica.setPulso(QtdePulsos);
        objContaTelefonica.setInterurbano(QtdeInter);
        objContaTelefonica.setDespertador(QtdeServDesp);
        
        System.out.println("Total da conta: " + objContaTelefonica.calcValorConta());
    }
    
}
