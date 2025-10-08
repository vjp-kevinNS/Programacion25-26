/**
 *
 * @author kevinNS
 */
import java.util.Scanner;

public class Ejercicio6T3 {

    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);
       System.out.println("Por favor, introduzca la nota del alumno");
       int numero = entrada.nextInt();
       
       if (numero >= 0 && numero <= 4) {
        System.out.println("Suspenso");
      }else if (numero == 5 || numero == 6) {
        System.out.println("Bien");
      }else if (numero == 7 || numero == 8){
        System.out.println("Notable");
      }else if (numero == 9 || numero ==10){
        System.out.println("Sobresaliente");
      }
    }
}
