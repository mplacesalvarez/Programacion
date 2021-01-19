
package boletin8_6;

import java.util.Scanner;


public class Boletin8_6 {

    public static void main(String[] args) {
       System.out.println("Introduce o número de vendas anuais: "); 
       int num_vendas;
        Scanner obxsc= new Scanner(System.in);
       do{num_vendas= obxsc. nextInt();
       tipo_producto obx=new tipo_producto();
      obx.productos(num_vendas);}while(num_vendas>=0);
    }

}
    

