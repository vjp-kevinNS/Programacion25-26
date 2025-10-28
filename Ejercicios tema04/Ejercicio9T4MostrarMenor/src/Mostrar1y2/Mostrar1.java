package Mostrar1y2;

import java.util.Scanner; //Importamos Scanner

/**
 * Aqúi crearemos el método que pida los 3 números
 *
 * @author kevinNS
 */
public class Mostrar1 {

public static int pedirNum() {
    
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el primer número: "); //Pedimos el primer número
        int numero = entrada.nextInt(); //Le guardamos
        return numero;


    }
}
