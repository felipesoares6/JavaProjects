package fatec.poo.model;

/**
 *
 * @author felipesoares
 */
public abstract class Pessoa {
    private String Nome;
    private int AnoInscricao;
    private double TotalCompras;
    
    
    public Pessoa(String Nome, int AnoInscricao){
        this.Nome = Nome;
        this.AnoInscricao = AnoInscricao;
    }
    
    abstract public double calcBonus(int x);
    
    public void addCompras(double Compra){
       TotalCompras += Compra;
    }
    
    public String getNome(){
        return Nome;
    }
    
    public int getAnoInscricao(){
        return AnoInscricao;
    }
    
    public double getTotalCompras(){
        return TotalCompras;
    }
}
