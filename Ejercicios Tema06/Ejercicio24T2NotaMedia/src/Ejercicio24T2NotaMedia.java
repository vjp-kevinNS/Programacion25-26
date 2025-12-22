import java.util.Scanner;

/**
 * Escribe un programa en JAVA en el que le pidas al usuario las notas de las 
 * asignaturas del Ciclo de DAM/DAW y te calcule la nota media del curso.
 * 
 * • Muestra por pantalla el resultado de la siguiente forma:
 * Por favor, introduzca la nota de Programación: X.X
 * Introduzca la nota de Lenguajes de Marcas: X
 * Introduzca la nota de Bases de Datos: X.X
 * Introduzca la nota de Entornos de Desarrollo: X
 * Introduzca la nota de Sistemas Informáticos: X
 * Introduzca la nota de Inglés Profesional: X
 * Por último, introduzca la nota de Itinerario Personal para la Empleabilidad: X.X
 * Su nota media del curso es de: X.X
 *
 * @author KevinNS
 */
public class Ejercicio24T2NotaMedia {

    public static void main(String[] args) {
        
        //Pedimos al usuario que introduzca las notas
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca la nota de Programación: ");
        double prog = entrada.nextDouble();
        System.out.println("Introduzca la nota de Lenguajes de Marcas: ");
        double leng = entrada.nextDouble();
        System.out.println("Introduzca la nota de Bases de Datos: ");
        double bases = entrada.nextDouble();
        System.out.println("Introduzca la nota de Entornos de Desarrollo: ");
        double entorno = entrada.nextDouble();
        System.out.println("Introduzca la nota de Sistemas Informáticos: ");
        double sist = entrada.nextDouble();
        System.out.println("Introduzca la nota de Inglés Profesional: ");
        double ingles = entrada.nextDouble();
        
        //Calculamos la media
        double media = (prog + leng + bases + entorno + sist + ingles) / 6 ;
        
        //Imprimimos por pantalla el resultado
        System.out.println("Su nota media del curso es de: " + media);

    }

}
