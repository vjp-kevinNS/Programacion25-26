package ejerciciorepaso5;

/**
 * Título–Autor–ISBN–Número de páginas
 *
 * @author KevinNS
 */
public class Libro {
    
    // Creamos los atributos
    private String tituloLibro;
    private String autorLibro;
    private String isbnLibro;
    private int numeroPaginas;
    
    // Creamos los constructores por defecto

    public Libro() {
        this.tituloLibro = "";
        this.autorLibro = "";
        this.isbnLibro = "";
        this.numeroPaginas = 0;
    }
    
    // Creamos los constructores parametrizados

    public Libro(String tituloLibro, String autorLibro, String isbnLibro, int numeroPaginas) {
        this.tituloLibro = tituloLibro;
        this.autorLibro = autorLibro;
        this.isbnLibro = isbnLibro;
        this.numeroPaginas = numeroPaginas;
    }
   
    // Creamos los getters y setters

    public String getTituloLibro() {
        return tituloLibro;
    }

    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }

    public String getAutorLibro() {
        return autorLibro;
    }

    public void setAutorLibro(String autorLibro) {
        this.autorLibro = autorLibro;
    }

    public String getIsbnLibro() {
        return isbnLibro;
    }

    public void setIsbnLibro(String isbnLibro) {
        this.isbnLibro = isbnLibro;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
    
    // Creamos To String

    @Override
    public String toString() {
        return "Libro | " + " Titulo Libro: " + tituloLibro + " | Autor Libro: " 
                + autorLibro + " | ISBN Libro: " + isbnLibro + " | Numero Paginas: " 
                + numeroPaginas;
    }
    

}
