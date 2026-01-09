package ejercicio1t7numerosenteros10;
import java.util.Scanner; // Importamos Scanner

/**
 * Escribir un programa que contenga un método que pida al usuario 10 números
 * enteros y los guarde en un array unidimensional. Luego, otro método, mostrará
 * solo los números pares que contiene el array.
 *
 * @author KevinNS
 */
public class Ejercicio1T7NumerosEnteros10 {

    public static void main(String[] args) {
        
        // Creamos el array que en este caso será de 10 números
        int [] misNumeros = new int [10];
        
        // LLamamos al método para pedir los números al usuario
        pedirNumero(misNumeros);
        
        //LLamamos al método para que nos diga cúantos pares hay
        numerosPares(misNumeros);
    }
    
    /**
     * Método para pedir 10 números al usuario y hacemos un bucle for para 
     * repetirlo 10 veces
     * @param numeros 
     */
    public static void pedirNumero(int[] numeros){
        // Pedimos el número
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce 10 números enteros: ");
        
        // Aquí repetimos la acción 10 veces
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Numero " + (i + 1) + " : ");
            numeros[i] = entrada.nextInt(); // Guardamos cada dato   
        }        
    }

    /**
     * Método que nos muestra los números pares de los introducidos por el 
     * usuario
     * @param pares 
     */
    public static void numerosPares(int[] pares){
        System.out.println("Numeros pares encontrados: ");
        
        // Creamos un bucle for con un if para saber cuantos pares hay
        for (int i = 0; i < pares.length; i++) {
            
            if (pares[i] % 2 == 0) {
                System.out.println(pares[i]);
                
            }
            
        }
        
    }

}
