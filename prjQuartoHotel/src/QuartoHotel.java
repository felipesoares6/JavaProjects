/**
 *
 * @author felipesoares
 */
public class QuartoHotel {
    private int NumQuarto;
    private double ValorDiaria;
    private int NumRG;
    private boolean Situacao;
    private double TotalFaturado = 0;
    
    public QuartoHotel(int n , double v){
        NumQuarto = n;
        ValorDiaria = v;
        Situacao = false;
    }
    
    public boolean getSituacao(){
        return Situacao;
    }
    
    public double getTotalFaturado(){
        return TotalFaturado;
    }
    
    public void setSituacao(boolean s){
        Situacao = s;
    }
    
    public void setTotalFaturado(double t){
        TotalFaturado = t;
    }
    
    
    public void reservar(int rg){
        NumRG = rg;
        Situacao = true;
    }
    
    public double liberar(int num){
        double total;
        total = num * ValorDiaria;
        TotalFaturado += total;
        NumRG = 0;
        Situacao = false;
        
        return total;
    }
}
