package proyectocorelink;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author KevinNS
 */
public class ProyectoCorelink {

    /**
     * Método para leer el fichero uno
     *
     * @param br
     * @throws IOException
     */
    public static void leerFicheroUno() throws IOException {

        try (FileReader fr = new FileReader("./datos_empleados.txt"); 
             BufferedReader br = new BufferedReader(fr)) {

            String linea; // Variable para almacenar cada línea leída
            System.out.println("---CONTENIDO DEL FICHERO---");

            // Bucle while para leer mientras readline() no devuelva null
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    /**
     * Método para leer el fichero dos
     *
     * @param br
     * @throws IOException
     */
    public static void leerFicheroDos() throws IOException {

        try (FileReader fr = new FileReader("./04dedf8afeb8a4177a009f41bb78018af601e341ed4322d4073911c9ac879726.txt"); 
             BufferedReader br = new BufferedReader(fr)) {

            String linea; // Variable para almacenar cada línea leída
            System.out.println("---CONTENIDO DEL FICHERO---");

            // Bucle while para leer mientras readline() no devuelva null
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    /**
     * Método que muestra el menú
     */
    public static void mostrarMenu() {
        System.out.println("---------------------------------------------------");
        System.out.println("-------------------PROYECTO CORELINK---------------");
        System.out.println("-------------------1.LEER FICHERO UNO--------------");
        System.out.println("-------------------2.LEER FICHERO DOS--------------");
        System.out.println("-----------------3.EMPLEADOS ZONA CERO-------------");
        System.out.println("----------------------4 CLAVES---------------------");
        System.out.println("-----------------5.SALIR DEL PROGRAMA--------------");
        System.out.println("---------------------------------------------------");
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Creamos el menú controlando excpeciones
        int opcion = 0;
        do {
            try {
                mostrarMenu();
                opcion = entrada.nextInt();

                switch (opcion) {
                    case 1:
                        leerFicheroUno();
                        break;
                    case 2:
                        leerFicheroDos();
                        break;
                    case 3:
                        
                        break;
                    case 4:
                        
                        break;
                    case 5:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción incorrecta");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error. Has intruducido una letra");
                entrada.nextLine();
            } catch (Exception e) {
                System.out.println("Error desconocido");
                entrada.nextLine();
            }

        } while (opcion != 3);

    }

}
