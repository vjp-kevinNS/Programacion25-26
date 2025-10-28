package Multiplos;
import java.util.Scanner; 
/**
 *
 * @author kevinNS
 */
public class Multiplos {
    
    //Pedimos el número al usuario
    public static int pedirNum(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        int dato = entrada.nextInt();
        return dato;
    } 
    //Creamos un if else para saber si es mayor o menor que 0
    public static boolean comprobarNum(int dato){
        if (dato <= 0){
            return false; 
        }else{
            return true;
        }   
    }
    //Creamos un bucle for para que nos muestre los múltiplos de 3
    public static void mostrarNum(int num) {
        for (int i = 0; i <= num; i = i+3) {
            
                System.out.println(i);
            
        }
    }
}
