public class Deportivas extends Barco {

    private int potenciaCV;

    public Deportivas(String matricula, int eslora, int potenciaCV) {
        super(matricula, eslora);
        this.potenciaCV = potenciaCV;
    }


    public int getPotenciaCV() {
        return potenciaCV;
    }

    @Override
    public float calcularPrecioAmarre() {
        return (10 * getEslora()) + (potenciaCV * 2);
    }


    @Override
    public String toString() {
        return " Deportiva ----  " + "matricula: " +
                super.getMatricula() + " eslora: " +
                super.getEslora() + " metros" +
                "  potenciaCV=  " + potenciaCV;
    }
}