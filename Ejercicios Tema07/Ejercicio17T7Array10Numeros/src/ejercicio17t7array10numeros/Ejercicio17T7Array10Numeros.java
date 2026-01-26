package ejercicio17t7array10numeros;

/**
 * Diseña un método que cree un array unidimensional de 10 números enteros
 * aleatorios entre el 0 y el 9. Luego, otro método, lo visualizará por
 * pantalla, otro método ordenará sus elementos de mayor a menor, y por último
 * volverás a visualizar el array ya ordenado.
 *
 * @author KevinNS
 */
public class Ejercicio17T7Array10Numeros {
    
    // Declaramos la constante que define el tamaño del array
    public final static int TAMAÑO = 10;

    public static void main(String[] args) {
        
        // Creamos el array
        int[]numero = new int[TAMAÑO];
        
        // LLamamos a los métodos
        System.out.println("Rellenando con aleatorios...");
        rellenarAleatorios(numero);
        System.out.println("Mostrando el contenido: ");
        mostrarArray(numero);
        System.out.println("Ordenando de mayor a menor...");
        mayorAMenor(numero);
        System.out.println("Mostrando contenido con los datos ordenados: ");
        mostrarArray(numero);
    }
    
    /**
     * Método que rellena el array con números aleatorios entre 0 y 9
     * @param aleatorio 
     */
    public static void rellenarAleatorios(int[]aleatorio){
        for (int i = 0; i < TAMAÑO; i++) {
            aleatorio[i] = (int)(Math.random() * 10);
        }
    }
    
    /**
     * Método que muestra el contenido del array
     * @param mostrar 
     */
    public static void mostrarArray(int[]mostrar){
        for (int i = 0; i < TAMAÑO; i++) {
            System.out.print(mostrar[i] + " | ");
        }
        System.out.println();
    }
    
    /**
     * Método que ordena de mayor a menor el contenido del array
     * @param ordenar 
     */
    public static void mayorAMenor(int[]ordenar){
        int aux; // Creamos una variable auxiliar
        
        // Creamos este primer bucle para repetir el proceso varias veces y asegurar que todo el array quede ordenado
        for (int i = 0; i < TAMAÑO - 1; i++) {
            // Creamos otro que recorre el array comparando los números de dos en dos
            for (int j = 0; j < TAMAÑO - 1; j++) {
                if (ordenar[j] < ordenar[j + 1]) { // Si el número de la izquierda es menor que el de su derecha lo movemos
                    aux = ordenar[j];
                    ordenar[j] = ordenar[j + 1]; // Realizamos el intercambio de valores
                    ordenar[j + 1] = aux;
                }
            }           
        }
    }

}
