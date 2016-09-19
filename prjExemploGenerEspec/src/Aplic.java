
import fatec.poo.model.FuncionarioHorista;

/**
 *
 * @author felipesoares
 */
public class Aplic {

    public static void main(String[] args) {
        FuncionarioHorista funcHor = new FuncionarioHorista(1010, "Pedro Silveira", "14/05/1978", 15.80);
        
        funcHor.apontarHoras(90);
        
        System.out.println("Salario Bruto " + funcHor.calcSalBruto());
        System.out.println("Desconto " + funcHor.calcDesconto());
        System.out.println("Salario Liquido " + funcHor.calcSalLiquido());
    }
    
}
