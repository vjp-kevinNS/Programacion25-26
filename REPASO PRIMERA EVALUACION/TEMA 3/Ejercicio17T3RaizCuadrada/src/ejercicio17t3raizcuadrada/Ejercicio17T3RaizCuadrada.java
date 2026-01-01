package ejercicio17t3raizcuadrada;
import java.util.Scanner;
/**
 * Crea un programa que calcule la raíz cuadrada del número que introduzca el
 * usuario. (Utiliza el método Math.sqrt()
 * 
 * • Si el usuario introduce un número negativo, debemos mostrarle un mensaje de
 * error y volver a pedírselo (tantas veces como sea necesario).
 *
 * @author KevinNS
 */
public class Ejercicio17T3RaizCuadrada {


    public static void main(String[] args) {
        
        //Creamnos Scanner y una variable double
        Scanner entrada = new Scanner(System.in);
        double numero;
        
        //Creamos un bucle do while con un if dentro
        do {
            //Pedimos al usuario que introduzca un número
            System.out.println("Por favor, introduzca un número");
            numero = entrada.nextDouble();
            
            if (numero <= 0) {
                System.out.println("Error, introduzca un número válido");  
            }
            
        } while (numero <= 0); //El bucle se repite mientras el valor no sea válido
        
        //Calculamos la raiz cuadrada usando Math.sqrt
        double resultado = Math.sqrt(numero);
        
        //Imprimimos el resultado por pantalla
        System.out.println("La raiz cuadrada de " + numero + " es: " + resultado);
        
    }

}
