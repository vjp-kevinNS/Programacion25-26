package ejercicio8t9fraseinvertida;
import java.util.Scanner; // Importamos Scanner
/**
 * Realiza un programa en JAVA que contenga un método que reciba una frase y que
 * muestre por pantalla la frase invertida carácter a carácter.
 *
 * @author KevinNS
 */
public class Ejercicio8T9FraseInvertida {
    
    /**
     * Método que invierte la frase introducida y la imprime por pantalla carácter
     * a carácter
     * @param frase 
     */
    public static void invertirFrase(String frase){
        System.out.println("Frase invertida carácter a carácter: ");
        
        // Empezamos el bucle en la última posición (length -1) y vamos bajando
        // hasta llegar a la primera
        
        for (int i = frase.length() -1; i >= 0; i--) {
            // Sacamos el carácter de la posición i y lo imprimimos
            System.out.print(frase.charAt(i));
        }
        
        System.out.println(); // Metemos un salto de línea 
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        // Pedimos la frase al usuario
        System.out.println("Por favor, introduzca una frase: ");
        String fraseUsuario = entrada.nextLine();
        
        // LLamamos al método
        invertirFrase(fraseUsuario);

    }

}
