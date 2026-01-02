package ejercicio22t3suma;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Crea un programa que calcule la suma de dos números que introduzca el
 * usuario. • En caso de que el usuario introduzca una letra en vez de un
 * número, debemos capturar la excepción y mostrarle un mensaje de error.
 *
 * @author KevinNS
 */
public class Ejercicio22T3Suma {

    public static void main(String[] args) {

        //Pedimos al usuario que introduzca dos números para la suma
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el primer número");
        int num1 = entrada.nextInt();
        System.out.println("Introduzca el segundo número");
        int num2 = entrada.nextInt();
        int resultado;

        //Hacemos un try catch
        try {
            resultado = num1 + num2;
            //Imprimimos por pantalla el resultado
            System.out.println("Resultado: " + resultado);
        } catch (InputMismatchException e) {
            System.out.println("Error. No has introducido un número");
        }
    }

}
