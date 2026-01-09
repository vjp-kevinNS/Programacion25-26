package ejercicio2t7intercambionumeros;
import java.util.Scanner; // Importamos Scanner
/**
 * Realizar un programa que lea 7 números enteros y los introduzca en un array
 * unidimensional. Luego muestras el array, intercambias los números que se
 * encuentren en la 2ª y 4ª posición, y muestras el nuevo array por pantalla. 
 * 
 * Utiliza al menos 3 métodos: uno para introducir los datos, otro para mostrar
 * los datos y otro para intercambiar los datos.
 *
 * @author KevinNS
 */
public class Ejercicio2T7IntercambioNumeros {

    public static void main(String[] args) {
        
        // Creamos el array de 7 números enteros
        int [] numeros = new int [7];
        
        // LLamamos al método para pedir los números
        introducirDatos(numeros);
        
        // LLamamos al método para mostrar los números antes del intercambio
        mostrarDatos(numeros);
        
        // LLamamos al método para intercambiar los números
        intercambiarDatos(numeros);
        
        // Volvemos a mostrar los números
        mostrarDatos(numeros);

    }
    
    /**
     * Método que pide al usuario 7 números
     * @param pedirNumeros
     */
    public static void introducirDatos(int[] pedirNumeros){
        // Pedimos el número
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca 7 números enteros: ");
        
        //Creamos un for para repetir la acción 7 veces
        for (int i = 0; i < pedirNumeros.length; i++) {
            System.out.println("Número " + i + " : ");
            pedirNumeros[i] = entrada.nextInt();
            
        }
    }
    
    /**
     * Método que nos muestra el array original, sin intercambios
     * @param mostrarNumeros 
     */
    public static void mostrarDatos(int[] mostrarNumeros){
        for (int i = 0; i < mostrarNumeros.length; i++) {
            System.out.println(mostrarNumeros[i] + " ");
            
            System.out.println(""); // Hacemos un salto de línea
            
            // También se puede hacer así
            
//            for (int i = 0; i < mostrarNumeros.length; i++) {
//                int mostrarNumero = mostrarNumeros[i];
//                System.out.println(mostrarNumeros);  
//            }  
        }
    }
    
    /**
     * Método que intercambia las posiciones 2 y 4
     * @param intercambiarNumeros 
     */
    public static void intercambiarDatos(int[] intercambiarNumeros){
        // Creamos una variable auxiliar para no perder el valor al sobreescribir
        int aux = intercambiarNumeros[2];
        intercambiarNumeros[2] = intercambiarNumeros[3];
        intercambiarNumeros[3] = aux;
        
        System.out.println(""); // Salto de línea
        
    }

}
