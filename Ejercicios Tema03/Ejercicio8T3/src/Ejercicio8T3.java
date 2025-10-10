/**
 *
 * @author KevinNS
 */
import java.util.Scanner;
public class Ejercicio8T3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, introduzca una cantidad de dinero");//Le indicamos al usuario que introduzca una cantidad de dinero
        int numero = entrada.nextInt(); //Guardamos el número introducido
        int original = numero; //Declaramos la variable original que será el número original antes de descomponerlo
        //Declaramos las variables y realizamos la operación
        int billetes50 = numero / 50;
        numero = numero %50;
        int billetes20 = numero / 20;
        numero = numero %20;
        int billetes10 = numero / 10;
        numero = numero %10;
        int billetes5 = numero / 5;
        numero = numero %5;
        int monedas2 = numero / 2;
        numero = numero %2;
        int monedas1 = numero; //Lo que sobra son monedas de 1
        
        System.out.println(original + " Euros se descomponen en:");
        if (billetes50 > 0) System.out.println("Billetes de 50: " + billetes50);
        if (billetes20 > 0) System.out.println("Billetes de 20: " + billetes20);
        if (billetes10 > 0) System.out.println("Billetes de 10: " + billetes10);
        if (billetes5 > 0) System.out.println("Billetes de 5: " + billetes5);
        if (monedas2 > 0) System.out.println("Monedas de 2 euros: " + monedas2);
        if (monedas1 > 0) System.out.println("Monedas de 1 euro: " + monedas1);     
      
    }
    
}
