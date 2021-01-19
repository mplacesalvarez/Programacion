
package boletin8_7;

import java.util.Scanner;

public class Métodos {
    String opcion;
    float a_cadrado,a_triangulo,a_circulo,base,altura,radio;
 
   public void menu(){
        
        
  
        
    System.out.println("Elixa unha figura: ");
    System.out.println("A) Cadrado");
    System.out.println("B) Triangulo");
    System.out.println("C) Circulo");
    Scanner obxsc=new Scanner(System.in);
    opcion=obxsc.nextLine();
    switch(opcion){
    case "A": System.out.println("Introduzca la base y la altura:");
        
        System.out.println("Base: ");
        base= obxsc.nextFloat();
        System.out.println("Altura: ");
        altura= obxsc.nextFloat();
        a_cadrado= base*altura;
        System.out.println("El área es "+a_cadrado);
        
        break;
        
        
        
        
    case "B":System.out.println("Introduzca la base y la altura:");
        
        System.out.println("Base: ");
        base= obxsc.nextFloat();
        System.out.println("Altura: ");
        altura= obxsc.nextFloat();
        a_triangulo= (base*altura)/2;
         System.out.println("El área es "+a_triangulo);
        break;
        
        
        
    case "C":System.out.println("Introduzca la base y la altura:");
     
     System.out.println("Radio: ");
        radio= obxsc.nextFloat();
        a_circulo= radio*radio*(float) 3.14;
      System.out.println("El área es "+a_circulo);
     
     break;
    }
    
    
    
    
    }
    
    
    
}
