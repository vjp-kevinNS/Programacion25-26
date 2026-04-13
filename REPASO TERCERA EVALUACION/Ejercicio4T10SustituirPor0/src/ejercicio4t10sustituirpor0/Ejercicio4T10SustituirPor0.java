package ejercicio4t10sustituirpor0;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Escribe un programa que contenga un método que acepte como parámetro una
 * lista de números enteros mayores que 0, pudiendo contener elementos
 * duplicados. Este método debe sustituir cada valor repetido por 0. 
 * 
 * • Otro método se encargará de mostrar la lista antes y después de ser modificada. 
 * 
 * • También necesitarás otro método para rellenar la lista de enteros. Este
 * método le irá pidiendo números al usuario hasta que este introduzca un número
 * negativo.
 *
 * @author KevinNS
 */
public class Ejercicio4T10SustituirPor0 {
    
    /**
     * Método que pide al usuario los números y los añade a la lista
     * 
     * @param lista 
     */
    public static void rellenarLista(ArrayList<Integer>lista){
        Scanner entrada = new Scanner(System.in);
        
        // Pedimos al usuario que introduzca los números
        System.out.println("Introduce números enteros mayores que 0 (negativo para acabar): ");
        int numUsu = entrada.nextInt();
        
        // Usamos un bucle while 
        while (numUsu >= 0) {            
            // Añadimos el número a la lista
            lista.add(numUsu);
            numUsu = entrada.nextInt(); // Pedimos el siguiente número
        }
    }
    
    /**
     * Método que busca los números duplicados y los cambia por 0
     * 
     * @param lista 
     */
    public static void sustituirRepetidos(ArrayList<Integer>lista){
        // Recorremos la lista
        for (int i = 0; i < lista.size(); i++) {
            int valorActual = lista.get(i); // Sacamos el número de la posición i
            
            // Si el número ya es 0 no hace falta comparar por que ya es repetido
            if (valorActual != 0) {
                // Comparamos con el resto de número que vienen después
                for (int j = i + 1; j < lista.size(); j++) {
                    // Si el número en la posición j es igual al que estamos mirando...
                    if (lista.get(j) == valorActual) {
                        lista.set(j, 0); // ... lo sustituimos por un 0
                    }
                    
                }
            }
            
        }
    }
    
    /**
     * Método que muestra el contenido de la lista
     * 
     * @param lista 
     */
    public static void mostrarLista(ArrayList<Integer>lista){
        // Usamos for each para recorrer toda la lista
        for (Integer numero : lista) {
            System.out.println(numero + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        // Creamos la lista de números enteros
        ArrayList<Integer>miLista = new ArrayList<>();
        
        // Rellenamos la lista
        rellenarLista(miLista);
        
        // Mostramos la lista original sin los cambios
        System.out.println("---LISTA ORIGINAL---");
        mostrarLista(miLista);
        
        // Sustitumosd los repetidos
        sustituirRepetidos(miLista);
        
        // Mostramos el resultado final
        System.out.println("---LISTA MODIFICADA---");
        mostrarLista(miLista);

    }

}
