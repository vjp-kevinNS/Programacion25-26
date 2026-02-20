package ejercicio12t9metodocomprueba;
import java.util.Scanner; // Importamos Scanner
/**
 * Crea un programa que contenga un método llamado comprueba, que reciba como
 * parámetro el nombre y extensión de un archivo (por ejemplo notas.txt) y
 * devuelva true si el nombre del archivo está bien formado. 
 * 
 * • Para que el nombre de un archivo esté bien formado contendrá entre 1 y 10 
 * caracteres. 
 * 
 * • Para que la extensión del archivo esté bien formada irá precedida por un
 * punto y contendrá entre 1 y 4 caracteres.
 *
 * @author KevinNS
 */
public class Ejercicio12T9MetodoComprueba {
    
    /**
     * Método que comprueba las reglas que nos pone el ejercicio
     * @param nombreCompleto
     * @return 
     */
    public static boolean comprueba(String nombreCompleto){
        // Buscamos la posición del punto
        int punto = nombreCompleto.lastIndexOf('.');
        
        // Si no hay punto estará mal formado
        if (punto == -1) {
            return false;
        }
        
        // Extraemos el nombre(desde el principio hasta el punto)
        String nombre = nombreCompleto.substring(0, punto);
        
        // Extraemos la extensión (desde después del punto hasta el final)
        String extension = nombreCompleto.substring(punto + 1);
        
        // Verificamos las longitudes
        // Nombre: entre 1 y 10 caracteres
        boolean nombreOK = nombre.length() >= 1 && nombre.length() <= 10;
        
        //Extensión: entre 1 y 4 caracteres
        boolean extensionOK = extension.length() >=1 && extension.length() <= 4;
        
        // Si ambas partes son correctas, devolvemos true
        return nombreOK && extensionOK;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        // Pedimos al usuario que introduzca nombre y extensión
        System.out.println("Por favor, introduzca el nombre y extensión del archivo: ");
        String archivo = entrada.nextLine();
        
        // LLamamos al método y mostramos si es correcto o no
        if (comprueba(archivo)) {
            System.out.println(archivo + " -> CORRECTO");
        } else {
            System.out.println(archivo + " -> INCORRECTO");
        }

    }

}
