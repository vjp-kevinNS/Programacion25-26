package ejercicio5t8arrayenteros10;
import java.util.Arrays;
/**
 * Construye un array de 10 números enteros, de nombre arrayEnteros. Hacer que
 * el array almacene en su posiciones los dígitos del 9 al 0 para mostrar
 * después su contenido. Ordenar el array ascendentemente, mediante los métodos
 * de la clase Arrays, y mostrar de nuevo su contenido.
 *
 * @author KevinNS
 */
public class Ejercicio5T8ArrayEnteros10 {

    public static void main(String[] args) {
        
        // Creamos el array de 10 posiciones
        int[] arrayEnteros = new int[10];
        
        // Rellenamos el array con números del 9 al 0, contando hacía atrás
        for (int i = 0; i < arrayEnteros.length; i++) {
            arrayEnteros[i] = 9 - i; // Así vamos restando la posición 
            
        }
        
        // Mostramos el contenido inicial con el toString
        System.out.println("Contenido inicial descendente:");
        System.out.println(Arrays.toString(arrayEnteros));
        
        // Para ordenarlo de manera ascendente usamos SORT
        Arrays.sort(arrayEnteros);
        
        // Mostramos el contenido ya ordenado (del 0 al 9)
        System.out.println("Contenido ordenado de manera ascendente:");
        System.out.println(Arrays.toString(arrayEnteros));

    }

}
