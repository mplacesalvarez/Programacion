
package boletin15_1;

import javax.swing.JOptionPane;

public class clasearray {
    int [] numeros=new int[6];
  
 public void numerosarraynumeros(){
     int i;
for(i=0; i<numeros.length;i++){numeros[i]=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número que este entre 1 y 50: " ));
if(numeros[i]<0 || numeros[i]>50) break;}

 }
  
 
public void mostrararraynumeros(){
for(int i=5; i>-1; i--){System.out.println(numeros[i]);}

}
    

}
