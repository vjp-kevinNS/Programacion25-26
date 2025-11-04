
import java.util.Scanner; //Importamos Scanner

/**
 * Desarrolla un programa que, a partir de dos números que nos introduzca el
 * usuario, muestre en pantalla la suma total de todos los números pares
 * comprendidos entre ambos. Usar 3 metodos distintos para pedir el número 1, el
 * número 2 y la suma de los pares
 *
 * @author KevinNS
 */
public class Ejercicio21T4SumaPares {

    /**
     * Método que nos pide el primer número
     *
     * @return el primer número introducido
     */
    public static int pedirNum1() {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el primer número: ");

        return entrada.nextInt();

    }

    /**
     * Método que nos pide el segundo número y si es menor volverá a pedir el
     * número hasta que sea mayor
     *
     * @param num1
     * @param num2
     * @return el segundo número si es mayor
     */
    public static int pedirNum2(int num1, int num2) {
        Scanner entrada = new Scanner(System.in);

        //Realizamos un bucle do while para que, en el caso
        //de que sea menor, nos siga pidiendo el número
        do {
            System.out.println("Introduce un segundo número mayor que " + num1);
            num2 = entrada.nextInt();
            if (num2 <= num1) {
                System.out.println("Error: el número introducido debe ser mayor que el primero");
            }
        } while (num2 <= num1);

        return num2;
    }

    /**
     * Método que nos muestra la suma de los pares
     *
     * @param num1
     * @param num2
     * @return la suma de los pares
     */
    public static int mostrarResultado(int num1, int num2) {
        int suma = 0; //para realizar la suma
        int i; //para aumentar el contador
        System.out.println("Número pares entre : " + num1 + " y " + num2);

        //Realizamos un bucle for para que vaya sumando los pares
        for (i = num1; i <= num2; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                suma += i;
            }
        }

        return suma;
    }

//Aquí, en el main, llamaremos a los métodos para que nos pida los números
//y nos muestre la suma
    public static void main(String[] args) {

        int numero1 = pedirNum1();
        int numero2 = pedirNum2(numero1, 0);
        int suma = mostrarResultado(numero1, numero2);
        System.out.println("La suma de los pares es: " + suma);
    }

}
