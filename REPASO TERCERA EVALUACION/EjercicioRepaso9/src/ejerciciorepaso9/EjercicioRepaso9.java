package ejerciciorepaso9;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

/**
 * Se quiere desarrollar una aplicación para gestionar clientes de un taller
 * mecánico.
 *
 * Cada cliente tendrá: ID, nombre, teléfono y una lista de reparaciones. Cada
 * reparación tendrá: fecha, descripción y precio.
 *
 * Crear una estructura para almacenar los clientes.
 *
 * MENÚ:
 *
 * Añadir clientes con sus reparaciones.
 *
 * Mostrar todos los clientes con sus reparaciones.
 *
 * Buscar un cliente por ID.
 *
 * Eliminar un cliente.
 *
 * Añadir una reparación a un cliente.
 *
 * Calcular el coste total de las reparaciones de un cliente.
 *
 * METODO ORDENAR!! COMPARE TO
 *
 * @author KevinNS
 */
public class EjercicioRepaso9 {

    /**
     * Método que muestra el menú
     */
    public static void mostrarMenu() {
        System.out.println("GESTION DE CLIENTES");
        System.out.println("1. Añadir clientes con sus reparaciones");
        System.out.println("2. Mostrar pclientes con sus reparaciones");
        System.out.println("3. Buscar cliente por ID)");
        System.out.println("4. Eliminar un cliente");
        System.out.println("5. Añadir reparación a un cliente");
        System.out.println("6. Salir del menú...");
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Creamos el mapa de clientes
        Map<String, Cliente>mapaClientes = new HashMap();
        
        // Creamos el menú controlando excepciones
        int opcion = 0;

        do {
            try {
                mostrarMenu();
                opcion = entrada.nextInt();
                switch (opcion) {
                    case 1:

                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:

                        break;
                    case 5:

                        break;
                    case 6:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción incorrecta");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error. Has introducidco una letra");
                entrada.nextLine();
            }

        } while (opcion != 6);

    }

}
