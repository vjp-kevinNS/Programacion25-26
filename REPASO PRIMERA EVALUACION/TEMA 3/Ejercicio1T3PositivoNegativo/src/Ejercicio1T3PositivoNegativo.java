import java.util.Scanner;
/**
 * Implementa un algoritmo en JAVA que le pida al usuario un número por teclado.
 * Posteriormente el programa le dirá al usuario si el número introducido es 
 * positivo o negativo.
 * 
 * • Muestra por pantalla el resultado de la siguiente forma:
 * Por favor, introduzca un numero: xxx
 * El número introducido es positivo o negativo
 *
 * @author KevinNS
 */
public class Ejercicio1T3PositivoNegativo {

    public static void main(String[] args) {
        
        //Pedimos al usuario un número
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, introduzca un número: ");
        int numero = entrada.nextInt();
        
        //Creamos un bucle if else para saber si es positivo o negativo
        if (numero > 0) { //si el número es mayor que cero es positivo
            System.out.println("El número introducido es positivo");            
        } else if(numero < 0) { //Si el número es menor que cero es negativo
            System.out.println("El número introducido es negativo");
        } else { //Si no es mayor ni menor entonces es cero
            System.out.println("El número es cero");
        }
        

    }

}
