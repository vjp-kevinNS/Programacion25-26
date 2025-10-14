/**
 *
 * @author KevinNS
 */
import java.util.Scanner; //importamos scanner
public class Ejercicio15T3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //Declaramos el scanner entrada
        System.out.println("Introduzca un número para calcular su tabla de multiplicar"); //Pedimos al usuario que introduzca un número
        int numero = entrada.nextInt(); //Guardamos el número
        int resultado;
        int i;//declaramos la variable i para utilizarla en el bucle for
        
        for (i=0; i<=10; i++){
            resultado = numero * i; //el número que haya introducido el usuario se multiplica
        System.out.println (numero +" por " + i + " es " +resultado);
        }
    }
    
}
