package ejerciciorepaso16;

import java.time.LocalDate;

/**
 * Partida tendrá: Fecha-Puntuación
 *
 * @author KevinNS
 */
public class Partida implements Comparable<Partida>{
    
    // Creamos los atributos
    
    private LocalDate fechaPartida;
    private float puntuacion;
    
    // Creamos los constructores por defecto

    public Partida() {
        this.fechaPartida = LocalDate.now();
        this.puntuacion = 0.0f;
    }
    
    // Creamos los constructores parametrizados

    public Partida(LocalDate fechaLanzamiento, float puntuacion) {
        this.fechaPartida = fechaLanzamiento;
        this.puntuacion = puntuacion;
    }
    
    // Creamos los getters y setters

    public LocalDate getFechaPartida() {
        return fechaPartida;
    }

    public void setFechaPartida(LocalDate fechaPartida) {
        this.fechaPartida = fechaPartida;
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
        return "Partida | " + " Fecha Lanzamiento: " + fechaPartida 
                + " | Puntuación: " + puntuacion;
    }
    
    // Creamos compareTo

    @Override
    public int compareTo(Partida otra) {
        return (int)(this.getPuntuacion() - otra.getPuntuacion());
    }
}
