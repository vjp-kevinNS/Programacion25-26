
package ejerciciorepaso13;

import java.util.ArrayList;

/**
 * ID-Nombre-Precio-Una lista de valoraciones
 * 
 * @author KevinNS
 */
public class Producto {
    
    // Creamos los atributos
    
    private int idProducto;
    private String nombreProducto;
    private float precioProducto;
    private ArrayList<Valoracion>listaValoraciones;
    
    // Creamos los constructores por defecto

    public Producto() {
        this.idProducto = 0;
        this.nombreProducto = "";
        this.precioProducto = 0.0f;
        this.listaValoraciones = new ArrayList<>();
    }
    
    // Creamos los constructores parametrizados

    public Producto(int idProducto, String nombreProducto, float precioProducto, ArrayList<Valoracion> listaValoraciones) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.listaValoraciones = listaValoraciones;
    }
    
    // Creamos los getters y setters

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public ArrayList<Valoracion> getListaValoraciones() {
        return listaValoraciones;
    }

    public void setListaValoraciones(ArrayList<Valoracion> listaValoraciones) {
        this.listaValoraciones = listaValoraciones;
    }

    public float getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(float precioProducto) {
        this.precioProducto = precioProducto;
    }
    
    
    // Creamos To String

    @Override
    public String toString() {
        return "Producto | " + " ID Producto: " + idProducto + " | Nombre Producto: " 
                + nombreProducto + " | Precio Producto: " + precioProducto 
                + " | Lista Valoraciones: " + listaValoraciones;
    }
    
    
    
    
}
