package ejercicio7t7aleatorios0y50;

/**
 * Realiza un programa que cree 15 números aleatorios (entre 0 y 50) y muestre
 * los 10 mayores.
 *
 * @author KevinNS
 */
public class Ejercicio7T7Aleatorios0Y50 {
    
    // Definimos el tamaño total con constantes
    public static final int TOTAL = 15;
    public static final int MOSTRAR = 10;

    public static void main(String[] args) {
        
        // Creamos el array usando las constantes
        int[]numeros = new int[TOTAL];
        
        // LLamamos a los métodos
        rellenarAleatorios(numeros);
        ordenarMayorMenor(numeros);
        mostrarMayores(numeros);

    }
    
    /**
     * Método que rellena el array con numeros aleatorios entre 0 y 50
     * @param aleatorio 
     */
    public static void rellenarAleatorios(int[]aleatorio){
        for (int i = 0; i < TOTAL; i++) {
            aleatorio[i] = (int)(Math.random() * 51);
            
        }
    }
    
    /**
     * Método que ordena de mayor a menor el array
     * @param mayor 
     */
    public static void ordenarMayorMenor(int[]mayor){
        int aux; // Creamos una variable auxiliar
        
        for (int i = 0; i < TOTAL - 1; i++) {
            for (int j = 0; j < TOTAL -1; j++) {
                // Comparamos de dos en dos e intercambiamos si es necesario
                if (mayor[j] < mayor[j + 1]) {
                    aux = mayor[j];
                    mayor[j] = mayor[j + 1];
                    mayor[j + 1] = aux; 
                }
            }
        }
    }
   
    public static void mostrarMayores(int[]mostrar){
        System.out.println("Los " + MOSTRAR + " números mayores son:");
        for (int i = 0; i < MOSTRAR; i++) {
            System.out.println("[" + i + "] -> " + mostrar[i] + "; ");
            
        }
    }
}
