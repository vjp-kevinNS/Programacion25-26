/**
 *
 * @author KevinNS
 */
import java.util.Scanner;

public class Ejercicio32 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Le indicamos al usuario que introduzca un número
        System.out.print("Por favor, indique una cantidad de dinero: ");
        int numero = entrada.nextInt();
        int original = numero;
        //Declaramos las variables y hacemos la operacion
      int billetes50 = numero / 50;
      numero = numero %50;
      int billetes20 = numero / 20;
      numero = numero %20;
      int billetes10 = numero / 10;
      numero = numero %10;
      int billetes5 = numero / 5;
      numero = numero %5;
      int moneda2 = numero / 2;
      numero = numero %2;
      int moneda1 = numero;
      numero = numero %2; 
      
        System.out.println(original+ " se descompone en: " +billetes50+ " billetes de 50, "
        +billetes20+ " billetes de 20, " +billetes10+ " billetes de 10, " +billetes5+ " billetes de 5, "
        +moneda2+ " monedas de 2, " +moneda1+ " monedas de 1 ");
                
        
        
          
        
      
        
                
    }
    
}
