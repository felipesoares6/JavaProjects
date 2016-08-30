
import java.util.Scanner;

/**
 *
 * @author felipesoares
 */
public class Aplic {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       double raio;
       
       System.out.println("Digite o raio: ");
       raio = entrada.nextDouble();
       
       Circulo objCirc = new Circulo(raio);
       
       System.out.println("Raio: " + objCirc.getRaio());
       System.out.println("Area: " + objCirc.calcArea());
       System.out.println("Perimetro " + objCirc.calcPerimetro());
    }    
}
