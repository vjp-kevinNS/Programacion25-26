package ejercicio24t12sueldoempleados;

/**
 * • Por cada empleado se almacenará su nombre, el número de horas que trabajó,
 * y la tarifa que cobra por una hora de trabajo.
 *
 * @author KevinNS
 */
public class Empleado {
    
    // Creamos los atributos
    
    private String nombre;
    private double horas;
    private double tarifa;
    
    // Creamos los contructores por defecto

    public Empleado() {
        this.nombre = "";
        this.horas = 0;
        this.tarifa = 0;
    }
    
    // Creamos los constructores parametrizados

    public Empleado(String nombre, double horas, double tarifa) {
        this.nombre = nombre;
        this.horas = horas;
        this.tarifa = tarifa;
    }
    
    // Creamos los getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }
    
    // Creamos To String

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", horas=" + horas + ", tarifa=" + tarifa + '}';
    }
    
    

}
