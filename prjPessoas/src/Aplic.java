
import fatec.poo.model.*;
import java.text.DecimalFormat;

/**
 *
 * @author felipesoares
 */
public class Aplic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa[] pessoas = new Pessoa[2];
        pessoas[0] = new PessoaFisica("Felipe", 1980, "03974");
        pessoas[1] = new PessoaJuridica("Luiz", 1990, "05643");
        
        DecimalFormat Formato = new DecimalFormat("#,##0.00");
        
        for(int i = 0; i < pessoas.length; i++){
            if(pessoas[i] instanceof PessoaFisica){
                
                ((PessoaFisica)pessoas[i]).setBase(800);
                pessoas[i].addCompras(3000);
                pessoas[i].addCompras(10000);
                System.out.println("Nome: " + pessoas[i].getNome());
                System.out.println("CPF: " + ((PessoaFisica)pessoas[i]).getCPF());
                System.out.println("Ano de Inscricao: " + pessoas[i].getAnoInscricao());
                System.out.println("Salario Base: " + Formato.format(((PessoaFisica)pessoas[i]).getBase()));
                System.out.println("Bonus: " + Formato.format(((PessoaFisica)pessoas[i]).calcBonus(2000)));
            
            }else if(pessoas[i] instanceof PessoaJuridica) {
                ((PessoaJuridica)pessoas[i]).setTaxaIncentivo(1000);
                pessoas[i].addCompras(6000);
                pessoas[i].addCompras(10000);
                System.out.println("\n\nNome: " + pessoas[i].getNome());
                System.out.println("CGC: " + ((PessoaJuridica)pessoas[i]).getCGC());
                System.out.println("Ano de Inscricao: " + pessoas[i].getAnoInscricao());
                System.out.println("Taxa de Incentivo: " + Formato.format(((PessoaJuridica)pessoas[i]).getTaxaIncentivo()));
                System.out.println("Bonus: " + Formato.format(((PessoaJuridica)pessoas[i]).calcBonus(2000)));
            }
            
        }
    }
    
}
