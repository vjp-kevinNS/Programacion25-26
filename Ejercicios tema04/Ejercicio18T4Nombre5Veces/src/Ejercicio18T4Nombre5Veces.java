
import java.util.Scanner; //Importamos Scanner

/**
 *Crear un programa que pida el nombre y
 *a continuación te lo muestre 5 veces.
 * @author KevinNS
 */
public class Ejercicio18T4Nombre5Veces {

    /**
     * Método que pide al usuario que introduzca un nombre
     *
     * @param nombre
     * @return el nombre del usuario
     */
    public static String pedirNombre() {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el nombre: ");
         String nombre = entrada.nextLine();

        return nombre;
    }
    
    /**
     * Método que nos muestra el nombre 5 veces
     * @param nombre
     * @return el nombre 5 veces
     */

    public static void mostrarNombre(String nombre) {
        int i; //Se declara esta variable para aumentar el contador

        for (i = 0; i < 5; i++) { //Como queremos que lo repita 5 veces ponemos 5
            System.out.println(nombre);
        }
        

    }

    public static void main(String[] args) {
       
        String nombre = pedirNombre();
        mostrarNombre(nombre);
        

    }

}
