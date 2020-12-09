
package boletin2_4;

import java.util.Scanner;


public class Boletin2_4 {

    public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
        System.out.println("Introduce dos números: ");
     System.out.println("Número 1: ");    
     float num1= sc.nextFloat();
System.out.println("Número 2: ");  
         float num2= sc.nextFloat();
         float suma= num1+num2;
          float resta=num1-num2;
          float producto=num1*num2;
          float cociente=num1/num2;
         
          System.out.println("La suma es: "+suma); 
           System.out.println("La resta es: "+resta); 
           System.out.println("El producto es: "+producto); 
           System.out.println("El cociente es: "+cociente); 
    }
    
}
