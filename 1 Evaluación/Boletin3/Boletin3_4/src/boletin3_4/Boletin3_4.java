
package boletin3_4;


import java.util.Scanner;

public class Boletin3_4{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int total,r1,r2;
        int b100,b20,b5,m1;
        System.out.println("teclea la cantidad: ");
        total = sc.nextInt();

        b100 = total/100;
        r1 = total%100;
        b20 = r1%20;
        r2 = r1%20;
        b5 = r2/5;
        m1 = r2%5;

        System.out.println("desglosadp = "+b100+","+ b20+","+ b5+","+ m1);

    }
}
