
package boletin15_2;

import java.util.Arrays;
import javax.swing.JOptionPane;


public class claseprogramacion {
      int[] notasprogra= {2,6,7,8,9,3,6,4,7,5,6,7,8,9,1,5,6,7,8,7,6,8,7,6,8,4,5,3,5,6};
      String[] alumnosprogra= {"Antonio","Lola","Mauricio","Marta","Lucia","Antonio E","Lola S","Lucas","Macarena","Jose","Alberto","Lola","Mauricio J","Marta I","Paula","Laura","Carmen","Jacobo","Alvaro","Javier","Antonio V","Lola R","Carmen M","Rafa","Marcos","Carla","Victor","Mario","Rodirgo","Lucia S",};
     
      
   public void aprobadossuspensosprog(){
int suspensos=0;
int aprobados=0;
for(int i=0; i<notasprogra.length; i++){if (notasprogra[i]>=5) {aprobados= aprobados +1;}else {suspensos=suspensos+1;}
    }

System.out.println("Entre los alumnos de programacion de DAM hay "+aprobados+" aprobados y "+suspensos+" suspensos");
}

public void mediaprogra(){
   float media=0;
for(int i=0; i<notasprogra.length; i++){media= media+notasprogra[i];}
media= media/notasprogra.length;
    System.out.println("La media de los alumnos de programación es: "+media);

}
public void notamasaltaprogra(){
int mayor=0;
for(int i=0; i<notasprogra.length; i++){if(notasprogra[i]>mayor){mayor=notasprogra[i];}}

System.out.println("La nota mayor es: "+mayor);

}
public void visualizarnotaalumnoprogra(){

System.out.println("Alumno: "+alumnosprogra[5]+"    Nota: "+notasprogra[5]);
}


public void alumnosaprobados(){

System.out.println("ALUMNOS APROBADOS:");

       for(int i=0; i<notasprogra.length; i++){if(notasprogra[i]>=5)System.out.println("Alumno: "+alumnosprogra[i]);} 
        
        }


//public void notasordencreciente(){}






/*public void visualizarnotaalumnoprograteclado(){
 //no esta terminado
String alumno= JOptionPane.showInputDialog("Selecciona un alumno para visualizar su nota: ");
Arrays.asList(alumnosprogra).contains(alumno);
for(int i=0; i<notasprogra.length; i++){if(alumno==alumnosprogra[i]){System.out.println("Alumno: "+alumnosprogra[i]+"    Nota: "+notasprogra[i]);}}
}
**/ 




}
