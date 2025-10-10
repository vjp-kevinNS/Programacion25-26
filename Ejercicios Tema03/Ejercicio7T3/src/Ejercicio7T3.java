/**
 *
 * @author KevinNS
 */
import java.util.Scanner;
public class Ejercicio7T3 {

    public static void main(String[] args) {
        int diasemana; //declaramos la variable
        boolean laborable = true;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Escribe el número del dia de la semana");
        diasemana = entrada.nextInt();
        
        switch (diasemana) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
        laborable = true;
            break;
            case 6:
            case 7:
        laborable = false;
        }
        if (laborable == true); {
        System.out.println("Día laborable");
        } else {
        System.out.println("Fin de semana");
        }
    }
    
}
