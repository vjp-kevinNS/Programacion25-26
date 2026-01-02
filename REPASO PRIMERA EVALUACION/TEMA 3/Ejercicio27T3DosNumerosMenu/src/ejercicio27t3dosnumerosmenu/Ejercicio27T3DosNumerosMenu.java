package ejercicio27t3dosnumerosmenu;
import java.util.Scanner;
/**
 * Diseña un programa en JAVA que pida al usuario dos números por teclado.
 * Posteriormente el programa mostrará un menú que le permitirá al usuario: 
 * • 1.- Sumar los números. 
 * • 2.- Restar los números. 
 * • 3.- Multiplicar los números. 
 * • 4.- Dividir los números. 
 * • 5.- Salir del programa. 
 * 
 * • Nota 1: Mientras el usuario no pulse 5, el programa no termina y el menú 
 * volverá a aparecer pidiendo nuevamente que le introduzcas una opción. 
 * • Nota 2: Controla el caso de división entre 0 mediante la captura de excepciones.
 *
 * @author KevinNS
 */
public class Ejercicio27T3DosNumerosMenu {

    public static void main(String[] args) {
        
        //Primero pedimos los dos número al usuario y creamos la variable opcion
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el primer número");
        int num1 = entrada.nextInt();
        System.out.println("Introduzca el segundo número");
        int num2 = entrada.nextInt();
        int opcion;
        
        //Creamos el menú usando un bucle do while. Dentro crearemos un switch y a su vez un try catch
        do {
            System.out.println("----MENU DE OPCIONES---");
            System.out.println("1-Sumar los números");
            System.out.println("2-Restar los números");
            System.out.println("3-Multiplicar los números");
            System.out.println("4-Dividir los números");
            System.out.println("5-Salir del programa");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Resultado suma: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Resultado resta: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Resultado multiplicación: " + (num1 * num2));
                    break;
                //Creamos un try catch para la división para capturar la excepción    
                case 4:
                    try {
                        int resultado = num1 / num2; //El resultado de dividir los dos números
                        System.out.println("Resultado división: " + resultado);
                    } catch (ArithmeticException e) {
                        //Si el resutlado es 0 saltará un error
                        System.out.println("Error. No se puede dividir por 0");
                        e.printStackTrace();
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no valida");
            }
            
            
        } while (opcion != 5);

    }

}
