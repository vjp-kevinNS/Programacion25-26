
import java.util.Scanner; //Importamos Scanner
/**
 * Operacions Aritméticas
 * 
 * @author KevinNS
 */
public class Ejercicio1T1 {


    public static void main(String[] args) {
        
        //Primero declaramos las variables enteras que seran los datos con
        //con los que haremos las operaciones
        
        int numero1;
        int numero2;
        int resultado;
        
        // Asignamos valor a las variables y luego haremos tambien que el usuario
        // meta los numeros que quiera usar
        numero1 = 30;
        numero2 = 40;
        
        // También podemos declarar las variables y asignar el valor directamente
        
        int numero3 = 23;
        int numero4 = 89;
        
        // Realizamos las operaciones que queramos 
        
        //SUMA
        resultado = numero1 + numero2;
        System.out.println(numero1 + "+" + numero2 + "=" + resultado);
        resultado = numero2 + numero4;
        System.out.println(numero3 + "+" + numero4 + "=" + resultado);
        
        //RESTA
        resultado = numero1 - numero2;
        System.out.println(numero1 + "-" + numero2 + "=" + resultado );
        resultado = numero3 - numero4;
        System.out.println(numero3 + "-" + numero4 + "=" + resultado );
        
        //MULTIPLICACION
        resultado = numero1 * numero2;
        System.out.println(numero1 + "*" + numero2 + "=" + resultado );
        resultado = numero3 * numero4;
        System.out.println(numero3 + "*" + numero4 + "=" + resultado );
        
        //DIVISION
        resultado = numero1 / numero2;
        System.out.println(numero1 + "/" + numero2 + "=" + resultado );
        resultado = numero3 / numero4;
        System.out.println(numero3 + "/" + numero4 + "=" + resultado );
        
        //Ahora probaremos pidiendole al usuario los datos
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, introduce el primer número: ");
        int opcion1 = entrada.nextInt();
        System.out.println("Ahora, introduzca el segundo número: ");
        int opcion2 = entrada.nextInt();
        
        resultado = opcion1 + opcion2;
        System.out.println(opcion1 + "+" + opcion2 + "=" + resultado);
        
        //Así podriamos hacer con las demás operaciones(resta, multiplicación, etc)

    }
    
}
