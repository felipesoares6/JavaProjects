
import fatec.poo.model.*;

/**
 *
 * @author felipesoares
 */
public class Aplic1 {

    public static void main(String[] args) {
        //Definição da matriz d objetos a partir da super classe Funcionario
        Funcionario Cadastro[] = new Funcionario[3];
        
        //Instanciacao dos objetos
        Cadastro[0] = new FuncionarioHorista(1010, "Pedro Silveira", "14/05/1978", 15.80);
        Cadastro[1] = new FuncionarioMensalista(1011, "Gilbertinho", "12/03/1980", 2);
        Cadastro[2] = new FuncionarioComissionado(2031, "Dindin", "05/04/1982", 1);
        
        
        System.out.println("Nome: " + Cadastro[0].getNome());
        System.out.println("Nome: " + Cadastro[1].getNome());
        System.out.println("Nome: " + Cadastro[2].getNome());
        
        ((FuncionarioHorista)Cadastro[0]).apontarHoras(90);
        ((FuncionarioMensalista)Cadastro[1]).apontarValSalMin(760);
        ((FuncionarioComissionado)Cadastro[2]).setSalBase(980);
        
    }
    
}
