
import Multiplos.Multiplos; //Importamos el método 

/**
 * Crearemos un programa en JAVA que imprima todos los números múltiplos de 3
 * que existen entre el número 1 y otro número introducido por el usuario
 *
 * @author kevinNS
 */
public class Ejercicio14T4Multiplos3 {

    //LLamamos a los métodos para que nos muestre el resultados
    public static void main(String[] args) {
        int dato;
        //Creamos un do while para que nos pida el número hasta que sea mayor que 0
        do {
            dato = Multiplos.pedirNum(); //LLamamos al método para pedir el número   
        } while (Multiplos.comprobarNum(dato) == false);
        
        Multiplos.mostrarNum(dato); //LLamamos al método para que nos muestre los número multiplos de 3 entre 1 y x

    }

}
