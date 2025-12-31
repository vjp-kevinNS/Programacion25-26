package ejercicio13t3pares11y133conwhile;

/**
 * Crea un algoritmo en JAVA que, utilizando un bucle while, imprima los números
 * pares que existen entre el número 11 y el número 133.
 *
 * @author KevinNS
 */
public class Ejercicio13T3Pares11y133ConWhile {

    public static void main(String[] args) {
        
        //Como en el anterior, creamos la variable inicial
        int numero = 11;
        
        //Creamos un bucle while con un if dentro
        while (numero <= 133) { //Este es el número final, por lo que se queda ahí            
            if (numero % 2 == 0) { //Si es par
                System.out.println(numero); //Se imprime 
            }
            numero ++; //Incrementamos el valor
        }

    }

}
