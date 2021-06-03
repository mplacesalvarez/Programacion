import java.util.ArrayList;

public class Boletin26 {
    public static void main(String[] args) {
        ArrayList<SeleccionFutbol> listaSeleccion = new ArrayList<>();

        SeleccionFutbol futbolista1 = new Futbolista(1, "Marco", "Van Basten", 31, 9, "delantero");
        SeleccionFutbol entrenador1 = new Entrenador(1, "Johan", "Cruif", 54, 123);
        SeleccionFutbol masajista1 = new Masajista(1, "Juan", "Del Bosque", 59, "Fisio", 29);
        SeleccionFutbol seleccionador1 = new Seleccionador(1, "yo", "Mismo", 39);

        listaSeleccion.add(futbolista1);
        listaSeleccion.add(entrenador1);
        listaSeleccion.add(masajista1);
        listaSeleccion.add(seleccionador1);

        for (SeleccionFutbol ele : listaSeleccion) {
            System.out.println(ele);
        }

        futbolista1.concentrarse();
        entrenador1.concentrarse();

    }

}