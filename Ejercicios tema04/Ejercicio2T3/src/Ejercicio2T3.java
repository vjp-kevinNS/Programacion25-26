import java.util.Scanner; //importamos Scanner
//Importamos los dos metodos
import Metodos.Metodo1;
import Metodos.Metodo2;
/**
 *
 * @author kevinNS
 */
public class Ejercicio2T3 {
        
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, introduzca un número: "); //Pedimos el primer número
        int num1 = entrada.nextInt();
        System.out.println("Ahora, introduzca un segundo número: "); //Pedimos el segundo número
        int num2 = entrada.nextInt();
        
        // LLamamos a los métodos
        int suma = Metodo1.operacionSuma(num1, num2);
        int multiplicacion = Metodo2.multiplicacion(num1, num2);
    }
    
}
