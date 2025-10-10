/**
 *
 * @author KevinNS
 */
import java.util.Scanner; //Esto permite leer lo que escribe el usuario por teclado

public class Ejercicio1T3 {

    public static void main(String[] args) { 
        Scanner entrada = new Scanner(System.in);
        System.out.println(" Por favor, introduzca un número: "); //Muestra en pantalla el número que introduzca el usuario
        int numero = entrada.nextInt(); //se guarda el número en una variable
        
        if (numero > 0 ) {  //si el número es mayor que 0 es positivo                                   
            System.out.println("El número introducido es positivo.");
        } else if (numero < 0) { //si el numero es menor que 0 es negativo
                System.out.println("El número introducido es negativo.");
        } else  {           //si no es mayor ni menor entonces es 0
            System.out.println("El número introducido es cero.");
        }
        
    }
    
}
