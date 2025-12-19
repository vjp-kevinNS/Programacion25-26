/**
 * Suponemos que llevas en tu cartera 130 euros en billetes de 50 euros y de 10 euros.
 * Realiza un programa que sea capaz de decirte cuantos billetes de cada tienes.
 * 
 * • Muestra por pantalla el resultado de la siguiente forma:
 * 130 euros hacen un total de: 2 billetes de 50 euros y 3 billetes de 10
 * euros.
 *
 * @author KevinNS
 */
public class Ejercicio16T2Billetes {


    public static void main(String[] args) {
        
        //Declaramos las variables
        int billetes = 130;
        int billetes50 = billetes / 50;
        int billetes10 = (billetes - billetes50 * 50) / 10;
        
        //Mostramos el desglose por pantalla
        System.out.println("130 euros hacen un total de " + billetes50 + " billetes de 50 euros y " 
                + billetes10 + " billetes de 10.");
    }

}
