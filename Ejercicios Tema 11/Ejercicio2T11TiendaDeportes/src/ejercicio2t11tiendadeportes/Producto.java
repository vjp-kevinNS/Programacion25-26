package ejercicio2t11tiendadeportes;

/**
 * • La clase Producto tendrá 3 atributos: 
 * 
 * • Nombre del producto: de tipo String. 
 * • Precio: de tipo float. 
 * • Stock: de tipo int.
 *
 * @author KevinNS
 */
public class Producto {
    
    // Creamos los atributos
    private String nombreProducto;
    private float precio;
    private int stock;
    
    // Creamos los constructores por defecto

    public Producto() {
        this.nombreProducto = "";
        this.precio = 0f;
        this.stock = 0;
    }
    
    // Creamos los constructores parametrizados
    public Producto(String nombreProducto, float precio, int stock) {
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.stock = stock;
    }
    
    // Creamos los getters y setters

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
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
        return "Producto | " + " Nombre Producto: " + nombreProducto + " | Precio: " 
                + precio + " | Stock" + stock;
    }
    
    
    

}
