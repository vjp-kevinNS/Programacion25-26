package repasotiendavideojuegos;

/**
 * Clase Videojuego que tendrá como atributos: nombre, plataforma y precio.
 *
 * @author KevinNS
 */
public class Videojuego {
    
    // Creamos los atributos
    private String nombre;
    private String plataforma;
    private float precio;
    
    // Creamos los contructores por defecto
    public Videojuego() {
        this.nombre = "";
        this.plataforma = "";
        this.precio = 0f;
    }
    
    // Creamos los constructores parametrizados
    public Videojuego(String nombre, String plataforma, float precio) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.precio = precio;
    }
    
    // Creamos los getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    // Creamos To String

    @Override
    public String toString() {
        return "Videojuego | " + " Nombre: " + nombre + " | Plataforma: " + plataforma + " | Precio: " + precio;
    }
    
    
    

}
