public class Seleccionador extends SeleccionFutbol {

    public Seleccionador(Integer id, String nombre, String apellidos, Integer edad) {
        super(id, nombre, apellidos, edad);
    }

    public void seleccionarJugador() {
        System.out.println("El seleccionador " + super.getNombre() + " " + super.getApellidos() + " selecciona jugadores");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}