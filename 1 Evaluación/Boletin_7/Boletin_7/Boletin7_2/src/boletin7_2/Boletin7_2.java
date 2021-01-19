
package boletin7_2;

import java.util.Scanner;

public class Boletin7_2 {

   
    public static void main(String[] args) {
      Scanner obx= new Scanner (System.in);
      Condicion obx1=new Condicion();
      short num1,num2;
        System.out.println("Introduce dos números de tipo short: ");
        num1= obx.nextShort();
        num2= obx.nextShort();
        
       obx1.numcondicion(num1,num2);
        
        
    }
    
}
