public abstract class SeleccionFutbol implements IntegranteSeleccionFutbol {
    private Integer id;
    private String nombre;
    private String apellidos;
    private Integer edad;

    public SeleccionFutbol() {
    }

    public SeleccionFutbol(Integer id, String nombre, String apellidos, Integer edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public Integer getEdad() {
        return edad;
    }

    @Override
    public void concentrarse() {

    }

    @Override
    public void viajar() {

    }

    @Override
    public void entrenar() {

    }

    @Override
    public void jugarPartido() {

    }

    @Override
    public String toString() {
        return
                " id= " + id +
                        " nombre= " + nombre +
                        " apellidos= " + apellidos +
                        " edad= " + edad;
    }
}