package boletin9_5;


public class Salario {
    float salario; int contador_massueldo, contador_menossueldo, i,j;
   
    
    public Salario(float salario, int i){
 this.salario=salario;
 this.i=i;
 }
    
    
  public void numero_traballadores(){
    for(j=0; j==i; j++){if((salario>=1000)&&(salario<=1750)){contador_massueldo++;}}
    System.out.println(contador_massueldo+" trabajadores ganan entre 1000 y 1750");
   
    }
    
    public void porcentaxe_salario(){
    for(j=0; j==i; j++){if(salario<1000){contador_menossueldo++;}}
    int porcentaxe=(contador_menossueldo*i)/100;
    System.out.println(porcentaxe+"% de los trabajadores ganan menos de 1000");
    }
    
}

    
