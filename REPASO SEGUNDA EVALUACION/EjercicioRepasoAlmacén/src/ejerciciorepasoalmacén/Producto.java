package ejerciciorepasoalmacén;

/**
 * Clase Producto que tendrá como atributos: nombre, categoria y precio.
 *
 * @author KevinNS
 */
public class Producto {
    
    // Creamos los atributos
    private String nombre;
    private String categoria;
    private float precio;
    
    // Creamos los constructores por defecto
    public Producto() {
        this.nombre = "";
        this.categoria = "";
        this.precio = 0f;
    }
    
    // Creamos los cosntructores parametrizados
    public Producto(String nombre, String categoria, float precio) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
    }
    
    // Creamos los getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
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
        return "Producto | " + " Nombre: " + nombre + " | Categoria: " + categoria 
                + " | Precio: " + precio;
    }
    
    
    

}
