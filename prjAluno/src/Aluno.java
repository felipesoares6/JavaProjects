
/**
 *
 * @author felipesoares
 */
public class Aluno {
    private int Ra;
    private double NtPrv1;
    private double NtPrv2;
    private double NtTrab1;
    private double NtTrab2;
    
    public void setRa(int a){
        Ra = a;
    }
    
    public void setNtPrv1(double a){
        NtPrv1 = a;
    }
    
    public void setNtPrv2(double b){
        NtPrv2 = b;
    }
    
    public void setNtTrab1(double a){
        NtTrab1 = a;
    }
    
    public void setNtTrab2(double b){
        NtTrab2 = b;
    }
    
    public int getRa(){
        return Ra;
    }
    
    public double getNtPrv1(){
        return NtPrv1;
    }
    
    public double getNtPrv2(){
        return NtPrv2;
    }
    
    public double getNtTrab1(){
        return NtTrab1;
    }
    
    public double getNtTrab2(){
        return NtTrab2;
    }
    
    
    public double calcMediaProva(){
     double MediaProva;
     MediaProva =  0.75 * ((NtPrv1 + 2 * NtPrv2) / 3);
     return MediaProva;
    }
    
    public double calcMediaTrab(){
       double MediaTrab;
       MediaTrab = 0.25 * ((NtTrab1 + NtTrab2) /2);
       return MediaTrab;
    }
    
    public double calcMediaFinal(){
        return calcMediaProva() + calcMediaTrab();
    }
    
    public boolean isAprovado(){
        return calcMediaFinal() >= 6;
    }
    
}
