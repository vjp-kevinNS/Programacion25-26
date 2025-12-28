package ejercicio6t3calificaciones;
import java.util.Scanner;
/**
 * Crea un programa en JAVA en donde el usuario introduzca la nota de un alumno
 * (número entero entre 0 y 10) y se escribirá su calificación según el valor de
 * la nota ingresada:
 *
 * • 0 a 4 = Suspenso. 
 * • 5 a 6 = Bien. 
 * • 7 a 8 = Notable. 
 * • 9 a 10 = Sobresaliente. 
 * 
 * • Nota: Se le avisará al usuario de un error en caso de que la
 * nota que nos introduzca no esté entre 0 y 10.
 *
 * @author KevinNS
 */
public class Ejercicio6T3Calificaciones {

    public static void main(String[] args) {
        
        //Pedimos al usuario que introduzca un número del 0 al 10
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca la nota del alumno");
        int nota = entrada.nextInt();
        
        //Hacemos if else para ver si está aprobado o suspenso
        
        if (nota >=0 && nota <=4) {
            System.out.println("Suspenso");
            
        } else if (nota == 5 || nota == 6 ){
            System.out.println("Bien");
            
        } else if(nota == 7 || nota == 8){
            System.out.println("Notable");
            
        } else if(nota == 9 || nota == 10){
            System.out.println("Sobresaliente");
            
        } else {
            System.out.println("No has introducido una nota válida");
        }
    }    

}
