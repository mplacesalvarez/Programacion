

package boletin9_5;

import java.util.Scanner;

public class Boletin9_5 {

    public static void main(String[] args) {
        float salario;
      Scanner obxsc=new Scanner(System.in);
      Salario obx=new Salario();
      
        do{System.out.println("Introduce un salario: ");
      salario=obxsc.nextFloat();
        obx.salario=salario;obx.numero_traballadores();
      obx.porcentaxe_salario();
        } while (salario!=0);
        
     obx.mensajes();
    
}   

}