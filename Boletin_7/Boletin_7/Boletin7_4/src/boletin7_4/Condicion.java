
package boletin7_4;

public class Condicion {
    String nombre1,nombre2;
        float peso1,peso2,diferenciapeso;
    public Condicion(){}
        public Condicion(String nombre1,String nombre2,float peso1,float peso2){
        
        this.nombre1= nombre1;
                this.nombre2= nombre2;
        this.peso1= peso1;
        this.peso2=peso2;
        
        
        }

    public void maiorpeso(){
    if (peso1>peso2){System.out.println(nombre1+" tiene maior peso."); diferenciapeso= peso1-peso2;
    System.out.println("La diferencia de peso es de "+diferenciapeso+" kilos");}
    
    }
   
}
