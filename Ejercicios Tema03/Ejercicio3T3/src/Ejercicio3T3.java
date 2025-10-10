/**
 *
 * @author kevinNS
 */
import java.util.Scanner;

public class Ejercicio3T3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println(" Por favor, introduzca el primer número: "); //Muestra en pantalla el primer número que introduzca el usuario
        int numero1 = entrada.nextInt(); //Guardamos el primer número
        System.out.println(" Ahora, introduzca el segundo número: "); //Muestra en pantalla el segundo número que introduzca el usuario
        int numero2 = entrada.nextInt(); //Guardamos el segundo número
        System.out.println(" Por último, introduzca el tercer número: "); //Muestra en pantalla el tercer número que introduzca el usuario
        int numero3 = entrada.nextInt(); //Guardamos el tercer número
        
        int mayor; //Esta variable es para guardar el resultado de la comparación de los 3 números
        //Realizamos la operación
        if (numero1 > numero2 && numero1 > numero3) {
            mayor = numero1;
      } else if (numero2 > numero1 && numero2 > numero3) {
            mayor = numero2;
      } else {
            mayor = numero3;
      }

        System.out.println("El número mayor de los introducidos es el " + mayor);

    }
    
}
