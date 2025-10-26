package Ejercicio1T4;
import Metodo1.Metodo1; //importamos el método
/**
 *
 * @author KevinNS
 */
public class Ejercicio1T4 {

    public static void main(String[] args) {
        int num = Metodo1.pedirNumero(); //LLamamos al método
        
        //Realizamos un else if para que nos diga cual es positivo y cual negativo
        if (num > 0){
            System.out.println("El número introducido es positivo");
        }else if (num < 0){
            System.out.println("El número introducido es negativo");
        }
    }
    
}