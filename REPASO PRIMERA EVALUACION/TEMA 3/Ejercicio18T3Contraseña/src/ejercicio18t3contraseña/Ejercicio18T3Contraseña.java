package ejercicio18t3contraseña;

import java.util.Scanner;

/**
 * Realiza un programa que le pida una contraseña al usuario. Si la escribe bien
 * le dará la enhorabuena, pero si la escribe mal 3 veces le dará un mensaje de
 * error de acceso.
 *
 * @author KevinNS
 */
public class Ejercicio18T3Contraseña {

    public static void main(String[] args) {

        //Creamos Scanner y las variables que usaremos
        Scanner entrada = new Scanner(System.in);

        int claveCorrecta = 1234; //Esta será la clave correcta
        int intento;              //Aquí guardaremos lo que escriba el usuario
        int fallos = 0;           //Esto será el contador de fallos

        //Creamos un bucle do while con if dentro
        do {
            System.out.println("Introduzca la constraseña");
            intento = entrada.nextInt();

            if (intento == claveCorrecta) {
                System.out.println("¡Enhorabuena!");

            } else {
                fallos++; //Sumamos 1 al contador de fallos
                if (fallos < 3) { //Si falla 3 veces volverá a pedirsela
                    System.out.println("Clave incorrecta. Intentelo de nuevo");
                }
            }
        } while (intento != claveCorrecta && fallos < 3);

        // Si al salir del bucle el último intento sigue siendo malo, damos el error
        if (intento != claveCorrecta) {
            System.out.println("Error de acceso");
        }
    }

}
