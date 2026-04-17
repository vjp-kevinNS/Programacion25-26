package ejerciciorepaso8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

/**
 * PACIENTE: ID–DNI–NOMBRE–EDAD–ENFERMEDAD–ARRAYLIST DE CITAS CITA:
 * LOCALDATE–FECHA–MOTIVO
 *
 * Crear mapa de pacientes
 *
 * MENÚ:
 *
 * Crear paciente con sus citas
 *
 * Visualizar pacientes con sus citas
 *
 * Mostrar información de un paciente
 *
 * Eliminar un paciente
 *
 * Añadir nueva cita a un paciente
 *
 * @author KevinNS
 */
public class EjercicioRepaso8 {

    /**
     * Método que, pidiendole los datos al usuario, crea los pacientes y las
     * citas
     *
     * @param mapa
     */
    public static void crearPaciente(Map<String, Paciente> mapa) {
        Scanner entrada = new Scanner(System.in);

        // Pedimos los datos
        System.out.println("ID del paciente: ");
        int idPaciente = entrada.nextInt();
        entrada.nextLine();
        System.out.println("DNI del paciente: ");
        String dniPaciente = entrada.nextLine();
        System.out.println("Nombre del paciente: ");
        String nombrePaciente = entrada.nextLine();
        System.out.println("Edad del paciente: ");
        int edadPaciente = entrada.nextInt();
        entrada.nextLine();
        System.out.println("¿Què enfermedad tiene?: ");
        String enfermedadPaciente = entrada.nextLine();

        // Creamos la lista de citas
        ArrayList<Cita> listaCitas = new ArrayList<>();

        String citaUsuario; // Para guardar la cita

        // RECORDAR!!!!!!!!!!!!
        // Creamos un do while para pedir los datos al usuario y que nos indique si quiere añadir más citas
        do {
            System.out.println("¿Quieres añadir una nueva cita?(si/no): ");
            citaUsuario = entrada.nextLine();

            if (citaUsuario.equalsIgnoreCase("si")) {
                // Pedimos los datos de la cita
                System.out.println("Motivo de la cita: ");
                String motivoCita = entrada.nextLine();

                // Creamos la cita
                Cita nuevaCita = new Cita(LocalDate.now(), motivoCita);

                // Añadimos la cita a la lista
                listaCitas.add(nuevaCita);
            }

        } while (citaUsuario.equalsIgnoreCase("si"));

        // Creamos al paciente
        Paciente nuevoPaciente = new Paciente(idPaciente, dniPaciente, nombrePaciente, edadPaciente, enfermedadPaciente, listaCitas);

        // Añadimos el paciente al mapa RECORDAR!!!!!!
        mapa.put(dniPaciente, nuevoPaciente);
    }

    /**
     * Método que muestra los pacientes con sus citas
     *
     * @param mapa
     */
    public static void mostrarPaciente(Map<String, Paciente> mapa) {
        // Recorremos los pacientes
        for (Paciente paciente : mapa.values()) {
            System.out.println("Paciente con ID: " + paciente.getId() + " con DNI: "
                    + paciente.getDni() + " se llama: " + paciente.getNombre()
                    + " con la edad de: " + paciente.getEdad() + " tiene la siguiente enfermedad: "
                    + paciente.getEnfermedad());

            // Recorremos las citas
            for (Cita cita : paciente.getListaCitas()) {
                System.out.println("El motivo de la cita es: " + cita.getMotivoCita());
            }
        }
    }

    /**
     * Método que muestra la información del paciente pidiendole el DNI al
     * usuario
     *
     * @param mapa
     */
    public static void mostrarInfoPacienteDni(Map<String, Paciente> mapa) {
        Scanner entrada = new Scanner(System.in);

        // Pedimos al usuario el dni del paciente que está buscando
        System.out.println("Introduce el DNI del paciente al que buscas: ");
        String dniBuscado = entrada.nextLine();

        // Comprobamos si existe el paciente
        if (mapa.containsKey(dniBuscado)) {

            // Creamos al paciente que buscamos
            Paciente pacienteBuscado = mapa.get(dniBuscado);
            System.out.println("Se ha encontrado al paciente con ese DNI: " + pacienteBuscado.getNombre());

            // Recorremos la lista de citas
            for (Cita cita : pacienteBuscado.getListaCitas()) {
                System.out.println("Este es el motivo de la cita de ese paciente: "
                        + cita.getMotivoCita());
            }
        } else {
            System.out.println("No hay ningún paciente con ese DNI");
        }
    }

    /**
     * Método que elimina a un paciente pidiendole el DNI al usuario
     * 
     * @param mapa 
     */
    public static void eliminarPaciente(Map<String, Paciente> mapa) {
        Scanner entrada = new Scanner(System.in);

        // Pedimos al usuario el DNI del paciente que está buscando
        System.out.println("Introduce el DNI del paciente al que buscas: ");
        String dniBuscado = entrada.nextLine();
        
        // Comprobamos si existe ese paciente
        if (mapa.containsKey(dniBuscado)) {
            mapa.remove(dniBuscado); // Borramos el paciente
            
            System.out.println("Se ha eliminado al paciente");
        }else{
            System.out.println("No hay ningún paciente con ese DNI");
        }
    }
    
    /**
     * Método que añade citas al paciente pidiendole los datos al usuario
     * 
     * @param mapa 
     */
    public static void añadirCita(Map<String, Paciente> mapa){
        Scanner entrada = new Scanner(System.in);
        
        // Pedimos al usuario el DNI del paciente a buscar
        System.out.println("Introduce el DNI del paciente al que buscas: ");
        String dniBuscado = entrada.nextLine();
        
        // Comprobamos si el paciente existe
        if (mapa.containsKey(dniBuscado)) {
            
            // Le añadimos la cita deseada
            System.out.println("¿Cuál es el motivo de la cita que queires añadir?: ");
            String motivoCitaUsu = entrada.nextLine();
            
            // RECORDAR!!!!!!!!!!!!!
            // Creamos esa cita
            Cita nuevaCita = new Cita(LocalDate.now(), motivoCitaUsu);
            
            // Guardamos el paciente
            Paciente nuevoPaciente = mapa.get(dniBuscado);
            
            // Lo añadimos a la lista
            nuevoPaciente.getListaCitas().add(nuevaCita);
            
            // Ahora actualizamos el mapa con los datos introducidos
            mapa.put(dniBuscado, nuevoPaciente);
            
        }else{
            System.out.println("No existe ningún paciente con ese DNI");
        }
    }

    /**
     * Método que muestra el menú
     */
    public static void mostrarMenu() {
        System.out.println("GESTION DE PACIENTES");
        System.out.println("1. Crear pacientes con sus citas");
        System.out.println("2. Mostrar pacientes con sus citas");
        System.out.println("3. Mostrar información del paciente(con su DNI)");
        System.out.println("4. Eliminar un paciente");
        System.out.println("5. Añadir nueva cita a un paciente");
        System.out.println("6. Salir del menú...");
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Creamos el mapa de pacientes
        Map<String, Paciente> mapaPacientes = new HashMap();

        // Creamos el menu controlando excepciones
        int opcion = 0;

        do {
            try {
                mostrarMenu();
                opcion = entrada.nextInt();
                switch (opcion) {
                    case 1:
                        crearPaciente(mapaPacientes);
                        break;
                    case 2:
                        mostrarPaciente(mapaPacientes);
                        break;
                    case 3:
                        mostrarInfoPacienteDni(mapaPacientes);
                        break;
                    case 4:
                        eliminarPaciente(mapaPacientes);
                        break;
                    case 5:
                        añadirCita(mapaPacientes);
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
