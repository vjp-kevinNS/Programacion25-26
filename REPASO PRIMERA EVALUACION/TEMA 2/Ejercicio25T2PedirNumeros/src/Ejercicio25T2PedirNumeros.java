import java.util.Scanner;

/**
 * Realiza un programa en JAVA en el que le pidas por pantalla 3 números al 
 * usuario y le dé como resultado la suma y el producto de estos.
 * 
 * • Muestra por pantalla el resultado de la siguiente forma:
 * Por favor, introduzca el primer número: XXX
 * Por favor, introduzca el segundo número: XX
 * Por favor, introduzca el tercer número: XXX
 * La suma de los números introducidos es: XXX
 * El producto de los números introducidos es: XXXXX
 *
 * @author KevinNS
 */
public class Ejercicio25T2PedirNumeros {

    public static void main(String[] args) {
        
        //Pedimos al usuario que introduzca 3 números
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, introduzca el primer número: ");
        int num1 = entrada.nextInt();
        System.out.println("Por favor ,introduzca el segundo número: ");
        int num2 = entrada.nextInt();
        System.out.println("Por favor, introduzca el tercer número: ");
        int num3 = entrada.nextInt();
        
        //Ahora realizamos las operaciones
        int suma = num1 + num2 + num3;
        int prod = num1 * num2 * num3;
        
        //Lo immprimimos por pantalla
        System.out.println("La suma de los número introducidos es: " + suma);
        System.out.println("El producto de los números introducidos es: " + prod);
        

    }

}
