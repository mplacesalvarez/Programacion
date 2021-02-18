
package boletin16_1;

import javax.swing.JOptionPane;


public class clasearray {
   
    
    int [] arrayenteros= new int [10];
    
    public void pedirnumeros(){
    
  for(int i=0; i<arrayenteros.length;i++){
  
  arrayenteros[i]=Integer.parseInt(JOptionPane.showInputDialog("Introduce los números del array: "));
  
   } 
  }
    
  public void parimpar(){
      int par=0;
      int negativos=0;
 for(int i=0; i<arrayenteros.length;i++){
  if(arrayenteros[i]%2==0){par=par+1;}
  if(arrayenteros[i]<0){negativos=negativos+1;}
  
  }
 System.out.println("Hay "+par+" números pares y "+negativos+" números negativos");


 
  }
    
    

      
}
