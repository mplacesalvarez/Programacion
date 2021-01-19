
package boletin12;

import java.util.Scanner;


public class Boletin12 {

    public static void main(String[] args) {
         
                Garaxe obxgaraxe=new Garaxe();
        coche obxcoche=new coche();
        Scanner sc=new Scanner(System.in);
           System.out.println("Introduzca matricula:");
       String matricula = sc.nextLine();
        obxcoche.setMatricula(matricula);
                
        System.out.println("Prazas a ocupar:");
        int numeroCoches= sc.nextInt();
        
        obxgaraxe.setNumeroCoches(numeroCoches);
        obxgaraxe.mensaxe();
        
     
        if(numeroCoches<5){
        System.out.println("Tempo que vai estar:");
        int tempo=sc.nextInt();
        obxgaraxe.setTempo(tempo);
        System.out.println("Cartos recibidos:");
        float cartosrecibi=sc.nextFloat();
        
        obxgaraxe.factura(cartosrecibi,obxgaraxe.prezo(), obxcoche.getMatricula(),cartosrecibi-obxgaraxe.prezo());
        
        
        }
       
        
        
        
        
    }
    }
    