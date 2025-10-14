/**
 *
 * @author kevinNS
 */
import java.util.Scanner;

public class Ejercicio26 {
 
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Por favor, introduzca un numero de 4 cifras: "); //Pedimos al usuario que introduzca un numero
        int numero = entrada.nextInt(); //Guardamos el número
        //Realizamos las operaciones
        int cifraUno = (numero / 1000);
        int cifraDos = (numero / 100) % 10;
        int cifraTres = (numero /10) % 10;
        int cifraCuatro = numero % 10;
       
        System.out.println (numero + " numero: "
                + cifraUno + " cifra 1, "
                + cifraDos + " cifra 2, "
                + cifraTres + " cifra 3, "
                + cifraCuatro + " cifra 4");
    }
    
}
