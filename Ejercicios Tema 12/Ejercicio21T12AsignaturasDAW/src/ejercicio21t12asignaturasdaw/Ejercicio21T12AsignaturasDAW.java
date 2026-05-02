package ejercicio21t12asignaturasdaw;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Realiza un programa en JAVA en el que le pidas al usuario las notas de las 6
 * asignaturas del Ciclo de DAM y las guarde en un fichero.
 *
 * Posteriormente leerá el fichero y te calculará la nota media del curso.
 *
 * • Cada una de las asignaturas serán un objeto cuyos atributos serán el nombre
 * y la nota.
 *
 * • Con el constructor podrás asignar directamente el nombre de la asignatura
 * al crear el objeto. En cambio, el atributo nota, será el usuario quien lo
 * introduzca mediante un método que controle que la nota tenga un valor
 * numérico (no letras) entre 0 y 10.
 *
 * @author KevinNS
 */
public class Ejercicio21T12AsignaturasDAW {

    /**
     * Método que lee las notas y calcula la nota media
     *
     * @throws IOException
     */
    public static void leerYCalcularMedia(){

        double suma = 0;
        int contador = 0;

        // Creamos un try withce resources
        try (BufferedReader br = new BufferedReader(new FileReader("NotasDAM.txt"))) {
            String linea;

            // Bucle de lectura hasta que devuelva null
            while ((linea = br.readLine()) != null) {

                // Separamos los datos por el ":"
                String[] partes = linea.split(":");

                // El índice 1 es la nota (String), la pasamos a double para sumar
                suma += Double.parseDouble(partes[1]);
                contador++;
            }

            if (contador > 0) {
                System.out.println("Nota media del curso: " + (suma / contador));
            }
        } catch (IOException e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Creamos el array
        Asignatura[] listaAsignatura = new Asignatura[6];

        // Asignamos un objeto del array a cada asignatura
        listaAsignatura[0] = new Asignatura("Programación", 0);
        listaAsignatura[1] = new Asignatura("Lenguaje de marcas", 0);
        listaAsignatura[2] = new Asignatura("Bases de Datos", 0);
        listaAsignatura[3] = new Asignatura("Entorno de desarrollo", 0);
        listaAsignatura[4] = new Asignatura("Sistemas Informaticos", 0);
        listaAsignatura[5] = new Asignatura("Formación y orientación laboral", 0);

        // PEDIR DATOS
        for (Asignatura a : listaAsignatura) {
            a.introducirNota(entrada);
        }

        // GUARDAR EN FICHERO
        
        // Usamos try-with-resources
        try (PrintWriter pw = new PrintWriter(new FileWriter("NotasDAM.txt"))) {
            for (Asignatura a : listaAsignatura) {
                pw.println(a.getNombre() + ":" + a.getNota()); // Separador ":"
            }
            System.out.println("*** Notas guardadas con éxito ***");
        } catch (IOException e) {
            System.out.println("Error al escribir: " + e.getMessage());
        }

        // LEER Y CALCULAR MEDIA
        leerYCalcularMedia();

    }
}
