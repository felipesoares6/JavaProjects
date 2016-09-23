package fatec.poo.model;

/**
 *
 * @author felipesoares
 */
public class pessoaJuridica extends Pessoa {
    private String CGC;
    private double TaxaIncentivo;
    
    public pessoaJuridica(String Nome, int AnoInscricao, String CGC) {
        super(Nome, AnoInscricao);
        this.CGC = CGC;
    }
    
    public void setTaxaIncentivo(double TaxaIncentivo){
        this.TaxaIncentivo = TaxaIncentivo;
    }
    
    public double getTaxaIncentivo(){
        return TaxaIncentivo;
    }
    
    public String getCGC(){
        return CGC;
    }
    
    public double calcBonus(int AnoAtual) {
        double aux;
        aux = TaxaIncentivo * super.getTotalCompras();
        return aux * (AnoAtual - super.getAnoInscricao());
    }
    
}
