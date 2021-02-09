
package boletin15_4;

import java.util.Scanner;


public class DNI {
    char[] letra = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
    int numdni;
Scanner obxsc=new Scanner(System.in);
    
    public void pedirdni(){
    System.out.println("Introduce el número del DNI: ");
    numdni=obxsc.nextInt();
   }
    public int dividirnumdi(){
    int resto= numdni%23;
    return resto;
    }
    
  
    public void letra(){
    
    for(int i=0;i<letra.length;i++){if(dividirnumdi()==i){ char letradni=letra[i];  
    System.out.println("La letra del DNI es "+letradni);};}
       
    }
    
    
    
    
     
    }
    
  
    
    
