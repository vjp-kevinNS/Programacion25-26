import java.util.Scanner; //Importamos Scanner
/**
 *Escribe un programa que contenga un
 *método que calcule la potencia de un número (a)
 *elevado a un número (b) que se le pasan como párametros.
 *
 *Controla la excepción de que el número 0 elevado a un
 *número negativo es infinito.
 *
 * @author KevinNS
 */
public class Ejercicio25T4Potencia {

    /**
     * Método que controla la excepción de un número negativo
     * @param num1
     * @param num2
     * @return la excepción
     */    
    public static double potencia(double num1, double num2) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        num1 = entrada.nextDouble();
        System.out.println("Introduce un segundo número: ");
        num2 = entrada.nextDouble();
        
        //Controlamos la excepcion de 0 elevado a un número negativo
        if (num1 == 0 && num2 < 0) {
            System.out.println("Error: 0 elevado a un número negativo es infinito");
            return 0;
        } else {
            return Math.pow(num1, num2);
        }
    }
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Resultado: " + potencia(entrada.nextDouble(),
                (entrada.nextDouble())));
        

    }

}
