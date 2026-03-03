package ejercicio7t10temperaturas;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Diseña programa que almacene, en una lista de listas de enteros (2
 * dimensiones), las temperaturas medias de un mes que introduzca un usuario.
 * Para hacerlo más sencillo vamos a suponer que el mes tiene 28 días y está
 * formado por 4 semanas de 7 días. Hasta que el usuario pulse 5, mostrar un
 * menú que nos permita: 1. Rellenar las temperaturas. 2. Mostrar las
 * temperaturas. 3. Visualizar la temperatura media del mes. 4. Día o días más
 * calurosos del mes.
 *
 * Ejemplo: El día o días más calurosos fueron: • ElJueves de la Semana 3 con 40
 * grados. • El Sábado de la Semana 4 con 40 grados.
 *
 * 5. Salir del programa.
 *
 * • Fíjate que necesitarás un array (o una lista) con el nombre de los días de
 * la semana.
 *
 * @author KevinNS
 */
public class Ejercicio7T10Temperaturas {

    public final static int SEMANAS = 4;
    public final static int DIAS = 7;

    /**
     * Método que rellena la lista de listas con 28 temperaturas
     *
     * @param temperaturas
     */
    public static void rellenar(ArrayList<ArrayList<Integer>> temperaturas) {
        for (int i = 0; i < SEMANAS; i++) {
            // Creo el ArrayList de temperaturas de la semana
            ArrayList<Integer> dias = new ArrayList<>();

            // Relleno el ArrayList de temperaturas de la semana
            for (int j = 0; j < DIAS; j++) {
                dias.add((int) (Math.random() * 15));

            }
            // Inserto las temperaturas de la semana a la lista
            temperaturas.add(dias);
        }
    }

    /**
     * Método que muestra las temperaturas del mes
     *
     * @param temperaturas
     * @param nombreDias
     */
    public static void mostrar(ArrayList<ArrayList<Integer>> temperaturas, String[] nombreDias) {
        if (temperaturas.isEmpty()) {
            System.out.println("No hay temperaturas registradas");
        } else {
            for (int i = 0; i < SEMANAS; i++) {
                System.out.println("Semana " + (i + 1));
                for (int j = 0; j < DIAS; j++) {
                    System.out.println(nombreDias[j] + ": " + temperaturas.get(i).get(j) + "ºC");

                }
            }
        }
    }

    /**
     * Método que muestra la temperaura media del mes
     *
     * @param temperaturas
     */
    public static void calcularMedia(ArrayList<ArrayList<Integer>> temperaturas) {
        int media = 0;

        for (int i = 0; i < SEMANAS; i++) {

            for (int j = 0; j < DIAS; j++) {
                media += temperaturas.get(i).get(j);

            }
        }

        media /= SEMANAS * DIAS;
        System.out.println("La temperatura media del mes es: " + media);
    }

    public static void mostrarTemperaturaMaxima(ArrayList<ArrayList<Integer>> temperaturas, String[] nombreDias) {
        int maxTemp = 0, tempActual;

        for (int i = 0; i < SEMANAS; i++) {

            for (int j = 0; j < DIAS; j++) {
                tempActual = temperaturas.get(i).get(i);

                if (tempActual > maxTemp) {
                    maxTemp = tempActual;
                }

            }
        }
        System.out.println("Los dias con temperaturas mas alta son: ");
        for (int i = 0; i < SEMANAS; i++) {

            for (int j = 0; j < DIAS; j++) {
                if (temperaturas.get(i).get(j) == maxTemp) {
                    System.out.println("El " + nombreDias[j] + " de la semana " + (i + 1) + " con " + maxTemp);
                }
            }

        }

    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> temperaturas = new ArrayList<>();

        String[] nombreDias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};

        int opcion = 0;

        do {
            try {
                System.out.println("1. Rellenar temperaturas");
                System.out.println("2. Mostrar temperaturas");
                System.out.println("3. Visualizar temperatura media");
                System.out.println("4. Mostrar días mas calurosos");
                System.out.println("5. Salir");
                opcion = entrada.nextInt();

                switch (opcion) {
                    case 1:
                        rellenar(temperaturas);
                        break;
                    case 2:
                        mostrar(temperaturas, nombreDias);
                        break;
                    case 3:
                        calcularMedia(temperaturas);
                        break;
                    case 4:
                        mostrarTemperaturaMaxima(temperaturas, nombreDias);
                        break;
                    case 5:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error. Introduzca un número entre 1 y 5");
            }

        } while (opcion != 5);
    }

}
