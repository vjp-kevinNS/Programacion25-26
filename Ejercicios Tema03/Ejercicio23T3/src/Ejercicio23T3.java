/**
 *
 * @author kevinNS
 */
import java.util.Scanner; //Importamos Scanner
public class Ejercicio23T3 {

    public static void main(String[] args) {
        int i = 2; //Declaramos la variable i, que en este caso es 2 ya que queremos que empiece desde el 1 y el uno no se contará
        int contador = 0; //Declaramos la variable contador para que vaya aumentando
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un número para mostrar los números que hay entre medias de 1 y el que introduzcas: ");
        int num = entrada.nextInt();
        //Creamos un if else
            if (num <= 1) { //Si el numero es menor que 1
            System.out.println("Error, el numero introducido es menor que 1 ");
            }else{
            System.out.println("Los números que hay entre 1 y " + num + " son ");
        //Creamos un bucle do while
        do{ 
            System.out.println(i);
            contador++; //incrementa el contador
            i++; //para aumentar el contador principal
        }while (i < num);
        }
    }
}

