package ejercicio21t3division;
import java.util.Scanner;
/**
 * Crea un programa que calcule el resultado de dividir los números que
 * introduzca el usuario. 
 * • En caso de que el usuario introduzca un número divisor igual a 0, debemos 
 * capturar la excepción y mostrarle un mensaje de error al usuario.
 *
 * @author KevinNS
 */
public class Ejercicio21T3Division {

    public static void main(String[] args) {
        
        //Pedimos al usuario que introduzca los números para la división
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el primer número");
        int num1 = entrada.nextInt();
        System.out.println("Introduzca el segundo número");
        int num2 = entrada.nextInt();
        int resultado; //Creamos la variable resultado para operar con ella también
        
        //Ahora haremos un try catch
        try {
            resultado = num1 / num2; //La división de los números
            //Imprimimos por pantalla el resultado
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error, no se puede dividir por 0");
            e.printStackTrace(); //Al intentar que me saliera la excpeción ví 
                                 //que no me salía y encontré ésto buscando
        }
        
    }

}
