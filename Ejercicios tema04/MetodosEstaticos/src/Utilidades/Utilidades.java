package Utilidades;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author KevinNS
 */
public class Utilidades {
    // Método que pide un número al usuario
    public static int pedirNumero() {
        int num = 1;
        try {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Escribe un número: ");
        num = entrada.nextInt();
        }catch(InputMismatchException e) {
            System.out.println("Has introducido un valor no válido");
        }
        return num;
    }
}
