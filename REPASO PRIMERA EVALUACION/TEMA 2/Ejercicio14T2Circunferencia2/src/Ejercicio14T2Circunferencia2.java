
/**
 * Realiza un programa que calcule el área de una circunferencia de radio 5,2
 * centímetros. Para ello utiliza la constante PI.
 * 
 * • Muestra por pantalla el resultado de igual forma que el ejercicio anterior.
 *
 * @author KevinNS
 */
public class Ejercicio14T2Circunferencia2 {
    
    private static double PI = 3.14;

    public static void main(String[] args) {
        
        //Usaré la clase Math.PI directamente para calcularla, aunque haya
        //declarado la constante PI
        
        //Creamos la variable radio
        double radio = 5.2;
        
        //Creamos la variable formula, que es la que usaremos para calcularlo
        double formula = 2 * Math.PI * radio;
        
        //Finalmente imprimimos por pantalla la operación
        System.out.println("El área de la circunferencia es: " + formula 
                + "cm.");
        
        
        

    }

}
