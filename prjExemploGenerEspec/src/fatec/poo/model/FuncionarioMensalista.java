
package fatec.poo.model;

/**
 *
 * @author felipesoares
 */
public class FuncionarioMensalista extends Funcionario {
    private double ValSalMin;
    private double NumSalMin;

    public FuncionarioMensalista(int r, String n, String data, double nsm){
        super(r, n, data);
        NumSalMin = nsm;
    }
    
    public void apontarValSalMin(double vsm){
        ValSalMin = vsm;
    }

    public double calcSalBruto() {
        double salBruto;
        salBruto = ValSalMin * NumSalMin;
        return salBruto;
    }

    
}
