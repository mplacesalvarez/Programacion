import java.util.ArrayList;

public class Boletin25 {
    public static void main(String[] args) {

        ArrayList<Barco> listaBarcos = new ArrayList<>();

        Barco barco1 = new Velero("12378Pl7", 12, 2);
        Barco barco2 = new Deportivas("3456PL76", 9, 350);
        Barco barco3 = new Yate("987tlES6", 20, 2000, 7);

        listaBarcos.add(barco1);
        listaBarcos.add(barco2);
        listaBarcos.add(barco3);


        for (Barco ele : listaBarcos) {
            System.out.println("Barco = " + ele);
        }

        barco1.calcularPrecioAmarre();
        barco1.precioTotalAlquiler(barco1, 8);
        barco1.generarFactura();
        barco2.calcularPrecioAmarre();
        barco2.precioTotalAlquiler(barco2, 4);
        barco2.generarFactura();
        barco3.calcularPrecioAmarre();
        barco3.precioTotalAlquiler(barco3, 11);
        barco3.generarFactura();
    }

}
