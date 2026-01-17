package ejercicio6t7rellenarnumerosprimos;

/**
 * Escribir un programa que rellene un array unidimensional con los 80 primeros
 * números primos y luego los visualice. 
 * 
 * • Ejemplo de ejecución: Contenido de un array unidimensional de 80 posiciones
 * con números primos: 
 * 
 * [0] → 1; [1]→2; [2] → 3; [3] → 5; [4] → 7; [5] → 11; [6] → 13; [7] → 17; 
 *
 * @author KevinNS
 */
public class Ejercicio6T7RellenarNumerosPrimos {
    
    // Usaré una constante para usarla en el ejercicio
    public static final int PRIMOS = 80;

    public static void main(String[] args) {
        
        // Creamos el array de 80 posiciones
        int[]primos = new int[PRIMOS];
        
        // LLamamos a los métodos
        rellenarPrimos(primos);
        mostrarPrimos(primos);

    }
    
    /**
     * Método para comprobar si un número es primo
     * @param numero
     * @return 
     */
    public static boolean esPrimo(int numero){
        
        if (numero <= 0) return false;
        // Un número es primo si solo es divisible por 1 y por sí mismo
        // Por eso intentamos dividirlo por todos los números desde el 2
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) { // Si el resto es 0 hemos encontrado un divisor
                return false; // No es primo, salimos del método  
            }
        }
        return true; // Si sale del bucle sin encontrar divisores, es primo
    }
    
    /**
     * Método para buscar y guardar los números primos
     * @param rellenar 
     */
    public static void rellenarPrimos(int[]rellenar){
        int encontrados = 0; // Contador de cuantos primos llevamos
        int numeroInicio = 1; // Empezamos desde el 1
        
        // Usamos un bucle while por que no sabemos cuantos números tendremos
        // que analizar hasta encontrar los 80 primos       
        while (encontrados < PRIMOS) {
            if (esPrimo(numeroInicio)) {
                rellenar[encontrados] = numeroInicio; // Lo guardamos 
                encontrados++; // Pasamos a la siguiente posición del array 
            }
            numeroInicio++; // Probamos con el siguiente número  
        }
    }
    
    /**
     * Método que muestra el array
     * @param mostrar 
     */
    public static void mostrarPrimos(int[]mostrar){
        System.out.println("Contenido de un array unidimensional de 80 posiciones: ");
        for (int i = 0; i < mostrar.length; i++) {
            System.out.print("[" + i + "] -> " + mostrar[i] + "; ");
        }
    }
    

}
