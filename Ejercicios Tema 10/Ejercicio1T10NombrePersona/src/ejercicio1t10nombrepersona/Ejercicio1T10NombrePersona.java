package ejercicio1t10nombrepersona;
import java.util.ArrayList; // Importamos ArrayList
import java.util.Scanner; // Importamos Scanner
/**
 * Crea una lista en la que almacenes nombres de personas y luego la muestres
 * por pantalla. 
 * 
 * • Para ello, crea un método para rellenar la lista, en el que le vayas pidiendo 
 * al usuario el nombre de la persona a introducir y si desea introducir otro nombre.
 * 
 * • Crea otro método para mostrar la lista por pantalla.
 *
 * @author KevinNS
 */
public class Ejercicio1T10NombrePersona {
    
    /**
     * Método que pide el nombre de las personas al usuario
     * @param lista 
     */
    public static void pedirNombre(ArrayList<String> lista){
        Scanner entrada = new Scanner(System.in);
        String respuesta;
        
        // Creamos un do while para pedirle al usuario los nombres
        do {            
            System.out.println("Introduce el nombre:");
            String nombre = entrada.nextLine();
            
            // Usamos add para meter el nombre en la lista
            lista.add(nombre);
            
            System.out.println("¿Desea introducir otro nombre? (s/n): ");
            respuesta = entrada.nextLine();
            
        } while (respuesta.equalsIgnoreCase("s")); // Se vuelve a repetir en el caso de que se ponga Si
        
    }
    
    /**
     * Método que muestra la lista de nombre creados
     * @param lista 
     */
    public static void mostrarLista(ArrayList<String> lista){
         System.out.println("---LISTA DE PERSONAS---");
         
         // Usamos size() para saber cuántos elementos hay
         // Tambien get[i] para obtener el nombre de esa posición
         
         for (int i = 0; i < lista.size(); i++) {
             System.out.println("Persona " + (i + 1) + ": " + lista.get(i));
            
        }
    }

    public static void main(String[] args) {
        
        // Creamos el ArrayList de nombres
        ArrayList<String> listaNombres = new ArrayList<>();
        
        // LLamamos al método para rellenar
        pedirNombre(listaNombres);
        
        // LLammamos al método para mostrar
        mostrarLista(listaNombres);

    }

}
