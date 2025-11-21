/**
 * Para probar la clase Empleado, crea una clase Test con un método que determine
 * y muestre el sueldo bruto de cada empleado.
 *
 * @author KevinNS
 */
public class Empleado {

    //Creamos los atributos
    private String nombre;
    private int horasTrabajadas;
    private double tarifaHora;

    //Creamos los constructores por defecto
    public Empleado() {
        this.nombre = "";
        this.horasTrabajadas = 0;
        this.tarifaHora = 0;
    }

    //Creamos los constructores con sus parametros
    public Empleado(String nombre, int horasTrabajadas, double tarifaHora) {
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaHora;
    }

    //Creamos los getter y setter
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

    //Creamos el método
    /**
     * Método que calcula el sueldo del empleado con un if else
     * @return el sueldo del empleado
     */
    public double calcularSueldo(){
        
        if (horasTrabajadas <=40) {
            return horasTrabajadas * tarifaHora;
            
        } else {
            int horasExtras = horasTrabajadas -40;
            double pagoNormal = 40 * tarifaHora;
            double pagoExtra = horasExtras * tarifaHora * 1.5;
            return pagoNormal + pagoExtra;
        }
    }
            
    //Creamos To String
    @Override
    public String toString() {
        return "El empleado: " + this.nombre + " Ha trabajado estas horas: "
                + this.horasTrabajadas + " Y la hora la cobra a: " + this.tarifaHora;
    }

}
