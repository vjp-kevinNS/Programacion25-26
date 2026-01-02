package ejercicio25t3sumapares;

/**
 * Escribe un programa en JAVA que te diga la suma total de los números pares
 * existentes entre el número 17 y el número 139.
 *
 * @author KevinNS
 */
public class Ejercicio25T3SumaPares {

    public static void main(String[] args) {
        
        //Primero creamos una variable que será la suma total
        int sumaTotal = 0;
        
        //Creamos un bucle for  con un if para ir número por número desde el 17 al 139
        for (int i = 17; i <= 139; i++) {
            
            //Dentro del bucle comprobamos si es par o impar
            if (i % 2 == 0) {
                sumaTotal = sumaTotal + i; //Aumentamos el contador si es par
                
            }
            
        }
        
        //Por último mostramos el resultado por pantalla
        System.out.println("La suma de los números pares existentes entre el 17 y el 139 es: " 
                + sumaTotal);

    }

}
