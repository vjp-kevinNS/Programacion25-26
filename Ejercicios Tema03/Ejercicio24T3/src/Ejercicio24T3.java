/**
 *
 * @author kevinNS
 */
import java.util.Scanner; //importamos scanner
public class Ejercicio24T3 {

    public static void main(String[] args) {
        int i = 1; //Declaramos la variable i, que en este caso es 1 ya que queremos los multiplos de 3 entre 1 y el número que se introduzca
        int contador = 0; //Declaramos la variable contador para que vaya aumentando
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un número para mostrar los números que son multiplos de 3 entre 1 y el que introduzcas: ");
        int num = entrada.nextInt();
        
        //Creamos un if else
            if (num <= 0) { //Si el numero es menor que 0 dará error
            System.out.println("Error, el numero introducido es menor que 0 ");
            }else{
            System.out.println("Los multiplos de 3 que hay entre 1 y " + num + " son ");
        //Creamos un bucle do while
            }do{
                if (i % 3 == 0){ //Si el número es multiplo de 3
                System.out.println(i);
                contador++; //incrementa el contador
            }
                i++; //para aumentar el contador principal
            }while (i <= num);
            System.out.println("La cantidad de números mostrados son: " + contador);
           
    }
    
}
