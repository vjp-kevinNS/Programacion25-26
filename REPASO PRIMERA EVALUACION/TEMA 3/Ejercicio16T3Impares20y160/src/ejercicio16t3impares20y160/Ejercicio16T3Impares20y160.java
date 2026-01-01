package ejercicio16t3impares20y160;

/**
 * Crea un programa que imprima los números impares que existen entre los
 * números 20 y el 160. 
 * Además, al final, nos dirá cuantos impares ha imprimido en total por pantalla. 
 * 
 * • Ejemplo: Los números impares existentes entre el número 20 y el 160 son: 
 * 21 – 23 – 25 – 27 – 29 – 31 - … 
 * La cantidad de números impares impresos han sido: XXX
 *
 * @author KevinNS
 */
public class Ejercicio16T3Impares20y160 {

    public static void main(String[] args) {
        
        //Creamos la variable que usaremos como punto de partida y un contador
        int numero = 20;
        int contador = 0;
        
        //Imprimimos el mensaje por pantalla
        System.out.println("Los números impares existentes entre el número 20 y el 160 son: ");
        
        //Creamos un do while con un if dentro para realizar la operación
        do {
            if (numero % 2 != 0) { //si el número es impar
                contador ++; //incrementamos el contador de impares 
                System.out.println(numero);
            }
            numero ++; //incrementamos el contador principal
            
            
        } while (numero <= 160); //Cómo queremos que llegue hasta el 160 se quedaría ahí
                
 
        
        //Imprimimos el resultado del contador
        System.out.println("La cantidad de números impares impresos han sido: " + contador);

    }

}
