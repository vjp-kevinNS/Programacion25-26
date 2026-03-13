package ejercicio5t10numerosenlista;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Realiza un programa en JAVA que lea por teclado números enteros (los que
 * quiera el usuario) y los introduzca en una lista.
 *
 * • Tras mostrar la lista por pantalla, calcularás cual es el mayor número par
 * y también el menor número impar de la lista, los muestras por pantalla,
 * intercambias sus posiciones en la lista y muestras el nuevo la lista por
 * pantalla.
 *
 * • Crea todos los métodos que creas conveniente; cuantos más, mejor.
 *
 * @author KevinNS
 */
public class Ejercicio5T10NumerosEnLista {

    /**
     * Método que pide los datos al usuario y el usuario decide cuándo parar
     *
     * @param lista
     */
    public static void rellenarLista(ArrayList<Integer> lista) {
        Scanner entrada = new Scanner(System.in);
        String respuesta = "si"; // Para controlar el bucle

        while (respuesta.equalsIgnoreCase("si")) { // Comparamos ignorando mayúsculas
            System.out.println("Introduce un número entero: ");
            int numero = entrada.nextInt(); // Capturamos el número
            lista.add(numero); // Lo metemos en la lista

            System.out.println("¿Quieres introducir otro? (si/no): ");
            respuesta = entrada.next(); // Leemos si queire seguir            
        }
    }

    /**
     * Método para mostrar los datos
     *
     * @param lista
     */
    public static void mostrarLista(ArrayList<Integer> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i) + " "); // Imprimimos el valor de cada posición           
        }
        System.out.println();
    }

    /**
     * Método que muestra el número mayor que sea además par
     *
     * @param lista
     * @return
     */
    public static int obtenerMayorPar(ArrayList<Integer> lista) {
        int mayorPar = Integer.MIN_VALUE; // Empezamos con el número más pequeño posible
        int indiceEncontrado = -1; // -1 indica que aún no se ha encontrado

        for (int i = 0; i < lista.size(); i++) {
            int numero = lista.get(i);
            // Si el resto de dividir por 2 es 0, es PAR
            if (numero % 2 == 0 && numero > mayorPar) {
                mayorPar = numero; // Actualizamos el del mayor valor
                indiceEncontrado = i; // Guardamos la posición
            }
        }
        return indiceEncontrado; // Devolvemos la posición final
    }

    /**
     * Método que muestra el número menor que sea además impar
     * 
     * @param lista
     * @return 
     */
    public static int obtenerMenorImpar(ArrayList<Integer> lista) {
        int menorImpar = Integer.MAX_VALUE; // Empezamos con el número más grande posible
        int indiceEncontrado = -1; // -1 Indica que aún se ha encontrado

        for (int i = 0; i < lista.size(); i++) {
            int numero = lista.get(i);
            // Si el resto es distinto de 0, es IMPAR
            if (numero % 2 != 0 && numero < menorImpar) {
                menorImpar = numero;
                indiceEncontrado = i;
            }
        }
        return indiceEncontrado; // Devolvemos la posición final
    }
    
    /**
     * Método que intercambia las posiciones 
     * 
     * @param lista
     * @param posicion1
     * @param posicion2 
     */
    public static void intercambiar(ArrayList<Integer>lista,int posicion1,int posicion2){
        int aux = lista.get(posicion1); // Guardamos el primer valor en un "cajón temporal"
        lista.set(posicion1, lista.get(posicion2)); // Movemos el segundo valor al hueco del primero
        lista.set(posicion2, aux); // Recuperamos el valor del cajón y lo ponemos en el segundo
    }

    public static void main(String[] args) {
        // Creamos la lista de números
        ArrayList<Integer> numeros = new ArrayList<>();
        
        // LLamamos al método para que el usuario rellene la lista
        rellenarLista(numeros);
        
        // Mostramos cómo ha quedado la lista inicialmente
        System.out.println("---LISTA ORIGINAL---");
        mostrarLista(numeros);
        
        // Buscamos las "direcciones" (indices) de los números especiales
        int posMayorPar = obtenerMayorPar(numeros);
        int posMenorImpar = obtenerMenorImpar(numeros);
        
        // Solo intercambiamos si hemos encontrado ambos tipos de números
        if (posMayorPar != -1 && posMenorImpar != -1) {
            // Mostramos los valores antes de moverlos para que el usuario lo sepa
            System.out.println("El mayor par es: " + numeros.get(posMayorPar));
            System.out.println("El menor impar es: " + numeros.get(posMenorImpar));
            
            // Realizamos el intercambio de posiciones
            intercambiar(numeros, posMayorPar, posMenorImpar);
            
            // Mostramos el resultado final para comprobar el cambio
            System.out.println("---LISTA TRAS INTERCAMBIAR POSICIONES---");
            mostrarLista(numeros);
            
        }else{
            // Si la lista no tiene pares o no tiene impares, avisamos del error
            System.out.println("No se puede hacer el cambio: faltan pares o impares");
        }

    }

}
