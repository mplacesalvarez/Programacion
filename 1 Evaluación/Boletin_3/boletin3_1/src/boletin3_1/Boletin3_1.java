
package boletin3_1;

import java.util.Scanner;


public class Boletin3_1 {

    public static void main(String[] args) {
       
      float preciotar,preciopag,porcentaxe;
              Scanner ns=new Scanner(System.in);
        System.out.println("Introduce o prezo da tarifa: ");
        preciotar= ns.nextFloat();
        System.out.println("Introduce o prezo pagado: ");
        preciopag= ns.nextFloat();
        
        porcentaxe=((preciotar-preciopag)*100)/preciotar;
                System.out.println("O descuento é: "+porcentaxe+" %");

    }
    
}
