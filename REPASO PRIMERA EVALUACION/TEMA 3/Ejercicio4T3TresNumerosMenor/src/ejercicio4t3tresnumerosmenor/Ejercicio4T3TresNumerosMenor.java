package ejercicio4t3tresnumerosmenor;

import java.util.Scanner;

/**
 * Escribir un algoritmo en JAVA que pida tres números e imprima por pantalla el
 * menor de ellos
 *
 * @author KevinNS
 */
public class Ejercicio4T3TresNumerosMenor {

    public static void main(String[] args) {
        
        //Pedimos al usuario los 3 números
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, introduzca el primer número: ");
        int num1 = entrada.nextInt();
        System.out.println("Ahora, introduzca un segundo número: ");
        int num2 = entrada.nextInt();
        System.out.println("Por último, introduzca un tercer número: ");
        int num3 = entrada.nextInt();
        int menor; //Variable para guardar el mayor de los 3
        
        //Creamos un bucle if else para ver cual es mayor
        if (num1 < num2 && num1 < num3) {
            menor = num1;   
        } else if(num2 < num1 && num2 < num3) {
            menor = num2;
        }else {
            menor = num3;
        }
        
        //Imprimimos el resultado por pantalla
        System.out.println("El número mayor de los introducidos es: " + menor);

    }

}
