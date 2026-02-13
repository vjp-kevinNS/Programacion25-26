package ejercicio3t9caracterestochararray;
import java.util.Scanner; // Importamos Scanner
/**
 * Crea un programa en JAVA en el que pidas al usuario una cadena de caracteres,
 * y luego la muestres carácter por carácter por pantalla. 
 * 
 * • Muestra cada carácter en una línea distinta. 
 * • Utiliza la clase String y el método toCharArray.
 *
 * @author KevinNS
 */
public class Ejercicio3T9CaracteresToCharArray {

    public static void main(String[] args) {
        
        // Pedimos al usuario que introduzca una cadena de carácteres
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce una cadena de carácteres: ");
        String cadenaUsuario = entrada.nextLine();
        
        // Convertimos el String en un array de char
        char[]letras = cadenaUsuario.toCharArray();
        
        System.out.println("Carácteres uno por uno: ");
        
        // Recorremos el array
        for (int i = 0; i < letras.length; i++) {
           
            // Mostramos el carácter de la posición i
            System.out.println(letras[i]);
            
        }

    }

}
