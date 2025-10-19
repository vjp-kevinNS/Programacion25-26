/**
 *
 * @author kevinNS
 */
import java.util.Scanner; //Importamos scanner
import java.util.InputMismatchException; //Esto lo he importado debido a un error previo, por eso me ha dado por importarlo aqui

public class Ejercicio22T3 {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       
        try { 
            
        System.out.println("Introduzca un número para sumarlo con otro"); //Pedimos al usuario que introduzca un número
        int num1 = entrada.nextInt(); //Guardamos el primer nuúmero
        System.out.println("Introduzca un segundo número para realizar la suma "); //Pedimos al usuario un segundo número
        int num2 = entrada.nextInt(); //Guardamos el segundo número
        int resultado; //Declaramos la variable para que nos dé un resultado
        
        //Realizamos un programa que realiza una suma
            resultado = num1 + num2; //El resultado es el num1 mas el num2
            System.out.println("Resultado: " + resultado);
        }
        catch (InputMismatchException e){ //He usado esto por un error que me ha dado y sel una excepcion lo puse aquí
            System.out.println("Error por no haber introducido un número; ");
        }
        
        }
}
