package ejercicio2t10mayormenorsuma;

import java.util.ArrayList;
import java.util.Scanner;

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
     * Método que rellena con números positivos pidiendoselo al usuario hasta
     * que éste introduzca un número negativo
     *
     * @param lista
     */
    public static void rellenarLista(ArrayList<Integer> lista) {
        Scanner entrada = new Scanner(System.in);

        // Pedimos al usuario que introduzca números positivos y uno negativo para terminar
        System.out.println("Introduce números positivos (negativo para terminar): ");
        int numeroUsu = entrada.nextInt();

        // Creamos un bucle while
        while (numeroUsu >= 0) {
            lista.add(numeroUsu); // Añadimos el número al final de la lista
            numeroUsu = entrada.nextInt();
        }

    }

    /**
     * Método que muestra todos los elementos de la lista
     *
     * @param lista
     */
    public static void visualizarLista(ArrayList<Integer> lista) {
        System.out.println("Contenido de la lista: ");
        // Usamos un bucle para recorrer desde la posición 0 hasta el tamaño total
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i) + " "); // Extraemos el valor de cada posición

        }
        System.out.println();
    }

    /**
     * Método que obtiene el número mayor
     *
     * @param lista
     * @return
     */
    public static int obtenerMayor(ArrayList<Integer> lista) {
        int mayor = lista.get(0);
        // Recorremos la lista y comparamos
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) > mayor) {
                mayor = lista.get(i);
            }

        }
        return mayor;
    }

    /**
     * Método que obtiene el número menor
     *
     * @param lista
     * @return
     */
    public static int obtenerMenor(ArrayList<Integer> lista) {
        int menor = lista.get(0);
        // Recorremos la lista y comparamos
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) < menor) {
                menor = lista.get(i);
            }

        }
        return menor;
    }
    
    /**
     * Método que calcula la suma de los números
     * @param lista
     * @return 
     */
    public static int obtenerSuma(ArrayList<Integer> lista){
        int suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma += lista.get(i); // Vamos acumulando los valores
            
        }
        return suma;
    }

    public static void main(String[] args) {

        // Creamos el ArrayList para guardar números
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        
        // LLamamos a los métodos 
        rellenarLista(listaNumeros);
        visualizarLista(listaNumeros);
        
        // Si la lista no está vacía, mostramos los resultados
        if (!listaNumeros.isEmpty()) {
            System.out.println("El número mayor es: " + obtenerMayor(listaNumeros));
            System.out.println("El número menor es: " + obtenerMenor(listaNumeros));
            System.out.println("La suma total es: " + obtenerSuma(listaNumeros));
        }
    }

}
