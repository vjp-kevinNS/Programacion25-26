package ejercicio8t8tiendadeporte;

/**
 * Cada objeto contiene como atributos el nombre de un producto de una tienda
 * de deportes, su precio y su stock.
 *
 * @author KevinNS
 */
public class Producto {
    
    // Creamos los atributos
    private String nombreProducto;
    private double precioProducto;
    private int cantidadStock;
    
    // Creamos los contructores por defecto

    public Producto() {
        this.nombreProducto = "";
        this.precioProducto = 0;
        this.cantidadStock = 0;
    }
    
    // Creamos los constructores parametrizados

    public Producto(String nombreProducto, double precioProducto, int cantidadStock) {
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.cantidadStock = cantidadStock;
    }
    
    // Creamos los getters y setters

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }
    
    // Creamos To String

    @Override
    public String toString() {
        return "Producto{" + "Nombre del producto: " + nombreProducto 
                + " | Precio del producto: " + precioProducto 
                + " | Cantidad de stock: " + cantidadStock + '}';
    }
    
    // Creamos los métodos propios de la clase producto para separarlos del main
    
    /**
     * Método que según la cantidad de quiera el cliente dirá si queda o no queda 
     * stock
     * @param cantidad
     * @return 
     */
    public boolean hayStockSuficiente(int cantidad){
        if (cantidad <= this.cantidadStock) {
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Método que resta a la cantidad de stock el número de ventas de ese producto
     * tras una venta
     * @param cantidadVendida 
     */
    public void reducirStock(int cantidadVendida){
        this.cantidadStock = this.cantidadStock - cantidadVendida;
    }
    
    

}
