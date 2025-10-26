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
        
        //Realizamos un if else para que, depende de los números que se introduzcan, haga una operación u otra
        if (num1 > 10){
            int resultado = Metodo2.multiplicacion(num1, num2);
            System.out.println("La operación que se realizó es una multiplicación: ");
            System.out.println(num1 + "*" + num2 + "=" + resultado);
        }else{
            int resultado = Metodo1.operacionSuma(num1, num2);
            System.out.println("La operación que se realizó es una suma: ");
            System.out.println(num1 + "+" + num2 + "=" + resultado);
        }
    }
        
    
}
