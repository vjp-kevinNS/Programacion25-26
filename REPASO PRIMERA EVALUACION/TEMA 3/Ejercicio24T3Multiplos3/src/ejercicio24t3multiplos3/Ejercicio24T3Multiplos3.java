package ejercicio24t3multiplos3;
import java.util.Scanner;
/**
 * Crea un programa en JAVA que que imprima todos los números múltiplos de 3 que
 * existen entre el número 1 y otro número introducido por el usuario.
 * 
 * Controla que el usuario te meta un número mayor que 0 y, sino, avísale del
 * error y vuélveselo al pedir las veces que hagan falta. 
 * 
 * • Por último infórmale al usuario del total de números mostrados.
 *
 * @author KevinNS
 */
public class Ejercicio24T3Multiplos3 {

    public static void main(String[] args) {
        
        //Creamos Scanner y la variable contador
        Scanner entrada = new Scanner(System.in);
        int numero; //La usaremos en el bucle
        int contador = 0; //La usaremos como contador que irá aumentando
        
        //Creamos un bucle do while con un if dentro
        
        do {
            System.out.println("Introduzca un número mayor que 0");
            numero = entrada.nextInt();
            
            if (numero <= 0) { //Si el número es 0 dará un error
                System.out.println("Error. El número debe ser mayor que 0");
            }
            
        } while (numero <= 0); //Volverá a pedirnoslo
        
        //Imprimimos un mensaje por pantalla con el resultado
        System.out.println("Los múltiplos de 3 entre 1 y " + numero + " son: ");
        
        //Ahora creamos un bucle for con un fi dentro
        for (int i = 0; i <= numero; i++) {
            if (i % 3 == 0) { //Si el número es múltiplo de 3
                System.out.println(i); //Se imprimirá por pantalla
                contador++; //Sumamos al contador
            }
            
        }
        
        //Por último mostramos los el número total
        System.out.println("En total se han mostrado " + contador 
                + " múltiplos de 3");

    }

}
