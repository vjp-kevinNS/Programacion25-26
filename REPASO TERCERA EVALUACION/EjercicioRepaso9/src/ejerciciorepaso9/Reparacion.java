
package ejerciciorepaso9;

import java.time.LocalDate;

/**
 * fecha, descripción y precio
 * 
 * @author KevinNS
 */
public class Reparacion {
    
   // Creamos los atributos
    private LocalDate fecha;
    private String descripcion;
    private float precio;
    
    // Creamos los constructores por defecto

    public Reparacion() {
        this.fecha = LocalDate.now();
        this.descripcion = "";
        this.precio = 0.0f;
    }
    
    // Creamos los cosntructores parametrizados

    public Reparacion(LocalDate fecha, String descripcion, float precio) {
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.precio = precio;
    }
    
    // Creasmos los getters y setters

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
        return "Reparacion{" + "fecha=" + fecha + ", descripcion=" + descripcion 
                + ", precio=" + precio + '}';
    }
    
    
    
}
