public class Entrenador extends SeleccionFutbol {

    private Integer idFederacion;

    public Entrenador(Integer id, String nombre, String apellidos, Integer edad, Integer idFederacion) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    public Integer getIdFederacion() {
        return idFederacion;
    }

    @Override
    public void concentrarse() {
        System.out.println("El entrenador " + super.getNombre() + " " + super.getApellidos() + " se concentra");
    }

    @Override
    public void viajar() {
        System.out.println("El entrenador " + super.getNombre() + " " + super.getApellidos() + " viaja");
    }

    public void planificarEntrenamiento() {
        System.out.println("El entrenador " + super.getNombre() + " " + super.getApellidos() + " esta planeando entreno");
    }

    @Override
    public String toString() {
        return " Entrenador : " + super.toString() +
                " idFederacion= " + idFederacion;
    }
}