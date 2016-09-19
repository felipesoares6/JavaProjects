package fatec.poo.model;

/**
 *
 * @author felipesoares
 */
public class FuncionarioHorista extends Funcionario {
    private double valHorTrab;
    private int QtdeHorTrab;
    
    public FuncionarioHorista(int r, String n, String data, double vht){
        super(r, n, data); //chamada ao metodo construtor da superclasse
        valHorTrab = vht;
    }
    
    public void apontarHoras(int qht){
        QtdeHorTrab = qht;
    }
    
    public double  calcSalBruto(){
        double salBruto;
        salBruto = valHorTrab * QtdeHorTrab;
        return salBruto;
    }
    
    public double calcGratificacao(){
        return (0.075 * calcSalBruto());
    }
    
    public double calcSalLiquido(){
        return (super.calcSalLiquido() + calcGratificacao());
    }
}
