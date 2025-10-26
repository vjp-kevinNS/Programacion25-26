import java.util.Scanner; //importamos Scanner
import Calificacion.Calificacion; //Importamos el método
/**
 * Queremos pedir al usuario que introduzca un la nota de un alumno
 * y que el método nos muestre la calificación según el valor introducido
 * Además si no es un número entre 0 y 10 nos dará un eror
 * @author kevinNS
 */
public class Ejercicio6T4PedirNota {
            
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //Pedimos al usuario que introduzca un numero entre 0 y 10
        System.out.println("Introduzca una nota del 0 al 10: ");
        int nota = entrada.nextInt(); //Guardamos el número que el usuario introduce
        
        Calificacion.calificacion(nota);
    }
    
}
