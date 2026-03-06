package repasoestanteria;

/**
 * clase Libro que tendrá como atributos: título, autor y número de páginas.
 *
 * @author KevinNS
 */
public class Libro {

    // Creamos los atributos
    private String titulo;
    private String autor;
    private int numPaginas;
    
    // Creamos los constructores por defecto
    public Libro() {
        this.titulo = "";
        this.autor = "";
        this.numPaginas = 0;
    }
    
    // Creamos los constructores parametrizados

    public Libro(String titulo, String autor, int numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }
    
    // Creamos los getters y setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
    
    // Creamos To String

    @Override
    public String toString() {
        return "Libro | " + " Titulo: " + titulo + " | Autor: " + autor 
                + " | Número de páginas: " + numPaginas;
    }
    
    
}
