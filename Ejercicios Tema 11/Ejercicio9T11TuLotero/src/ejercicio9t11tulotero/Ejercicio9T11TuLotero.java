package ejercicio9t11tulotero;

import java.time.LocalDate;
import java.time.Month;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * El operador de loterías “TuLotero” desea gestionar los sorteos que realiza a
 * lo largo del año.
 *
 * • Para tratar esta información, necesitaremos una clase Sorteo, cuyos
 * atributos serán la fecha del sorteo (será un LocalDate) y un vector de 4
 * celdas con los números ganadores (aleatorios de 1 a 100).
 *
 * • Los sorteos se organizarán en un .TreeMap, cuyas claves serán las fechas
 * del sorteo.
 *
 * • Facilitaremos las siguientes opciones al operador de loterías:
 *
 * • Realizar sorteo (La fecha será la de hoy y los números ganadores serán a
 * leatorios entre 1 y 100).
 *
 * • Repetir sorteo. Se eliminará el sorteo de hoy y se volverá a realizar el
 * sorteo.
 *
 * • Mostrar sorteos del mes actual.
 *
 * • Mostrar sorteo dada una fecha.
 *
 * • Realizar sorteo por fecha (Pediremos una fecha y se realizará el sorteo de
 * esa fecha en concreto - comprobando, previamente, que no hay sorteo en esa
 * fecha).
 *
 * • Mostrar todos los sorteos
 *
 * @author KevinNS
 */
public class Ejercicio9T11TuLotero {

    /**
     * Método auxiliar para no repetir código de impresión
     *
     * @param sorteo
     */
    public static void imprimirSorteo(Sorteo sorteo) {
        System.out.println("Fecha: " + sorteo.getFecha() + " | Números: ");
        for (int numero : sorteo.getGanadores()) {
            System.out.println(numero + " ");
        }
        System.out.println("");
    }

    /**
     * Método que realiza un sorteo el día de hoy
     *
     * @param mapa
     */
    public static void realizarSorteo(TreeMap<LocalDate, Sorteo> mapa) {
        LocalDate hoy = LocalDate.now(); // Obtenemos la fecha actual del sistema

        if (mapa.containsKey(hoy)) {
            System.out.println("Ya existe un sorteo para el día de hoy");
        } else {
            mapa.put(hoy, new Sorteo(hoy)); // Añadimos al mapa
            System.out.println("Sorteo realizado con éxito");
        }
    }

    /**
     * Método que elimina el sorteo de hoy y lo vuelve a hacer
     *
     * @param mapa
     */
    public static void repetirSorteo(TreeMap<LocalDate, Sorteo> mapa) {
        LocalDate hoy = LocalDate.now();

        if (mapa.containsKey(hoy)) {
            mapa.remove(hoy); // Borramos el existente
            mapa.put(hoy, new Sorteo(hoy)); // Creamos uno nuevo
            System.out.println("Sorteo de hoy reiniciado con nuevos números");
        } else {
            System.out.println("No hay ningún sorteo hoy para repetir");
        }
    }

    /**
     * Método que muestra los sorteos del mes actual
     *
     * @param mapa
     */
    public static void mostrarSorteoMesActual(TreeMap<LocalDate, Sorteo> mapa) {
        LocalDate ahora = LocalDate.now();

        System.out.println("----SORTEOS DE " + ahora.getMonth() + " ----");
        boolean hay = false;

        // Recorremos los valores del mapa
        for (Sorteo sorteo : mapa.values()) {
            // Si el mes del sorteo coincide con el mes actual...
            if (sorteo.getFecha().getMonth() == ahora.getMonth() && sorteo.getFecha().getYear() == ahora.getYear()) {
                imprimirSorteo(sorteo);
                hay = true;
            }
        }
        if (!hay) {
            System.out.println("No hay sorteos registrados este mes");
        }
    }

