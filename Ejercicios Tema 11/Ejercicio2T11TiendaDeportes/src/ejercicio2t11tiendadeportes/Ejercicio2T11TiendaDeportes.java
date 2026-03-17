package ejercicio2t11tiendadeportes;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Realizar un programa en JAVA en el realices la gestión de una pequeña tienda
 * de deportes. Ayudate de un HashMap, donde el campo Clave será un código de
 * producto (Integer o String, como prefieras), y el campo Value será un objeto
 * de la clase Producto.
 *
 * • La clase Producto tendrá 3 atributos: • Nombre del producto: de tipo
 * String. • Precio: de tipo float. • Stock: de tipo int.
 *
 * • Se le mostrarán al usuario un menú con 3 opciones:
 *
 * 1. MENU DE ADMINISTRACIÓN
 *
 * 2. MENÚ DE COMPRA
 *
 * 3. SALIR
 *
 * MENU DE ADMINISTRACIÓN:
 *
 * Se visualizará el siguiente submenú:
 *
 * 1. Introducir productos en la lista: Pediremos los datos de un producto al
 * usuario y lo introducimos en el HashMap.
 *
 * 2. Visualizar todos los productos.
 *
 * 3. Eliminar productos de la lista: Pediremos el código del producto y lo
 * eliminaremos.
 *
 * 4. Volver al menú principal.
 *
 * MENU DE COMPRA:
 *
 * 1. Comprar productos:
 *
 * • Mostramos una lista con los productos a comprar.
 *
 * • El usuario elegirá que producto comprar (el código) y luego le
 * preguntaremos cuantas unidades desea de él. Luego se le preguntará si desea
 * comprar otro producto o salir.
 *
 * • Por último, se le mostrará el importe total de la compra.
 *
 * • Date cuenta de que necesitarás actualizar el valor del stock de un producto
 * cuando el usuario lo compre. En caso de que el usuario pida más unidades de
 * las que quedan se le avisará por pantalla del error, se le comunicarán las
 * unidades restantes y le preguntará si desea comprar otro producto.
 *
 * 2. Volver al menú principal.
 *
 * @author KevinNS
 */
public class Ejercicio2T11TiendaDeportes {
    
    public static void menuAdministracion(HashMap<Integer, Producto> mapa){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("--------BIENVENIDO AL MENU DE ADMINISTRACION-------");
        System.out.println("------------1. Introducir productos----------------");
        
    }

    /**
     * Método que muestra el menú
     */
    public static void mostrarMenu() {
        System.out.println("---------------------------------------------------");
        System.out.println("------------GESTION TIENDA DE DEPORTES-------------");
        System.out.println("--------------1. MENU ADMINISTRACION---------------");
        System.out.println("--------------2. MENU DE COMPRA--------------------");
        System.out.println("--------------3- SALIR DEL PROGRAMA----------------");
        System.out.println("---------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        // Creamos el mapa
        HashMap<Integer, Producto> codigo = new HashMap<>();

        // Creamos el menu controlando excepciones
        int opcion = 0;

        do {
            try {
                mostrarMenu();
                opcion = entrada.nextInt();
                switch (opcion) {
                    case 1:
                        menuAdministracion(codigo);
                        break;
                    case 2:

                        break;
                    case 3:
                        System.out.println("Saliendo del programa....");
                        break;
                    default:
                        System.out.println("Opción incorrecta");
                }

            } catch (InputMismatchException e) {
                System.out.println("ERROR. Has introducido una letra");
                entrada.nextLine();
            }

        } while (opcion != 3);

    }

}
