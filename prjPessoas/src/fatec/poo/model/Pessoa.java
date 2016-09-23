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
    
    abstract public double calcBonus();
    
    public void addCompras(double Compra){
       TotalCompras += Compra;
    }
    
    public void getNome(String Nome){
        this.Nome = Nome;
    }
    
    public void getAnoInscricao(int AnoInscricao){
        this.AnoInscricao = AnoInscricao;
    }
    
    public void getTotalCompras(int TotalCompras){
        this.TotalCompras = TotalCompras;
    }
}
