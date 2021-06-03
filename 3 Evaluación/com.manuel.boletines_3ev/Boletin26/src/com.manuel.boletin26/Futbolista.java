public class Futbolista extends SeleccionFutbol {

    private Integer dorsal;
    private String demarcacion;

    public Futbolista(Integer id, String nombre, String apellidos, Integer edad, Integer dorsal, String demarcacion) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public Integer getDorsal() {
        return dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    @Override
    public void concentrarse() {
        System.out.println("El jugador " + super.getNombre() + " " + super.getApellidos() + " se concentra");
    }

    @Override
    public void viajar() {
        System.out.println("El jugador " + super.getNombre() + " " + super.getApellidos() + " viaja");
    }

    @Override
    public void entrenar() {
        System.out.println("El jugador " + super.getNombre() + " " + super.getApellidos() + " entrena");
    }

    @Override
    public void jugarPartido() {
        System.out.println("El jugador " + super.getNombre() + " " + super.getApellidos() + " juega partido");
    }

    public void entrevista() {
        System.out.println("El jugador " + super.getNombre() + " " + super.getApellidos() + " esta en una entrevista");
    }

    @Override
    public String toString() {
        return " futbolista: " + super.toString() +
                " dorsal= " + dorsal +
                " demarcacion= " + demarcacion;
    }
}