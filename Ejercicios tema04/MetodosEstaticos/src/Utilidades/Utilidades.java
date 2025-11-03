package Utilidades;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author KevinNS
 */
public class Utilidades {

    // Método que pide un número al usuario
    public static double pedirNumero() {
        double num = 1;
        try {
            Scanner entrada = new Scanner(System.in);
            System.out.print("Escribe un número: ");
            num = entrada.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Has introducido un valor no válido");
        }
        return num;
    }

    //Método que pide una letra aleatoria entre "a" y "z" al usuario usando ASCII
    public static String letraAleatoria() {
        //He mirado en https://elcodigoascii.com.ar/ a que número se corresponde la "a" y la "z"
        //y "a" sería 97 y "z" 122. Entonces nuestro rango está entre esos dos números

        int codigo = (int) (Math.random() * 26) + 97; //Número aleatorio entre 97 y 122 y ponemos *26 por que ese es el rango de números que hay entre "a" y "z"
        String letra = "" + (char) codigo;           //Usamos char para que convierta el número en una letra
        return letra;
    }
}
