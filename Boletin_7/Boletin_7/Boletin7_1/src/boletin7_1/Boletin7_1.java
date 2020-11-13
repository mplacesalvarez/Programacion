
package boletin7_1;

import java.util.Scanner;



public class Boletin7_1 {

    public static void main(String[] args) {
        
        Scanner obx= new Scanner(System.in);
     
        System.out.println("Introduce un número: ");
        
        int num = obx. nextInt();
        
       Numero obx1=new Numero();
       obx1.numpositivo(num);
        
        
    }
    
}
