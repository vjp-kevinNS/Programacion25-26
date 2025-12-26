package ejercicio5t3parimpar;
import java.util.Scanner;
/**
 * Implementa un algoritmo en JAVA que le pida al usuario un número por teclado.
 * Posteriormente, el programa le dirá al usuario si el número introducido es
 * par o impar.
 *
 * @author KevinNS
 */
public class Ejercicio5T3ParImpar {


    public static void main(String[] args) {
        
        //Pedimos al usuario que introduzca un número
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, introduzca un número");
        int numero = entrada.nextInt();
        
        //Creamos un bucle if else para saber si es par o impar
        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es par.");
            
        } else{
            System.out.println("El número " + numero + " es impar.");
        }
        
    }

}
