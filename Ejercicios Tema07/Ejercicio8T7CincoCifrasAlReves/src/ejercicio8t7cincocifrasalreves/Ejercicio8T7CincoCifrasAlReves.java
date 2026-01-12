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
        
        // 1. LLamamos al método para pedir número
        int numeroUsuario = pedirNumero();
        
        // 2. Creamos el array y llamamos al método para dividir el número
        int[] cifras = new int[5];
        dividirCifras(numeroUsuario, cifras);
        
        // 3. LLamamos al método para mostrar el resultado
        System.out.println("El número introducido escrito al revés es: ");
        mostrarArray(cifras);

    }

    /**
     * Método que le pide al usuario un número entero de 5 cifras
     * @return el número que se guarda
     */
    public static int pedirNumero(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un número de 5 cifas: ");
        return entrada.nextInt();
    }
    
    /**
     * Método que divide el número y lo guarda en el array
     * @param numero
     * @param cifras 
     */
    public static void dividirCifras(int numero, int[] cifras){
        
        // Creamos un bucle for para recorrer todas las posiciones de array
        for (int i = 0; i < cifras.length; i++) {
            // Usamos % 10 para que nos dé el último dígito
            cifras[i] = numero % 10;
            numero = numero / 10; // Dividimos el numero entre 10 para quitarle la última cifra

        }           
    }
    
    /**
     * Método que nos muestra el contenido del array
     * @param mostrar 
     */
    public static void mostrarArray(int[] mostrar){
        for (int i = 0; i < mostrar.length; i++) {
            System.out.print(mostrar[i] + ("-"));
            
        }
    }
        
}

