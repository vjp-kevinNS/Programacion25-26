import java.util.Scanner;
/**
 * Diseña un programa en JAVA que lea tres números e imprima por pantalla el 
 * mayor de ellos.
 * 
 * • Muestra por pantalla el resultado de la siguiente forma:
 * Por favor, introduzca el primer numero: xxx
 * Ahora, introduzca un segundo numero: xxx
 * Por último, introduzca un tercer numero: xxx
 * El número mayor de los introducidos es el xxx
 *
 * @author KevinNS
 */
public class Ejercicio3T3TresNumerosMayor {

    public static void main(String[] args) {
        
        //Pedimos al usuario los 3 números
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, introduzca el primer número: ");
        int num1 = entrada.nextInt();
        System.out.println("Ahora, introduzca un segundo número: ");
        int num2 = entrada.nextInt();
        System.out.println("Por último, introduzca un tercer número: ");
        int num3 = entrada.nextInt();
        int mayor; //Variable para guardar el mayor de los 3
        
        //Creamos un bucle if else para ver cual es mayor
        if (num1 > num2 && num1 > num3) {
            mayor = num1;   
        } else if(num2 > num1 && num2 > num3) {
            mayor = num2;
        }else {
            mayor = num3;
        }
        
        //Imprimimos el resultado por pantalla
        System.out.println("El número mayor de los introducidos es: " + mayor);

    }

}
