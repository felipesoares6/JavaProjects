/**
 *
 * @author felipesoares
 */
public class Circulo {
  private double raio;
  
  // Definição do método construtor
  public Circulo(double r){
      raio = r;
  }
  
  public double getRaio(){
      return raio;
  }
  
  public void setRaio(double a){
       raio = a;
  }
  
  public double calcArea(){
     return (Math.PI * Math.pow(raio, 2));
  }
  
  public double calcPerimetro(){
      return (2 * Math.PI * raio);
  }
  
}
