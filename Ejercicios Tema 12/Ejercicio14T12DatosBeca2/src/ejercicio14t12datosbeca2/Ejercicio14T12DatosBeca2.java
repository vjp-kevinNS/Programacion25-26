package ejercicio14t12datosbeca2;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Realizar un programa que partiendo del fichero “DatosBeca.txt” calcule la
 * cuantía de la beca (en caso de que la haya).
 *
 * El total de la beca se calcula como sigue:
 *
 * • Base fija de 1500€
 *
 * • Si los ingresos anuales de la familia son menores o iguales a la media
 * (12.000€), la beca se incrementa en 500€, en caso contrario no lleva
 * complementos.
 *
 * • Si la edad de la persona es inferior a 23 años, 200€ de gratificación, si
 * es mayor no hay gratificación.
 *
 * • Si no hay suspensos en el curso anterior, hay una gratificación de 500€, 1
 * suspenso 200€, si hay 2 suspensos o más no hay beca.
 *
 * • Si vive de alquiler (no residencia familiar), 1000€ más de gratificación.
 *
 * • Visualizar el nombre de cada uno de los becarios y su cuantía total (sólo
 * los que tienen beca).
 *
 * @author KevinNS
 */
public class Ejercicio14T12DatosBeca2 {

    /**
     * Método que lee el fichero y guarda los aptos en el array
     *
     * @param lista
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static int procesarBecarios(String[] lista) throws FileNotFoundException, IOException {
        String ruta = "DatosBeca.txt";
        int contador = 0; // Para saber en qué posición del array guardar cada becario

        // Creamos un try...
        try (FileReader fr = new FileReader(ruta); BufferedReader br = new BufferedReader(fr)) {

            String linea;
            System.out.println("---LISTADO DE BECARIOS ADMITIDOS---");

            //Leemos el fichero mientras queden datos
            while ((linea = br.readLine()) != null) {
                // Extraemos el nombre
                String nombre = linea.split(": ")[0];

                // Extraemos sexo y edad
                String linea2 = br.readLine();
                int edad = Integer.parseInt(linea2.split("Edad: ")[1].trim());

                // Extraemos suspensos y residencia
                String linea3 = br.readLine();
                int suspensos = Integer.parseInt(linea3.split("Suspensos: ")[1].split(" ")[0]);
                // Cogemos lo que hay después de residencia familiar:
                String residencia = linea3.split("Residencia Familiar: ")[1].trim();

                // Extrameos ingresos
                String linea4 = br.readLine();
                // Quitamos los símbolos para que sea un número válido (.trim para eliminar espacios en blanco)
                double ingresos = Double.parseDouble(linea4.split(": ")[1].replace("€", "").trim());

                // Saltamos el separador
                br.readLine();

                // LLamamos al método del cálculo
                double totalBeca = calcularBeca(edad, suspensos, residencia, ingresos);

                // Si tiene derecho a beca lo guardamos en el array
                if (totalBeca > 0) {
                    lista[contador] = "Becario: " + nombre + " | Beca: " + totalBeca + "€";
                    contador++; // Incrementamos para el siguien becario
                }
            }
            System.out.println("Se han encontrado " + contador + " becarios con derecho a ayuda");
        }
        
        return contador;
    }

    /**
     * Método que calcula la beca en función de ingresos,etc...
     *
     * @param edad
     * @param suspensos
     * @param residencia
     * @param ingresos
     * @return
     */
    public static double calcularBeca(int edad, int suspensos, String residencia, double ingresos) {
        // Si tiene 2 o más suspensos no hay beca
        if (suspensos >= 2) {
            return 0;
        }

        double beca = 1500; // Base fija

        if (ingresos <= 12000) {
            beca += 500; // Complemento por ingresos          
        }

        if (edad < 23) {
            beca += 200; // Gratificación por edad
        }

        if (suspensos == 0) {
            beca += 500; // Por 0 suspensos
        } else if (suspensos == 1) // Por 1 suspenso
        {
            beca += 200;
        }

        if (residencia.equalsIgnoreCase("no")) {
            beca += 1000; // Por vivir de alquiler
        }

        return beca;
    }

    /**
     * Método que muestra la lista de becarios
     *
     * @param lista
     * @param limite
     */
    public static void mostrarLista(String[] lista, int limite) {
        System.out.println("---LISTADO DE BECARIOS----");

        if (limite == 0) {
            System.out.println("No hay becarios que cumplan los requisitos");
        } else {
            // Usamos un for normal para ir desde 0 hasta el límite de becarios encontrados
            for (int i = 0; i < limite; i++) {
                System.out.println(lista[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Creamos un array de Strings
        String[] resultados = new String[10];

        try {
            // LLamamos al método de procesarBecarios
            int cantidadConBeca = procesarBecarios(resultados);
            
            // LLamamos al método para mostrar el array por pantalla
            mostrarLista(resultados, cantidadConBeca);
            
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: No se encuentra el archivo. Comprueba su ubicación.");
        } catch (IOException e) {
            System.out.println("ERROR de lectura/escritura: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.toString());
        }


    }

}
