package repasorestauranterepeticion;

/**
 * Clase Plato (String nombre, boolean vegetariano, int stock , float precio)
 *
 * @author KevinNS
 */
public class Plato {
    
    // Creamos los atributos
    private String nombre;
    private boolean vegetariano;
    private int stock;
    private float precio;
    
    // Creamos los constructores por defecto

    public Plato() {
        this.nombre = "";
        this.vegetariano = false;
        this.stock = 0;
        this.precio = 0;
    }
    
    // Creamos los constructores parametrizados

    public Plato(String nombre, boolean vegetariano, int stock, float precio) {
        this.nombre = nombre;
        this.vegetariano = vegetariano;
        this.stock = stock;
        this.precio = precio;
    }
    
    // Creamos los getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isVegetariano() {
        return vegetariano;
    }

    public void setVegetariano(boolean vegetariano) {
        this.vegetariano = vegetariano;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
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
        return "Plato | " + " Nombre: " + nombre + " | Vegetariano: " + vegetariano 
                + " | Stock: " + stock + " | Precio: " + precio;
    }
    
    

}
