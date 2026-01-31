package ejercicio6t8sueldoempleados;
import java.util.Scanner; // Importamos Scanner
/**
 * Desarrolle una aplicación en Java que determine el sueldo bruto para cada uno
 * de los empleados de una empresa. La empresa paga la tarifa normal en las
 * primeras 40 horas de trabajo de cada empleado, y paga tarifa y media en todas
 * las horas trabajadas que excedan de 40. 
 * 
 * • El programa creará los objetos que quiera el usuario (uno para cada empleado)
 * los meterá en un array y se le pedirá al usuario que rellene la información 
 * para cada empleado. 
 * 
 * • Por cada empleado se almacenará su nombre, el número de horas que trabajó, y la tarifa
 * que cobra por una hora de trabajo.
 * 
 * • Para finalizar el programa debe determinar y mostrar el sueldo bruto de 
 * cada empleado. 
 * 
 * • Ejemplo de ejecución: Pepe trabajó 42 horas, cobra 20 euros la hora por lo 
 * que le corresponde un sueldo de 860 euros.
 *
 * @author KevinNS
 */
public class Ejercicio6T8SueldoEmpleados {

    public static void main(String[] args) {
        
        // Añadimos Scanner para pedir los datos al usuario
        Scanner entrada = new Scanner(System.in);
        
               
        // Creamos el array de objetos con el número que el usuario quiera introducir
        System.out.println("¿Cuántos empleados quieres introducir?");
        int numeroEmp = entrada.nextInt();
        entrada.nextLine(); // Limpiamos el buffer
        
        Empleado[]lista = new Empleado[numeroEmp];
        
        
        // Rellenamos el array pidiendo datos
        for (int i = 0; i < lista.length; i++) {
            System.out.println("DATOS DEL EMPLEADO " + (i + 1)); // ponemos (i + 1) para que no empiece desde el 0 y quede rarete
            
            System.out.println();
            
            System.out.print("Introduzca el nombre del empleado: ");
            String nombreEmp = entrada.nextLine();
            
            System.out.print("¿Cuántas horas trabajó este mes?: ");
            int horasTrab = entrada.nextInt();
            
            System.out.println("¿Cuál es su tarifa por hora de trabajo?: ");
            double tarifaHora = entrada.nextDouble();
            entrada.nextLine(); // Volvemos a limpiar el buffer, si no nos dará fallo al introducir los datos del segundo empleado
            
            // Aqui creamos el objeto real en la posición i del array
            lista[i] = new Empleado(nombreEmp, horasTrab, tarifaHora);
            System.out.println("EMPLEADO " + (i + 1) + " ALMACENADO CON ÉXITO");
            System.out.println();
        }    
            // Recorremos el array para calcular y mostrar el sueldo de cada empleado
            for (int i = 0; i < lista.length; i++) {
                // LLamamos al método para calcular y mostrar la tarifa de horas
                determinarYMostrarSueldo(lista[i]);
            }
     
    }
    
        public static void determinarYMostrarSueldo(Empleado empleado){
            double sueldoBruto;
            int horas = empleado.getHorasTrabajadas();
            double tarifa = empleado.getTarifaHora();
            
            // Las primeras 40 son normales. Las extras son tarifa y media (1,5)
            if (horas <= 40) {
                sueldoBruto = horas * tarifa; 
                
            }else{
                // Calculamos 40h normales más las extras con el 1,5
                int horasExtras = horas - 40;
                sueldoBruto = (40 * tarifa) + (horasExtras * tarifa * 1.5);
            }
            
            // Mostramos el mensaje final
            System.out.println(empleado.getNombre() + " trabajó " + horas + 
            " horas, cobra " + tarifa + " Euros/h. Sueldo bruto: " + sueldoBruto + " Euros");
        }

}
