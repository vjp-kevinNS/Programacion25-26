package ejercicio4t11conjuntos;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Crea un programa con dos conjuntos distintos: HashSet y LinkedHashSet.
 * Inserta en ambos los meses de un año. Posteriormente recorre los conjuntos
 * mostrando su contenido. Estudia sus diferencias. 
 * 
 * • Pista: Necesitarás un vector de String para almacenar los meses.
 *
 * @author KevinNS
 */
public class Ejercicio4T11Conjuntos {
    
    /**
     * Método para recorrer y mostrar cualquier conjunto con un for each
     * 
     * @param conjunto 
     */
    public static void mostrarConjunto(Set<String>conjunto){
        for (String elemento : conjunto) {
            System.out.println(elemento + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        
        // Creamos un vector con los meses del año
        String[]mesesAnio = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", 
            "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", 
            "Diciembre"};
        
        // CREACION DE CONJUNTOS:
        
        // El HashSet es más rápido, pero mças desordenado
        Set<String> conjuntoHash = new HashSet<>();
        
        // El LinkedHashSet usa una lista enlazada para recordar el orden de llegada
        Set<String> conjuntoLinked = new LinkedHashSet<>();
        
        // Metemos los meses en los dos usando un bucle
        for (String mes : mesesAnio) {
            conjuntoHash.add(mes);
            conjuntoLinked.add(mes);
        }
        
        // LLamamos a los métodos para ver los contenidos
        System.out.println("---CONTENIDO DEL HASHSET (Orden aleatorio)---");
        mostrarConjunto(conjuntoHash);
        
        System.out.println("---CONTENIDO DEL LINKEDHASHSET (Orden de ijnserción)---");
        mostrarConjunto(conjuntoLinked);
        
        // Mostramos las diferencias
        System.out.println("El HASHSET mezcla los meses. El LINKEDHASHSET los "
                + "muestra tal y como los escribimos");

    }

}
