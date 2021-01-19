
package boletin3_5;

import java.util.Scanner;

public class Boletin3_5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float soldoFixo;
        double soldoBruto,soldoLiquido;
        float vendas,km,dias;

        System.out.println("soldoFixo: ");
        soldoFixo = sc.nextFloat();

        System.out.println("vendas: ");
        vendas = sc.nextFloat();

        System.out.println("km: ");
        km = sc.nextFloat();

        System.out.println("días desprazamento: ");
        dias = sc.nextFloat();

        soldoBruto = soldoFixo + 0.05*vendas + km*2 + dias*30;
        soldoLiquido = soldoBruto - 0.18*soldoBruto-36;


        System.out.println("Soldo bruto = "+ soldoBruto + "Soldo líquido = " + soldoLiquido);
    }
}