
package boletin2_3;

import java.util.Scanner;

public class Boletin2_3 {

    public static void main(String[] args) {
        float euros; float dolares;
        Scanner ns = new Scanner(System.in);
       System.out.println("Introduce los euros: ");
       euros =ns.nextFloat();
        dolares = (float) (euros*1.19);
              System.out.println("Son "+dolares+" dólares");

       
    }
    
}
