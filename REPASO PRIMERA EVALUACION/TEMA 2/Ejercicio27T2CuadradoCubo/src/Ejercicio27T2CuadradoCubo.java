import java.util.Scanner;
/**
 * Escribe un programa en JAVA para calcular el cuadrado y el cubo de un número 
 * entero introducido por teclado y que muestre los resultados.
 * 
 * • Muestra por pantalla el resultado de la siguiente forma:
 * Por favor, introduzca un número: XXX
 * El cuadrado de XXX es: XXXXXX
 * El cubo de XXX es: XXXXXXXX
 *
 * @author KevinNS
 */
public class Ejercicio27T2CuadradoCubo {

    public static void main(String[] args) {
        
        //Pedimos un número entero
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, introduzca un número: ");
        int num = entrada.nextInt();
        
        //Realizamos las operaciones
        int cuadrado = num * num;
        int cubo = num * num * num;
        
        //Imprimimos el resultado por pantalla
        System.out.println("El cuadrado de " + num + " es igual a: " + cuadrado);
        System.out.println("El cubo de " + num + " es igual a: " + cubo);

    }

}
