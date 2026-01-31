package ejercicio6t8sueldoempleados;

/**
 * Por cada empleado se almacenará su nombre, el número de horas que trabajó, y
 * la tarifa que cobra por una hora de trabajo.
 *
 * @author KevinNS
 */
public class Empleado {

    // Creamos los atributos
    private String nombre;
    private int horasTrabajadas;
    private double tarifaHora;
    
    // Creamos los constructores por defecto
    public Empleado(){
        this.nombre = "";
        this.horasTrabajadas = 0;
        this.tarifaHora = 0.0;
    }
    
    // Creamos los constructores parametrizados
    
    public Empleado(String nombre, int horasTrabajadas, double tarifaHora){
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaHora;
    }
    
    // Creamos los getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getTarifaHora() {
        return tarifaHora;
    }

    public void setTarifaHora(double tarifaHora) {
        this.tarifaHora = tarifaHora;
    }
    
    // Creamos To String

    @Override
    public String toString() {
        return "El empleado " + nombre + " ha trabajado " + horasTrabajadas + " horas"
                + " con ésta tarifa " + tarifaHora;
    }
    
}
