package ejercicio3t10numerosenteros;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Realiza un programa que lea tantos números enteros como desee el usuario (le
 * irás preguntando si desea introducir más números) y los introduzca en una
 * lista. 
 * 
 * • A continuación, muestras la lista, luego intercambias los números
 * que se encuentren en la 2ª y 4ª posición, y por último muestras de nuevo la
 * lista por pantalla. 
 * 
 * • Utiliza al menos 3 métodos: uno para introducir los datos, otro para mostrar 
 * los datos y otro para intercambiar los datos.
 *
 * @author KevinNS
 */
public class Ejercicio3T10NumerosEnteros {
    
    /**
     * Método que pide al usuario los números que desea introducir y los añade 
     * a la lista
     * 
     * @param lista 
     */
    public static void introducirNumeros(ArrayList<Integer>lista){
        Scanner entrada = new Scanner(System.in);
        String respuesta; // Para guardar el si o el no
        
        // Creamos un bucle que se repetírá hasta que el usuario quiera
        do {
            // Pedimos al usuario que introduzca un número
            System.out.println("Introduce un número entero: ");
            int numUsu = entrada.nextInt();
            entrada.nextLine();
            
            // Metemos el número en la lista
            lista.add(numUsu);
            
            // Preguntamos al usuario si quiere seguir añadiendo números
            System.out.println("¿Desea introducir más números? (si/no): ");
            respuesta = entrada.nextLine();
            
        } while (respuesta.equalsIgnoreCase("si")); // Repetir si el usuario dice si
    }
    
    /**
     * Método que muestra los datos de la lista
     * 
     * @param lista 
     */
    public static void mostrarDatos(ArrayList<Integer>lista){
        // Usamos un bucle for para recorrer desde la posición 0 hasta el final
        for (int i = 0; i < lista.size(); i++) {
            // Usamos .get(i) para sacar el valor de esa posición sin borrarlo
            System.out.println(lista.get(i) + " ");          
        }
        System.out.println();
    }
    
    /**
     * Método que intercambia el valor de la 2ª posición con el de la 4ª
     * 
     * @param lista 
     */
    public static void intercambiarDatos(ArrayList<Integer>lista){
        // Comprobamos que la lista tenga al menos 4 números para no dar error
        
        if (lista.size() >= 4) {
            // Guardamos el valor de la 2ª posición en la variable auxiliar
            int auxiliar = lista.get(1);
            
            // Ponemos el valor de la 4ª posición en el hueco de la 2ª usando .set
            lista.set(1, lista.get(3));
            
            // Ponemos el valor de antes en el hueco de la 4ª
            lista.set(3, auxiliar);
            
            System.out.println("---Intercambio realizado con éxito---");
            System.out.println();
            
        }else{
            System.out.println("Error. No hay suficientes números para intercambiar la 2ª y 4ª posición");
        }
        
    }

    public static void main(String[] args) {
        
        // Creamos la lista para guardar números enteros
        ArrayList<Integer>miLista = new ArrayList<>();
        
        // LLamamos al método para pedir los números al usuario
        introducirNumeros(miLista);
        
        // Mostramos la lista por primera vez
        System.out.println("---LISTA ORIGINAL---");
        mostrarDatos(miLista);
        
        // Intercambiamos los valores
        intercambiarDatos(miLista);
        
        // Mostramos el resultado final
        System.out.println("---LISTA TRAS EL INTERCAMBIO---");
        mostrarDatos(miLista);

    }

}
