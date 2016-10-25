
package fatec.poo.model;

/**
 *
 * @author felipesoares
 */
public class Projeto {
    private int codigo;
    private String descricao;
    private String dataInicio;
    private String dataTermino;
    private Funcionario funcionarios[];
    private int qtdFunc;
    
    public Projeto(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
        funcionarios = new Funcionario[5];
    }
    
    public void setDataInicio(String dataInicio){
        this.dataInicio = dataInicio;
    }
    
    public void setDataTermino(String dataTermino){
        this.dataTermino = dataTermino;
    }
    
    public void addFuncionario(Funcionario f){
        funcionarios[qtdFunc++] = f;
        f.setProjeto(this);
    }
    
    public void listar(){
        System.out.println("\nProjeto");
        System.out.println("Codigo: " + codigo);
        System.out.println("Descricao: " + descricao);
        System.out.println("Data Inicio: " + dataInicio);
        System.out.println("Data Termino: " + dataTermino);
        System.out.println("Qtd Funcionarios: " + qtdFunc);
        
        
        System.out.println("\nRegistro\t\tNome\t\t Departamento \t\tTipo\n");
        for(int i = 0; i < qtdFunc; i++){    
            String tipo;    
            if(funcionarios[i] instanceof FuncionarioHorista){
                tipo = "Horista";
            }    
            else if(funcionarios[i] instanceof FuncionarioMensalista){
                tipo = "Mensalista";
            }else {
                tipo = "Comissionado";
            }       
            
            System.out.println(funcionarios[i].getRegistro() + "\t\t" + funcionarios[i].getNome() + "\t\t" + funcionarios[i].getDepartamento() + "\t\t" + tipo);
                
        }
    }
            
}
