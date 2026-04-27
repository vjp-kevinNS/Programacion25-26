package ejerciciorepasoficheros11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Ejercicio 7 – Citas médicas
 *
 * Fichero: citas.txt
 *
 * Cada línea:
 *
 * Nombre paciente
 *
 * Fecha
 *
 * Médico
 *
 * Opciones:
 *
 * Añadir cita
 *
 * Mostrar todas
 *
 * Buscar citas por médico
 *
 * Salir
 *
 * CON SEPARADORES!!!!!!
 *
 * @author KevinNS
 */
public class EjercicioRepasoFicheros11 {

    /**
     * Método que añade al fichero los datos de las citas
     *
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static void añadirCita() throws FileNotFoundException, IOException {
        Scanner entrada = new Scanner(System.in);

        // Pedimos los datos de la cita
        System.out.println("Nombre paciente: ");
        String nombrePaciente = entrada.nextLine();
        System.out.println("Fecha cita: ");
        String fechaCita = entrada.nextLine();
        System.out.println("Nombre médico: ");
        String nombremedico = entrada.nextLine();

        // Creamos un try with resources
        try (FileWriter fw = new FileWriter("citas2.txt", true); PrintWriter pw = new PrintWriter(fw)) {

            // Añadimos los datos con las variables añadiendo el separador
            pw.println(nombrePaciente + ";" + fechaCita + ";" + nombremedico);

        }
    }

    /**
     * Método que muestra el contenido del fichero con separadores
     *
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static void mostrarTodas() throws FileNotFoundException, IOException {

        // Creamos un try with resources
        try (FileReader fr = new FileReader("citas2.txt"); BufferedReader br = new BufferedReader(fr)) {

            // Creamos la variable línea
            String linea;

            System.out.println("---MOSTRANDO CONTENIDO DEL FICHERO---");

            // Creamos un while
            while ((linea = br.readLine()) != null) {

                // Cremos un array de String
                String[] lineaArr = linea.split(";");
                System.out.println("Nombre cliente: " + lineaArr[0]);
                System.out.println("Fecha cita: " + lineaArr[1]);
                System.out.println("Nombre medico: " + lineaArr[2]);

                System.out.println("-------------------------------------------");
            }
        }
    }

    public static void buscarPorMedico() throws FileNotFoundException, IOException {
        Scanner entrada = new Scanner(System.in);

        // Pedimos el nombre del medico
        System.out.println("Introduce el nombre del medico: ");
        String nombreBuscado = entrada.nextLine();

        // Creamos un try with resources
        try (FileReader fr = new FileReader("citas2.txt"); BufferedReader br = new BufferedReader(fr)) {

            // Creamos la variable linea 
            String linea;

            System.out.println("---MOSTRANDO CONTENIDO DEL FICHERO---");

            // Creamos un while
            while ((linea = br.readLine()) != null) {

                // Creamos un array de String
                String[] lineaArra = linea.split(";");
                
                // Creamos las variables para guardar los datos
                String nombrePaciente = lineaArra[0];
                String fecha = lineaArra[1];
                String nombreMedico = lineaArra[2];
                             
                // Creamos un if
                if (nombreBuscado.toLowerCase().contains(nombreBuscado.toLowerCase())) {
                    
                    System.out.println("Nombre paciente: " + nombrePaciente 
                            + " Fecha cita: " + fecha + "Nombre médico: " + nombreMedico);

                }
            }
        }
    }

    /**
     * Método que muestra el menú
     */
    public static void mostrarMenu() {
        System.out.println("1.Añadir cita");
        System.out.println("2.Mostrar todas las citas");
        System.out.println("3.Buscar citas por médico");
        System.out.println("4.Salir");
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Creamos el menú controlando excepciones
        int opcion = 0;

        do {
            try {
                mostrarMenu();
                opcion = entrada.nextInt();
                switch (opcion) {
                    case 1:
                        añadirCita();
                        break;
                    case 2:
                        mostrarTodas();
                        break;
                    case 3:
                        buscarPorMedico();
                        break;
                    case 4:
                        System.out.println("Salir del programa....");
                        break;
                    default:
                        System.out.println("Opción incorrecta");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error. Has introducido una letra");
            } catch (FileNotFoundException e) {
                System.out.println("No se ha encontrado el fichero");
            } catch (IOException e) {
                System.out.println("Error al escribir en el archivo");
            } catch (Exception e) {
                System.out.println("Error desconocido");
            }

        } while (opcion != 4);
    }

}
