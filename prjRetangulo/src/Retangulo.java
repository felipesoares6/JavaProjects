/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author felipesoares
 */
public class Retangulo {
    private double altura;
    private double base;
    
    public void setAltura(double a){
       altura = a;
    }
    
    public void setBase(double b){
        base = b;
    }
    
    public double getAltura(){
        return altura;
    }
    
    public double getBase(){
        return base;
    }
    
    public double calcArea(){
      double area;
      
      area  = altura * base;
      return(area);
    }
    
    public double calcPerimetro(){
      double perimetro;

      perimetro = (altura + base) * 2;
      return(perimetro);
    }
    
    public double calcDiagonal(){
        return(Math.sqrt(Math.pow(base,2) + Math.pow(altura, 2)));
    }
    
}
