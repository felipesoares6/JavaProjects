package fatec.poo.model;

/**
 *
 * @author felipesoares
 */
public class FuncionarioComissionado extends Funcionario {

    private double SalBase;
    private double TaxaComissao; //em porcentagem
    private double TotalVendas;
    
    public FuncionarioComissionado(int r, String n, String data, double taxa){
     super(r, n , data);
     TaxaComissao = taxa;
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
    
    public void addVendas(double venda){
        TotalVendas += venda;
    }
    
    public double calcSalBruto(){
        return SalBase + (TaxaComissao / 100 * TotalVendas);
    }
    
    public double calcGratificacao(){
        if(TotalVendas <= 5000)
            return 0;
        else if(TotalVendas > 5000 && TotalVendas <= 10000)
            return calcSalBruto() * 0.35;
        else
            return calcSalBruto() * 0.5;
            
    }
    
     public double calcSalLiquido(){
        return (super.calcSalLiquido() + calcGratificacao());
    }
}
