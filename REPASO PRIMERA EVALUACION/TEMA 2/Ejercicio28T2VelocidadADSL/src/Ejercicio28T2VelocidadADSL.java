
import java.util.Scanner;

/**
 * Implementa un programa al que introduciéndole el tamaño de un archivo en MB y
 * la velocidad de tu ADSL (en megabits) te calcule el tiempo en minutos que
 * tardarías en descargártelo.
 *
 * @author KevinNS
 */
public class Ejercicio28T2VelocidadADSL {

    public static void main(String[] args) {
        
        //Haremos que nos pida los datos del tamaño y la velocidad 
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el tamaño del archivo en MB: ");
        double tamaño = entrada.nextDouble();
        System.out.println("Introduzca la velocidad del ADSL: ");
        double velocidad = entrada.nextDouble();
        
        //Realizamos la operación
        double tiempo = (tamaño * 8) / velocidad / 60;
        
        //Imprimimos el resultado
        System.out.println("El archivos trardará en descargar: " + tiempo);
        

    }

}
