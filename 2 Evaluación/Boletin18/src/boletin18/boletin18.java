
package boletin18;

import java.util.Scanner;

public class boletin18 {

    
    public static void main(String[] args) {
        Correo nuevo = null;
        
        Buzon obx=new Buzon();
        Scanner obxsc=new Scanner(System.in);
      int option;
        
        do{ System.out.println("**** MENU ****\n1) Añadir correos.\n2) Correos sin leer.\n3) Primer correo sin leer.\n4) Mostrar correo.\n5) Eliminar correo.\n6) Salir.");
        option=obxsc.nextInt();
        
        switch(option){
          
       case 1:obx.engade();break;
       case 2:obx.porLer();break;
       case 3:System.out.println(obx.amosaPrimerNoLeido());break;
       case 4:   System.out.println("¿Que correo desea leer?:");System.out.println(obx.amosa(obxsc.nextInt()));break;
       case 5:System.out.println("¿Que correo desea eliminar?:");obx.elimina(obxsc.nextInt());break;
      }
     
        
        
    }while(option!=6);
        
    }
    
}