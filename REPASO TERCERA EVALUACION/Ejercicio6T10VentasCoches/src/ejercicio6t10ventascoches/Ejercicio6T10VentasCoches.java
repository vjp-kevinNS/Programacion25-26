package ejercicio6t10ventascoches;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Realiza un programa en el que utilices una lista de enteros y que muestre un
 * menú en el que se le ofrezcan al usuario las siguientes opciones:
 *
 * 1. Introducir las ventas de coches de cada uno de los 12 meses del año.
 *
 * 2. Mostrar las ventas introducidas en el punto anterior.
 *
 * 3. Mostrar las ventas introducidas al revés.
 *
 * 4. Que muestre la suma total de ventas del año.
 *
 * 5. Que muestre las ventas totales de los meses cuyo nombre contenga la letra
 * a.
 *
 * 6. Que muestre el nombre del mes (o meses) con más ventas.
 *
 * 7. Salir del programa.
 *
 * • Necesitarás, un array unidimensional (o una lista) con el nombre de los
 * meses del año.
 *
 * • Controlaremos que el usuario elija una opción del menú entre 1 y 7. Hasta
 * que el usuario no pulse 7 no saldremos del programa.
 *
 * @author KevinNS
 */
public class Ejercicio6T10VentasCoches {

    /**
     * Método que rellena la lista con las 12 ventas
     *
     * @param lista
     * @param meses
     */
    public static void introducirVentas(ArrayList<Integer> lista, String[] meses) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce las ventas de cada mes: ");

        // Recorremos el array de meses
        for (int i = 0; i < meses.length; i++) {
            System.out.println(meses[i] + ": ");
            // Leemos la cifra de ventas
            int venta = entrada.nextInt();
            // La guardamos en la lista
            lista.add(venta);
        }
        System.out.println("Dtos guardados con éxito");
    }

    /**
     * Método que muestra las ventas introducidas
     *
     * @param lista
     * @param meses
     */
    public static void mostrarVentas(ArrayList<Integer> lista, String[] meses) {
        // Comprobamos que la lista esté vacía
        if (lista.isEmpty()) {
            System.out.println("No hay datos");
            return;
        }
        System.out.println("---VENTAS DE ENERO A DICIEMBRE---");

        int i = 0; // Indice para el array de nombres
        // Recorremos la lista
        for (Integer venta : lista) { // Por cada venta en la lista...
            System.out.println(meses[i] + ": " + venta + " coches");
            i++; // Pasamos al siguiente mes
        }
    }

    /**
     * Método que muestra las ventas al revés
     *
     * @param lista
     * @param meses
     */
    public static void mostrarVentasAlReves(ArrayList<Integer> lista, String[] meses) {
        // Comprobamos que la lista esté vacía
        if (lista.isEmpty()) {
            System.out.println("No hay datos");
            return;
        }
        System.out.println("---VENTAS DE DICIEMBRE A ENERO---");
        // Recorremos la lsita con un for descendente, empezando por la posición 11 bajando hasta la 0
        for (int i = lista.size() - 1; i >= 0; i--) {
            System.out.println(meses[i] + ": " + lista.get(i));
        }
    }

    /**
     * Método que muestra las ventas totales del año
     *
     * @param lista
     */
    public static void sumaTotal(ArrayList<Integer> lista) {
        int total = 0; // Para acumular la suma
        for (Integer venta : lista) {
            total += venta; // Sumamos cada venta total
        }
        System.out.println("Ventas totales del año " + total + " coches");
    }

    /**
     * Método que muestra los meses que contienen la letra a
     *
     * @param lista
     * @param meses
     */
    public static void filtrarMesesConA(ArrayList<Integer> lista, String[] meses) {
        System.out.println("---VENTAS DE MESES CON LETRA A---");

        // Recorremos la lista
        for (int i = 0; i < meses.length; i++) {
            // Comprobamos si el nombre del mes tiene la letra a
            if (meses[i].toLowerCase().contains("a")) {
                System.out.println(meses[i] + ": " + lista.get(i));
            }

        }
    }

    /**
     * Método que muestra el mes con más ventas
     * 
     * @param lista
     * @param meses 
     */
    public static void mesConMasVentas(ArrayList<Integer> lista, String[] meses) {
        // Comprobamos que la lista esté vacía
        if (lista.isEmpty()) {
            System.out.println("No hay datos");
            return;
        }
        int max = lista.get(0); // Suponemos que el primero es el mayor
        // Buscamos cuál es la cifra más alta
        for (Integer venta : lista) {
            if (venta > max) {
                max = venta ;
            }
            System.out.println("El mes o meses con más ventas (" + max + ") fueron: ");
            // Buscamos qué meses coinciden con exe máximo
            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i) == max) {
                    System.out.println(meses[i] + " ");
                }          
            }
            System.out.println();
        }
    }

    /**
     * Método que muestra el menú
     */
    public static void mostrarMenu() {
        System.out.println("---------------------------------------------------");
        System.out.println("-----------------GESTION DE VENTAS-----------------");
        System.out.println("----------------1. Introducir ventas---------------");
        System.out.println("----------------2. Mostrar ventas------------------");
        System.out.println("----------------3. Mostrar ventas al revés---------");
        System.out.println("----------------4. Suma total de ventas------------");
        System.out.println("----------------5. Ventas meses con letra a--------");
        System.out.println("----------------6. Mes con mas ventas--------------");
        System.out.println("----------------7. SALIR DEL MENU------------------");
        System.out.println("---------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Creamos la lista para las ventas
        ArrayList<Integer> listaVentas = new ArrayList<>();

        // Creamos el array con los nombres de los meses del año
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio",
            "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

        // Creamos el menu controlando excepciones
        int opcion = 0;

        do {
            try {
                mostrarMenu();
                opcion = entrada.nextInt();

                switch (opcion) {
                    case 1:
                        introducirVentas(listaVentas,meses);
                        break;
                    case 2:
                        mostrarVentas(listaVentas,meses);
                        break;
                    case 3:
                        mostrarVentasAlReves(listaVentas,meses);
                        break;
                    case 4:
                        sumaTotal(listaVentas);
                        break;
                    case 5:
                        filtrarMesesConA(listaVentas,meses);
                        break;
                    case 6:
                        mesConMasVentas(listaVentas,meses);
                        break;
                    case 7:
                        System.out.println("Saliendo del programa....");
                        break;
                    default:
                        System.out.println("Opción incorrecta");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error. Has introducido una letra");
                entrada.nextLine();
            }

        } while (opcion != 7);

    }

}
