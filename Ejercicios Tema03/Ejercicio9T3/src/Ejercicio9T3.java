/**
 *
 * @author kevinNS
 */
import java.util.Scanner;
public class Ejercicio9T3 {

    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, introduzca el primer número"); //Se muestra el primer número
      int numero1 = entrada.nextInt(); //Guardamos el primer número
        System.out.println("Ahora, introduzca un segundo número"); //Se muestra el segundo número
      int numero2 = entrada.nextInt(); //Guardamos el segundo número
        System.out.println("Introduzca el tercer número"); //Se muestra el tercer número
      int numero3 = entrada.nextInt(); //Guardamos el tercer número
        System.out.println("Por último, introduzca un cuarto número"); //Se muestra el cuarto número
      int numero4 = entrada.nextInt(); //Guardamos el cuarto número
      
        int mayor = numero1;

        if (numero2 > mayor) mayor = numero2;
        if (numero3 > mayor) mayor = numero3;
        if (numero4 > mayor) mayor = numero4;

        System.out.println("El número mayor es: " + mayor);
    }
    
}
