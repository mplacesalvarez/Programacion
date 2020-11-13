
package boletin7_2;

public class Condicion {
    short num1, num2;
    public Condicion(){}
     public Condicion(short num1, short num2){
     this.num1= num1;
     this.num2=num2;
     }
    public void numcondicion(short num1, short num2){
      int suma= num1+num2;
      int resta=num1-num2;
      System.out.println("La suma de los dos números es "+suma);
    if(num1>=num2){System.out.println("La resta de los dos números es "+resta);}
    
    
    
    
    }
    
    
}
