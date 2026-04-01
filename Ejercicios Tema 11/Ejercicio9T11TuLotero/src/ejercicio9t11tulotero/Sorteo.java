
package ejercicio9t11tulotero;

import java.time.LocalDate;

/**
 *
 * @author KevinNS
 */
public class Sorteo {
    
    // Creamos los atributos
    private LocalDate fecha; // Atributo para la fecha del sorteo 
    private int[] ganadores = new int[4]; // Vector de 4 celdas para los números
    
    // Creamos un constructor que recibe la fecha y genera números aleatorios
    public Sorteo(LocalDate fecha){
        this.fecha = fecha;
        // Rellenamos el vector con números aleatorios entre 1 y 100
        for (int i = 0; i < ganadores.length; i++) {
            ganadores[i] = (int)(Math.random() * 100 + 1);
            
        }
    }
    
    // Creamos los getters y setters

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int[] getGanadores() {
        return ganadores;
    }

    public void setGanadores(int[] ganadores) {
        this.ganadores = ganadores;
    }
    
    // Creamos To String

    @Override
    public String toString() {
        return "Sorteo | " + " Fecha: " + fecha + " | Ganadores: " + ganadores;
    }
    
    

    
    
    
}
