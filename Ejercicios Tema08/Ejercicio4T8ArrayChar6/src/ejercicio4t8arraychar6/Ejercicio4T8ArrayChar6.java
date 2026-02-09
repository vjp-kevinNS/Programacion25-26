package ejercicio4t8arraychar6;
import java.util.Arrays; // Importamos la clase Arrays
/**
 * Construye un array de 6 caracteres, de nombre arrayChar. El array almacenará
 * en la primera mitad de las posiciones el carácter a, y en la segunda mitad el
 * carácter b, mediante el uso de la clase Arrays. Por último, muestra el
 * contenido del array
 *
 * @author KevinNS
 */
public class Ejercicio4T8ArrayChar6 {

    public static void main(String[] args) {
        
        // Creamos el array de 6 posiciones
        char[]arrayChar = new char[6];
        
        // Usamos Array.fill para rellenarlo
        
        // El número final de la primera mitad(3) no se incluye, solo llega al 2
        Arrays.fill(arrayChar, 0, 3 ,'a');
        
        // Rellenamos la segunda mitad empezando por el 3 y el tope es 6 (que será 5)
        Arrays.fill(arrayChar, 3, 6, 'b');
        
        // Mostramos con el método toString
        System.out.println("Contenido del array de caracteres:");
        System.out.println(Arrays.toString(arrayChar));

    }

}
