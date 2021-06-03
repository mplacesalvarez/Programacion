public class Masajista extends SeleccionFutbol {
    private String titulacion;
    private Integer anosExperencia;

    public Masajista(Integer id, String nombre, String apellidos, Integer edad, String titulacion, Integer anosExperencia) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.anosExperencia = anosExperencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public Integer getAnosExperencia() {
        return anosExperencia;
    }

    @Override
    public void viajar() {
        System.out.println("El masajista " + super.getNombre() + " " + super.getApellidos() + " viaja");
    }

    public void darMasaje() {
        System.out.println("El masajista " + super.getNombre() + " " + super.getApellidos() + " esta dando masajes");
    }

    @Override
    public String toString() {
        return " Masajista : " + super.toString() +
                " titulacion= " + titulacion +
                " anosExperencia= " + anosExperencia;
    }
}