package ejercicio5t7mayormenorsuma;
import java.util.Scanner; // Importamos Scanner
/**
 * Realiza un programa en JAVA que calcule el mayor, el menor y la suma de todos
 * los elementos de un array bidimensional de 4x2 números enteros. 
 * 
 * • El programa ejecutará un método en el que el usuario introduzca los valores, luego
 * ejecutará otro método que visualizará los elementos del array de forma
 * atractiva y, por último, se mostrará el mayor, el menor y la suma de todos
 * los elementos (otros 3 métodos independientes).
 *
 * @author KevinNS
 */
public class Ejercicio5T7MayorMenorSuma {
    
    // Declaramos las constantes que utilizaremos
    public final static int FILAS = 4;
    public final static int COLUMNAS = 2;

    public static void main(String[] args) {
        
        // Declaramos la matriz       
        int[][] numeros = new int[FILAS][COLUMNAS];
        
        // LLamamos a los métodos introducir y mostrar
        introducirValores(numeros);
        mostrarElementos(numeros);
        
        // LLamamos a los métodos mayor, menor y suma
        System.out.println("El mayor de los valores es: " + calcularMayor(numeros));
        System.out.println("El menor de los valores es: " + calcularMenor(numeros));
        System.out.println("La suma total de los números es: " + calcularSuma(numeros));

    }
    
    /**
     * Método que pide los valores de la matriz al usuario (4x2)
     * @param valores 
     */
    public static void introducirValores(int[][]valores){       
        // Primero usamos Scanner para pedir los números al usuario
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce los números para la matriz 4x2");
        
        // Creamos los bucles para recorrer filas y columnas (for)
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.println("FILA [" + i + "] + COLUMNA [" + j + "] ");
                valores[i][j] = entrada.nextInt();   
            }
            
        }
    }
    
    /**
     * Método que muestra los elementos del array
     * @param elementos 
     */
    public static void mostrarElementos(int[][]elementos){
        System.out.println("RESULTADO: ");
        for (int i = 0; i < FILAS; i++) {
            
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.print(elementos[i][j] + " ");
                
            }
            System.out.println("");
        }
    }
    
    /**
     * Método que muestra el mayor número
     * @param numero
     * @return 
     */
    public static int calcularMayor(int[][]numero){
        // Suponemos que el primer elemento es el mayor para empezar a comparar        
        int mayor = numero[0][0];
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                if (numero[i][j] > mayor) {
                    mayor = numero[i][j];                    
                }       
            }  
        }
        return mayor;
    }
    
    /**
     * Método que muestra el menor número
     * @param numero
     * @return 
     */
    public static int calcularMenor(int[][]numero){   
        int menor = numero[0][0];
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                if (numero[i][j] < menor) {
                    menor = numero[i][j];                    
                }       
            }  
        }
        return menor;
    }
    
    /**
     * Método que calcula la suma de los números
     * @param numero
     * @return 
     */
    public static int calcularSuma(int[][]numero){
        int sumaAcumulada = 0;
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                sumaAcumulada += numero[i][j];
            }
            
        }
        return sumaAcumulada;
    }

}