    /**
     * Método que pide al usuario una fecha en concreto para ver el sorteo de
     * esa fecha
     *
     * @param mapa
     */
    public static void mostrarSorteoDadaUnaFecha(TreeMap<LocalDate, Sorteo> mapa) {
        Scanner entrada = new Scanner(System.in);

        // Pedimos los datos al usuario
        System.out.println("Introduce año (aaa): ");
        int año = entrada.nextInt();
        System.out.println("Introduce mes (1-12)");
        int mes = entrada.nextInt();
        System.out.println("Introduce día (1-31)");
        int dia = entrada.nextInt();
        LocalDate buscada = LocalDate.of(año, mes, dia); // Fabricamos la fecha con los datos

        // Creamos un bucle while para la búsqueda usando el iterador de las entradas del mapa
        Iterator<Map.Entry<LocalDate, Sorteo>> it = mapa.entrySet().iterator();
        Sorteo encontrado = null;

        while (it.hasNext() && encontrado == null) {
            Map.Entry<LocalDate, Sorteo> entradaMapa = it.next();
            if (entradaMapa.getKey().equals(buscada)) {
                encontrado = entradaMapa.getValue(); // Si la fecha coincide, guardamos el sorteo
            }

        }
        if (encontrado != null) {
            imprimirSorteo(encontrado);
        } else {
            System.out.println("No hay sorteo para esa fecha");
        }
    }

    /**
     * Método que crea un sorteo en una fecha concreta si no existe
     *
     * @param mapa
     */
    public static void realizarSorteoPorFecha(TreeMap<LocalDate, Sorteo> mapa) {
        Scanner entrada = new Scanner(System.in);

        // Pedimos los datos al usuario
        System.out.println("Introduce año (aaa): ");
        int año = entrada.nextInt();
        System.out.println("Introduce mes (1-12)");
        int mes = entrada.nextInt();
        System.out.println("Introduce día (1-31)");
        int dia = entrada.nextInt();
        LocalDate fechaNueva = LocalDate.of(año, mes, dia); // Fabricamos la fecha con los datos

        // Comprobamos previamente que no hay sorteo en esa fecha
        if (mapa.containsKey(fechaNueva)) {
            System.out.println("Error. Ya se realizó un sorteo en esa fecha");
        } else {
            mapa.put(fechaNueva, new Sorteo(fechaNueva));
            System.out.println("Sorteo programado realizado");
        }
    }

    /**
     * Método para mostrar todos los sorteos
     *
     * @param mapa
     */
    public static void mostrarTodos(TreeMap<LocalDate, Sorteo> mapa) {
        if (mapa.isEmpty()) {
            System.out.println("Archivo vacío");
            return;
        }
        // Al ser TreeMap, el for each ya lso saca ordenados por fecha automáticamente
        for (Sorteo sorteo : mapa.values()) {
            imprimirSorteo(sorteo);
        }
    }

    /**
     * Método que muestra el menú
     */
    public static void mostrarMenu() {
        System.out.println("---------------------------------------------------");
        System.out.println("-----------------GESTION TU LOTERO-----------------");
        System.out.println("----------------1. Realizar sorteo-----------------");
        System.out.println("----------------2. Repetir sorteo------------------");
        System.out.println("----------------3. Mostrar sorteos mes actual------");
        System.out.println("----------------4. Mostrar sorteo dada una fecha---");
        System.out.println("----------------5. Realizar sorteo por fecha-------");
        System.out.println("----------------6. Mostrar todos los sorteos-------");
        System.out.println("----------------7. SALIR DEL MENU------------------");
        System.out.println("---------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Creamos un TreeMap que organiza automáticamente las fechas de menor a mayor
        TreeMap<LocalDate, Sorteo> mapaSorteos = new TreeMap<>();

        // Creamos el menu controlando excepciones
        int opcion = 0;

        do {
            try {
                mostrarMenu();
                opcion = entrada.nextInt();

                switch (opcion) {
                    case 1:
                        realizarSorteo(mapaSorteos);
                        break;
                    case 2:
                        repetirSorteo(mapaSorteos);
                        break;
                    case 3:
                        mostrarSorteoMesActual(mapaSorteos);
                        break;
                    case 4:
                        mostrarSorteoDadaUnaFecha(mapaSorteos);
                        break;
                    case 5:
                        realizarSorteoPorFecha(mapaSorteos);
                        break;
                    case 6:
                        mostrarTodos(mapaSorteos);
                        break;
                    case 7:
                        System.out.println("Saliendo del programa....");
                        break;
                    default:
                        System.out.println("Opción incorrecta");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error. Has introducido una letra");
            }

        } while (opcion != 7);

    }

}
