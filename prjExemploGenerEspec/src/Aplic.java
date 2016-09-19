
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import java.text.DecimalFormat;

/**
 *
 * @author felipesoares
 */
public class Aplic {

    public static void main(String[] args) {
        FuncionarioHorista funcHor = new FuncionarioHorista(1010, "Pedro Silveira", "14/05/1978", 15.80);
        FuncionarioMensalista funcMens = new FuncionarioMensalista(1011, "Gilbertinho", "12/03/1980", 2);
        
        DecimalFormat formato = new DecimalFormat("#,##0.00");
        
        funcHor.setCargo("Programador");
        funcHor.apontarHoras(90);
        funcMens.setCargo("Aux. Administrativo");
        funcMens.apontarValSalMin(600);
        
        System.out.println("Funcionario Horista: ");
        System.out.println("Registro: " + funcHor.getRegistro());
        System.out.println("Nome: " + funcHor.getNome());
        System.out.println("Data Admissao: " + funcHor.getDtAdimissao());
        System.out.println("Cargo: " + funcHor.getCargo());
        System.out.println("Salario Bruto " + formato.format(funcHor.calcSalBruto()));
        System.out.println("Desconto " + formato.format(funcHor.calcDesconto()));
        System.out.println("Gratificacao " + formato.format(funcHor.calcGratificacao()));
        System.out.println("Salario Liquido " + formato.format(funcHor.calcSalLiquido()));
        
        System.out.println("\nFuncionario Mensalista: ");
        System.out.println("Registro: " + funcHor.getRegistro());
        System.out.println("Nome: " + funcHor.getNome());
        System.out.println("Data Admissao: " + funcHor.getDtAdimissao());
        System.out.println("Cargo: " + funcHor.getCargo());
        System.out.println("Salario Bruto " + formato.format(funcMens.calcSalBruto()));
        System.out.println("Desconto " + formato.format(funcMens.calcDesconto()));
        System.out.println("Salario Liquido " + formato.format(funcMens.calcSalLiquido()));
    }
    
}
