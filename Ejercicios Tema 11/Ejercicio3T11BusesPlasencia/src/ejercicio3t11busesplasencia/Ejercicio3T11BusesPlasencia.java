package ejercicio3t11busesplasencia;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Diseña un programa en Java para gestionar los autobuses de la estación de
 * Plasencia.
 *
 * • Nuestro programa dispondrá de un vector de 6 celdas dónde “aparcar” los
 * autobuses.
 *
 * • De cada autobús, almacenaremos su matrícula y los conductores que tiene
 * asignados (los cuales se almacenarán en un HashMap).
 *
 * • De cada conductor almacenaremos su DNI (que hará las veces de clave) y su
 * nombre.
 *
 * • El programa dispondrá del siguiente menú:
 *
 * • Aparcar (pedirá un número, que será la posición del vector donde deberemos
 * aparcar el autobús. Si la posición está ocupada, se volverá a pedir hasta
 * encontrar una libre).
 *
 * • Mostrar dársenas libres.
 *
 * • Buscar autobús (método que muestre toda la información del autobús a partir
 * de su matrícula).
 *
 * • Buscar conductor (Mostrará la matrícula del autobús que tiene asignado).
 *
 * • Método que retorne la posición del vector donde se encuentra el autobús con
 * mayor número de conductores asignados.
 *
 * @author KevinNS
 */
public class Ejercicio3T11BusesPlasencia {

    /**
     * Método que primero comprueba si una plaza está libre o no y que luego
     * pide los datos del conductor y del autobus al usuario para crearlos y
     * aparcar el bus
     *
     * @param lista
     */
    public static void aparcarBus(Autobus[] lista) {
        Scanner entrada = new Scanner(System.in);

        // Creamos un bucle que se repetirá si la plaza está libre o ya está ocupada
        int posicion;

        do {
            System.out.println("¿En que plaza quieres aparcar? (0-6): ");
            posicion = entrada.nextInt();

            // Si la posición introducida es menor que 0 y mayor que 6 será errónea
            if (posicion < 0 || posicion > 6) {
                System.out.println("Error. Solo hay plazas de la 0 a la 6");
            } else if (lista[posicion] != null) { // Si la celda no es null hay un bus allí
                System.out.println("Esa plaza ya está ocupada");

            }

        } while (posicion < 0 || posicion > 6 || lista[posicion] != null);

        entrada.nextLine();

        // Una vez comprobado si la plaza esta libre o no pedimos los datos del bus y del conductor
        System.out.println("Matrícula: ");
        String matricula = entrada.nextLine();
        // Creamos el objeto y lo metemos en el hueco del array
        Autobus nuevoBus = new Autobus(matricula);

        // Añadimos un conductor al mapa interno del bus usando .put
        System.out.println("DNI conductor: ");
        String dniC = entrada.nextLine();
        System.out.println("Nombre conductor: ");
        String nombreC = entrada.nextLine();
        // Ahora le añadimos el conductor al bus
        nuevoBus.getConductores().put(dniC, nombreC);

        // Guardamos el objeto en la posición elegida
        lista[posicion] = nuevoBus;
        System.out.println("Autobus aparcado con éxito");
    }

    /**
     * Método que muestra las plazas libres
     *
     * @param lista
     */
    public static void verLibre(Autobus[] lista) {
        System.out.println("---PLAZAS DISPONIBLES---");
        // Recorremos la lista
        for (int i = 0; i < lista.length; i++) {
            // Si la celda es null, signifíca que no hay ningún Autobus ahí
            if (lista[i] == null) {
                System.out.print(i + " ");
            }

        }
        System.out.println();
    }

    /**
     * Método que busca un bus con la matrícula indicada por el usuario
     *
     * @param lista
     */
    public static void buscarMatricula(Autobus[] lista) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Indica la matrícula a buscar: ");
        String matBuscada = entrada.nextLine();

        int i = 0; // Índice para movernos por el array
        boolean encontrado = false; // Para saber si parar el bucle

