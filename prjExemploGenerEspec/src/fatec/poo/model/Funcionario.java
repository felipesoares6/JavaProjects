package fatec.poo.model;

/**
 *
 * @author felipesoares
 */
public abstract class Funcionario {
    private int Registro;
    private String Nome;
    private String DtAdmissao;
    
    public Funcionario(int r, String n, String dta){
        Registro = r;
        Nome = n;
        DtAdmissao = dta;
    }
    
    abstract public double calcSalBruto();
    
    public double calcDesconto(){
        double Desconto;
        Desconto= 0.10 * calcSalBruto();
        return Desconto;
    }
    
    public double calcSalLiquido(){
        double SalLiq;
        SalLiq = calcSalBruto() - calcDesconto();
        return SalLiq;
    }
}
