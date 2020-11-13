
package boletin7_5;


public class Condicion {
    float num1,num2,num3;
    
    public Condicion(){}
    
    public void num_maior(float num1,float num2,float num3){
    if(num1>num2){if(num1>num3){System.out.println(num1+" es maior");}else{System.out.println(num3+" es maior");}}
    else if(num2>num3){System.out.println(num2+" es maior");}else {System.out.println(num3+" es maior");} 
        
    }
   
}
    
    
    
  
