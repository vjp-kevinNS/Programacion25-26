package ejercicio12.bis2.t12cadenas;

import java.io.*;
import java.util.Scanner;

/**
 * Escriba un programa en JAVA que contenga un método, de nombre
 * escribirCadenasEnArchivo, que reciba un array de 4 cadenas de caracteres
 * (previamente relleno por el usuario) y vuelque su contenido a un archivo cuyo
 * nombre también se recibirá por parámetro. 
 * 
 * • Las cadenas quedarán separadas en el archivo por un asterisco.
 *
 * @author KevinNS
 */
public class Ejercicio12Bis2T12Cadenas {
    
    /**
     * Método que recibe el array y el nombre y escribe los datos separados por
     * un asterisco
     * 
     * @param cadenas
     * @param nombre
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public static void escribirCadenasEnArchivo(String[]cadenas, String nombre)throws FileNotFoundException,IOException{
        
        // Creamos un try-witch-resources
        try(FileWriter fw = new FileWriter(nombre);
            PrintWriter pw = new PrintWriter(fw)){
            
            // Recorremos el array para volcar el contenido del fichero
            for (int i = 0; i < cadenas.length; i++) {
                
                // Escribimos la frase actual sin saltar de línea(usando print)
                pw.print(cadenas[i]);
                
                // Si no es la últimas cadena, ponemos el separador "*"
                if(i < cadenas.length - 1){
                    pw.print("*");
                }
                
            }
            
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        // Creamos el array de 4 posiciones
        String[]misFrases = new String[4];
        
        // Pedimos al usuario que rellene el array
        System.out.println("Introduce 4 frases para el archivo: ");
        for (int i = 0; i < misFrases.length; i++) {
            System.out.println("Escribe la frase " + (i + 1) + ": ");
            misFrases[i] = entrada.nextLine();
        }
        
        // Pedimos el nombre del archivo de destino
        System.out.println("¿Qué nombre quieres ponerle al archivo?: ");
        String nombreFichero = entrada.nextLine();
        
        // Creamos un try catch y llamamos al método creado
        try {
            escribirCadenasEnArchivo(misFrases, nombreFichero);
            System.out.println("Se ha creado el fichero con éxito");
            
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: No se encuentra el archivo. Comprueba su ubicación.");
        } catch (IOException e) {
            System.out.println("ERROR de lectura/escritura: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.toString());
        }

    }

}
