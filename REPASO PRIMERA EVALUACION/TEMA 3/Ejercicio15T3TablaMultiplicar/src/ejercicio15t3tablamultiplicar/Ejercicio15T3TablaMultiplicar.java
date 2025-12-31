package ejercicio15t3tablamultiplicar;
import java.util.Scanner;
/**
 * Escribe un programa en JAVA que, utilizando bucles, imprima la tabla de
 * multiplicar de un número que elija el usuario.
 *
 * @author KevinNS
 */
public class Ejercicio15T3TablaMultiplicar {

    public static void main(String[] args) {
        
        //Primero pediremos al usuario que introduzca el número
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un número");
        int numero = entrada.nextInt();
        
        int resultado; //Esta variable la usaremos para la operación
        
        //Creamos un bucle for por que sabemos que tiene que llegar hasta 10(11)
        //por que es una tabla de multiplicar
        
        for (int i = 0; i < 11; i++) {
            resultado = numero * i;
            System.out.println(numero + " por " + i + " igual " + resultado);
        }
        
        

    }

}
