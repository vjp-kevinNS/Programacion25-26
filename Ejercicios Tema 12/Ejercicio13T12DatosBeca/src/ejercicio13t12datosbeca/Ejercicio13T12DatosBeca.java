package ejercicio13t12datosbeca;

import java.io.*;
import java.util.Scanner;

/**
 * Realizar un programa que lea de teclado (la entrada estándar) los siguientes
 * datos:
 *
 * • Nombre y apellido de un supuesto becario.
 *
 * • Sexo (H-M)
 *
 * • Edad(20-60)
 *
 * • Número de suspensos del curso anterior (0-4).
 *
 * • Residencia familiar (SI-NO)
 *
 * • Ingresos anuales de la familia.
 *
 * • Los datos se almacenan en un fichero llamado “DatosBeca.txt”.
 *
 * • Cuando vuelvas a ejecutar el programa no se sobrescribirá el fichero, sino
 * que se seguirán añadiendo posibles becarios al final del fichero.
 *
 * @author KevinNS
 */
public class Ejercicio13T12DatosBeca {

    /**
     * Método que pide los datos del becario al usuario
     *
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static void añadirBecario() throws FileNotFoundException, IOException {
        Scanner entrada = new Scanner(System.in);

        // Pedimos los datos del becario
        System.out.println("Nombre y apellidos: ");
        String nombre = entrada.nextLine();
        System.out.println("Sexo (H/M): ");
        String sexo = entrada.nextLine();
        System.out.println("Edad (20-60): ");
        int edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Número de suspensos (0-4): ");
        int suspensos = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Residencia familiar (si/no): ");
        String residencia = entrada.nextLine();
        System.out.println("Ingresos anuales de la familia: ");
        double ingresos = entrada.nextDouble();
        entrada.nextLine();

        // LLamamos al método qwue escribe en el archivo
        guardarEnArchivo(nombre, sexo, edad, suspensos, residencia, ingresos);
    }

    /**
     * Método que vuelca los datos al fichero de texto
     * 
     * @param nombre
     * @param sexo
     * @param edad
     * @param suspensos
     * @param residencia
     * @param ingresos
     * @throws FileNotFoundException
     * @throws IOException 
     */
    private static void guardarEnArchivo(String nombre, String sexo, int edad, int suspensos, String residencia, double ingresos) throws FileNotFoundException, IOException {
        // Creamos el nombre del fichero
        String nombreFichero = "DatosBeca.txt";

        // Creamos un try-with-resources
        try (FileWriter fw = new FileWriter(nombreFichero, true); PrintWriter pw = new PrintWriter(fw)) {

            // Escribimos los datos del becario
            pw.println("Becario: " + nombre);
            pw.println("Sexo: " + sexo + " | Edad: " + edad + " años");
            pw.println("Suspensos: " + suspensos + " | Residencia Familiar: " + residencia);
            pw.println("Ingresos anuales: " + ingresos + "€");
            System.out.println("----------------------------------------------");
        }
    }

    public static void main(String[] args) {
        
        // Creamos un try catch
        try {
            // Lamamos al método que pide los datos y los guarda
            añadirBecario();
            System.out.println("Proceso finalizado. Los datos se han guardado en DatosBecas.txt");
            
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: No se encuentra el archivo. Comprueba su ubicación.");
        } catch (IOException e) {
            System.out.println("ERROR de lectura/escritura: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.toString());
        }

    }

}
