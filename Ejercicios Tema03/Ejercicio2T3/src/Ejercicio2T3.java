/**
 *
 * @author KevinNS
 */
import java.util.Scanner; //Esto permite leer lo que escribe el usuario por teclado

public class Ejercicio2T3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println(" Por favor, introduzca el primer número: "); //Muestra en pantalla el primer número que introduzca el usuario
        int numero1 = entrada.nextInt(); //Guardamos el primer número
        System.out.println(" Por favor, introduzca el segundo número: "); //Muestra en pantalla el segundo número que introduzca el usuario
        int numero2 = entrada.nextInt(); //Guardamos el segundo número
        int resultado;
        
         if (numero1 > 10) {
            resultado = numero1 * numero2;
            System.out.println("El primer número es mayor que 10, se multiplican.");
        } else if (numero1 < 10) {
            resultado = numero1 + numero2;
            System.out.println("El primer número es menor que 10, se suman.");
        } else {
            resultado = 0;
            System.out.println("El primer número es igual a 10, el resultado es 0.");
        }
        System.out.println("La operación que se realizó es suma o producto y el resultado es: " +resultado);
        
        entrada.close();
       
    }
    
}
