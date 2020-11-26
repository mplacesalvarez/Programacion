
package boletin11_1;

import java.util.Scanner;


public class xogador2 {
    int num_xogador2,numero_adiviñar ;
    Scanner obxsc=new Scanner(System.in);
    public void introducir_numero(){
        System.out.println("XOGADOR 2\nIntroduce un número: ");
    num_xogador2=obxsc.nextInt();
    
    
    }
    
    
    
   public void pista_numero(){ if(num_xogador2==numero_adiviñar){System.out.println("NÚMERO CORRECTO");}else{if(num_xogador2>numero_adiviñar){System.out.println("El número es muy alto");} else{System.out.println("El número es muy bajo");}
    }}
}
