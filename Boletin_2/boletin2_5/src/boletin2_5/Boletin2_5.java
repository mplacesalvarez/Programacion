
package boletin2_5;

import java.util.Scanner;


public class Boletin2_5 {

  
    public static void main(String[] args) {
        float millma, metros;
        Scanner ns=new Scanner(System.in);
        System.out.println("Introduce as millas mariñas: ");
    millma= ns.nextFloat();
    metros= millma*1852;

    System.out.println(millma+" millas mariñas son: "+metros+" metros");

    }
}
