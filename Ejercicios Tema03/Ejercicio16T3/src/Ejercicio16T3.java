/**
 *
 * @author kevinNS
 */
public class Ejercicio16T3 {

    public static void main(String[] args) {
            int i = 20; //Declaramos la variable i que en este caso es 20, por que queremos que empiece desde ahi
            int contador = 0; //Declaramos la variable contador para ver cuántos números impares hay
        //bucle do while
            System.out.println("Los números impares existentes entre el número 20 y el 160 son:"); 
        do{ 
            if (i % 2 != 0) { //Si el número es impar
            System.out.println(i);
            contador++; //incrementa el contador de impares
            }
            i++; //para aumentar el contador principal
        } while (i<=160); //como queremos que sea hasta el 160 se quedaría ahi
            System.out.println("La cantidad de números impares impresos han sido: " + contador);
    }
    
}
