public abstract class Barco {
    private String matricula;
    private int eslora;
    private static float precioAmarre;
    private static float precioTotal;

    public Barco() {
    }

    public Barco(String matricula, int eslora) {
        this.matricula = matricula;
        this.eslora = eslora;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getEslora() {
        return eslora;

    }

    public abstract float calcularPrecioAmarre();

    public float precioTotalAlquiler(Barco barco, int diasEstancia) {
        precioAmarre = barco.calcularPrecioAmarre();
        precioTotal = diasEstancia * barco.calcularPrecioAmarre();
        return precioTotal;
    }


    public void generarFactura() {
        System.out.println(" *******   FACTURA    *******     \n" +

                "----TIPO BARCO:"
                + this.toString());
        System.out.println("Precio de embarcacion por dia: " + precioAmarre + " Euros");
        System.out.println("Importe total : " + precioTotal + " Euros");
    }

    @Override
    public String toString() {
        return
                "  matricula=  '" + matricula +
                        "  eslora=  " + eslora +
                        "  precioAmarre=  " + precioAmarre +
                        " precioTotal= " + precioTotal;
    }
}
