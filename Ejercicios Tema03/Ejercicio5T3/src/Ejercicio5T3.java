/**
 *
 * @author kevinNS
 */
import java.util.Scanner;

public class Ejercicio5T3 {
 
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un número: "); //Pedimos al usuario que introduzca un número
        int numero = entrada.nextInt(); //Creamos la variable número y le guardamos
        //Aquí hacemos que nos diga si el número es PAR o IMPAR
        if (numero % 2 == 0){
            System.out.println("El número " + numero + " Es PAR");
        }else {
            System.out.println("El número " + numero + " Es IMPAR");
        }
        
        entrada.close();
    }
    
}
