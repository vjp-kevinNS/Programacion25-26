/**
 *
 * @author kevinNS
 */
import java.util.Scanner; //Importamos Scanner

public class Ejercicio21T3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un número para dividirlo entre otro"); //Pedimos al usuario que introduzca un número
        int num1 = entrada.nextInt(); //Guardamos el primer nuúmero
        System.out.println("Introduzca un segundo número para realizar la división "); //Pedimos al usuario un segundo número
        int num2 = entrada.nextInt(); //Guardamos el segundo número
        int resultado; //Declaramos la variable para que nos dé un resultado
        //Realizamos un programa que realiza una división
        try { 
            resultado = num1 / num2; //El resultado es el num1 entre el num2
        }
        catch (ArithmeticException e){
            System.out.println("Error; " + e.getMessage());
            resultado = 0; //Si el resultado es 0 el programa dará un error
        }
        System.out.println("Resultado: " + resultado);
        }
}

