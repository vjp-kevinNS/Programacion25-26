package ejerciciorepasovideoclub;

/**
 * Clase Pelicula que tendrá como atributos: titulo, genero y duracion.
 *
 * @author KevinNS
 */
public class Pelicula {
    
    // Cremaos los atributos
    private String titulo;
    private String genero;
    private float duracion;
    
    // Creamos los constructores por defecto
    public Pelicula() {
        this.titulo = "";
        this.genero = "";
        this.duracion = 0;
    }
    
    // Creamos los constructores parametrizados
    public Pelicula(String titulo, String genero, float duracion) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
    }
    
    // Creamos los getters y setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }
    
    // Creamos To String

    @Override
    public String toString() {
        return "Pelicula | " + " Titulo: " + titulo + " | Genero: " + genero 
                + " | Duración: " + duracion;
    }
    
    
    

}
