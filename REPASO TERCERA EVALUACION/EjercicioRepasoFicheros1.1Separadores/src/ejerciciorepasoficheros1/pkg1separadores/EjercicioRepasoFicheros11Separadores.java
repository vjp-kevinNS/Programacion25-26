package ejerciciorepasoficheros1.pkg1separadores;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author KevinNS
 */
public class EjercicioRepasoFicheros11Separadores {

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
        try (FileWriter fw = new FileWriter("agenda2.txt", true);                
            PrintWriter pw = new PrintWriter(fw)) {

            // Añadimos los datos al fichero, en este caso solo las variables separados por lo que queramos(";")
            pw.println(nombreContacto + ";" + edad + ";" + numTelefono);

            System.out.println("Contacto añadido");

        } catch (FileNotFoundException e) {
            System.out.println("Error al abrir el archivo " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error al escribir del archivo " + e.getMessage());
        }
    }

    /**
     * Método que muestra el contenido del fichero con separadores
     *
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static void mostrarContenidoFichero() throws FileNotFoundException, IOException {

        // Creamos un try-witch-resources
        try (FileReader fr = new FileReader("agenda2.txt");
             BufferedReader br = new BufferedReader(fr)) {

            // Creamos la variable linea
            String linea;
            System.out.println("---CONTENIDO DEL FICHERO---");

            // Creamos un while con un array de String y usamos split
            while ((linea = br.readLine()) != null) {

                if (linea.trim().isEmpty()) {
                    continue;
                }
                String[] lineaArr = linea.split(";");

                if (lineaArr.length >= 3) {
                    System.out.println("Nombre: " + lineaArr[0]);
                    System.out.println("Edad: " + lineaArr[1]);
                    System.out.println("Tlfn: " + lineaArr[2]);
                    System.out.println("-----------------------------");

                }

            }

        } catch (FileNotFoundException e) {
            System.out.println("Error al abrir el archivo " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error al leer del archivo " + e.getMessage());
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

        // Creamos un try-with-resources
        try (FileReader fr = new FileReader("agenda2.txt"); BufferedReader br = new BufferedReader(fr)) {

            // Creamos la variable linea
            String linea;
            System.out.println("---CONTENIDO DEL FICHERO---");

            // Pedimos al usuario el nombre del contacto
            System.out.println("Nombre de contacto: ");
            String nombreCon = entrada.nextLine();

            // Leo una línea
            linea = br.readLine();

            // Creamos un while y comprobamos el campo que introduce el usuario pasando todo a minúsculas
            while (linea != null) {

                // Si contiene ese nombre se mostrara, en este caso lo mostraremos creando un Array de String y usando split
                if (linea.toLowerCase().contains(nombreCon.toLowerCase())) {
                    String[] lineArr = linea.split(";");
                    System.out.println("Nombre " + lineArr[0]);
                    System.out.println("Edad " + lineArr[1]);
                    System.out.println("Tlfno " + lineArr[2]);
                }

                linea = br.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error al abrir el archivo " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error al leer del archivo " + e.getMessage());
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
                System.out.println("Error desconocido" + e.getMessage());
            }

        } while (opcion != 4);

    }

}
