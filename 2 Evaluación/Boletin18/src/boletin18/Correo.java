
package boletin18;


public class Correo {
    private String contenido_correo;
    private boolean indicativo= false;

    public Correo() {
    }

    public Correo(String contenido_correo) {
        this.contenido_correo = contenido_correo;
    }

    public String getContenido_correo() {
        return contenido_correo;
    }

    public boolean isIndicativo() {
        return indicativo;
    }

    public void setContenido_correo(String contenido_correo) {
        this.contenido_correo = contenido_correo;
    }

    public void setIndicativo(boolean indicativo) {
        this.indicativo = indicativo;
    }
    
    
    
    
}
