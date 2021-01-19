
package boletin7_5;

import java.util.Scanner;


public class Boletin7_5 {

  
    public static void main(String[] args) {
      
        Scanner obx=new Scanner(System.in);
       System.out.println("Introduce tres números: "); 
        float num1= obx.nextFloat();
        float num2= obx.nextFloat();
        float num3= obx.nextFloat();
        Condicion obx1=new Condicion();
        obx1.num_maior(num1,num2,num3);
        
        
    }
    
}
