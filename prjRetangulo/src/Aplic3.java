
import java.util.Scanner;


/**
 *
 * @author felipesoares
 */
public class Aplic3 {

    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        
        //Definição da matriz de objetos da classe Retangulo
        Retangulo MatRet[] = new Retangulo[4];
        
        double medAlt, medBase;
        int cont;
        
        
       //instanciação dos objetos da classe Retangulo
        for (cont=0; cont < MatRet.length; cont++){
            System.out.println("Digite a media da altura: ");
            medAlt = Entrada.nextDouble();
            System.out.println("Digite a media da base: ");
            medBase= Entrada.nextDouble();
            
            MatRet[cont] = new Retangulo();
            
            MatRet[cont].setAltura(medAlt);
            MatRet[cont].setBase(medBase);
        }
        
        //acessando a matriz de objetos da classe Retangulo
        for(cont=0; cont < MatRet.length; cont++){
            System.out.println("Objeto retangulo: " + (cont + 1));
            System.out.println("A area do retangulo: " + MatRet[cont].calcArea());
            System.out.println("A diagonal do retangulo: " + MatRet[cont].calcDiagonal());
            System.out.println("O perimetro do retangulo: " + MatRet[cont].calcPerimetro());
        }
    }
    
}
