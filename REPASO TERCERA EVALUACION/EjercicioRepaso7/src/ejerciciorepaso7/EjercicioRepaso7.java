package ejerciciorepaso7;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 * EMPLEADO: ID-DNI-NOMBRE-APELLIDO-EDAD-SALARIO-ARRAYLIST DE TAREA
 *
 * Crear mapa de empleados
 *
 * MENU:
 *
 * Crear empleado con sus tareas
 *
 * Visualizar empleado con sus tareas
 *
 * Mostrar información de un empleado
 *
 * Eliminar un empleado
 *
 * Subir sueldo a un empleado
 *
 * @author KevinNS
 */
public class EjercicioRepaso7 {

    /**
     * Método que crea empleados con los datos que introduzca el usuario
     *
     * @param mapa
     */
    public static void crearEmpleado(Map<String, Empleado> mapa) {
        Scanner entrada = new Scanner(System.in);

        // Pedimos los datos al usuario
        System.out.println("ID del empleado: ");
        int idEmp = entrada.nextInt();
        entrada.nextLine();
        System.out.println("DNI del empleado: ");
        String dniEmp = entrada.nextLine();
        System.out.println("Nombre del empleado: ");
        String nombreEmp = entrada.nextLine();
        System.out.println("Apellido del empleado: ");
        String apellidoEmp = entrada.nextLine();
        System.out.println("Edad del empleado: ");
        int edadEmp = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Sueldo del empleado: ");
        float sueldoEmp = entrada.nextFloat();
        entrada.nextLine();
        
        // Creamos un ArrayList de tareas 
        ArrayList<Tarea> listaTarea = new ArrayList<>();
        
        // Creamos un do while para ir pidiendo las tareas
        String tareaUsu;
        do {
            System.out.println("¿Quieres añadir una tarea al empleado?(si/no): ");
            tareaUsu = entrada.nextLine();
            
            if (tareaUsu.equalsIgnoreCase("si")) {
                
                // Pedimos los datos de la tarea
                System.out.println("Descripción de la tarea: ");
                String descripcionTarea = entrada.nextLine();
                
                // Creamos la tarea
                Tarea tareaEmpleado = new Tarea(LocalDate.now(), descripcionTarea);
                
                // Añadimos la tarea al ArrayList
                listaTarea.add(tareaEmpleado);
                        
            }
            
        } while (tareaUsu.equalsIgnoreCase("si"));

        // Creamos el empleado
        Empleado nuevoEmp = new Empleado(idEmp, dniEmp, nombreEmp, apellidoEmp, edadEmp, sueldoEmp, listaTarea);

        // Añadimos el empleado al mapa
        mapa.put(dniEmp, nuevoEmp);
    }

    /**
     * Método que muestras los empleados creados
     *
     * @param mapa
     */
    public static void mostrarEmpleado(Map<String, Empleado> mapa) {
        // Recorremos el mapa
        for (Empleado empleado : mapa.values()) {
            System.out.println("El empleado con el nombre " + empleado.getNombre()
                    + " " + empleado.getApellido() + " tiene " + empleado.getEdad()
                    + " años y cobra " + empleado.getSalario());
            
            // Recorremos la lista
            for (Tarea tarea : empleado.getListaTarea()) {
                System.out.println("La tarea añadida es la siguiente: " 
                        + tarea.getDecripcion());
            }
        }

    }

