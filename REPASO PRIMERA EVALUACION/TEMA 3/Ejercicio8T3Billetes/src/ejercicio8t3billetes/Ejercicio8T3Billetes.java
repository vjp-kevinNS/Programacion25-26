package ejercicio8t3billetes;
import java.util.Scanner;
/**
 * Realiza un programa que dado un importe en euros nos indique número óptimo de
 * billetes de 50, 20, 10 y 5, así como la cantidad sobrante en monedas de 2 y
 * de 1 euro. En caso de que NO haya billetes/monedas de algún tipo NO se
 * mostrarán.
 *
 * @author KevinNS
 */
public class Ejercicio8T3Billetes {

    public static void main(String[] args) {
        
        //Pedimos al usuario que introduzca una cantidad
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca una cantidad de dinero");
        int cantidad = entrada.nextInt();
        int numero = cantidad;
        
        //Ahora creamos las variables de los billetes y la descomposición
        int billetes50 = numero / 50;
        numero = numero % 50;
        int billetes20 = numero / 20;
        numero = numero % 20;
        int billetes10 = numero / 10;
        numero = numero % 10;
        int billetes5 = numero / 5;
        numero = numero % 5;
        int monedas2 = numero / 2;
        numero = numero % 2;
        int monedas1 = numero / 1;
        numero = numero % 1;
        
        //Imprimimos el resultado por pantalla sin mostrar los datos en caso de
        //que no haya esos billetes o monedas
        
        System.out.println(cantidad + " Se descompone en: ");
        if (billetes50 > 0) System.out.println("Billetes de 50: " + billetes50);
        if (billetes20 > 0) System.out.println("Billetes de 20: " + billetes20);
        if (billetes10 > 0) System.out.println("Billetes de 10: " + billetes10);
        if (billetes5 > 0) System.out.println("Billetes de 5: " + billetes5);
        if (monedas2 > 0) System.out.println("Monedas de 2 euros: " + monedas2);
        if (monedas1 > 0) System.out.println("Monedas de 1 euro: " + monedas1); 

    }

}
