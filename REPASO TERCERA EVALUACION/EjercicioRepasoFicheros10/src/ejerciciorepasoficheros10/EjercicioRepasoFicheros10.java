package ejerciciorepasoficheros10;

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
 * @author KevinNS
 */
public class EjercicioRepasoFicheros10 {
    
    /**
     * Método que añade la información de la cita con lso datos introducidos por
     * el usuario
     * 
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public static void añadirCita()throws FileNotFoundException,IOException{
        Scanner entrada = new Scanner(System.in);
        
        // Pedimos los datos de la cita
        System.out.println("Nombre paciente: ");
        String nombrePaciente = entrada.nextLine();
        System.out.println("Fecha cita: ");
        String fechaCita = entrada.nextLine();
        System.out.println("Nombre médico: ");
        String nombremedico = entrada.nextLine();
        
        // Creamos un try with resources
        try(FileWriter fw = new FileWriter("citas.txt", true);
            PrintWriter pw = new PrintWriter(fw)){
            
            
            // Añadimos los datos línea a línea
            pw.println("Nombre paciente: " + nombrePaciente);
            pw.println("Fecha cita: " + fechaCita);
            pw.println("Nombre médico: " + nombremedico);
            
            System.out.println("-----------------------------------------------");
        }
    }
    
    /**
     * Método que muestra el contenido del fichero
     * 
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public static void mostrarTodas()throws FileNotFoundException,IOException{
        
        // Creamos un try with resources
        try(FileReader fr = new FileReader("citas.txt");
            BufferedReader br = new BufferedReader(fr)){
            
            
            // Creamos la variable linea
            String linea;
            
            System.out.println("---MOSTRANDO CONTENIDO DEL FICHERO---");
            
            // Creamos un while
            while ((linea = br.readLine()) != null) {                
                System.out.println(linea);
                linea = br.readLine();
                System.out.println(linea);
                linea = br.readLine();
                System.out.println(linea);
                linea = br.readLine();
                
                System.out.println("------------------------------------------");
            }
        }
    }
    
    /**
     * Método que muestra el los datos de la cita buscando por nombre del médico
     * 
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public static void buscarPorMedico()throws FileNotFoundException,IOException{
        Scanner entrada = new Scanner(System.in);
        
        // Pedimos el nombre del medico
        System.out.println("Introduce el nombre del médico para mostrar la información: ");
        String medicoBuscado = entrada.nextLine();
        
        // Creamos un try with resources
        try(FileReader fw = new FileReader("citas.txt");
            BufferedReader br = new BufferedReader(fw)){
            
            // Creamos la variable linea
            String linea;
            
            System.out.println("---MOSTRANDO CONTENIDO DEL FICHERO---");
            
            // Creamos un while
            while ((linea = br.readLine()) != null) {                
                
                // Creamos las variables de los datos
                String nombrePaciente = linea;
                String fechaCita = br.readLine();
                String nombreMedico = br.readLine();
                
                // Creamos un if 
                if (nombreMedico.toLowerCase().contains(medicoBuscado.toLowerCase())) {
                   
                    System.out.println("|" + nombrePaciente + "|" + fechaCita 
                            + "|" + nombreMedico);
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
