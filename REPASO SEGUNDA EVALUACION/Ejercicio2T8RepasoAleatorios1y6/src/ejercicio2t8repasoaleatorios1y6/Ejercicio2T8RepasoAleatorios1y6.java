package ejercicio2t8repasoaleatorios1y6;

import java.util.InputMismatchException;
import java.util.Scanner; // Importamos Scanner

/**
 * Escribir un programa en JAVA que contenga un método que rellena un array
 * unidimensional (vector) de enteros ALEATORIOS entre el 1 y el 6, y luego,
 * otro método, lo muestre por pantalla, utilizando el bucle for-each.
 *
 * • El programa también tendrá un método donde el usuario elegirá la longitud
 * del array entre 1 y 10. Este método también controla que el usuario nos
 * introduzca un número entero y no una letra (mediante excepciones). En caso de
 * que el usuario introduzca el dato incorrecto se lo volveremos a pedir las
 * veces que hagan falta.
 *
 * @author KevinNS
 */
public class Ejercicio2T8RepasoAleatorios1y6 {

    public static int pedirLongitud() {
        Scanner entrada = new Scanner(System.in);
        int longitudUsuario = 0;

        do {
            try {
                System.out.println("Introduzca la longitud del array entre 1 y 10: ");
                longitudUsuario = entrada.nextInt();

            } catch (InputMismatchException e) {
                
            }
        } while (longitudUsuario < 1 && longitudUsuario > 10);
        
        return longitudUsuario;
    }

    /**
     * Método que rellena un array de enteros con números aleatorios entre 1 y 6
     *
     * @param numeros
     */
    public static void rellenarArray(int[] numeros) {
        System.out.println("Rellenando array....");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random() * 5 + 1);
        }
    }

    /**
     * Método que muestra el contenido del array
     *
     * @param numeros
     */
    public static void mostrarArray(int[] numeros) {
        System.out.println("Mostrando array....");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }

    public static void main(String[] args) {
        
        // LLamamos al método pedirLongitud
        int longitudNumero = pedirLongitud();
        
        // Creamos el array de enteros
        int[] numeros = new int[longitudNumero];

        // LLamamos a los demás métodos
        
        rellenarArray(numeros);
        mostrarArray(numeros);

    }

}
