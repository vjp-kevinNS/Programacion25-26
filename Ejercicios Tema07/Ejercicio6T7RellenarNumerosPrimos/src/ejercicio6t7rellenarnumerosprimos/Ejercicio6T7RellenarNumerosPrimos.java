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
        int[] primos = new int[PRIMOS];

        // LLamamos a los métodos
        rellenarPrimos(primos);
        mostrarPrimos(primos);

    }

    /**
     * Método para comprobar si un número es primo
     *
     * @param numero
     * @return
     */
    public static boolean esPrimo(int numero) {

        // Un número menor o igual a 1 no se considera primo
        if (numero <= 1) {
            return false;
        }

        // Empezamos a probar divisores desde el 2
        int i = 2;

        // Creamos un while que se ejecuta mientras la condición sea cierta
        while (i < numero) {
            // Comprobamos si el número es divisible por el valor actual de i
            if (numero % i == 0) {
                return false; // Si el resto es 0, hemos encontrado un divisor y no es primo.
            }
            i++;
        }

        // Si el bucle termina sin encontrar divisores, el número es primo
        return true;
    }

    /**
     * Método para buscar y guardar los números primos
     *
     * @param rellenar
     */
    public static void rellenarPrimos(int[] rellenar) {
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
     *
     * @param mostrar
     */
    public static void mostrarPrimos(int[] mostrar) {
        System.out.println("Contenido de un array unidimensional de 80 posiciones: ");
        for (int i = 0; i < mostrar.length; i++) {
            System.out.print("[" + i + "] -> " + mostrar[i] + "; ");
        }
    }

}
