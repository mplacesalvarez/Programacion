
package boletin18;

import java.util.Scanner;


public class Buzon {
    Scanner obxsc=new Scanner(System.in);
   int num_correos;
    
     int pos=-1;
public int numeroDeCorreos(){
System.out.println("Introduce el número de correos: ");
num_correos=obxsc.nextInt();
return num_correos;
}
Correo[] correos_electronicos= new Correo[numeroDeCorreos()];
public void engade (){
    Correo correonuevo=new Correo();
    System.out.println("Escribe un correo:");
    correonuevo.setContenido_correo(obxsc.next());
    correos_electronicos[pos=pos+1]=correonuevo;
}
public void porLer(){
    int conta_correos=0;
    int i;
    
for(i=0; i<correos_electronicos.length; i++){
if(correos_electronicos[i].isIndicativo()==false){conta_correos=conta_correos+1;}

}
System.out.println("Quedan "+conta_correos+" correos por leer");
}


public String amosaPrimerNoLeido(){
        int i;

for(i=0; i<correos_electronicos.length; i++){
if(correos_electronicos[i].isIndicativo()==false){
break;

}}
 correos_electronicos[i].setIndicativo(true);
return correos_electronicos[i].getContenido_correo();

}
      

public String amosa(int k){
 
    correos_electronicos[k].setIndicativo(true);
  return correos_electronicos[k].getContenido_correo();

}
public void elimina(int k){
   
    correos_electronicos[k]=null;}
    
}
