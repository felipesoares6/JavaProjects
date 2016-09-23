
import fatec.poo.model.*;
import java.text.DecimalFormat;

/**
 *
 * @author felipesoares
 */
public class Aplic2 {

    public static void main(String[] args) {
        //Definição da matriz d objetos a partir da super classe Funcionario
        Funcionario Cadastro[] = new Funcionario[3];

        //Instanciacao dos objetos
        Cadastro[0] = new FuncionarioHorista(1010, "Pedro Silveira", "14/05/1978", 15.80);
        Cadastro[1] = new FuncionarioMensalista(1011, "Gilbertinho", "12/03/1980", 2);
        Cadastro[2] = new FuncionarioComissionado(2031, "Dindin", "05/04/1982", 1);

        DecimalFormat Formato = new DecimalFormat("#,##0.00");

        for (int i = 0; i < Cadastro.length; i++) {
            if (Cadastro[i] instanceof FuncionarioHorista) {
                Cadastro[i].setCargo("Programador");
                ((FuncionarioHorista) Cadastro[i]).apontarHoras(90);
                System.out.println("Registro: " + Cadastro[i].getRegistro());
                System.out.println("Nome: " + Cadastro[i].getNome());
                System.out.println("Data Admissao: " + Cadastro[i].getDtAdimissao());
                System.out.println("Cargo: " + Cadastro[i].getCargo());
                System.out.println("Salario Bruto " + Formato.format(Cadastro[i].calcSalBruto()));
                System.out.println("Desconto " + Formato.format(Cadastro[i].calcDesconto()));
                System.out.println("Gratificacao " + Formato.format(((FuncionarioHorista)Cadastro[i]).calcGratificacao()));
                System.out.println("Salario Liquido " + Formato.format(((FuncionarioHorista)Cadastro[i]).calcSalLiquido()));
                
            }else if (Cadastro[i] instanceof FuncionarioMensalista) {
                Cadastro[i].setCargo("Aux. Administrativo");
                ((FuncionarioMensalista) Cadastro[i]).apontarValSalMin(760);
                System.out.println("\n\nRegistro: " + Cadastro[i].getRegistro());
                System.out.println("Nome: " + Cadastro[i].getNome());
                System.out.println("Data admissão: " + Cadastro[i].getDtAdimissao());
                System.out.println("Cargo: " + Cadastro[i].getCargo());
                System.out.println("Salario Bruto: " + Formato.format(Cadastro[i].calcSalBruto()));
                System.out.println("Desconto: " + Formato.format(Cadastro[i].calcDesconto()));
                System.out.println("Salario Liquido: " + Formato.format(Cadastro[i].calcSalLiquido()));
            
            } else if (Cadastro[i] instanceof FuncionarioComissionado) {
                Cadastro[i].setCargo("Vendedor");
                ((FuncionarioComissionado) Cadastro[i]).setSalBase(980);
                ((FuncionarioComissionado) Cadastro[i]).addVendas(1000);
                ((FuncionarioComissionado) Cadastro[i]).addVendas(3000);
                ((FuncionarioComissionado) Cadastro[i]).addVendas(2000);

                System.out.println("\n\nRegistro: " + Cadastro[i].getRegistro());
                System.out.println("Nome: " + Cadastro[i].getDtAdimissao());
                System.out.println("Cargo: " + Cadastro[i].getCargo());
                System.out.println("Salario Bruto: " + Formato.format(Cadastro[i].calcSalBruto()));
                System.out.println("Vendas: " + Formato.format(((FuncionarioComissionado) Cadastro[i]).getTotalVendas()));
                System.out.println("Comissao: " + Formato.format(((FuncionarioComissionado) Cadastro[i]).getTaxaComissao()));
                System.out.println("Desconto: " + Formato.format(Cadastro[i].calcDesconto()));
                System.out.println("Gratificacao: " + Formato.format(((FuncionarioComissionado) Cadastro[i]).calcGratificacao()));
                System.out.println("Salario Liquido: " + Formato.format(((FuncionarioComissionado) Cadastro[i]).calcSalLiquido()));
            }

          
        }
    }

}
