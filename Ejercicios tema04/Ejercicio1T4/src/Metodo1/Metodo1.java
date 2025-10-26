package Metodo1;
import java.util.Scanner;

/**
 * 
 * @author kevinNS
 */
    //Creamos el método con el que, desde el main, operaremos
public class Metodo1 {
    /**En este caso le vamos a pedir al usuario que introduzca un número
     * y que desde el main nos diga si es positivo o negativo
     * @return el número introducido
     */
    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número: ");
        int num = entrada.nextInt();
        return num;
    }
}