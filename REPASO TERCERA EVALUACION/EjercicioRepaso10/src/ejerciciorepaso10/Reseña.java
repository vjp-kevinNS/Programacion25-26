
package ejerciciorepaso10;

import java.time.LocalDate;

/**
 * Fecha-Comentario-Puntuación  
 * 
 * @author KevinNS
 */
public class Reseña {
    
    // Creamos los atributos
    
    private LocalDate fechaReseña;
    private String comentario;
    private float puntuacion;
    
    // Creamos los constructores por defecto

    public Reseña() {
        this.fechaReseña = LocalDate.now();
        this.comentario = "";
        this.puntuacion = 0.0f;
    }
    
    // Creamos los constructores parametrizados

    public Reseña(LocalDate fechaReseña, String comentario, float puntuacion) {
        this.fechaReseña = fechaReseña;
        this.comentario = comentario;
        this.puntuacion = puntuacion;
    }
    
    // Creamos los getters y setters

    public LocalDate getFechaReseña() {
        return fechaReseña;
    }

    public void setFechaReseña(LocalDate fechaReseña) {
        this.fechaReseña = fechaReseña;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public float getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(float puntuacion) {
        this.puntuacion = puntuacion;
    }
    
    // Creamos To String

    @Override
    public String toString() {
        return "Reseña | " + " Fecha de Reseña: " + fechaReseña + " | Comentario: " 
                + comentario + " | Puntuación: " + puntuacion;
    }
    
    
    
}
