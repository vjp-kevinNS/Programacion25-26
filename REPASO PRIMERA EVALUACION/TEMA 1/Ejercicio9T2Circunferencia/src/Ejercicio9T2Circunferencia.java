
/**
 * Realiza un programa que calcule la longitud de una circunferencia de radio 3,55
 * metros. Para ello utiliza la constante PI.
 * 
 * • Muestra por pantalla el resultado de la siguiente forma:
 * La longitud de una circunferencia cuyo radio vale 3 sería igual
 * a: xxx metros.
 *
 * @author KevinNS
 */
public class Ejercicio9T2Circunferencia {
    
        final static double PI = 3.14; //Las constantes siempre van en mayúsculas

    public static void main(String[] args) {
        
        //Creamos la variable radio con sus datos
        double radio = 3.55; 
        
        //Creamos la variable formula con la operación, despues usaremos la 
        //clase math
        double formula = 2 * PI * radio; // 
        
        System.out.println("La longitud de una circunferencia cuyo radio vale 3 sería igua a: " 
                + formula + " metros." );
        
        //Ahora haremos los mismo pero usando la clase math.pi
        double formula2 = 2 * Math.PI * radio;
        System.out.println("Operación usando la clase math: " + formula2);

    }

}
