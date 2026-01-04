package ejercicio29t3adivinarnumero;
import java.util.Scanner;
/**
 * Escribe un programa que juegue con el usuario a adivinar un número. El
 * ordenador debe generar un número entero aleatorio entre 1 y 100, y el usuario
 * tiene que intentar adivinarlo. 
 * • Para ello, cada vez que el usuario introduce un valor el ordenador debe 
 * decirle al usuario si el número que tiene que adivinar es mayor o menor que 
 * el que ha introducido. 
 * • Cuando consiga adivinarlo debe indicárselo e imprimir en pantalla el número
 * de veces que el usuario ha intentado adivinar el número.
 *
 * @author KevinNS
 */
public class Ejercicio29T3AdivinarNumero {

    public static void main(String[] args) {
        
        //Creamos Scanner, generamos el número aleatorio y creamos las variables necesarias
        Scanner entrada = new Scanner(System.in);
        
        int numeroOculto = (int) (Math.random() * 100 + 1);
        int intento;
        int contadorIntentos = 0; //Esta variable contará las veces que se intenta
        
        System.out.println("Intenta adivinar el número del 1 al 100");
        
        //Creamos un bucle do while con if else dentro
        do {
            System.out.println("Introduce tu número");
            intento = entrada.nextInt();
            contadorIntentos ++; //Sumamos un intento cada vez que se escriba un número
            
            //Con el if else comprobamos si el número es mayor, menor o el correcto
            if (intento < numeroOculto) {
                System.out.println("El número que buscas es MAYOR");
                
            } else if (intento > numeroOculto) {
                System.out.println("El número que buscas es MENOR");
            } else {
                System.out.println("¡HAS ACERTADO!");
            }
            
        // El bucle se repite mientras el intento NO sea igual al número oculto
        } while (intento != numeroOculto);
        
        //Mostramos el total de intentos al final
        System.out.println("Has necesitado " + contadorIntentos + " intentos para acertar");
        
        

    }

}
