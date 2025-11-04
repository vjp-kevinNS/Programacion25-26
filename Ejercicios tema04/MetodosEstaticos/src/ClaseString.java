
import java.util.Scanner;

/**
 *
 * @author KevinNS
 */
public class ClaseString {

    public static void main(String[] args) {
        //Declarar la variable de tipo String
        String nombre;
        String nombre1;

        //Inicializar la variable
        nombre = "Kevin";
        nombre1 = "kevin";

        //Declarar e inicializar una variable de tipo String
        String apellido = "Nuñez";

        //Pedir una cadena al usuario
        Scanner entrada = new Scanner(System.in);
        System.out.print("¿Cuál fue el trofeo que ganaste?: ");
        String trofeos = entrada.nextLine();
        System.out.print("Has ganado el trofeo " + trofeos);

        //Comparar dos valores ( .equals() e .equalIgnoreCse() )
        if (nombre.equals(nombre)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("Son distintos");
        }

        if (nombre.equalsIgnoreCase(nombre1)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("Son distintos");
        }
    }
}
