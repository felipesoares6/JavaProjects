
import fatec.poo.model.Departamento;
import fatec.poo.model.FuncionarioComissionado;
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import fatec.poo.model.Projeto;
import java.text.DecimalFormat;

/**
 *
 * @author felipesoares
 */
public class Aplic {

    public static void main(String[] args) {
        FuncionarioHorista funcHor = new FuncionarioHorista(1010, "Pedro Silveira", "14/05/1978", 15.80);
        FuncionarioMensalista funcMens = new FuncionarioMensalista(1011, "Gilbertinho", "12/03/1980", 2);
        FuncionarioComissionado funcComs = new FuncionarioComissionado(2031, "Dindin", "05/04/1982", 1);
        Departamento dep1 = new Departamento("RH", "Recursos Humanos");
        Departamento dep2 = new Departamento("VD", "Vendas");
        Projeto prj1 = new Projeto(123, "Projetinho top");
             
        DecimalFormat formato = new DecimalFormat("#,##0.00");
        
        funcHor.setCargo("Programador");
        funcHor.apontarHoras(90);
        
        funcMens.setCargo("Aux. Administrativo");
        funcMens.apontarValSalMin(760);
        
        funcComs.setCargo("Jogador");
        funcComs.addVendas(1000);   
        funcComs.addVendas(3000);
        funcComs.addVendas(2000);
        funcComs.setSalBase(980);
        
        prj1.setDataInicio("01/9/2018");
        prj1.setDataTermino("22/11/2019");
        
        dep1.addFuncionario(funcHor);
        dep1.addFuncionario(funcMens);
        dep2.addFuncionario(funcComs);
        
        prj1.addFuncionario(funcHor);
        prj1.addFuncionario(funcMens);
        prj1.addFuncionario(funcComs);
        
        dep1.listar();
        dep2.listar();
        
        prj1.listar();
        
        
        System.out.println("\nO funcionario " + funcHor.getNome() + " trabalha no departamento de " + funcHor.getDepartamento().getNome());
        System.out.println("O funcionario " + funcMens.getNome() + " trabalha no departamento de " + funcHor.getDepartamento().getNome());
        System.out.println("O funcionario " + funcComs.getNome() + " trabalha no departamento de " + funcHor.getDepartamento().getNome());
        
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
        
        System.out.println("\nFuncionario Mensalista: ");
        System.out.println("Registro: " + funcComs.getRegistro());
        System.out.println("Nome: " + funcComs.getNome());
        System.out.println("Data Admissao: " + funcComs.getDtAdimissao());
        System.out.println("Cargo: " + funcComs.getCargo());
        System.out.println("Salario Bruto " + formato.format(funcComs.calcSalBruto()));
        System.out.println("Desconto " + formato.format(funcComs.calcDesconto()));
        System.out.println("Gratificacao " + formato.format(funcComs.calcGratificacao()));
        System.out.println("Salario Liquido " + formato.format(funcComs.calcSalLiquido()));
        
        
    }
    
}
