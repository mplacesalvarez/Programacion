
package boletin3_2;

import java.util.Scanner;

public class Boletin3_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float C, K;
        double F;
        System.out.println("grados centigrados: ");
        C = sc.nextFloat();
        K = C+273;
        F = 1.8*C + 32f;
        System.out.println(C + " grados centígrados son = " +K+" grados kevil "+" y "+ F + "grados fahrenheit");

    }
}