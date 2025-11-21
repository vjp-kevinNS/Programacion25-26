
import java.util.InputMismatchException; //La excepción se importa automáticamente
import java.util.Scanner; //Importamos Scanner

/**
 * Realizar un programa orientado a objetos, que pida al usuario dos números por
 * teclado (serán el atributo de dos objetos distintos). Posteriormente el
 * programa mostrará un menú que le permitirá al usuario: 1.- Sumar los números.
 * 2.- Restar los números. 3.- Multiplicar los números. 4.- Dividir los números.
 * 5.- Salir del programa. • Nota1: Mientras el usuario no pulse 5, el programa
 * no termina y el menú volverá a aparecer pidiendo nuevamente que le
 * introduzcas una opción. • Nota 2: Controla el caso de división entre 0
 * mediante la captura de excepciones.
 *
 * @author KevinNS
 */
public class Menu {

    //Creamos los métodos
    /**
     * Método que muestra el menú y nos da un error en el caso de que no se
     * introduzca un número entre 1 y 5.
     *
     * @param entrada
     * @return
     */
    public static int mostrarMenuYLeerOpcion(Scanner entrada) {

        int opcion = 0; //Esta variable la usaremos en el try catch

        //Mostramos el menú para que el ususario elija una opción
        System.out.println("-----MENU DE OPERACIONES-----");
        System.out.println("-------1.-Sumar números------");
        System.out.println("-------2.-Restar números-----");
        System.out.println("---3.-Multiplicar números----");
        System.out.println("-----4.-Dividir números------");
        System.out.println("----5.-Salir del programa----");

        //Usamos un try catch para mostrar la excepción y para que vuelva
        //a aparecer el menú en el caso de que nos dé 0.
        try {
            opcion = entrada.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Error. No has introducido un número del 1 al 5");
            entrada.nextLine(); //Limpiamos el buffer
            opcion = 0;
        }
        return opcion;
    }

    public static void procesarOpcion(int opcion, Numero num1, Numero num2) {

        //Accedemos a los valores de los objetos
        int valor1 = num1.getValor();
        int valor2 = num2.getValor();
        double resultado;

        //Hacemos un switch case para usarlo con el menú
        switch (opcion) {
            case 1:
                resultado = valor1 + valor2;
                System.out.println("Resultado de la SUMA: " + valor1 + " + " + valor2 + " = " + resultado);
                break;
            case 2:
                resultado = valor1 - valor2;
                System.out.println("Resultado de la RESTA: " + valor1 + " - " + valor2 + " = " + resultado);
                break;
            case 3:
                resultado = valor1 * valor2;
                System.out.println("Resultado de la MULTIPLICACION: " + valor1 + " - " + valor2 + " = " + resultado);
                break;
            case 4: //Controlamos la division entre 0 usando un try catch con un if dentro
                try {
                    if (valor2 == 0) {
                        System.out.println("No se puede dividir");
                    }
                    resultado = (double) valor1 / valor2;
                    System.out.println("resultado de la DIVISION: " + valor1 + " / " + valor2 + " = " + resultado);
                } catch (ArithmeticException e) {
                    System.out.println("Error. No se puede dividir");
                }
                break;

            default: //si el usuario no introduce un número del 1 al 5
                System.out.println("No has introducido un número del 1 al 5");
                break;
        }
    }

    public static void main(String[] args) {

        //Pedimos al usuario que introduzca los números
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el primer número");
        int num1 = entrada.nextInt();
        System.out.println("Introduce el segundo número");
        int num2 = entrada.nextInt();

        //Creamos los objetos
        Numero numero1 = new Numero(num1);
        Numero numero2 = new Numero(num2);

        //LLamamos a los métodos
        int opcion;
        //Creamos un Do While para que se repita el menú
        do {
            opcion = mostrarMenuYLeerOpcion(entrada);
            if (opcion != 5) {
                procesarOpcion(opcion, numero1, numero2);
            }

        } while (opcion != 5);
        System.out.println("Saliendo del programa");
    }

}
