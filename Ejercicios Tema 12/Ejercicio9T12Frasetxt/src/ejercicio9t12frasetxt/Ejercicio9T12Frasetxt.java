package ejercicio9t12frasetxt;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Realiza un programa en JAVA que lea un archivo creado en el bloc de notas
 * llamado frase.txt que contiene una línea de texto.
 *
 * Luego, el programa creará un archivo llamado fraseinvertida.txt que contendrá
 * el texto invertido del archivo frase.txt.
 *
 * • Ejemplo: Si frase.txt contiene Hola, que tal fraseinvertida.txt contendrá
 * lat euq ,aloH
 *
 * @author KevinNS
 */
public class Ejercicio9T12Frasetxt {

    /**
     * Método que lee y escribe un fichero
     *
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static void procesarFrase() throws FileNotFoundException, IOException {

        String origen = "frase.txt";
        String destino = "fraseinvertida.txt";

        // Usamos try-with-resources
        try (FileReader fr = new FileReader(origen); BufferedReader br = new BufferedReader(fr)) {

            // Leemos la frase del archivo original
            String textoOriginal = br.readLine();

            // Comprobamos que el archivo no esté vacío
            if (textoOriginal != null) {

                // Invertimos el texto usando el método auxiliar
                String fraseAlReves = invertirTexto(textoOriginal);

                // Abrimos el flujo de escritura y guardamos el resultado
                try (FileWriter fw = new FileWriter(destino); PrintWriter pw = new PrintWriter(fw)) {

                    pw.print(fraseAlReves); // Escribimos la frase invertida
                    System.out.println("Texto invertido guardado correctamente");
                }
            } else {
                System.out.println("El archivo frase.txt está vacío");
            }
        }
    }

    /**
     * Método que invierte cualquier cadena que reciba
     *
     * @param texto
     * @return
     */
    public static String invertirTexto(String texto) {
        String invertida = ""; // Para ir montando la frase al revés

        // Creamos un for y empezamos desde la última posición hasta la 0
        for (int i = texto.length() - 1; i >= 0; i--) {

            // Usamos charAt para sacar el carácter de la posición "i"
            invertida = invertida + texto.charAt(i);
        }

        return invertida; // Devolvemos el resultado final
    }

    public static void main(String[] args) {
        // Creamos un try catch para capturar las excepciones lanzadas anteriormente
        try {
            // Ejecutamos el método que gestiona los archivos
            procesarFrase();
            System.out.println("Proceso realizado con éxito");

        } catch (FileNotFoundException e) {
            System.out.println("ERROR: No se encuentra el archivo 'frase.txt'. Comprueba su ubicación.");
        } catch (IOException e) {

            System.out.println("ERROR de lectura/escritura: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.toString());
        }

    }
}