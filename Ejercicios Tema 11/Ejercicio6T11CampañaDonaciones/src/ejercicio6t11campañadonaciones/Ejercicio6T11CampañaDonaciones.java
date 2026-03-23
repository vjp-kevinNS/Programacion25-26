package ejercicio6t11campañadonaciones;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Debido a la avalancha de campañas de donaciones para la compra de material
 * para hospitales y residencias contra el coronavirus, el Ministerio de Sanidad
 * ha decidido crear un software que gestione todo el dinero donado. En la
 * versión alfa del software debemos gestionar las donaciones de una única
 * campaña. Para ello, debemos implementar las siguientes clases:
 *
 * • Clase Donacion, que almacenará el nombre de la persona que dona y la
 * cantidad donada.
 *
 * • Clase Campania, que almacenará un conjunto de donaciones y el nombre de la
 * campaña.
 *
 * El programa mostrará un menú con las siguientes opciones:
 *
 * 1. Añadir donación.
 *
 * 2. Mostrar donaciones.
 *
 * 3. Mostrar donaciones por nombre de donante (Pediremos un nombre y
 * mostraremos las donaciones cuyo donante coincida con el nombre dado).
 *
 * 4. Mostrar número de donaciones.
 *
 * 5. Mostrar total dinero recaudado.
 *
 * 6. Ordenar donaciones (de mayor a menor importe de las donaciones)
 *
 * 7. Salir.
 *
 * NOTA: No se puede utilizar el método de la Burbuja para realizar la
 * ordenación de las donaciones.
 *
 * PISTA: Podéis utilizar un vector de Donaciones donde ir insertándolas de
 * manera ordenada.
 *
 * @author KevinNS
 */
public class Ejercicio6T11CampañaDonaciones {

    /**
     * Método que muestra el menú
     */
    public static void mostrarMenu() {
        System.out.println("---------------------------------------------------");
        System.out.println("---------------GESTION ALFA CORONAVIRUS------------");
        System.out.println("----------------1. Añadir donación-----------------");
        System.out.println("----------------2. Mostrar donaciones--------------");
        System.out.println("----------------3. Donaciones por donante----------");
        System.out.println("----------------4. Mostrar Nº donaciones-----------");
        System.out.println("----------------5. Mostrar total dinero recaudado--");
        System.out.println("----------------6. Ordenar donaciones--------------");
        System.out.println("----------------7. SALIR DEL MENU------------------");
        System.out.println("---------------------------------------------------");
    }

    /**
     * Mñetodo que pide al usuario el nombre del donante asi como la cantidad
     * que ha donado insertánndolo en una posición
     *
     * @param camp
     */
    public static void añadirDonacion(Campania camp) {
        Scanner entrada = new Scanner(System.in);

        // Pedimos al usuario los datos del donante y la cantidad donada
        System.out.println("Nombre del donante: ");
        String nombreDon = entrada.nextLine();
        System.out.println("Cantidad donada: ");
        double cantidadDon = entrada.nextDouble();

        // Añadimos la nueva donación
        camp.getListaDonaciones().add(new Donacion(nombreDon, cantidadDon));

        System.out.println("Donacioón añadida y ordenadoa automaticamente");
    }

    /**
     * Método que muestra todas las donaciones realizadas
     *
     * @param camp
     */
    public static void mostrarDonaciones(Campania camp) {
        // Comprobamos si está vacío
        if (camp.getListaDonaciones().isEmpty()) {
            System.out.println("No hay datos registrados");
            return;
        }

        // Recorremos la lista
        for (Donacion donacion : camp.getListaDonaciones()) {
            System.out.println("Donante: " + donacion.getDonante() + ": "
                    + donacion.getImporte() + "€");
        }
    }

    /**
     * Método que busca las donaciones realizadas por un donante en concreto
     * elegido por el usuario
     *
     * @param camp
     */
    public static void donacionesPorDonante(Campania camp) {
        Scanner entrada = new Scanner(System.in);

        // Pedimos al usuario el nombre del donante a buscar
        System.out.println("Introduce le nombre del donante a buscar: ");
        String nombreBuscar = entrada.nextLine();

        // Obtenemos el iterador del conjunto
        Iterator<Donacion> it = camp.getListaDonaciones().iterator();
        boolean encontrado = false;

        // Usamos un bucle while para buscar en toda la lista        
        while (it.hasNext()) {
            Donacion donacion = it.next(); // Samaos el siguiente elemento
            // Comparamos ignorando mayúsculas y minúsculas
            if (donacion.getDonante().equalsIgnoreCase(nombreBuscar)) {
                System.out.println("Localizado: " + donacion.getImporte() + "€");
                encontrado = true; // Si hemos encontrado lo ponemos a true
            }
        }
        // Si no la hemos encotnrado mostramos un mensaje
        if (!encontrado) {
            System.out.println("No existen donaciones de ese donante");
        }

    }

    /**
     * Método que muestra el número de donaciones realizadas
     *
     * @param camp
     */
    public static void mostrarCantidadDonaciones(Campania camp) {
        // Usamos .size para que nos devuelva el número total de elementos en la lista
        int total = camp.getListaDonaciones().size();

        if (total == 0) {
            System.out.println("El contador está a cero. Aún no hjay donaciones registradas");
        } else {
            System.out.println("Actualmente se han registrado un total de: "
                    + total + " donaciones");
        }

    }

    /**
     * Método que calcula el total del dinero recaudado
     *
     * @param camp
     */
    public static void calcularTotalRecaudado(Campania camp) {
        double acumulador = 0;

        // Recorremos la lista
        for (Donacion donacion : camp.getListaDonaciones()) {
            acumulador += donacion.getImporte(); // Vamos sumando cada cantidad
        }
        System.out.println("El total recaudado es: " + acumulador + " Euros");
    }

    /**
     * Método que ordena llas donaciones de mayor a menor
     *
     * @param camp
     */
    public static void ordenarDonaciones(Campania camp) {
        System.out.println("---LISTA ORDENADA (MAYOR A MENOR)---");
        // Como hemos usado inserción ordenada en el método de añadir donación
        // ya lo tendriamos echo. Con lo cual llamamos al método para mostrarlas

        mostrarDonaciones(camp);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Creamos el objeto de la campaña
        Campania campañaSanidad = new Campania();

        // Creamos el menú controlando excepciones
        int opcion = 0;

        do {
            try {
                mostrarMenu();
                opcion = entrada.nextInt();

                switch (opcion) {
                    case 1:
                        añadirDonacion(campañaSanidad);
                        break;
                    case 2:
                        mostrarDonaciones(campañaSanidad);
                        break;
                    case 3:
                        donacionesPorDonante(campañaSanidad);
                        break;
                    case 4:
                        mostrarCantidadDonaciones(campañaSanidad);
                        break;
                    case 5:
                        calcularTotalRecaudado(campañaSanidad);
                        break;
                    case 6:
                        ordenarDonaciones(campañaSanidad);
                        break;
                    case 7:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción incorrecta");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error. Has introducido una letra");

            } catch (NullPointerException e) {
                System.out.println("Error. Hay posiciones nulas");

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error. Posición fuera de rango");

            } catch (Exception e) {
                System.out.println("Error desconocido");

                entrada.nextLine();
            }

        } while (opcion != 7);

    }

}
