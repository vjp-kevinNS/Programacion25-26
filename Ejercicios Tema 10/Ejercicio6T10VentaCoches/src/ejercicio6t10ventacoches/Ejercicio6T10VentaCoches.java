package ejercicio6t10ventacoches;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Realiza un programa en el que utilices una lista de enteros y que muestre un
 * menú en el que se le ofrezcan al usuario las siguientes opciones:
 *
 * 1. Introducir las ventas de coches de cada uno de los 12 meses del año. 2.
 * Mostrar las ventas introducidas en el punto anterior. 3. Mostrar las ventas
 * introducidas al revés. 4. Que muestre la suma total de ventas del año. 5. Que
 * muestre las ventas totales de los meses cuyo nombre contenga la letra a. 6.
 * Que muestre el nombre del mes (o meses) con más ventas. 7. Salir del
 * programa.
 *
 * • Necesitarás, un array unidimensional (o una lista) con el nombre de los
 * meses del año.
 *
 * • Controlaremos que el usuario elija una opción del menú entre 1 y 7. Hasta
 * que el usuario no pulse 7 no saldremos del programa.
 *
 * @author KevinNS
 */
public class Ejercicio6T10VentaCoches {

    /**
     * Método que muestra el menú al usuario
     */
    public static void mostrarMenu() {
        System.out.println("----------------GESTION DE VENTAS-----------------");
        System.out.println("----------------1.Introducir ventas---------------");
        System.out.println("----------------2.Mostrar ventas------------------");
        System.out.println("----------------3.Mostrar ventas al reves---------");
        System.out.println("----------------4.Total de ventas-----------------");
        System.out.println("----------------5.Meses con 'a'-------------------");
        System.out.println("----------------6.Mes con mas ventas--------------");
        System.out.println("----------------7.SALIR DEL PROGRAMA--------------");
    }

    /**
     * Método que le pide al usuario que rellene las ventas de todos los meses
     *
     * @param ventas
     * @param nombreMeses
     */
    public static void introducirVentas(ArrayList<Integer> ventas, String[] nombreMeses) {
        Scanner entrada = new Scanner(System.in);

        // Recorremos el array de meses
        for (int i = 0; i < nombreMeses.length; i++) {
            System.out.println("Ventas de " + nombreMeses[i] + ": ");
            ventas.add(entrada.nextInt()); // Guardamos el dato al final de la lista
        }
    }

    /**
     * Método que muestra las ventas introducidas
     *
     * @param ventas
     * @param nombreMeses
     */
    public static void mostrarVentas(ArrayList<Integer> ventas, String[] nombreMeses) {
        if (ventas.isEmpty()) { // Comprobamos que no esté vacío
            System.out.println("La lista está vacía. Usa la opcción 1");
            return;
        }

        for (int i = 0; i < ventas.size(); i++) {
            // El mes 'i' se corresponde con la venta 'i'
            System.out.println(nombreMeses[i] + ": " + ventas.get(i) + " coches");

        }
    }

    /**
     * Método que muestra las ventas al revés
     *
     * @param ventas
     * @param nombreMeses
     */
    public static void mostrarAlReves(ArrayList<Integer> ventas, String[] nombreMeses) {
        if (ventas.isEmpty()) {
            return;
        }
        System.out.println("Ventas de Diciembre a Enero: ");
        // Empezamos el for en el último índice(size -1) y va restando hasta llegar a 0
        for (int i = ventas.size() - 1; i >= 0; i--) {
            System.out.println(nombreMeses[i] + ": " + ventas.get(i));

        }
    }

    /**
     * Método que calcula la suma total de ventas
     *
     * @param ventas
     */
    public static void calcularSumaTotal(ArrayList<Integer> ventas) {
        int acumulador = 0;

        // Recorremos el array para ir sumando cada valor de la listas
        for (int i = 0; i < ventas.size(); i++) {
            acumulador += ventas.get(i);
        }
        System.out.println("La suma total de ventas en el año es: " + acumulador);
    }

    /**
     * Método que muestra las ventas de los meses que contienen la letra 'a'
     *
     * @param ventas
     * @param nombreMeses
     */
    public static void mesesConLetraA(ArrayList<Integer> ventas, String[] nombreMeses) {
        System.out.println("Ventas de meses que contienen la letra 'a': ");
        for (int i = 0; i < nombreMeses.length; i++) {

            // Usamos toLowerCase para que de igual si se escribe en mayúscula y 
            // contains('a') para buscar la letra dentro de la palabra
            if (nombreMeses[i].toLowerCase().contains("a")) {
                System.out.println(nombreMeses[i] + ": " + ventas.get(i));
            }
        }
    }
    
    /**
     * Método que muestra los meses con mayor número de ventas
     * @param ventas
     * @param nombreMeses 
     */
    public static void buscarMesesMaximos(ArrayList<Integer> ventas, String[] nombreMeses) {
        if (ventas.isEmpty()) {
            return;
        }

        // Primero encontramos el valor más alto
        int max = ventas.get(0);
        for (int i = 1; i < ventas.size(); i++) {
            if (ventas.get(i) > max) {
                max = ventas.get(i);
            }
        }
        // Después buscamos qué meses tienen ese valor máximo
        System.out.println("El mes o meses con el récord de " + max + " ventas han sido: ");
        int j = 0;
        while (j < ventas.size()) {
            if (ventas.get(j) == max) {
                System.out.println(nombreMeses[j] + " ");
            }
            j++; // Avanzamos el íondice
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Creamos un array fijo con el nombre de los meses
        String[] nombreMeses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo",
            "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

        // Creamos el ArrayList
        ArrayList<Integer> ventas = new ArrayList<>();

        int opcion = 0;

        do {
            try {
                mostrarMenu();
                opcion = entrada.nextInt();

                if (opcion < 1 || opcion > 7) {
                    System.out.println("Error: Elije una opción valida (1-7)");
                }
                switch (opcion) {
                    case 1:
                        introducirVentas(ventas, nombreMeses);
                        break;
                    case 2:
                        mostrarVentas(ventas, nombreMeses);
                        break;
                    case 3:
                        mostrarAlReves(ventas, nombreMeses);
                        break;
                    case 4:
                        calcularSumaTotal(ventas);
                        break;
                    case 5:
                        mesesConLetraA(ventas, nombreMeses);
                        break;
                    case 6:
                        buscarMesesMaximos(ventas, nombreMeses);
                        break;
                    case 7:
                        System.out.println("Saliendo del programa....");
                        break;
                    default:
                        throw new AssertionError();

                }

            } catch (InputMismatchException e) {
            }

        } while (opcion != 7);

    }

}
