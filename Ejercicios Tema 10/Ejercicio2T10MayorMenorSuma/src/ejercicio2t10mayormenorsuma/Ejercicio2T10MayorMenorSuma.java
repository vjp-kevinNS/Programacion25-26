package ejercicio2t10mayormenorsuma;

import java.util.ArrayList; // Importamos ArrayList
import java.util.Scanner; // Importamos Scanner

/**
 * Crea un programa que calcule el mayor, el menor y la suma de todos los
 * elementos de una lista que contenga números enteros positivos.
 *
 * • El programa permitirá, mediante un método, que el usuario introduzca
 * valores hasta que introduzca un valor negativo.
 *
 * • Otro método visualizará los elementos de la lista
 *
 * • Por último, se mostrará el mayor, el menor y la suma de los elementos
 * (implementado en 3 métodos independientes)
 *
 * @author KevinNS
 */
public class Ejercicio2T10MayorMenorSuma {

    /**
     * Método que pide al usuario que rellene la lista hasta que introduzca un
     * numero negativo
     *
     * @param lista
     */
    public static void rellenarLista(ArrayList<Integer> lista) {
        Scanner entrada = new Scanner(System.in);
        int numeros;
        System.out.println("Introduce número positivos (un negativo para parar): ");
        numeros = entrada.nextInt();

        // Creamos un bucle while por que no sabemos cuántos números querrá poner el usuario
        while (numeros >= 0) {
            lista.add(numeros); // Añadimos el elemento al final de la lists
            numeros = entrada.nextInt();
        }
    }

    /**
     * Metodo que muestra los elementos de la lista
     *
     * @param lista
     */
    public static void mostrarLista(ArrayList<Integer> lista) {
        System.out.println("---ELEMENTOS EN LA LISTA---");
        for (int i = 0; i < lista.size(); i++) { // Size nos da el tamaño
            System.out.println(lista.get(i) + " "); // get(i)extrae el valor
        }
        System.out.println("");
    }

    /**
     * Método que muestra el número mayor
     *
     * @param lista
     */
    public static void calcularMayor(ArrayList<Integer> lista) {
        // Suponemos que el primero (posición 0) es el mayor de todos
        int mayor = lista.get(0);
        for (int i = 0; i < lista.size(); i++) {

            // Recorrecmos desde el segundo elemento (posicion 1) hasta el final
            if (lista.get(i) > mayor) {
                mayor = lista.get(i); // Lo guardamos como el nuevo mayor
            }
        }
        System.out.println("El número mayor es :" + mayor);
    }

    /**
     * Método que muestra el número menor
     *
     * @param lista
     */
    public static void calcularMenor(ArrayList<Integer> lista) {
        // Suponemos que el primero (posición 0) es el menor de todos
        int menor = lista.get(0);
        for (int i = 0; i < lista.size(); i++) {

            // Recorrecmos desde el segundo elemento (posicion 1) hasta el final
            if (lista.get(i) < menor) {
                menor = lista.get(i); // Lo guardamos como el nuevo menor 

            }
        }
        System.out.println("El número menor es : " + menor);
    }

    /**
     * Método que calcula la suma de los números
     *
     * @param lista
     */
    public static void calcularSuma(ArrayList<Integer> lista) {
        int acumulador = 0; // Para ir sumando todo

        for (int i = 0; i < lista.size(); i++) {
            // Vamos añadiendo el valor de cada posición al acumulador
            acumulador += lista.get(i);
        }
        System.out.println("La suma de todos los números es: " + acumulador);
    }

    public static void main(String[] args) {
        ArrayList<Integer> numero = new ArrayList<>();

        // LLamamos al método para rellenar los datos
        rellenarLista(numero);

        // LLamamos al método para mostrar los datos
        mostrarLista(numero);
        
        // Comprobamos si la lista tiene números antes de hacer cáculos
        // is.Empty devuelve true si la lista está vacía
        if (!numero.isEmpty()) {
            // Mostramos los datos
            mostrarLista(numero);
            
        // LLamamos a los métodos para realizar las operaciones
            calcularMayor(numero);
            calcularMenor(numero);
            calcularSuma(numero);
            
        } else {
            System.out.println("No has introducido ningún número positivo");
        }
    }
}
