public class Velero extends Barco {
    private int numeroMastiles;


    public Velero(String matricula, int eslora, int numeroMastiles) {
        super(matricula, eslora);
        this.numeroMastiles = numeroMastiles;
    }

    public int getNumeroMastiles() {
        return numeroMastiles;
    }

    @Override
    public float calcularPrecioAmarre() {
        return (10 * getEslora()) + (numeroMastiles * 8);
    }


    @Override
    public String toString() {
        return " Velero----  " + "matricula: " +
                super.getMatricula() + " eslora: " +
                super.getEslora() + " metros" +
                "  numeroMastiles=  " + numeroMastiles;
    }
}