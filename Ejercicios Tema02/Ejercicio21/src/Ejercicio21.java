/**
 *
 * @author alumno
 */
import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("por favor introduzca un numero en segundos: ");
        int totalSegundos = sc.nextInt();

        int dias = totalSegundos / 86400;          // 1 día = 86400 segundos
        int horas = (totalSegundos % 86400) / 3600;
        int minutos = (totalSegundos % 3600) / 60;
        int segundos = totalSegundos % 60;

        System.out.println(totalSegundos + " segundos son: " 
            + dias + " dia(s), " 
            + horas + " hora(s), " 
            + minutos + " minuto(s) y " 
            + segundos + " segundo(s).");
    }
}
