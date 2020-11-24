
package boletin9_5;

import java.util.Scanner;

public class Boletin9_5 {

    public static void main(String[] args) {
        int i;
        float salarios[] = null;

        System.out.println("Introduce los sueldos:");
        Scanner obxsc=new Scanner(System.in);
       
           for(i=0; i>0 ; i++){if (salarios[i] >0) {salarios[i]=obxsc.nextFloat();}else{System.out.println("No se aceptan números negativos");}
          if(salarios[i]==0)break;
          }
    
           
    Salario obx=new Salario(salarios[i],i);
    
    
    
    
    
    obx.numero_traballadores();
    obx.porcentaxe_salario();
        
        
}   }
   
    
