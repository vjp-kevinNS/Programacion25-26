package ejerciciorepasomatrices;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Crear una clase que se llame compartimentos Crear una matriz de
 * compartimentos que sea de 3x3 Crear un menu con la sisuignetes opciones:
 *
 * 1-Mostrar todos los compartimentos (comprobando los nulos) 
 * 2-Colocar un compartimento en la posición indicada por el usuario (controlando
 * excepciones) 
 * 3-Eliminar un compartimento de la posición indicada(controlando excepciones) 
 * 4-Mostrar compartimento con mas valor 
 * 5-Mostrar compartimento con menos valor 
 * 6-Salir del programa
 *
 * @author KevinNS
 */
public class EjercicioRepasoMatrices {

    public static void mostrarMenu() {
        System.out.println("--------------------------------------------------");
        System.out.println("----------------#OPCIONES DEL MENÚ#---------------");
        System.out.println("-------------1.Mostrar compartimentos-------------");
        System.out.println("--------------2.Colocar compartimento-------------");
        System.out.println("-------------3.Eliminar compartimento-------------");
        System.out.println("-----4.Mostrar compartimerntos con mas valor------");
        System.out.println("----5.Mostrar compartimerntos con menos valor-----");
        System.out.println("--------------6.SALIR DEL PROGRAMA----------------");
        System.out.println("--------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Creamos la matriz de compartimentos
        Compartimentos[][] misCompartimentos = new Compartimentos[3][3];

        // LLamamos al método del menú y usamos un bucle para que el usuario
        // introduzca una opción
        int opcion = 0;

        do {
            mostrarMenu();
            opcion = entrada.nextInt();
            
            try {
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
                System.out.println("Error. Has introducido una letra, introduce un número");
            }

        } while (opcion != 6);

    }

}
