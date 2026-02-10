package ejercicio10t8array10numburbuja;
import java.util.Arrays;
/**
 * Construye un array de 10 números enteros aleatorios y muestra su contenido
 * mediante el método toString de la clase Arrays. Después, ordena el array
 * descendentemente (de mayor a menor), mediante el método de la burbuja, y
 * muestra de nuevo su contenido mediante el método toString de la claseArrays.
 *
 * @author KevinNS
 */
public class Ejercicio10T8Array10NumBurbuja {

    public static void main(String[] args) {
        
        // Creamos el array de 10 objetos
        int[]arrayAleatorios = new int[10];
        
        // Rellenamos con números aleatorios (del 0 al 99 por ejemplo)
        for (int i = 0; i < arrayAleatorios.length; i++) {
            arrayAleatorios[i] = (int)(Math.random() * 100);
            
        }
        
        // Mostramos el contenido inicial con toString
        System.out.println("Array original(desordenado)");
        System.out.println(Arrays.toString(arrayAleatorios));
        
        // Hacemos el método de la burbuja para ordenarlos
        for (int i = 0; i < arrayAleatorios.length - 1; i++) {
            for (int j = 0; j < arrayAleatorios.length - 1; j++) {
                int arrayAleatorio = arrayAleatorios[j];
                // Si el número de la izquierda es menor que el de la derecha
                if (arrayAleatorios[j] < arrayAleatorios[j + 1]) {
                    // Los intercambiamos
                    int auxiliar = arrayAleatorios[j];
                    arrayAleatorios[j] = arrayAleatorios[j + 1];
                    arrayAleatorios[j + 1] = auxiliar;
                }
            }
            
        }
        
        // Mostramos el resultado final
        System.out.println("Array ordenador descendentemente");
        System.out.println(Arrays.toString(arrayAleatorios));

    }

}
