package ContadorNumeros;

import java.util.Scanner;

/**
 * Vamos a pedir al metodo que pida el número al usuario, otro de tipo booleano
 * para comprobar que el número es mayor que 1 y otro para mostrar el resultado.
 *
 * @author kevinNS
 */
public class ContadorNumeros {

    /**
     * Aqui pedimos un numero para que nos le devuelva
     *
     * @return el número
     */
    public static int devuelveNum() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        int dato = entrada.nextInt();
        return dato;
    }

    /**
     * Aquí pedimos que nos diga si el número introducido es mayor o menor que
     * uno y nos devuelva un true o un false (boolean)
     *
     * @param num
     * @return true o false según los datos introducidos
     */
    public static boolean devuelveBoolean(int num) {
        boolean dato;
        if (num <= 1) {
            dato = false;
        } else {
            dato = true;
        }
        return dato;
    }

    /**
     * Aquí queremos que nos muestre el resultado (con for)
     *
     * @param num
     */
    public static void mostrarNum(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }

    }
}
