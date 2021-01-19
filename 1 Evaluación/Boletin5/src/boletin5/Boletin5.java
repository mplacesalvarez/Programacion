
package boletin5;


public class Boletin5 {

    public static void main(String[] args) {
        float consumo_medio, velocidade_media;
      Consumo obxconsum1= new Consumo (); 
       obxconsum1.setLitros(50);
               obxconsum1.setPGas((float) 1.57);
      Consumo obxconsum2= new Consumo (66,50,55, (float) 1.57); 

      consumo_medio= obxconsum2.consumo_medio();
      System.out.println("O consumo medio é "+consumo_medio);
      
      obxconsum2.setLitros(40);
    
    
     
      velocidade_media= obxconsum2.getVelocidade();
      System.out.println("A velocidade media é "+velocidade_media);
        
    }
    
    
  
}
