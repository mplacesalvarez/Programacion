
package boletin12;

public class Garaxe {
    private int numeroCoches;
    private int tempo;
    private final coche Coche=new coche();
    
  
    
    public void mensaxe(){if(numeroCoches<5){System.out.println("PLAZAS DISPOÑIBLES");} else{System.out.println("COMPLETO");}}

    public void setNumeroCoches(int numeroCoches) {
        this.numeroCoches = numeroCoches;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

public float prezo(){
    float prezo;
    
    if(tempo<=3){prezo=(float) 1.5;} else{prezo=(float) (1.5+(0.20*(tempo-3)));}

return prezo;

}   

    
public void factura(float cartosrecibi, float prezo, String matricula, float cartosdevolt){
   
System.out.println("FACTURA");
System.out.println("MATRICULA COCHE " +matricula);
System.out.println("TEMPO "+tempo+" horas");
System.out.println("PRECIO " +prezo+" €");
System.out.println("CARTOS RECIBIDOS " +cartosrecibi+" €");
System.out.println("CARTOS DEVOLTOS "+cartosdevolt+" €");
System.out.println("GRACIAS POR USAR O NOSO APARCADOIRO ");

}

}
