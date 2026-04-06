package ejercicioampliacion2t10;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Una vez se ha probado por nuestro departamento de Testing el programa
 * anterior, nuestro analista decide detallar un programa algo más complejo. En
 * esta segunda versión, nuestro programa debe funcionar para 3 viviendas.
 *
 * Nuestro programa mostrará un menú que permita las siguientes opciones:
 *
 * 1. Rellenar viviendas (Añadiremos las direcciones de las viviendas, pero NO
 * añadiremos actividades).
 *
 * 2. Añadir actividad (Preguntaremos al usuario la posición de la vivienda
 * donde insertar la actividad)
 *
 * 3. Mostrar viviendas (Mostraremos la información de la vivienda junto con sus
 * actividades).
 *
 * 4. Mostrar actividades para toda la familia (las de todas las viviendas).
 *
 * 5. Mostrar actividades por tipo. (Pediremos al usuario qué tipo de actividad
 * desea mostrar).
 *
 * 6. Mostrar número de actividades (de entre todas las viviendas).
 *
 * 7. Salir del programa.
 *
 * @author KevinNS
 */
public class EjercicioAmpliacion2T10 {

    /**
     * Método que muestra el menú
     */
    public static void mostrarMenu() {
        System.out.println("---------------------------------------------------");
        System.out.println("-----------------GESTION 3 VIVIENDAS---------------");
        System.out.println("----------------1. Añadir viviendas----------------");
        System.out.println("----------------2. Añadir actividades--------------");
        System.out.println("----------------3. Mostrar viviendas---------------");
        System.out.println("----------------4. Mostrar actividades familiares--");
        System.out.println("----------------5. Mostrar actividades por tipo----");
        System.out.println("----------------6. Mostrar número de actividades---");
        System.out.println("----------------7. SALIR DEL MENU------------------");
        System.out.println("---------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Creamos el vector: Un array de 3 posiciones para guardar objetos Vivienda
        Vivienda[] viviendas = new Vivienda[3];

        // Creamos el menú controlando excpeciones
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

                        break;
                    case 7:
                        System.out.println("Saliendo del programa...");
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
