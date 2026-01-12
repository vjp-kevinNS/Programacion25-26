package ejercicio8t7cincocifrasalreves;
import java.util.Scanner; // Importamos Scanner
/**
 * Realizar un programa en JAVA que le pida al usuario un número entero de 5
 * cifras y que le devuelva el mismo número escrito al revés. 
 * • Para ello necesitarás un método que le pida el número al usuario, otro método 
 * dividirá el número en cifras y que las vaya metiendo en un array. 
 * Por último, otro método visualizará el array.
 * 
 * • Ejemplo de ejecución:
 * Introduzca un número entero de 5 cifras: 85921
 * El numero introducido escrito al revés es el: 12958
 *
 * @author KevinNS
 */
public class Ejercicio8T7CincoCifrasAlReves {

    public static void main(String[] args) {

    }
    
    
    /**
     * Método que le pide al usuario un número entero de 5 cifras
     */
    public static int pedirNumero(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un número de 5 cifas ");
        return entrada.nextInt();
    }
    
    public static void dividirCifras(int numero, int[] cifras){
        
        // Creamos un bucle for para recorrer todas las posiciones de array
        for (int i = 0; i < cifras.length; i++) {
            // Usamos % para guardar el resto de dividir entre 2
            cifras[i] = numero % 10;
           
        }
            
        }
        
    }
    

}
