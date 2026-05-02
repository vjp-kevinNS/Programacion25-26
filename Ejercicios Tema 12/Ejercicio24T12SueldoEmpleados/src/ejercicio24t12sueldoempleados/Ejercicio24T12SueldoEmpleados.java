package ejercicio24t12sueldoempleados;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Desarrolle una aplicación en Java que determine el sueldo bruto para cada uno
 * de los empleados de una empresa. La empresa paga la tarifa normal en las
 * primeras 40 horas de trabajo de cada empleado, y paga tarifa y media en todas
 * las horas trabajadas que excedan de 40.
 *
 * • El programa creará los objetos que quiera el usuario (uno para cada
 * empleado) los meterá en una lista y luego los volcará a un fichero. Ten en
 * cuenta que cuando se vuelva a ejecutar el programa se podrán seguir añadiendo
 * empleados.
 *
 * • Por cada empleado se almacenará su nombre, el número de horas que trabajó,
 * y la tarifa que cobra por una hora de trabajo.
 *
 * • Para finalizar el programa debe leer el fichero y determinar y mostrar el
 * sueldo bruto de cada empleado. Ejemplo: Pepe trabajó 42 horas, cobra 20 euros
 * la hora por lo que le corresponde un sueldo de 860 euros.
 *
 * • Nota 1: Realiza un método para establecer el nombre de cada empleado, otro
 * para establecer para las horas y otro para establecer la tarifa.
 *
 * • Nota 2: Crea otros 3 métodos para devolver el nombre de cada empleado, otro
 * para devolver las horas y otro para devolver la tarifa.
 *
 * • Nota 3: Utiliza un método que lea el fichero y que calcule el sueldo que
 * corresponde a cada empleado.
 *
 * @author KevinNS
 */
public class Ejercicio24T12SueldoEmpleados {

    /**
     * Método que introduce los datos de un nuevo empleado
     *
     * @param lista
     */
    public static void introducirDatos(ArrayList<Empleado> lista) {
        Scanner sc = new Scanner(System.in);
        String respuesta;

        do {
            Empleado emp = new Empleado(); // Creamos un objeto nuevo

            System.out.print("Introduce el nombre del empleado: ");
            emp.setNombre(sc.nextLine());

            System.out.print("Horas trabajadas: ");
            emp.setHoras(Double.parseDouble(sc.nextLine()));

            System.out.print("Tarifa por hora (€): ");
            emp.setTarifa(Double.parseDouble(sc.nextLine()));

            lista.add(emp); // Guardamos el objeto en la lista

            System.out.print("¿Deseas añadir otro empleado? (SI/NO): ");
            respuesta = sc.nextLine();

        } while (respuesta.equalsIgnoreCase("SI"));
    }

    /**
     * Método que crea el fichero con lso datos de los empleados
     *
     * @param lista
     */
    public static void volcarAFichero(ArrayList<Empleado> lista) {
        String ruta = "nominas.txt";

        // Creamos un try with resources
        try (FileWriter fw = new FileWriter(ruta, true); PrintWriter pw = new PrintWriter(fw)) {

            for (Empleado e : lista) {
                // Guardamos los datos separados por ":" para poder leerlos luego con split
                pw.println(e.getNombre() + ":" + e.getHoras() + ":" + e.getTarifa());
            }
            System.out.println("*** Datos guardados correctamente en el fichero ***");

        } catch (IOException e) {
            System.out.println("Error al escribir en el fichero: " + e.getMessage());
        }
    }

    /**
     * Método que lee el fichero y calcula el sueldo bruto
     * 
     */
    public static void leerYCalcularNomina() {
        System.out.println("--- CÁLCULO DE SUELDOS BRUTOS ---");

        try (FileReader fr = new FileReader("nominas.txt"); 
             BufferedReader br = new BufferedReader(fr)) {

            String linea;
            // Leemos línea a línea hasta el final
            while ((linea = br.readLine()) != null) {
                // Troceamos la línea por el separador ":"
                String[] datos = linea.split(":");

                double h = Double.parseDouble(datos[0]);
                double t = Double.parseDouble(datos[0]);

                // Cálculamos el sueldo brutos
                double sueldo;
                if (h <= 40) {
                    sueldo = h * t;
                } else {
                    double extras = h - 40;
                    // 40h normales + extras cobradas a 1.5 veces la tarifa
                    sueldo = (40 * t) + (extras * t * 1.5);
                }

                System.out.println("El empelado trabajó " + h + " horas. Sueldo Bruto: " + sueldo + "€");
            }

        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe todavía.");
        } catch (IOException e) {
            System.out.println("Error de lectura: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Creamos la lista de empleados
        ArrayList<Empleado> listaTemporal = new ArrayList<>();

        // LLamamos a lo métodos
        introducirDatos(listaTemporal);
        volcarAFichero(listaTemporal);
        leerYCalcularNomina();

    }

}
