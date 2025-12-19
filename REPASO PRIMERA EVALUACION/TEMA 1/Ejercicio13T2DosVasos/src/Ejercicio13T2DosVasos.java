
/**
 *• Realiza un programa en el que tengas dos variables de tipo entero, num1 que contiene
 * un 1 y num2 que contiene un 2. ¿Cómo pasarías el contenido de una variable a otra de
 * forma que num1 contenga el 2 y num2 contenga el 1?
 * 
 * • Muestra por pantalla el resultado de la siguiente forma:
 * La variable num1 contiene el valor 1 y la variable num2 contiene el valor 2.
 * Ahora, la variable num1 contiene el valor 2 y la variable num2 contiene el valor 1.
 *
 * @author KevinNS
 */
public class Ejercicio13T2DosVasos {


    public static void main(String[] args) {
        
        //Declaramos las variables
        int num1 = 1;
        int num2 = 2;
        
        //Mostramos el primer mensaje con los datos correctos
        System.out.println("La variable num1 contiene el valor " + num1 
                + " y la variable num2 contiene el valor " + num2);
        
        //Ahora cambiamos de posicion los datos de las variables y lo imprimimos
        //por pantalla
        
        //Para ello debemos crear una variable adicional para guardar el valor 
        //de num1
        
        int adicional = num1;
        num1 = num2;
        num2 = adicional;
        
        System.out.println("Ahora la variable num1 contiene el valor " + num1 
                + " y la variable num2 contiene el valor " + num2);
        
    }

}
