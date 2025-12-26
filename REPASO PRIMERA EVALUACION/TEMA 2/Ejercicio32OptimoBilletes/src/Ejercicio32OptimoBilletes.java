import java.util.Scanner;
/**
 * Realiza un programa que dado un importe en euros nos indique número óptimo de
 * billetes de 50, 20, 10 y 5, así como la cantidad sobrante en monedas de 2 y 
 * de 1 euro.
 * 
 * • Por ejemplo:
 * Por favor, indique una cantidad de dinero: 232
 * 232 Euros se descomponen en 4 billetes de 50, 1 billetes de 20, 1 billetes de 10, 0
 * billetes de 5, 1 monedas de 2 euros y 0 monedas de 1 euro.
 *
 * @author KevinNS
 */
public class Ejercicio32OptimoBilletes {

    public static void main(String[] args) {
        
        //Pedimos al usuario que introduzca una cantidad
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca una cantidad");
        int cantidad = entrada.nextInt();
        
        //Guardamos la cantidad y creamos otra variable para que no se pierda ese valor
        int numero = cantidad;
        
        //Creamos las variables de los billetes y monedas
        int billetes50 = cantidad  / 50;
        cantidad = cantidad % 50;
        int billetes20 = cantidad / 20;
        cantidad = cantidad % 20;
        int billetes10 = cantidad / 10;
        cantidad = cantidad % 10;
        int billetes5 = cantidad / 5;
        cantidad = cantidad % 5;
        int monedas2 = cantidad / 2;
        cantidad = cantidad % 2;
        int monedas1 = cantidad;
        cantidad = cantidad % 1;
        
        //Imprimimos por pantalla el resultado
        System.out.println(numero + " Se descomponen en " + billetes50 + 
                " billetes de 50 " + billetes20 + " billetes de 20 " + billetes10 + 
                " billetes de 10 " + billetes5 + " billetes de 5 " + monedas2 +
                " monedas de 2 euros y " + monedas1 + " monedas de 1 euro.");

    }

}
