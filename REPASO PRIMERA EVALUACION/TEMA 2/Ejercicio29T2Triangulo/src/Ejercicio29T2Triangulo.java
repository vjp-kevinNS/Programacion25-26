import java.util.Scanner;
/**
 * Escribe un programa en JAVA en el que se le pida al usuario que introduzca 
 * la longitud de los catetos de un triángulo rectángulo y que posteriormente 
 * el programa calcule la longitud de la hipotenusa.
 * 
 * @author KevinNS
 */
public class Ejercicio29T2Triangulo {


    public static void main(String[] args) {
        
        //Pedimos al usuario que introduzca la longitud de los catetos
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca la longitud del primer cateto: ");
        double cateto1 = entrada.nextDouble();
        System.out.println("Introduzca la longitud el segundo cateto: ");
        double cateto2 = entrada.nextDouble();
        
        //Calculamos la hipotenusa
        double hipotenusa = Math.sqrt((cateto1 * cateto1) + (cateto2 * cateto2));
        
        //Imprimimos el resultado
        System.out.println("La longitud de la hipotenusa es: " + hipotenusa);
        
       
    }
    
}