        // Usamos WHILE para buscar y parar cuando lo tengamos
        while (i < lista.length && !encontrado) {
            // Verificamos que la plaza no esté vacía (null) y comparamos matrícula
            if (lista[i] != null && lista[i].getMatricula().equalsIgnoreCase(matBuscada)) {
                System.out.println("¡Bus localizado!");
                // Mostramos los conductores usando el método HashMap
                System.out.println("Conductores asignados: " + lista[i].getConductores());
                encontrado = true; // Al ponerlo a true, el bucle se detendrá en la próxima vuelta
            }
            i++; // Pasamos a la siguiente plaza de la estación
        }

        if (!encontrado) {
            System.out.println("No hay ningún autobús con esa matrícula.");
        }
    }

    /**
     * Método que localiza al conductor con el DNI introducido por el usuario y
     * muestra el autobús que tiene asignado
     *
     * @param lista
     */
    public static void localizarDni(Autobus[] lista) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("DNI del conductor a localizar: ");
        String dniBusq = entrada.nextLine();

        int i = 0;
        boolean encontrado = false;

        while (i < lista.length && !encontrado) {
            // Entramos en cada bus y preguntamos a su HashMap de conductores
            if (lista[i] != null && lista[i].getConductores().containsKey(dniBusq)) {
                System.out.println("El conductor con DNI " + dniBusq + " está asignado al bus: "
                        + lista[i].getMatricula());
                encontrado = true; // Paramos la búsqueda
            }
            i++;
        }

        if (!encontrado) {
            System.out.println("No se ha encontrado ese DNI en ningún autobús de la estación.");
        }
    }

    /**
     * Método que muestra el bus (con su plaza) que tiene más conductores
     * asignados
     *
     * @param lista
     */
    public static void busConMasPersonal(Autobus[] lista) {
        int maxConductores = -1; // Récord de conductores encontrados
        int plazaGanadora = -1;  // Posición del bus que tiene el récord
        int i = 0;

        // Recorremos todas las plazas de la estación
        while (i < lista.length) {
            if (lista[i] != null) {
                // Usamos .size para saber cuántos conductores tiene este bus
                int numCondActual = lista[i].getConductores().size();

                // Si este bus supera el récord anterior, actualizamos los datos
                if (numCondActual > maxConductores) {
                    maxConductores = numCondActual;
                    plazaGanadora = i;
                }
            }
            i++; // Siguiente bus
        }

        // Al final del trayecto, comprobamos si encontramos algún bus
        if (plazaGanadora != -1) {
            System.out.println("El autobús con mayor número de conductores está en la dársena: "
                    + plazaGanadora);
        } else {
            System.out.println("La estación está actualmente vacía.");
        }
    }

    /**
     * Método que muestra el menú
     */
    public static void mostrarMenu() {
        System.out.println("---------------------------------------------------");
        System.out.println("-----------ESTACION DE BUS DE PLASENCIA------------");
        System.out.println("------------1. Aparcar bus-------------------------");
        System.out.println("------------2. Plazas libres-----------------------");
        System.out.println("------------3. Buscar bus--------------------------");
        System.out.println("------------4. Buscar conductor--------------------");
        System.out.println("------------5. Mayor número conductores------------");
        System.out.println("------------6. SALIR DEL MENU----------------------");
        System.out.println("---------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Creamos el vector de 6 celdas
        Autobus[] plazas = new Autobus[6];

        // Creamos el menú controlando excepciones
        int opcion = 0;
        do {
            try {
                mostrarMenu();
                opcion = entrada.nextInt();

                switch (opcion) {
                    case 1:
                        aparcarBus(plazas);
                        break;
                    case 2:
                        verLibre(plazas);
                        break;
                    case 3:
                        buscarMatricula(plazas);
                        break;
                    case 4:
                        localizarDni(plazas);
                        break;
                    case 5:
                        busConMasPersonal(plazas);
                        break;
                    case 6:
                        System.out.println("Saliendo del menú.....");
                        break;
                    default:
                        System.out.println("Opción incorrecta");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error. Has introducido una letra");
                entrada.nextLine();
            }

        } while (opcion != 6);

    }

}
