package ejercicio9t3menoramayor;
import java.util.Scanner;
/**
 * Escribe un programa en JAVA en el que el usuario introduzca cuatro números
 * enteros y luego el programa los muestre por pantalla ordenados de forma
 * creciente.(de menor a mayor) 
 * 
 * • Muestra por pantalla el resultado de la siguiente forma:
 * 
 * Por favor, introduzca el primer numero: 8 Ahora, introduzca
 * un segundo numero: 5 Introduzca el tercer numero: 9 Por último, introduzca un
 * cuarto numero: 1 
 * 
 * El orden de los números introducidos es el 1 - 5 - 8 - 9
 *
 * @author KevinNS
 */
public class Ejercicio9T3MenorAMayor {

    public static void main(String[] args) {
        
        //Pedimos al usuario que introduzca cuatro números
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, introduzca el primer número: ");
        int num1 = entrada.nextInt();
        System.out.println("Ahora, introduzca un segundo número: ");
        int num2 = entrada.nextInt();
        System.out.println("Introduzca el tercer número: ");
        int num3 = entrada.nextInt();
        System.out.println("por último, introduzca un cuarto número: ");
        int num4 = entrada.nextInt();
        
        //Creamos una variable auxiliar
        int aux;
        
        /**
         * Ahora utilizamos if para hacer el método de la burbuja que consiste
         * en ir comparando los números de dos en dos e ir ordenándolos entre ellos
         */
        
        // Ciclo 1: Llevamos el número más grande al final (a la posición n4)
        if (num1 > num2) { aux = num1; num1 = num2; num2 = aux; } // Intercambio si el primero es mayor [3]
        if (num2 > num3) { aux = num2; num2 = num3; num3 = aux; }
        if (num3 > num4) { aux = num3; num3 = num4; num4 = aux; }

        // Ciclo 2: El más grande ya está en n4, ahora llevamos el siguiente a n3
        if (num1 > num2) { aux = num1; num1 = num2; num2 = aux; }
        if (num1 > num3) { aux = num2; num2 = num3; num3 = aux; }

        // Ciclo 3: Ya solo nos queda asegurar el orden entre n1 y n2
        if (num1 > num2) { aux = num1; num1 = num2; num2 = aux; }

        //Imprimos el resultado por pantalla
        
        System.out.println("El orden de los números introducidos es el " + 
                           num1 + " - " + num2 + " - " + num3 + " - " + num4);

    }

}
