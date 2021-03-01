
package clases;

public class libro {
   String título,autor,ISBN;
   float prezo;
   int num_unidades;

    public libro() {
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setPrezo(float prezo) {
        this.prezo = prezo;
    }

    public void setNum_unidades(int num_unidades) {
        this.num_unidades = num_unidades;
    }

    public libro(String título, String autor, String ISBN, float prezo, int num_unidades) {
        this.título = título;
        this.autor = autor;
        this.ISBN = ISBN;
        this.prezo = prezo;
        this.num_unidades = num_unidades;
    }

    

    public String getTítulo() {
        return título;
    }

    public String getAutor() {
        return autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public float getPrezo() {
        return prezo;
    }

    public int getNum_unidades() {
        return num_unidades;
    }
    
    
    
    
     public String toString() {
        return "libro {" + "Título= " + título + ", Autor= " + autor + ", ISBN= " + ISBN + ", Prezo= " + prezo + ", Número de unidades= " + num_unidades+'}';
    }
        
     
    
    
}
