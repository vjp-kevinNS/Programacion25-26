
package ejerciciorepaso8;

import java.time.LocalDate;

/**
 * CITA: LOCALDATE–FECHA–MOTIVO
 * 
 * @author KevinNS
 */
public class Cita {
    
    // Creamos los atributos
    private LocalDate fechaCita;
    private String motivoCita;
    
    // Creamos los contructores por defecto

    public Cita() {
        this.fechaCita = LocalDate.now();
    }
    
    // Creamos los construtores parametrizados

    public Cita(LocalDate fechaIngreso, String motivoCita) {
        this.fechaCita = fechaIngreso;
        this.motivoCita = motivoCita;
    }
    
    // Creamos los getters y setters

    public LocalDate getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(LocalDate fechaCita) {
        this.fechaCita = fechaCita;
    }

    public String getMotivoCita() {
        return motivoCita;
    }

    public void setMotivoCita(String motivoCita) {
        this.motivoCita = motivoCita;
    }
    
    // Creamos To String

    @Override
    public String toString() {
        return "Cita | " + " Fecha Cita: " + fechaCita + " | Motivo Cita: " 
                + motivoCita;
    }
    
    
    
    
}
