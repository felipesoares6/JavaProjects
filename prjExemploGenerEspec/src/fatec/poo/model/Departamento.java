package fatec.poo.model;

import javax.sound.midi.SysexMessage;

/**
 *
 * @author felipesoares
 */
public class Departamento {
    private String sigla;
    private String nome;
    private Funcionario funcionarios[];
    int qtdFunc;

    public Departamento(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
        funcionarios = new Funcionario[5];
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }
   
    public void addFuncionario(Funcionario f){
        funcionarios[qtdFunc++]  = f ;
        f.setDepartamento(this);
    }
    
    public void listar(){
        System.out.println("\nDepartamento");
        System.out.println("\nSigla: " + sigla);
        System.out.println("Nome: " + nome);
        System.out.println("Qtd funcionarios: " + qtdFunc);
        
        System.out.println("\nRegistro\t\tNome\t\tTipo\n");
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
            
            System.out.println(funcionarios[i].getRegistro() + "\t\t" + funcionarios[i].getNome() + "\t\t" + tipo);
                
        }
    }
    
    
}
