package ejercicio12bist12masnumeros;

import java.io.*;
import java.util.Scanner;

/**
 * Realiza un programa en JAVA que lea un archivo creado en el bloc de notas
 * llamado masnumeros.txt que contiene varias líneas y en cada una de ellas hay
 * varios números separados por ; (punto y coma).
 *
 * • El programa te mostrará por pantalla la suma de todos los números del
 * fichero.
 *
 * @author KevinNS
 */
public class Ejercicio12bisT12MasNumeros {

    /**
     * Método que lee el archivo, separa los números y los suma
     *
     * @return
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static int calcularSumaDesdeArchivo() throws FileNotFoundException, IOException {
        String ruta = "masnumeros.txt"; // Nombre del fichero
        int sumaAcumulada = 0; // Para guardar el total de la suma

        // Creamos try-with-resources
        try (FileReader fr = new FileReader(ruta); 
             BufferedReader br = new BufferedReader(fr)) {

            String linea;

            // Creamos un while para que lea el fichero línea a línea hasta el final
            while ((linea = br.readLine()) != null) {

                // Dividimo la línea en pares usando el separado punto y coma
                String[] trozos = linea.split(";");

                // Recorremos el array de trozos de texto
                for (String trozo : trozos) {

                    // Convertimos cada trozo de texto a un número entero
                    // Usamos trim() por si hay espacios en blanco
                    sumaAcumulada += Integer.parseInt(trozo.trim());
                }
            }
            return sumaAcumulada; // Devolvemos el total
        }
    }

    public static void main(String[] args) {
        // Creamos un try catch para capturar las excepciones lanzadas anteriormente
        try {
            // LLamamos al método que realiza el cálculo
            int resultadoTotal = calcularSumaDesdeArchivo();
            System.out.println("La suma total de todos los números del fichero es: "
                    + resultadoTotal);

        } catch (FileNotFoundException e) {
            System.out.println("ERROR: No se encuentra el archivo. Comprueba su ubicación.");
        } catch (IOException e) {
            System.out.println("ERROR de lectura/escritura: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.toString());
        }

    }

}