    /**
     * Método que muestra al empleado con su tarea con el DNI que introduzca el 
     * usuario
     *
     * @param mapa
     */
    public static void mostrarInfoEmpleadoDni(Map<String, Empleado> mapa) {
        Scanner entrada = new Scanner(System.in);

        // Preguntamos al usuario el dni del empleado que está buscando
        System.out.println("¿Qué DNI estáss buscando?: ");
        String dniUsu = entrada.nextLine();

        // Comprobamos si existe el empleado
        if (mapa.containsKey(dniUsu)) {
            Empleado empleadoBuscar = mapa.get(dniUsu);

            System.out.println("Este es el empleado con el DNI introducido: "
                    + empleadoBuscar.getNombre());
            
            // Recorremos la lista de tareas
            for (Tarea tarea : empleadoBuscar.getListaTarea()) {
                System.out.println("Esta es la tarea que tiene el empleado: " 
                        + tarea.getDecripcion());
            }
        } else {
            System.out.println("No hay ningún empleado con ese DNI");
        }
    }

    /**
     * Método que elimina un empleado indicado por el usuario
     * 
     * @param mapa 
     */
    public static void eliminarEmpleado(Map<String, Empleado> mapa) {
        Scanner entrada = new Scanner(System.in);

        // Preguntamos al usuario el dni del empleado que está buscando
        System.out.println("Introduce el DNI del empleado que quieres eliminar: ");
        String dniUsu = entrada.nextLine();

        if (mapa.containsKey(dniUsu)) {
            mapa.remove(dniUsu);
            
            System.out.println("Empleado eliminado correctamente");
            
        } else {
            System.out.println("No hay ningún empleado con ese DNI");
        }      
    }
    
    /**
     * Método que sube el sueldo a un empleado
     * 
     * @param mapa 
     */
    public static void subirSueldoEmpleado(Map<String, Empleado> mapa){
        Scanner entrada = new Scanner(System.in);
        
        // Pedimos al usuario el DNI del empleado al que quiere subir el sueldo
        System.out.println("¿A que empleado quieres subirle el sueldo(introduce su DNI)?: ");
        String dniUsu = entrada.nextLine();
        
        // Compobamos si existe ese DNI
        if (mapa.containsKey(dniUsu)) {
            
            System.out.println("¿Cuál es el nuevo sueldo después del aumento?: ");
            float nuevoSueldo = entrada.nextFloat();
            
            // Guardamos el empleado para modificarle el sueldo
            Empleado empleadoAumento = mapa.get(dniUsu);
            
            // Cambiamos al empleado el sueldo
            empleadoAumento.setSalario(nuevoSueldo);
            
            // Actualizamos el valor en el mapa
            mapa.put(dniUsu, empleadoAumento);
            
            System.out.println("Se le ha subido el sueldo al empleado " + empleadoAumento.getNombre()
                    + " Ahora su sueldo es de: " + empleadoAumento.getSalario());
            
        }else{
            System.out.println("No hay ningún empleado con ese DNI");
        }
       
  
    }

    /**
     * Método que muestra el menú
     */
    public static void mostrarMenu() {
        System.out.println("GESTION DE EMPLEADOS");
        System.out.println("1. Añadir empleados con sus tareas");
        System.out.println("2. Mostrar empleado con su tarea");
        System.out.println("3. Mostrar información del empleado(por DNI)");
        System.out.println("4. Eliminar un empleado");
        System.out.println("5. Subir sueldo a un empleado");
        System.out.println("6. Salir del menú...");
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Creamos el mapa de empleados
        Map<String, Empleado> mapaEmpleados = new HashMap<>();

        // Creamos el menu controlando excepciones
        int opcion = 0;

        do {
            try {
                mostrarMenu();
                opcion = entrada.nextInt();
                switch (opcion) {
                    case 1:
                        crearEmpleado(mapaEmpleados);
                        break;
                    case 2:
                        mostrarEmpleado(mapaEmpleados);
                        break;
                    case 3:
                        mostrarInfoEmpleadoDni(mapaEmpleados);
                        break;
                    case 4:
                        eliminarEmpleado(mapaEmpleados);
                        break;
                    case 5:
                        subirSueldoEmpleado(mapaEmpleados);
                        break;
                    case 6:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción incorrecta");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error. Has introducido una letra");
                entrada.nextLine();
            }

        } while (opcion != 6);

    }

}
