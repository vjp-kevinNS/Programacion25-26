package ejerciciorepasoficheros4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Haz un programa que gestione agenda.txt con:
 *
 * Nombre Edad Teléfono Email Ciudad
 *
 * Opciones:
 *
 * Añadir contacto
 *
 * Mostrar todos
 *
 * Buscar por nombre
 *
 * Buscar por ciudad
 *
 * Salir
 *
 * @author KevinNS
 */
public class EjercicioRepasoFicheros4 {

    /**
     * Método que añade un contacto al fichero, que además si no existe lo crea
     *
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static void añadirContacto() throws FileNotFoundException, IOException {
        Scanner entrada = new Scanner(System.in);

        // Pedimos los datos que llevará nuestro fichero
        System.out.println("Nombre contacto: ");
        String nombre = entrada.nextLine();
        System.out.println("Edad contacto: ");
        int edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Teléfono contacto: ");
        String telefono = entrada.nextLine();
        System.out.println("Email contacto: ");
        String email = entrada.nextLine();
        System.out.println("Ciudad contacto: ");
        String ciudad = entrada.nextLine();

        // Creamos un try with resources
        try (FileWriter fw = new FileWriter("agenda.txt", true); 
             PrintWriter pw = new PrintWriter(fw)) {

            // Añadimos los datos separados por lineas
            pw.println("Nombre: " + nombre);
            pw.println("Edad: " + edad);
            pw.println("Tlfno: " + telefono);
            pw.println("Email: " + email);
            pw.println("Ciudad: " + ciudad);

            System.out.println("-----------------------------------------------");

        }
    }

    /**
     * Método que muestra el contenido del fichero
     *
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static void mostrarFichero() throws FileNotFoundException, IOException {

        // Creamos un try with resoruces para leer el fichero
        try (FileReader fr = new FileReader("agenda.txt"); 
             BufferedReader br = new BufferedReader(fr)) {

            // Creamos la variable linea
            String linea;
            System.out.println("---MOSTRANDO CONTACTOS---");

            // Creamos un while para leer linea a linea
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
                linea = br.readLine();
                System.out.println(linea);
                linea = br.readLine();
                System.out.println(linea);
                linea = br.readLine();
                System.out.println(linea);
                linea = br.readLine();
                System.out.println(linea);

                System.out.println("-------------------------------------------");

            }
        }
    }

    /**
     * Método que muestra los datos del nombre del contacto que introduzca el usuario
     * 
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public static void mostrarPorNombre() throws FileNotFoundException, IOException {
        Scanner entrada = new Scanner(System.in);

        // Pedimos el nombre del contacto a mostrar
        System.out.println("Introduce el nombre del contacto que buscas: ");
        String nombreBuscado = entrada.nextLine();

        // Creamos un try with resources
        try (FileReader fr = new FileReader("agenda.txt"); 
             BufferedReader br = new BufferedReader(fr)) {

            // Creamos la variable linea
            String linea;
            System.out.println("---MOSTRANDO DATOS POR NOMBRE---");

            // Creamos un while
            while ((linea = br.readLine()) != null) {

                // Creamos las variables para guardar los datos
                String nombre = linea;
                String edad = br.readLine();
                String telefono = br.readLine();
                String email = br.readLine();
                String ciudad = br.readLine();
                
                // Si el nombre buscado existe imprimimos por pantalla
                if (nombre.toLowerCase().contains(nombreBuscado.toLowerCase())) {
                    System.out.println("| " + nombre + " | " + edad
                            + " | " + telefono + " | " + email + " | " + ciudad);

                }
            }
        }
    }

    /**
     * Método que muestra los datos del contacto con la ciudad que introduzca 
     * el usuario
     * 
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public static void mostrarPorCiudad() throws FileNotFoundException, IOException {
        Scanner entrada = new Scanner(System.in);

        // Pedimos la ciudad del contacto a mostrar
        System.out.println("Introduce la ciudad del contacto que buscas: ");
        String ciudadBuscada = entrada.nextLine();

        // Creamos un try with resources
        try (FileReader fr = new FileReader("agenda.txt"); 
             BufferedReader br = new BufferedReader(fr)) {

            // Creamos la variable linea
            String linea;
            System.out.println("---MOSTRANDO DATOS POR CIUDAD---");

            // Creamos un while
            while ((linea = br.readLine()) != null) {

                // Creamos las variables para que salgan guardar los datos
                String nombre = linea;
                String edad = br.readLine();
                String telefono = br.readLine();
                String email = br.readLine();
                String ciudad = br.readLine();

                if (ciudad.toLowerCase().contains(ciudadBuscada.toLowerCase())) {
                    System.out.println("| " + nombre + " | " + edad
                            + " | " + telefono + " | " + email + " | " + ciudad);

                }
            }
        }
    }

    /**
     * Método que muestra el menú
     */
    public static void mostrarMenu() {
        System.out.println("1.Añadir contacto fichero");
        System.out.println("2.Mostrar todos los contactos");
        System.out.println("3.Mostrar contacto por nombre");
        System.out.println("4.Mostrar contacto por ciudad");
        System.out.println("5.Salir");
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
                        añadirContacto();
                        break;
                    case 2:
                        mostrarFichero();
                        break;
                    case 3:
                        mostrarPorNombre();
                        break;
                    case 4:
                        mostrarPorCiudad();
                        break;
                    case 5:
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

        } while (opcion != 5);

    }

}
