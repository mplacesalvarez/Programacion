
package boletin7_4;

import java.util.Scanner;


public class Boletin7_4 {

    public static void main(String[] args) {
        Scanner obx= new Scanner (System.in);
        String nombre1,nombre2;
        float peso1,peso2;
        System.out.println("Introduce el nombre y el peso de dos personas.");
        System.out.println("Nombre persona 1: ");
        nombre1=obx.next();
        System.out.println("Peso persona 1: ");
        peso1=obx.nextFloat();
        System.out.println("Nombre persona 2: ");
        nombre2=obx.next();
        System.out.println("Peso persona 2: ");
        peso2=obx.nextFloat();
 

       Condicion obx1= new Condicion(nombre1,nombre2,peso1,peso2);
       obx1.maiorpeso();
        
        
        
        
    }
    
}
