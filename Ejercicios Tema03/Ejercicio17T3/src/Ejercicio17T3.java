/**
 *
 * @author KevinNS
 */
import java.util.Scanner;
public class Ejercicio17T3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un número"); //Le pedimos al usuario que introduzca un número para saber su raiz cuadrada
        int num = entrada.nextInt(); //Guardamos el número
        int numero = 0; //Declaramos la variable número para operar con ella
        //primero realizamos un bucle while para que repita las veces que sea necesario
        while (numero >=0){
            System.out.println("Si el número es negativo será error");
            numero = entrada.nextInt();
        //Después realizamos un if
        if (numero >=0){
            double resultado = Math.sqrt(num); //Declaramos la variable resultado y operamos con Math.sqrt
            System.out.println("La raiz cuadrada de: " + numero + " es " + resultado);
        } 
    
    }     
    }
}