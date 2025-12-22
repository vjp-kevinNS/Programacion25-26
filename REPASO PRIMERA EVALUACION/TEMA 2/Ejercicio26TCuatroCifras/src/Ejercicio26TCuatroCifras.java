import java.util.Scanner;

/**
 * Desarrolla un programa en el que le pidas al usuario un número de 4 cifras y
 * muestre por pantalla cada una de las cifras que lo forman.
 * 
 * • Muestra por pantalla el resultado de la siguiente forma:
 * Por favor, introduzca un número de 4 cifras: XYZW
 * La primera cifra es: X
 * La segunda cifra es: Y
 * La tercera cifra es: Z
 * La cuarta cifra es: W
 *
 * @author KevinNS
 */
public class Ejercicio26TCuatroCifras {

    public static void main(String[] args) {
        
        //Pedimos al usuario que introduzca un número de 4 cifras
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, introduzca un número de 4 cifras: ");
        int numero = entrada.nextInt();
        
        //Realizamos la operación
        int cifraUno = (numero / 1000);
        int cifraDos = (numero / 100) % 10;
        int cifraTres = (numero / 10) % 10;
        int cifraCuatro = numero % 10;
        
        //Imprimimos el resultado por pantalla
        System.out.println("La primera cifra es: " + cifraUno);
        System.out.println("La segunda cifra es: " + cifraDos);
        System.out.println("La tercera cifra es: " + cifraTres);
        System.out.println("La cuarta cifra es: " + cifraCuatro);
        
        

    }

}
