/**
 * Crear una clase Test donde crees 3 direcciones y
 * luego crea tres empleados, asignándoles una de las direcciones anteriormente creadas. Por último,
 * crea un método que muestre los datos de cada empleado creado.
 *
 * @author KevinNS
 */
public class Test {

    public static void main(String[] args) {

        //Creamos los objetos, primero para las direcciones
        Direccion direccion1 = new Direccion();
        Direccion direccion2 = new Direccion();
        Direccion direccion3 = new Direccion();

        //Ahora creamos los objetos de los empleados
        Empleado empleado1 = new Empleado("Kevin", 1500, direccion1);
        Empleado empleado2 = new Empleado("Elyan", 1700, direccion2);
        Empleado empleado3 = new Empleado("Luisana", 1800, direccion3);
        
        //LLamamos al método para mostrar los datos de cada empleado
        mostrarDatos(empleado1);
        mostrarDatos(empleado2);
        mostrarDatos(empleado3);
    }
    
        /**
         * Método que nos muestra los datos de los empleados
         * @param empleado 
         */
        public static void mostrarDatos(Empleado empleado) {
            
            System.out.println("Nombre del empleado: " + empleado.getNombre());
            System.out.println("Salario del empleado: " + empleado.getSalario());
            System.out.println("Dirección del empleado (Calle): " + empleado.getDireccion().getCalle());
            System.out.println("Número: " + empleado.getDireccion().getNumero());
            System.out.println("Piso: " + empleado.getDireccion().getPiso());
            System.out.println("Ciudad: " + empleado.getDireccion().getCiudad());
    }

}
