package ejercicio23t3numerosexistentes;
import java.util.Scanner;
/**
 * Realiza un algoritmo que imprima todos los números existentes entre el número
 * 1 y otro introducido por el usuario. 
 * • Controla que el usuario te meta un número mayor que 1 y, sino, avísale del 
 * error y vuélveselo a pedir las veces que hagan falta
 * (hasta que introduzca un número mayor que 1)
 *
 * @author KevinNS
 */
public class Ejercicio23T3NumerosExistentes {

    public static void main(String[] args) {
        
        //Creamos Scanner
        Scanner entrada = new Scanner(System.in);
        int numero; //Ahora usaremos esta variable en el bucle
        
        //Creamos un bucle do while con un if dentro
        do {
            System.out.println("Introduzca un número mayor que 1");
            numero = entrada.nextInt(); //Este es el núm introducido por el usuario
            if (numero <= 1) { //Si el número es menor que 1 dará error
                System.out.println("Error. El número debe ser mayor que 1");
            }
            
        } while (numero <= 1); //Volverá a pedir el número
        
        //Imprimimos el resutlado por pantalla
        System.out.println("Los números existentes entre el 1 y " + numero + " son: ");
        
        //Ahora creamos un for por que sabemos exactamente cúantas veces se repetirá la acción
        for (int i = 1; i <= numero; i++) {
            System.out.println(i);     
        }
        

        

    }

}
