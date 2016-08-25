/**
 *
 * @author felipesoares
 */
public class Aplic1 {

    public static void main(String[] args) {
        //instanciação de um objeto da classe Retangulo
        
        Retangulo objRet; //definição de um ponteiro
        
        objRet = new Retangulo(); //alocação do objeto na memória
        
        objRet.setAltura(3);
        objRet.setBase(4);
        
        System.out.println("\n\nAltura: " + objRet.getAltura());
        System.out.println("Base: " + objRet.getBase());
        System.out.println("Area " + objRet.calcArea());
        System.out.println("Perimetro " + objRet.calcPerimetro());
        System.out.println("Diagonal: " + objRet.calcDiagonal());
    }
    
}
