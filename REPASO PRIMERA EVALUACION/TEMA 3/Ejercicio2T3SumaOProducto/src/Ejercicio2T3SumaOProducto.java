import java.util.Scanner;
/**
 * Realiza un programa en el que le solicites al usuario 2 números y, si el 
 * primer número introducido es mayor que 10, se multipliquen, y en caso 
 * contrario que se sumen. Muestra al usuario la operación realizada y el resultado.
 * 
 * • Muestra por pantalla el resultado de la siguiente forma:
 * Por favor, introduzca un numero: xxx
 * Ahora, introduzca un segundo numero: xxx
 * La operación que se realizó es suma o producto y el resultado es xxx
 *
 * @author KevinNS
 */
public class Ejercicio2T3SumaOProducto {

    public static void main(String[] args) {
        
        //Pedimos al usuario que introduzca los dos números
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el primer número: ");
        int num1 = entrada.nextInt();
        System.out.println("Introduzca el segundo número: ");
        int num2 = entrada.nextInt();
        int resultado;
        
        //Creamos un bucle if else para que haga la operación correspondiente
        if (num1 > 10) {
            resultado = num1 * num2;
            System.out.println("El primer número es mayor que 10, se multiplican");    
        } else if (num1 < 10){
            resultado = num1 + num2;
            System.out.println("El primer número es menor que 10, se suman");
        } else {
            resultado = 0;
            System.out.println("El primero número es igual a 10, el resultado es 0");
        }
        
        //Imprimimos el resultado por pantalla
        System.out.println("La operación que se realizó es suma o producto y el resultado es: " 
                + resultado);

    }

}
