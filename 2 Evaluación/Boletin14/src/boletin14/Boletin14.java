
package boletin14;


import java.util.Scanner;


public class Boletin14 {

    
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         ConversorTemperaturas obx=new ConversorTemperaturas();
        try{
            System.out.println("Introduzca una temperatura en grados centígrados: ");
        float  tempcenti=sc.nextFloat();
           rango(tempcenti);
           System.out.println("La temperatura en Fahrenheit es "+obx.centigradosAFharenheit(tempcenti)+" °F \nLa temperatura en Réaumur es "+obx.centígradosAReamur(tempcenti)+" °Re");
        }
        
        catch(TemperaturaErradaExcepcion ex){String respuesta = "Se ha introducido una temperatura menor a 80 ºC";
}

        }
    
    static void rango(float tempcenti)throws TemperaturaErradaExcepcion{
    if(tempcenti<80){throw new TemperaturaErradaExcepcion("La temperatura no puede ser menor de 80 ºC");}
    
    }
    
}