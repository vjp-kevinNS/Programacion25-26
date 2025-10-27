package Billetera;

import java.util.Scanner;

/**
 * Aquí haremos el método que nos indicará el número optimo de billetes y
 * monedas
 *
 * @author KevinNS
 */
public class Billetera {

    public static void cartera(int billetes50, int billetes20, int billetes10, int billetes5, int monedas2, int monedas1, int original, int numero) {

        billetes50 = numero / 50;
        numero = numero % 50;
        billetes20 = numero / 20;
        numero = numero % 20;
        billetes10 = numero / 10;
        numero = numero % 10;
        billetes5 = numero / 5;
        numero = numero % 5;
        monedas2 = numero / 2;
        numero = numero % 2;
        monedas1 = numero;
        numero = numero % 2;
    
        System.out.println(original + " se descompone en " + billetes50 + " billetes de 50 "
                + billetes20 + " billetes de 20 " + billetes10 + " billetes de 10 " + billetes5
                + " billetes de 5 " + monedas2 + " monedas de 2 " + monedas1 + " monedas de 1 ");
    }    
} 

