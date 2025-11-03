import java.util.Scanner; //Importamos Scanner
/**
 *
 * @author KevinNS
 */
public class Ejercicio26T4NumerosPrimos {
    
/**
 * Método que recibe un número entero como
 *parámetro y devuelva un booleano que indique si se trata de
 *un número primo o no.
 * @param numero
 * @return si el numero es primo o no
 */
    public static boolean esPrimo(int numero) {
        int divisor;  //Esta variable la usaremos para saber si el numero original se puede dividir sin dejar resto
        boolean primo = true; //Esta variable la usaremos para que nos muestre el resultado true o false

        if (numero < 2) {
            primo = false;
        } else if (numero == 2) {
            primo = true;
        } else {
            for (divisor = 2; divisor <= (int) Math.sqrt(numero); divisor++) {
                if (numero % divisor == 0) {
                    primo = false;
                }
            }
        }
        return primo;
    }

    public static void main(String[] args) {
        
        //Pedimos al usuario que introduzca un número
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un número ");
        int numero = entrada.nextInt();
        
        //Creamos un if else para mostrar por pantalla si es primo o no y llamamos al método
        if (esPrimo(numero)){
            System.out.println(numero + " Es primo ");
        }else{
            System.out.println(numero + " No es primo ");
        }
        

    }

}
