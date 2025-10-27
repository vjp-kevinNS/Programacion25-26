
import java.util.Scanner; //Importamos Scanner
import Ordenador.Ordenador; //Importamos el método

/**
 *
 * @author kevinNS
 */
public class Ejercicio7T4OrdenadorNumeros {

    public static void main(String[] args) {
        //Pedimos al usuario 4 números
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, introduzca el primer número: ");
        int num1 = entrada.nextInt();
        System.out.println("Ahora, introduzca el segundo número: ");
        int num2 = entrada.nextInt();
        System.out.println("Introduzca el tercer número: ");
        int num3 = entrada.nextInt();
        System.out.println("Por último, introduzca un cuarto número: ");
        int num4 = entrada.nextInt();

        //LLamamos al método
        Ordenador.ordenarNumeros(num1, num2, num3, num4);
    }
}
