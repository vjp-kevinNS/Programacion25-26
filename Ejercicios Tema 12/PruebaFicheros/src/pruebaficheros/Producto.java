package pruebaficheros;

/**
 *
 * @author KevinNS
 */
public class Producto {

    // Creamos los atributos
    private String nombre;
    private int cantidad;
    private float precio;

    // Creamos los constructores por defecto
    public Producto() {
        this.nombre = "";
        this.cantidad = 0;
        this.precio = 0.0f;
    }

    // Creamos los constructores parametrizados
    public Producto(String nombre, int cantidad, float precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    // Creamos los getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
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
        return "Producto | " + " Nombre: " + nombre + " | Cantidad: " + cantidad
                + " | Precio: " + precio;
    }

}
