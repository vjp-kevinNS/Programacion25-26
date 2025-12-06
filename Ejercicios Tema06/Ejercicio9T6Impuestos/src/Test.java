
/**
 * Clase Test donde instancies un objeto de Persona y otro de Vehículo y llames
 * a calcularImpuesto().
 *
 * @author KevinNS
 */
public class Test {

    public static void main(String[] args) {
        
        //Creamos los objetos
        Persona persona1 = new Persona("45788929O", 4000.0);
        Vehiculo vehiculo1 = new Vehiculo(1500, "4567-JBB", "827659897L");
        
        //Calculamos el impuesto para los objetos
        double impuestoPersona = persona1.calcularImpuesto();
        double impuestoVehiculo = vehiculo1.calcularImpuesto();
    }

}
