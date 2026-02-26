package ejercicio4t10sustituirrepetidospor0;

import java.util.ArrayList; // Importamos ArrayList
import java.util.Scanner; // Importamos Scanner

/**
 * Escribe un programa que contenga un método que acepte como parámetro una
 * lista de números enteros mayores que 0, pudiendo contener elementos
 * duplicados. Este método debe sustituir cada valor repetido por 0.
 *
 * • Otro método se encargará de mostrar la lista antes y después de ser
 * modificada.
 *
 * • También necesitarás otro método para rellenar la lista de enteros. Este
 * método le irá pidiendo números al usuario hasta que este introduzca un número
 * negativo.
 *
 * @author KevinNS
 */
public class Ejercicio4T10SustituirRepetidosPor0 {

    /**
     * Método que pide números enteros al usuario hasta que este meta un número
     * negativo
     *
     * @param lista
     */
    public static void rellenarConNumeros(ArrayList<Integer> lista) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce números enteros(para terminar introduce un negativo): ");
        int numUsuario = entrada.nextInt();

        // Creamos un bucle que se repetirá hasta que el número no sea negativo
        while (numUsuario >= 0) {
            lista.add(numUsuario); // add pone el número al final de la cola
            numUsuario = entrada.nextInt();
        }
    }

    /**
     * Método que muestra el contenido de la lsita por pantalla
     *
     * @param lista
     */
    public static void mostrarDatos(ArrayList<Integer> lista) {
        // Usamos sice() para saber cuántos elementos hay guardados
        for (int i = 0; i < lista.size(); i++) {
            // Usamos get(i) para leer lo que hay en cada posición
            System.out.println(lista.get(i) + " ");
        }
        System.out.println();
    }
    
    /**
     * Método que compara cada número con los siguientes y pone a 0 si hay algún
     * repetido
     * @param lista 
     */
    public static void procesarRepetidos(ArrayList<Integer> lista) {
        int i = 0;

        // Creamos un bucle para que recorra la lista de principio a fin
        while (i < lista.size()) {
            int numABuscar = lista.get(i);
            
            // Si el valor es 0 no hace faltas buscar mas
            if (numABuscar != 0) {
                
                // Creamos otro bucle que mira desde la posición 1 + 1 hasta el final
                int j = i + 1;
                while (j < lista.size()) {
                   
                    // Si encotnramos el mismo número más adelante...
                    if (numABuscar == lista.get(j)) {
                        // ...lo modificamos poniendolo a 0 con el set
                        lista.set(j, 0);
                    }
                    j++; // Avanzamos en la búsqueda interior
                }
                
            }
            i++; // Pasamos al siguiente número para buscar sus repetidos
        }

    }

    public static void main(String[] args) {
        
        // Creamos la lista para números enteros(Integer)
        ArrayList<Integer>listaNumeros = new ArrayList<>();
        
        // 1- Rellenamos la lista
        rellenarConNumeros(listaNumeros);
        
        // 2- Mostramos la lista original
        System.out.println("Lista original: ");
        mostrarDatos(listaNumeros);
        
        // 3- Ejecutamos la búsqueda y sustitución de los números repetidos
        procesarRepetidos(listaNumeros);
        
        // 4-Mostramos el resultado final
        System.out.println("Lista tras las modificaciones: ");
        mostrarDatos(listaNumeros);
        

    }

}
