
package boletin5;

public class Consumo {
private float km;
private float litros;
private float velocidade;
private float prezo_gas ;

    
    public Consumo(){};
    public Consumo(float km, float litros, float velocidade, float prezo_gas){
        this.km= km;
        this.litros= litros;
        this.velocidade= velocidade;
        this.prezo_gas= prezo_gas;
        }
    
    public float getTempo(){
    float tempo;
    tempo= km/velocidade;
    return tempo;
    }
  
    
    public float consumo_medio(){
    float consumo_medio;
    consumo_medio= litros/100;
    return consumo_medio;
    }
    
    
    public float consumo_euros(){
    float consumo_euros;
    consumo_euros= prezo_gas/100;
    return consumo_euros;
    }
    
  
    
    
    
    public void setKms(float km){
  this.km= km;  
    }
public void setLitros(float litros){
   this.litros= litros;
}                   
public void setvMed(float velocidade){
    this.velocidade= velocidade;
}
 public void setPGas(float prezo_gas){
     this.prezo_gas= prezo_gas;
 }
  
    
        
 public float getVelocidade(){
    return velocidade;
    }
 
 
 
 
}
