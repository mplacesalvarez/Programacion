
package boletin7_3;

import java.util.Scanner;

public class Boletin7_3 {

   
    public static void main(String[] args) {
        Scanner obx=new Scanner (System.in);
        Condicion obx1=new Condicion();
        System.out.println("Introduce un número: ");
        int num= obx.nextInt();
        
        obx1.resultado(num);
        
    }
    
}
