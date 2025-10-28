
import java.util.Scanner; //Importamos Scanner
import Billetera.Billetera; //Importamos el método

/**
 * Haremos un método que nos indique un número óptimo de billetes de 50, 20, 10
 * y 5, así como la cantidad sobrante en monedas de 2 y de 1 euro. En caso de
 * que NO haya billetes/monedas de algún tipo NO se mostrarán.
 *
 * @author KevinNS
 */
public class Ejercicio8T4Billetes {

    //Aquí en el main pediremos que se introduzca la cantidad
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, introduce una cantidad de dinero: ");
        int numero = entrada.nextInt(); //Guardamos el número introducido
        int original = numero; // int original Lo usaremos para que el número original no se pierda al hacer la descomposición
        Billetera.cartera(numero, numero, numero, numero, numero, numero, original, numero);
    }

}
