
package ejerciciorepaso11;

import java.time.LocalDate;

/**
 * Fecha-Descripción-Coste
 * 
 * @author KevinNS
 */
public class Revision {
    
    // Creamos los atributos
    private LocalDate fechaRevision;
    private String descripcionRevision;
    private float costeRevision;
    
    // Creamos los constructores por defecto

    public Revision() {
        this.fechaRevision = LocalDate.now();
        this.descripcionRevision = "";
        this.costeRevision = 0.0f;
    }
    
    // Creamos los constructores parametrizados

    public Revision(LocalDate fechaRevision, String descripcionRevision, float costeRevision) {
        this.fechaRevision = fechaRevision;
        this.descripcionRevision = descripcionRevision;
        this.costeRevision = costeRevision;
    }
    
    // Creamos lso getters y setters

    public LocalDate getFechaRevision() {
        return fechaRevision;
    }

    public void setFechaRevision(LocalDate fechaRevision) {
        this.fechaRevision = fechaRevision;
    }

    public String getDescripcionRevision() {
        return descripcionRevision;
    }

    public void setDescripcionRevision(String descripcionRevision) {
        this.descripcionRevision = descripcionRevision;
    }

    public float getCosteRevision() {
        return costeRevision;
    }

    public void setCosteRevision(float costeRevision) {
        this.costeRevision = costeRevision;
    }
    
    // Creamos To String

    @Override
    public String toString() {
        return "Revisión | " + " Fecha Revisión: " + fechaRevision + " | Descripción Revisión: " 
                + descripcionRevision + " | Coste Revisión: " + costeRevision;
    }
    
    
}
