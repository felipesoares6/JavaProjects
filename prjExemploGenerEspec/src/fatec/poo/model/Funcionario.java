package fatec.poo.model;

/**
 *
 * @author felipesoares
 */
public abstract class Funcionario {
    private int Registro;
    private String Nome;
    private String DtAdmissao;
    private String Cargo;
    private Departamento departamento; //ponteiro
    private Projeto projeto; 
    
    public Funcionario(int r, String n, String dta){
        Registro = r;
        Nome = n;
        DtAdmissao = dta;
    }
    
    public int getRegistro(){
        return Registro;
    }
    
    public String getNome(){
        return Nome;
    }
    
    public String getDtAdimissao(){
        return DtAdmissao;
    }
    
    public String getCargo(){
        return Cargo;
    }
    
    public void setCargo(String Cargo){
        this.Cargo = Cargo;
    }
    
    // retorna endereco de um objeto da classe departamento
    public Departamento getDepartamento() {
        return departamento;
    }

    // parametro de entrada endereco de um objeto da classe departamento
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
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
