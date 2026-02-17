package ejercicio7t9fraseinvertida;
import java.util.Scanner; // Importamos Scanner
/**
 * Realiza un programa en JAVA que contenga un método que reciba una frase y que
 * muestre por pantalla la frase invertida palabra a palabra.
 *
 * @author KevinNS
 */
public class Ejercicio7T9FraseInvertida {
    
    public static void mostrarInvertida(String frase){
        // Usamos Split para romer la frase por los espacios
        // Esto guarda cada palabra en una posición de Array
        String[]palabras = frase.split(" ");
        
        System.out.println("Frase invertida");
        
        // Recorremos el array empeezando por el final
        // i empieza en la últimas posición (longitud - 1) y baja hasta 0
        for (int i = palabras.length - 1; i >= 0; i--) {
            System.out.print(palabras[i] + " ");           
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        // Pedimos la frase al usuario
        System.out.println("Introduzca una frase: ");
        String fraseUsuario = entrada.nextLine();
        
        // LLamamos al método
        mostrarInvertida(fraseUsuario);
       
    }

}
