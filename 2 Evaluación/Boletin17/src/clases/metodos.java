
package clases;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;


public class metodos {
      String título,autor,ISBN;
   float prezo;
   int num_unidades;
    
  ArrayList <libro> lib=new ArrayList <libro>();  
   public void menu(){
     int opcion;
       do{
         opcion= Integer.parseInt(JOptionPane.showInputDialog("MENU:\n1) Engadir libros.\n2) Vender libros.\n3) Amosar libros.\n4) Dar de baixa.\n5) Consultar un libro.\n6) Salir."));
        switch(opcion){
            case 1:engadir(); break;
            case 2: vender(); break;
                case 3: amosar(); break;
             case 4: baixa(); break;
                case 5: consultar(); break;

                
        }}
        while(opcion!=6);
        
        
   }
    
   public void engadir(){
  
       título= JOptionPane.showInputDialog("Introduzca título:");
       autor= JOptionPane.showInputDialog("Introduzca autor:");
       ISBN= JOptionPane.showInputDialog("Introduzca ISBN:");
       prezo= Float.parseFloat(JOptionPane.showInputDialog("Introduzca precio:"));
       num_unidades= Integer.parseInt(JOptionPane.showInputDialog("Introduzca número de unidades:"));
      libro obxlib=new libro(título,autor,ISBN,prezo,num_unidades);
      
       
       lib.add(obxlib);
   
   
   }
   
   public void vender(){
 
      String lib_vender= JOptionPane.showInputDialog("Introduzca el nombre del libro que va a vender:");
   for(int i=0; i<lib.size();i++){ if(título.equalsIgnoreCase(lib_vender)){lib.get(i).setNum_unidades(num_unidades=num_unidades-1);

   }}
   }
   
   
   
   
   
   
      public void amosar(){
          //SIN TERMINAR
 System.out.println("******* Libros disponibles *******");
          Iterator<libro> it =lib.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }   
            
       
     
     
     }

 
   
        public void baixa(){
            for(int i=0;i<lib.size();i++){
        if(num_unidades==0){lib.remove(i);}
            }
        }
        
        
        
        
        
     public void consultar(){
    
     String nomlibro_consulta=JOptionPane.showInputDialog("Introduzca el título del libro que desea consultar: ");
      for(int i=0;i<lib.size();i++){  if(lib.get(i).getTítulo().equalsIgnoreCase(nomlibro_consulta)){System.out.println("******* CONSULTA *******");System.out.println(lib.get(i));}}
   
     }

    
}
