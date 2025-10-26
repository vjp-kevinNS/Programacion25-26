import java.util.Scanner; //Importamos Scanner
import Metodoimp.Metodoimp; //Importamos el método

/**
 *
 * @author kevinNS
 */
public class Ejercicio4T4 {

    public static void main(String[] args) {
        //Pedimos al usuario que introduzca 3 números
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el primer número: ");
        int num1 = entrada.nextInt();
        System.out.println("Introduzca el segundo número: ");
        int num2 = entrada.nextInt();
        System.out.println("Introduzca el tercer número: ");
        int num3 = entrada.nextInt();
        
        //Importamos el método
        Metodoimp.mostrarMenor(num1, num2, num3);
    }
    
}
