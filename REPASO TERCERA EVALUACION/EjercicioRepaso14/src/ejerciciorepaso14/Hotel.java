package ejerciciorepaso14;

/**
 * Hotel tendrá: Nombre-Número de habitaciones
 *
 * @author KevinNS
 */
public class Hotel implements Comparable<Hotel>{
    
    // Creamos los atributos
    
    private String nombreHotel;
    private int numHabitaciones;
    
    // Creamos los constructores por defecto

    public Hotel() {
        this.nombreHotel = "";
        this.numHabitaciones = 0;
    }
    
    // Creamos los constructores parametriazados

    public Hotel(String nombreHotel, int numHabitaciones) {
        this.nombreHotel = nombreHotel;
        this.numHabitaciones = numHabitaciones;
    }
    
    // Creamos los getters y setters

    public String getNombreHotel() {
        return nombreHotel;
    }

    public void setNombreHotel(String nombreHotel) {
        this.nombreHotel = nombreHotel;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }
    
    // Creamos To String

    @Override
    public String toString() {
        return "Hotel | " + " Nombre Hotel: " + nombreHotel + " | Número Habitaciones: " 
                + numHabitaciones;
    }

    // Creamos compare To
    
    @Override
    public int compareTo(Hotel otro) {
        return otro.getNumHabitaciones() - this.getNumHabitaciones();
    }
}
