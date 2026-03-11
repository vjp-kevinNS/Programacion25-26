package tema10arraylist;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Ejercicio 7:
 * 
 * Semana1 - Semana2 - Semana3 - Semana4
 *   |          |         |         |
 *  Día1       ...       ...       ...
 *  Día2
 *  Día3
 *  Día4
 *  Día5
 *  Día6
 *  Día7
 * 
 * @author KevinNS
 */
public class ListasDeListas {

    public final static int SEMANAS = 4;
    public final static int DIAS = 7;

    /**
     * Método que rellena la lista de listas con 28 temperaturas.
     *
     * @param temperaturas
     */
    public static void rellenar(ArrayList<ArrayList<Integer>> temperaturas) {
        for (int i = 0; i < SEMANAS; i++) {
            // Creo el arrayList de temperaturas de la semana
            ArrayList<Integer> dias = new ArrayList<>();

            // Relleno el arrayList de temperaturas de la semana
            for (int j = 0; j < DIAS; j++) {
                dias.add((int) (Math.random() * 15));
            }

            // Inserto las temperaturas de la semana a la lista
            temperaturas.add(dias);

        }
    }

    /**
     * Método que muestra las temperaturas del mes.
     *
     * @param temperaturas
     * @param nombreDias
     */
    public static void mostrar(ArrayList<ArrayList<Integer>> temperaturas, String[] nombreDias) {
        if (temperaturas.isEmpty()) {
            System.out.println("No hay temperaturas registradas en el mes");
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
     * Método que muetra la temperatura media del mes.
     *
     * @param temperaturas
     */
    public static void calcularMedia(ArrayList<ArrayList<Integer>> temperaturas) {
        if (temperaturas.isEmpty()) {
            System.out.println("No hay temperaturas registradas en el mes");
        } else {
            int media = 0;

            for (int i = 0; i < SEMANAS; i++) {

                for (int j = 0; j < DIAS; j++) {
                    media += temperaturas.get(i).get(j);
                }
            }

            media /= SEMANAS * DIAS;

            System.out.println("la temperatura media del mes es: " + media);
        }
    }

    /**
     * Método que muestra los días con mayor temperatura.
     *
     * @param temperaturas
     * @param nombreDias
     */
    public static void mostrarTemperaturasMaximas(ArrayList<ArrayList<Integer>> temperaturas, String[] nombreDias) {
        if (temperaturas.isEmpty()) {
            System.out.println("No hay temperaturas registradas en el mes");
        } else {
            int maxTemp = 0, tempActual;

            for (int i = 0; i < SEMANAS; i++) {
                for (int j = 0; j < DIAS; j++) {
                    tempActual = temperaturas.get(i).get(j);

                    if (tempActual > maxTemp) {
                        maxTemp = tempActual;
                    }

                }
            }

            System.out.println("Los días con temperaturas más altas son:");
            for (int i = 0; i < SEMANAS; i++) {
                for (int j = 0; j < DIAS; j++) {
                    if (temperaturas.get(i).get(j) == maxTemp) {
                        System.out.println("El " + nombreDias[j] + " de la semana " + (i + 1) + " con " + maxTemp);
                    }

                }
            }
        }
    }

    /**
     * Método que pide la opción del menú al usuario
     *
     * @return la opción introducida.
     */
    public static int pedirOpcion() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }

    /**
     * Método principal.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> temperaturas = new ArrayList<>();
        String[] nombreDias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        int opcion = 0;

        do {

            try {
                System.out.println("1. Rellenar las temperaturas");
                System.out.println("2. Mostrar las temperaturas");
                System.out.println("3. Temperatura media");
                System.out.println("4. Mostrar días más calurosos");
                System.out.println("5. Salir");
                System.out.print("   Opción: ");

                opcion = pedirOpcion();

                switch (opcion) {
                    case 1 ->
                        rellenar(temperaturas);
                    case 2 ->
                        mostrar(temperaturas, nombreDias);
                    case 3 ->
                        calcularMedia(temperaturas);
                    case 4 ->
                        mostrarTemperaturasMaximas(temperaturas, nombreDias);
                    case 5 ->
                        System.out.print("Gracias por usar el programa :)");
                    default ->
                        System.out.print("Opción no válida: Escribe un número entre 1 y 5.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: Introduzca un número entero entre 1 y 5");
            }

        } while (opcion != 5);

    }

}
