
/**
 *
 * @author felipesoares
 */
public class ContaTelefonica {
    private int Numero;
    private int Tipo;
    private int QtdePulsos;
    private int QtdeInter;
    private int QtdeServDesp;
    
    public void setNumero(int a){
        Numero = a;
    }
    
    public void setTipo(int a){
        Tipo = a;
    }
    
    public void setPulso(int a){
        QtdePulsos = a;
    }
    
    public void setInterurbano(int a){
        QtdeInter = a;
    }
    
    public void setDespertador(int a){
        QtdeServDesp = a;
    }
    
    public int getNumero(){
        return Numero;
    }
    
    public int getTipo(){
        return Tipo;
    }
    
    public int getPulso(){
        return QtdePulsos;
    }
    
    public int getInterurbano(){
        return QtdeInter;
    }
    
    public int getDespertador(){
        return QtdeServDesp;
    }
    
    
    public double calcValorConta(){
        double ValorConta;
        double TotalPulsos, TotalInter, TotalDesp;
        int Taxa;
        
        if(Tipo == 1){
            Taxa = 10;
        }else{
            Taxa = 15;
        }
        
        if(QtdePulsos > 90){
            TotalPulsos = (QtdePulsos - 90) *0.05;
        }else{
            TotalPulsos = 0;
        }
        
        TotalInter = 0.08 * (QtdeInter * 60);
        
        TotalDesp = 2 * QtdeServDesp;       
        
        ValorConta = Taxa + TotalPulsos + TotalInter + TotalDesp;
        
        return ValorConta;
    }
}
