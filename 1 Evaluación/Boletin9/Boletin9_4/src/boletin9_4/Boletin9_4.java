
package boletin9_4;

import java.util.Scanner;


public class Boletin9_4 {

    
    public static void main(String[] args) {
        int num;
        System.out.println("Introduce un número: ");
        Scanner obxsc= new Scanner(System.in);
        num= obxsc.nextInt();
        
        System.out.println("La tabla del "+num+" es:");
        Multiplicar obx=new Multiplicar(num);
        obx.multiplicacion();
        
        
    }
    
}
