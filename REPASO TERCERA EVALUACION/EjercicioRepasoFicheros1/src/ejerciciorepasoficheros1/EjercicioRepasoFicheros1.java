package ejerciciorepasoficheros1;

import java.io.*;
import java.util.*;

/**
 *  * Realiza un programa en JAVA en el que muestres un menú que te permita 3
 * opciones:
 *
 * 1. Añadir un contacto a un fichero de texto (“agenda.txt”) en el que indiques
 * en cada línea:
 *
 * • Un Nombre. • Una Edad. • Un número de teléfono.
 *
 * 2. Mostrar por pantalla el contenido del fichero de texto creado.
 *
 * 3. Salir del Programa.
 *
 * • Captura las excepciones que veas necesarias.
 *
 * @author KevinNS
 */
public class EjercicioRepasoFicheros1 {

    /**
     * Método que añade contactos al fichero previamente creado
     *
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static void añadirContacto() throws FileNotFoundException, IOException {
        Scanner entrada = new Scanner(System.in);

        // Pedimos los datos del contacto
        System.out.println("Nombre: ");
        String nombreContacto = entrada.nextLine();
        System.out.println("Edad: ");
        int edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Número de teléfono: ");
        String numTelefono = entrada.nextLine();

        // Creamos un try-with-resources
        try (FileWriter fw = new FileWriter("agenda.txt", true); PrintWriter pw = new PrintWriter(fw)) {

            // Añadimos los datos al fichero
            pw.println("Contacto nombre: " + nombreContacto + " | Edad: " + edad
                    + " | Número de teléfono: " + numTelefono);

            System.out.println("Contacto añadido");

        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo " + e.getMessage());
        }
    }

    /**
     * Método que muestra el contenido del fichero
     *
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static void mostrarContenidoFichero() throws FileNotFoundException, IOException {

        // Apuntamos al fichero
        File fichero = new File("agenda.txt");

        // Comprobamos si existe
        if (!fichero.exists()) {
            System.out.println("El fichero no existe aún");
            return;
        }

        // Creamos un try-witch-resources
        try (FileReader fr = new FileReader(fichero); BufferedReader br = new BufferedReader(fr)) {

            // Creamos la variable linea
            String linea;
            System.out.println("---CONTENIDO DEL FICHERO---");

            // Creamos un while
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo " + e.getMessage());
        }
    }

    /**
     * Método que muestra los contactos filtrados por nombre
     *
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static void mostrarContenidoPorNombre() throws FileNotFoundException, IOException {
        Scanner entrada = new Scanner(System.in);

        // Apuntamos al fichero
        File fichero = new File("agenda.txt");

        // Comprobamos si existe
        if (!fichero.exists()) {
            System.out.println("El fichero aún no existe");
            return;
        }

        // Creamos un try-with-resources
        try (FileReader fr = new FileReader(fichero); BufferedReader br = new BufferedReader(fr)) {

            // Creamos la variable linea
            String linea;
            System.out.println("---CONTENIDO DEL FICHERO---");

            // Pedimos al usuario el nombre del contacto
            System.out.println("Nombre de contacto: ");
            String nombreCon = entrada.nextLine();

            // Creamos un while
            while ((linea = br.readLine()) != null) {

                if (linea.toLowerCase().contains(nombreCon.toLowerCase())) {
                    System.out.println(linea);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo " + e.getMessage());
        }

    }

    /**
     * Método que muestra el menú
     */
    public static void mostrarMenu() {
        System.out.println("1.Añadir contacto fichero");
        System.out.println("2.Mostrar contenido del fichero");
        System.out.println("3.Mostrar contenido del fichero por nombre");
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
                        añadirContacto();
                        break;
                    case 2:
                        mostrarContenidoFichero();
                        break;
                    case 3:
                        mostrarContenidoPorNombre();
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
                System.out.println("Erro desconocido");
            }

        } while (opcion != 3);

    }

}
