
package boletin9_1;

public class Numeros {
    int i;int num0; int nummas;int nummenos;
  
 public void num() {
    for(i=0; i<10; i++)if(obxsc.nextFloat()==0)num0=num0+1;

    for(i=0; i<10; i++)if(obxsc.nextFloat()>0)nummas=nummas+1;

    for(i=0; i<10; i++)if(obxsc.nextFloat()<0)nummenos=nummenos+1;

 System.out.println("Hay "+num0+" numeros negativos, "+nummas+" numeros positivos y "+nummenos+" ceros");
}

}
    
    