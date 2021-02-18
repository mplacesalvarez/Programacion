
package boletin16_2;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class clasearray {

    float mediaaltura;
    int numpersonas;   
    int[] alturas= new int[pedirpersonas()];
 public int pedirpersonas(){
   int n;
        do { n =Integer.parseInt(JOptionPane.showInputDialog("Introduzca el número de personas (Debe ser un número positivo):"));
        
        }while(n<0);
        return n;
        
 }
    
     public void pediralturas(){

       for(int i=0; i<alturas.length; i++){alturas[i]=Integer.parseInt(JOptionPane.showInputDialog("Introduzca la altura en centímetros: "));}
    
    }
    
    
    public void calcaltursamedia(){
    float sumaalturas=0;
  for(int i=0; i<alturas.length; i++){sumaalturas=sumaalturas+alturas[i];}
   float media=sumaalturas/alturas.length;
    
   System.out.println("La media de las alturas es "+media);
   mediaaltura=media;
    }
    
    public void altsupinf(){
    int alturasuperior= 0;
    int alturainferior=0;
   for(int i=0; i<alturas.length; i++){if(alturas[i]>mediaaltura){alturasuperior=alturasuperior+1;}else{alturainferior=alturainferior+1;}}
    
    System.out.println("Hay "+alturasuperior+" personas cuya altura es superior a la media y "+alturainferior+" personas cuya altura es inferior a la media");
    
    }

}