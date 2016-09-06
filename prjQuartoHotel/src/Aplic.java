
import java.util.Scanner;

/**
 *
 * @author felipesoares
 */
public class Aplic {
    public static void main(String[] args) {
       
       Scanner entrada = new Scanner(System.in);
       int opcao, rg, dias;
              
       QuartoHotel objQuartoHotel = new QuartoHotel(1010, 150);
       
       do{           
            
            System.out.println("\n\n");
            System.out.println("Hotel Recanto do Sossego");
            System.out.println("1- Consultar quarto");
            System.out.println("2- Reservar quarto");
            System.out.println("3- Liberar o quarto");
            System.out.println("4- Consultar faturamento");
            System.out.println("5- Sair");
            System.out.print("Digite a opção: ");

            opcao = entrada.nextInt();
            System.out.println("\n");
                        
            
            switch(opcao){
                case 1:
                    if(objQuartoHotel.getSituacao()){
                        System.out.println("O quarto está reservado");
                    }else{
                        System.out.println("O quarto está livre");
                    }
                        
                    break;
                case 2:
                    if(objQuartoHotel.getSituacao()){
                        System.out.println("O quarto já foi reservado");
                    }else{
                        System.out.println("Digite o RG: ");
                        rg = entrada.nextInt();
                        objQuartoHotel.reservar(rg);
                    }
                    break;
                case 3:
                    if(!objQuartoHotel.getSituacao()){
                        System.out.println("O quarto já está livre");
                    }else {
                        System.out.println("Digite o número de dias:");
                        dias = entrada.nextInt();
                        System.out.println("O valor a ser pago pelo quarto é: R$" + objQuartoHotel.liberar(dias));
                    }
                    break;
                case 4:
                    System.out.println("O faturamento é: " + objQuartoHotel.getTotalFaturado());
                    break;
                                    
                default:                   
                    System.err.println("Opção inválida!");
            }            
       }while(opcao != 5);
        
    }
    
}
