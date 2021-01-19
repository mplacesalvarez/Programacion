
package boletin11_1;

import javax.swing.JOptionPane;


public class Boletin11_1 {

    
    public static void main(String[] args) {
      int numero_adiviñar, num_xogador2=0;
        do{ numero_adiviñar= Integer.parseInt(JOptionPane.showInputDialog("XOGADOR 1 \nIntroduce o número a adiviñar ( entre 1 e 50 ): "));
       if (numero_adiviñar>1 && numero_adiviñar<50){
        
        
        int num_maxintentos= Integer.parseInt(JOptionPane.showInputDialog("XOGADOR 1 \nIntroduce o número máximo de intentos: ")); 
       xogador2 obx=new xogador2();
        obx.numero_adiviñar=numero_adiviñar;
        
        
        for(int i=0; i<num_maxintentos;i++){obx.introducir_numero();if(numero_adiviñar==num_xogador2){break;}obx.pista_numero(); if (i==num_maxintentos-1)
        System.out.println("SOLO TENIAS "+num_maxintentos+" INTENTOS");}obx.num_xogador2=num_xogador2;}
       
       
       else if(numero_adiviñar!=0)System.out.println("Debes introducir un número entre 1 y 50. ");
       
    }while(numero_adiviñar!=0);
       
       
    }
    
}
