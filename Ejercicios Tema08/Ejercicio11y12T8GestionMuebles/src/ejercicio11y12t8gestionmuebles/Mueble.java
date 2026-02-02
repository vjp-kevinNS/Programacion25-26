package ejercicio11y12t8gestionmuebles;

/**
 * Crea una clase Mueble con precio y descripción como atributos. Crea
 * constructor por defecto y parametrizado, así como getters y setters.
 *
 * @author KevinNS
 */
public class Mueble {
    
    // Creamos los atributos
    private double precio;
    private String descripcion;
    
    // Creamos los constructores por defecto
    public Mueble(){
        this.precio = 0.0;
        this.descripcion = "";
    }
    
    // Creamos los contructores parametrizados
    public Mueble(double precio, String descripcion){
        this.precio = precio;
        this.descripcion = descripcion;
    }
    
    // Creamos los getters y setters 

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    // Creamos To String

    @Override
    public String toString() {
        return "Mueble{" + "precio= " + precio + ", descripcion= " + descripcion + '}';
    }
    
}
