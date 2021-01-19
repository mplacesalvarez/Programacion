
package boletin9_3;

import java.util.Scanner;

public class Boletin9_3 {


    public static void main(String[] args) {

        float base, altura;
        System.out.println("Introduce la base y la altura. ");
        Scanner obxsc = new Scanner(System.in);
        System.out.println("Base: ");
        base = obxsc.nextFloat();

        System.out.println("Altura: ");
        altura = obxsc.nextFloat();


        Area obx = new Area(base, altura);
        obx.calcular_area();

    }

}
