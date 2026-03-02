package ejerciciorepasorestaurante;

/**
 * Descripción String, boolean vegetariano, precio float y stock int 20
 *
 * @author KevinNS
 */
public class Plato {
    
    // Creamos los atributos
    private String descripcion;
    private boolean vegetariano;
    private float precio;
    private int stock;
    
    // Creamos los constructores por defecto
    public Plato() {
        this.descripcion = "";
        this.vegetariano = false;
        this.precio = 0f;
        this.stock = 20;
    }
    
    // Creamos los constructores parametrizados
    public Plato(String descripcion, boolean vegetariano, float precio) {
        this.descripcion = descripcion;
        this.vegetariano = vegetariano;
        this.precio = precio;
        this.stock = 20;
    }
    
    // Creamos los getters y setters
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isVegetariano() {
        return vegetariano;
    }

    public void setVegetariano(boolean vegetariano) {
        this.vegetariano = vegetariano;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    // Creamos To String

    @Override
    public String toString() {
        return "Plato | " + " Descripcion: " + descripcion + " | vegetariano: " 
                + vegetariano + " | Precio: " + precio + " | Stock:" + stock;
    }
    
    

}
