package ejercicio5t10numeroparimpar;

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
public class Ejercicio5T10NumeroParImpar {

    /**
     * Método que pide números al usuario, que segirá añadienlos hasta que él
     * quiera
     *
     * @param lista
     */
    public static void rellenarLista(ArrayList<Integer> lista) {
        Scanner entrada = new Scanner(System.in);
        String respuesta; // Para la respuesta del usuario(si/no)

        // Creamos un do while para pedir los datos al usuario y que introduzca hasta que él quiera
        do {
            System.out.println("Introduce un número entero: ");
            int numUsu = entrada.nextInt();
            entrada.nextLine();
            // Añadimos el número a la lista con add
            lista.add(numUsu);

            // Preguntamos si quiere añadir otro número
            System.out.println("¿Quieres introducir otro?(si/no): ");
            respuesta = entrada.nextLine();

        } while (respuesta.equalsIgnoreCase("si")); // Repetir mientras el usuario quiera
    }

    /**
     * Método que muestra la lista
     *
     * @param lista
     */
    public static void mostrarLista(ArrayList<Integer> lista) {
        // Usamos for each para recorrer la lista
        for (Integer numero : lista) {
            System.out.println(numero + " ");
        }
        System.out.println();
    }

    /**
     * Método que busca el número mayor par
     *
     * @param lista
     * @return
     */
    public static int buscarPosicionMayorPar(ArrayList<Integer> lista) {
        int maxPar = -1; // Usamos -1 para indicar que aún no hay nada

        // Recorremos la lista
        for (int i = 0; i < lista.size(); i++) {
            int numActual = lista.get(i); // Sacamos el número con get
            // Comprobamos si es par y si es mayor que el mayor actual
            if (numActual % 2 == 0) {
                if (maxPar == -1 || numActual > lista.get(maxPar)) {
                    maxPar = i; // Guardamos la posición
                }
            }

        }
        return maxPar;
    }

    /**
     * Método que busca el número menor impar
     *
     * @param lista
     * @return
     */
    public static int buscarPosicionMenorImpar(ArrayList<Integer> lista) {
        int minImpar = -1; // Usamos -1 para indicar que aún no hay nada

        // Recorremos la lista
        for (int i = 0; i < lista.size(); i++) {
            int numActual = lista.get(i); // Sacamos el número con get
            // Comprobamos si es impar y si es menor que el menor actual
            if (numActual % 2 != 0) {
                if (minImpar == -1 || numActual > lista.get(minImpar)) {
                    minImpar = i; // Guardamos la posición
                }
            }

        }
        return minImpar;
    }
    
    /**
     * Método que intercambia las posiciones
     * 
     * @param lista 
     */
    public static void intercambiar(ArrayList<Integer> lista){
        int posicion1 = 0;
        int posicion2 = 0;
        int auxiliar = lista.get(posicion1); // Guardamos el primer valor
        lista.set(posicion1,lista.get(posicion2)); // Ponemos el segundo valor en el hueco del primero
        lista.set(posicion2, auxiliar); // Ponemos el valor del auxiliar en el hueco del segundo
        
    }

    public static void main(String[] args) {

        // Creamos la lista de números enteros
        ArrayList<Integer> miLista = new ArrayList<>();
        
        // LLamamos al método para pedir datos al usuario
        rellenarLista(miLista);
        
        // Mostramos la lista original
        System.out.println("---LISTA ORIGINAL---");
        mostrarLista(miLista);
        
        // Buscamos el mayor par y el menor impar
        int porMayorPar = buscarPosicionMayorPar(miLista);
        int posMenorImpar = buscarPosicionMenorImpar(miLista);
        
        // Si encontramos ambos, hacemos el intercambio
        if (porMayorPar != -1 && posMenorImpar != -1) {
            // Mostramos los valores antes de intercambiar
            System.out.println("Mayor par: " + miLista.get(porMayorPar));
            System.out.println("Menor impar: " + miLista.get(posMenorImpar));
            
            // Intercambiamos y vovlemos a mostrar
            intercambiar(miLista);
            System.out.println("---LISTA TRAS EL INTERCAMBIO---");
            mostrarLista(miLista);
        }else{
            System.out.println("Error: No hay suficientes números pares o impares");
        }

    }

}
