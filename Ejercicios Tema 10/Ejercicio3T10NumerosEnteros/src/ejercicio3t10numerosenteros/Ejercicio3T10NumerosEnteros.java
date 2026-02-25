package ejercicio3t10numerosenteros;

import java.util.ArrayList; // Importamos ArrayList
import java.util.Scanner; // Importamos Scanner

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
     * Método que pide los datos al usuario
     * @param lista 
     */
    public static void introducirDatos(ArrayList<Integer> lista){
        Scanner entrada = new Scanner(System.in);
        String respuesta;
        
        do {            
            System.out.println("Introduce un número entero: ");
            int numUsario = entrada.nextInt();
            entrada.nextLine(); // Limpiamos el buffer
            
            // Añadimso el número al final de la lista
            lista.add(numUsario);
            
            System.out.println("¿Quieres introducir otro número? (s/n): ");
            respuesta = entrada.nextLine();
        } while (respuesta.equalsIgnoreCase("S")); // Repite si el usuario quiere
        
    }
    
    /**
     * Método para mostrar la lista con los datos
     * @param lista 
     */
    public static void mostrarDato(ArrayList<Integer> lista){
        // Recorremos la lista desde la posición 0 hasta el final (size)
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i) + " "); // get(i) saca el valor
            }
        
        System.out.println();
    }
    
    /**
     * Método que intercambia los valores de posición
     * @param lista 
     */
    public static void intercambiarDatos(ArrayList<Integer> lista){
        // Guardamos los valores en variables
        // Indice 1 = 2ª posición | Indice 3 = 4ª posición
        int valorPosicion2 = lista.get(1);
        int valorPosicion4 = lista.get(3);
        
        // Usamos set(posición, nuevoValor) para hacer el cambio
        lista.set(1, valorPosicion4); // Ponemos el cuarto número en el segundo hueco
        lista.set(3, valorPosicion2); // Ponemos el segundo número en el cuarto hueco
        
        System.out.println("Se ha echo el intercambio");
    }
            
    public static void main(String[] args) {
        
        // Creamos la lista para guardar números enteros (Integer)
        ArrayList<Integer>listaNumeros = new ArrayList<>();
        
        // LLamamos al método para introducir datos
        introducirDatos(listaNumeros);
        
        // Mostramos la lista original
        System.out.println("Lista inicial: ");
        mostrarDato(listaNumeros);
        
        // Verificamos si hay al menos 4 números para no tener errores
        if (listaNumeros.size() >= 4) {
            // LLamamos al método de intercambio
            intercambiarDatos(listaNumeros);
            
            // Mostramos la lista final
            System.out.println("Lista después del cambio: ");
            mostrarDato(listaNumeros);
            
        } else {
            System.out.println("No hay suficientes números para intercambiar la posición");
        }
        
        
        

    }

}
