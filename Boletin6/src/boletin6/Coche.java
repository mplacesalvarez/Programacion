
package boletin6;


public class Coche {

    private int velocidade ;

    public Coche(){
    velocidade =0 ;
    }

    public int getVelocidade(){
    return velocidade;
    }

public void acelerar (int valor){
    float velocidad_acelerar;
velocidad_acelerar= valor+velocidade;
} 

public void frenar (int menos){
    float velocidad_frenar;
    velocidad_frenar= velocidade- menos;
}
    
    

}