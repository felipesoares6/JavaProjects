
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

        DecimalFormat formato = new DecimalFormat("#,##0.00");

        for (int i = 0; i < Cadastro.length; i++) {
            if (Cadastro[i] instanceof FuncionarioHorista) {
                Cadastro[i].setCargo("Programador");
                ((FuncionarioHorista) Cadastro[i]).apontarHoras(90);
                System.out.println("Registro: " + Cadastro[i].getRegistro());
                System.out.println("Nome: " + Cadastro[i].getNome());
                System.out.println("Data Admissao: " + Cadastro[i].getDtAdimissao());
                System.out.println("Cargo: " + Cadastro[i].getCargo());
                System.out.println("Salario Bruto " + formato.format(Cadastro[i].calcSalBruto()));
                System.out.println("Desconto " + formato.format(Cadastro[i].calcDesconto()));
                System.out.println("Gratificacao " + formato.format(((FuncionarioHorista)Cadastro[i]).calcGratificacao()));
                System.out.println("Salario Liquido " + formato.format(((FuncionarioHorista)Cadastro[i]).calcSalLiquido()));
            }
        }
    }

}
