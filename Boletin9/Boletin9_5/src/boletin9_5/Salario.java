package boletin9_5;



import java.util.Scanner;

public class Salario {
    float salario; int contador_massueldo=0, contador_menossueldo=0; int porcentaxe;
   
    Scanner obxsc=new Scanner(System.in);
  //  public Salario(float salario){
 //this.salario=salario;
    
   // }
    
  public void numero_traballadores(){
    if((salario>=1000)&&(salario<=1750)){contador_massueldo++;}
    
  }
    
    
    public void porcentaxe_salario(){
    if(salario>=1&&salario<1000){contador_menossueldo++;
    porcentaxe=(contador_menossueldo*100/(contador_menossueldo+contador_massueldo));
  

    
    
    }
    
    }
    
    
    public void mensajes(){
    System.out.println(contador_massueldo+" trabajadores ganan entre 1000 y 1750");
      System.out.println(porcentaxe+"% de los trabajadores ganan menos de 1000");
    }
    
    
    
    
    
    }


    