package ejercicio1t10nombrespersonas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Crea una lista en la que almacenes nombres de personas y luego la muestres
 * por pantalla. 
 * 
 * • Para ello, crea un método para rellenar la lista, en el que le vayas pidiendo 
 * al usuario el nombre de la persona a introducir y si desea introducir otro 
 * nombre. 
 * 
 * • Crea otro método para mostrar la lista por pantalla.
 *
 * @author KevinNS
 */
public class Ejercicio1T10NombresPersonas {
    
    /**
     * Método que pide nombre de la persona al usuario hasta que éste decida
     * parar
     * 
     * @param lista 
     */
    public static void rellenarLista (ArrayList<String>lista){
        Scanner entrada = new Scanner(System.in);
        String respuesta; // Variable para saber si el usuario quiere seguir
        
        // Usamos un do while para introducir al menso un nombre
        do {
            // Pedimos el nombre de la persona al usuario   
            System.out.println("Introduce el nombre de la persona: ");
            String nombre = entrada.nextLine();
            
            // Añadimos el nombre al final de la lista con add
            lista.add(nombre);
            
            // Preguntamos al usuario si quiere introducir otro nombre
            System.out.println("¿Desea introducir otro nombre? (si/no): ");
            respuesta = entrada.nextLine();
            
        } while (respuesta.equalsIgnoreCase("si")); // El bucle se repite mientras el usuario escriba si
        
    }
    
    /**
     * Método que muetra cada nombre creado
     * 
     * @param lista 
     */
    public static void mostrarLista( ArrayList<String>lista){
        System.out.println("---LISTADO DE PERSONAS---");
        
        // Usamos un for each para recorrer y mostrar
        for (String nombre : lista) {
            System.out.println("-> " + nombre); // Imprimimos el nombre actual
        }
        // Si queremos saber cuántos hay en total usamos lista.size()
        System.out.println("Total de personas: " + lista.size());
        
    }

    public static void main(String[] args) {
        
        // Creamos la lista de tipo String para guardar los nombres
        ArrayList<String>listaNombres = new ArrayList<>();
        
        // LLamamos a los métodos
        rellenarLista(listaNombres);
        mostrarLista(listaNombres);
    }

}
