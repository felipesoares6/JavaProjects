package fatec.poo.model;

/**
 *
 * @author felipesoares
 */
public class PessoaFisica extends Pessoa {
    private String CPF;
    private double Base;
    
    
    public PessoaFisica(String Nome, int AnoInscricao, String CPF) {
        super(Nome, AnoInscricao);
        this.CPF = CPF;
    }
    
    public String getCPF(){
        return CPF;
    }
    
    public void setBase(double Base){
        this.Base = Base;
    }

    public double calcBonus(int AnoAtual) {
        double aux;
        if(super.getTotalCompras() > 12000){
          aux = AnoAtual - super.getAnoInscricao();
          return aux * Base;
       }else{
           return 0;
       }
    }
    
}
