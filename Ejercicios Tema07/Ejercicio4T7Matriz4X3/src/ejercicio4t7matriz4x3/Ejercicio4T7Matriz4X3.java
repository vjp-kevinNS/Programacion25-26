package ejercicio4t7matriz4x3;

/**
 * Escribir un programa que contenga un método que guarde en un array
 * bidimensional de 4x3 12 números aleatorios. 
 * 
 * Los números aleatorios estarán comprendidos entre el número 100 y el número 200. 
 * 
 * Luego, otro método, mostrará solo los números pares que contiene el array.
 *
 * @author KevinNS
 */
public class Ejercicio4T7Matriz4X3 {
    
    // Declaramos las constantes que utilizaremos
    private final static int FILAS = 4;
    private final static int COLUMNAS = 3;

    public static void main(String[] args) {
        
        // Filas -> 4
        // Columnas -> 3
        /**
        |   |   |    1     2     3        
        Numero1 -> [100] [123] [189] 
        Numero2 -> [131] [156] [198] 
        Numero3 -> [112] [178] [166]
        Numero4 -> [142] [118] [181]
         */
        
        // Declaramos la matriz
        int[][] numerosAleatorios = new int[FILAS][COLUMNAS];
        
        // Rellenamos las posiciones con números aleatorios
        rellenarAleatorios(numerosAleatorios);
        
        System.out.println(" ");
        
        // Mostramos los números pares
        mostrarPares(numerosAleatorios);
    }
    
    /**
     * Método que rellena la matriz con números aleatorios
     * @param numeroAleatorio 
     */
    public static void rellenarAleatorios(int[][] numeroAleatorio){
        System.out.println("Numeros aleatorios... ");
        for (int i = 0; i < FILAS; i++) {
            
            for (int j = 0; j < COLUMNAS; j++) {
                numeroAleatorio[i][j] = (int)(Math.random() * 100 + 1) + 100;
//                System.out.println("FILA: " + i + " ");
//                System.out.println("COLUMNA: " + j + " ");
//                System.out.println("CONTENIDO DE I,J: " + numeroAleatorio[i][j]);

                  System.out.print(numeroAleatorio[i][j] + " ");
            }  
            System.out.println("");
        }
    }
    
    /**
     * Método que nos muestras los números pares
     * @param numerosPares 
     */
    public static void mostrarPares(int[][]numerosPares){
        System.out.println("Numeros pares encontrados...");
        for (int i = 0; i < numerosPares.length; i++) {
            
            for (int j = 0; j <numerosPares[i].length ; j++) {
                if (numerosPares[i][j] % 2 == 0) { 
                    System.out.print(numerosPares[i][j] + " ");   
            }
        }
            
        }
    }    
}
