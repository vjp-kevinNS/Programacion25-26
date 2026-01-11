package ejercicio3t7enterosaleatorios1y6;

import java.util.InputMismatchException; // Importamos la excepción
import java.util.Scanner; // Importamos Scanner

/**
 * Escribir un programa en JAVA que contenga un método que rellena un array
 * unidimensional (vector) de enteros aleatorios entre el 1 y el 6, y luego,
 * otro método, lo muestre por pantalla.
 *
 * • El programa también tendrá un método donde el usuario elegirá la longitud
 * del array entre 1 y 10.
 *
 * Este método también controla que el usuario nos introduzca un número entero y
 * no una letra (mediante excepciones).
 *
 * En caso de que el usuario introduzca el dato incorrecto se lo volveremos a
 * pedir las veces que hagan falta.
 *
 * @author KevinNS
 */
public class Ejercicio3T7EnterosAleatorios1Y6 {

    public static void main(String[] args) {
        
        // 1. LLamamos al método para decidir el tamaño del array
        int longitud = pedirLongitud();
        
        // 2. Creamos el array con el tamaño introducido
        int[] miArray = new int[longitud];
        
        // 3. Rellenamos con números aleatorios
        rellenarConAleatorios(miArray);
        
        // 4. Mostramos el resultado por pantalla
        mostrarArray(miArray);

    }

    /**
     * Método que pide al usuario la longitud del array, con un bucle que se
     * repetirá hasta que se introduzca el dato válido y que además se captura
     * la excepción en el caso de que no se introduzca un número entero
     */
    public static int pedirLongitud() {
        Scanner entrada = new Scanner(System.in);
        int numero = 0;

        // Creamos un bucle do while con un try catch que a su vez tendrá un if
        // para repetir la pregunta hasta que el dato sea válido
        do {
            try {
                // Pedimos al usuario el número
                System.out.println("Introduce la longitud del array (1 - 10): ");
                numero = entrada.nextInt();

                // Si el número no está entre 1 y 10 dará un error
                if (numero < 1 || numero > 10) {
                    System.out.println("Error. El número debe estar entre 1 y 10");

                }
            } catch (InputMismatchException e) { // Capturamos la excepción si no es un número
                System.out.println("Error. Debes introducir un número entero");
                entrada.nextLine(); // Limpiamos el buffer
                numero = 0; // Reiniciamos el valor para que se vuelva a repetir el bucle
            }

        } while (numero < 1 || numero > 10); // Se vuelve a pedir el número entre 1 y 10
        return numero;
    }
    
    /**
     * Método que rellenará con un número aleatorio entre 1 y 6 nuestro array
     * Para ello usamos Math.random
     * @param aleatorio 
     */
    public static void rellenarConAleatorios(int[] aleatorio){
        for (int i = 0; i < aleatorio.length; i++) { // Usamos length para saber el tamaño
            // Usamos Math.random para generar un número aleatorio entre 1 y 6
            aleatorio[i] = (int) (Math.random() * 6) +  1;
            
        }
    }
    
    /**
     * Método para mostrar el contenido del array
     * @param mostrar 
     */
    public static void mostrarArray(int[] mostrar ){
        System.out.println("Mostrando el contenido: ");
        for (int i = 0; i < mostrar.length; i++) {
            System.out.println("Posición [" + i + "]: " + mostrar[i]);
            
        }
    }

}
