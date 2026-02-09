package ejercicio3t8vectorenteros30;
import java.util.Arrays; // Importamos la clase Arrays
/**
 * Construye un array de 30 números enteros de nombre vectorEnteros. Mediante el
 * uso de la clase Arrays, hacer que el array almacene en las 10 primeras
 * posiciones 10 ceros, en las 10 siguientes 10 unos, y en las 10 últimas 10
 * cincos. Por último, muestra el contenido del array.
 *
 * @author KevinNS
 */
public class Ejercicio3T8VectorEnteros30 {

    public static void main(String[] args) {
        
        // Creamos el array de 30 posiciones
       int[] vectorEnteros = new int[30];
       
       // Usamos Arrays.fill para rellenarlo
       
       // Rellenamos desde la posición 0 a la 10 con ceros (el 10 no se incluye)
       // para cubrir los índices del 0 al 9
       Arrays.fill(vectorEnteros, 0, 10, 0);
       
       // Rellenamos desde la posición 10 hasta la 20 con unos (el 20 no se incluye)
       // para cubrir los índices del 10 al 19
       Arrays.fill(vectorEnteros, 10, 20, 1);
       
       // Rellenamos desde la posición 20 hasta la 30 con unos (el 30 no se incluye)
       // para cubrir los índices del 20 al 29
       Arrays.fill(vectorEnteros, 20, 30, 5);
       
       
       // Mostramos el contenido con el método toString
        System.out.println("El contenido del vector es: ");
        System.out.println(Arrays.toString(vectorEnteros));
    }

}
