import Mostrar1y2.Mostrar1; //Importamos el primer método
import Mostrar1y2.Mostrar2; //Importamos el segundo método

/**
 * Escribir un algoritmo en JAVA que pida tres
 * números (utiliza un método) y se los pase a otro método
 * que los imprima por pantalla mostrando el menor de ellos
 * @author kevinNS
 */
public class Ejercicio9T4MostrarMenor {
        
    public static void main(String[] args) {
        //Creamos las variables que vamos a usar
        int num1;
        int num2;
        int num3;
        //Pedimos los números usando el método 1 3 veces
        num1 = Mostrar1.pedirNum();
        num2 = Mostrar1.pedirNum();
        num3 = Mostrar1.pedirNum();
        //Pedimos que nos muestre el menor al método 2
        Mostrar2.mostrarNum(num1, num2, num3);
    }
    
}
