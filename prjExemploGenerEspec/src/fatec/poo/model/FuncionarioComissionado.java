package fatec.poo.model;

/**
 *
 * @author felipesoares
 */
public class FuncionarioComissionado extends Funcionario {

    private double SalBase;
    private double TaxaComissao;
    private double TotalVendas;
    
    public FuncionarioComissionado(int r, String n, String data, double coms){
     super(r, n , data);
     TaxaComissao = coms;
    }
    
    public void setSalBase(double SalBase){
        this.SalBase = SalBase;
    }
    
    public double getSalBase(){
        return SalBase;
    }
    
    public double getTaxaComissao(){
       return TaxaComissao; 
    }
    
    public double getTotalVendas(){
        return TotalVendas;
    }
    
}
