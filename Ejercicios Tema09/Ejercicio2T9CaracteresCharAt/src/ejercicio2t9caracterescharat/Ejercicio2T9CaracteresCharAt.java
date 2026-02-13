package ejercicio2t9caracterescharat;
import java.util.Scanner; // Importamos Scanner
/**
 * Crea un programa en JAVA en el que pidas al usuario una cadena de caracteres,
 * y luego la muestres carácter por carácter por pantalla.
 * 
 * • Muestra cada carácter en una línea distinta. 
 * • Utiliza la clase String y el método charAt
 *
 * @author KevinNS
 */
public class Ejercicio2T9CaracteresCharAt {

    public static void main(String[] args) {
        
        // Le pedimos al usuario que introduzca una cadena de carácteres
        Scanner entrada = new Scanner (System.in);
        System.out.println("Introduce una cadena de carácteres: ");
        String caracteres = entrada.nextLine();
        
        // Recorremos la cadena
        System.out.println("Los carácteres de su cadena son: ");
        for (int i = 0; i < caracteres.length(); i++) {
            
            // Usamos CharAt para extraer el carácter de la posición i
            char caracterActual = caracteres.charAt(i);
            
            // Mostramos el resultado
            System.out.println(caracterActual);
        }
    }

}
