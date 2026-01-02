package ejercicio26t3sumaimpares;

/**
 * Diseña un programa en JAVA que te diga la suma total de los números impares
 * existentes entre el 111 y el 222.
 *
 * @author KevinNS
 */
public class Ejercicio26T3SumaImpares {

    public static void main(String[] args) {

        //Primero creamos una variable que será la suma total
        int sumaTotal = 0;

        //Creamos un bucle for  con un if para ir número por número desde el 111 al 222
        for (int i = 111; i <= 222; i++) {

            //Dentro del bucle comprobamos si es par o impar
            if (i % 2 != 0) {
                sumaTotal = sumaTotal + i; //Aumentamos el contador si es impar

            }

        }

        //Por último mostramos el resultado por pantalla
        System.out.println("La suma de los números impares existentes entre el 111 y el 222 es: "
                + sumaTotal);

    }

}
