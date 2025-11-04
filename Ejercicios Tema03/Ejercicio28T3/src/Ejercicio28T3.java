
/**
 *
 * @author KevinNS
 */
public class Ejercicio28T3 {

    public static void main(String[] args) {
        int numero = (int) (Math.random() * 100) + 1; // número aleatorio entre 1 y 100
        System.out.println("Número aleatorio: " + numero);

        int doble = numero * 2;
        int suma = numero + 50;

        System.out.println("El doble del número es: " + doble);
        System.out.println("El número más 50 es: " + suma);
    }
}    
