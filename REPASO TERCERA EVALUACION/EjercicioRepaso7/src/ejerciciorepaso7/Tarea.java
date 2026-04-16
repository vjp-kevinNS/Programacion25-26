
package ejerciciorepaso7;

import java.time.LocalDate;

/**
 * LOCALDATE: FECHA DE CREACION-DESCRIPCION
 * @author KevinNS
 */
public class Tarea {
    
    // Creamos los atributos
    private LocalDate fechaCreacion;
    private String descripcion;
    
    // Creamos los constructores por defecto

    public Tarea() {
        this.fechaCreacion = LocalDate.now();
        this.descripcion = "";
    }
    
    // Creamos los constructores parametrizados

    public Tarea(LocalDate fechaCreacion, String decripcion) {
        this.fechaCreacion = fechaCreacion;
        this.descripcion = decripcion;
    }
    
    // Creamos lso getters y setters

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getDecripcion() {
        return descripcion;
    }

    public void setDecripcion(String decripcion) {
        this.descripcion = decripcion;
    }
    
    // Creamos To String

    @Override
    public String toString() {
        return "Tarea | " + " Fecha Creacion: " + fechaCreacion + " | Decripción: " 
                + descripcion;
    }
    
    
    
    
}
