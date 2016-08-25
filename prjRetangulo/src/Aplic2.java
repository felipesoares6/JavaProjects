
import java.util.Scanner;

public class Aplic2 {
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        Retangulo objRet = new Retangulo();
        
        double medBase, medAltura;
        
        System.out.println("Digite medida de altura: ");
        medAltura = entrada.nextDouble();
        System.out.println("Digite a medida da base: ");
        medBase = entrada.nextDouble();

        //passagem de mensagens
        objRet.setAltura(medAltura);
        objRet.setBase(medBase);
        
        System.out.println("\n\nAltura: " + objRet.getAltura());
        System.out.println("Base: " + objRet.getBase());
        System.out.println("Area " + objRet.calcArea());
        System.out.println("Perimetro " + objRet.calcPerimetro());
        System.out.println("Diagonal: " + objRet.calcDiagonal());

    }
    
}
