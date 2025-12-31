package ejercicio12t3numerospares11y133;

/**
 * Crea un algoritmo en JAVA que, utilizando un bucle do…while, imprima los
 * números pares que existen entre el número 11 y el número 133
 *
 * @author KevinNS
 */
public class Ejercicio12T3NumerosPares11y133 {

    public static void main(String[] args) {

        //Creamos la variable que usaremos como punto de partida
        int numero = 11;

        //Creamos el bucle do while con un if dentro
        do {
            if (numero % 2 == 0) { //Si es par
                System.out.println(numero); //Se imprime   
            }
                numero++; //Se incrementa el valor

        } while (numero <= 133); //Queremos que se quede en el 133

    }

}
