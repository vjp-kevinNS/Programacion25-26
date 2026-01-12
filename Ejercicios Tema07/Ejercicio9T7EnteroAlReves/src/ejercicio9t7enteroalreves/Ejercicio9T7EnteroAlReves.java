package ejercicio9t7enteroalreves;
import java.util.Scanner; // Importamos Scanner
/**
 * Realizar un programa en JAVA que le pida al usuario un número entero y que le
 * devuelva el mismo número escrito al revés. 
 * 
 * • Para ello necesitarás un método que le pida el número al usuario, otro 
 * método calculará cuantas cifras tiene el número, otro método dividirá el 
 * número en cifras y las irá metiendo en un array. Por último, otro método 
 * visualizará el array al revés. 
 * 
 * • Ejemplo de ejecución: 
 * Introduzca un número entero: 821
 * El numero introducido escrito al revés es el: 128
 *
 * @author KevinNS
 */
public class Ejercicio9T7EnteroAlReves {

    public static void main(String[] args) {
        
        // 1- LLamamos al método para pedir el número
        int numero = pedirNumero();
        
        // 2. Contamos cúantas cifras tiene
        int tamaño = contarCifras(numero);
        
        // 3. Creamos el array e introducimos las cifras en orden normal
        int[] misCifras = new int [tamaño];
        llenarArray(numero, misCifras);
        
        // 4. Mostramos el array al revés
        mostrarAlReves(misCifras);
    }
    
    /**
     * Método que pide un número y usa return para entregarlo al main
     * @return el número que se guarda
     */
    public static int pedirNumero(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un número entero: ");
        return entrada.nextInt();
    }
    
    /**
     * Método que cuenta cifras dividiendo entre 10
     * @param num
     * @return el total del contador
     */
    public static int contarCifras(int num){
        // Creamos un contador que inicialmente estará en 0
        int contador = 0;
        
        //Creamos un bucle while
        while (num > 0){
            num = num / 10; // Quitamos la última cifra
            contador ++;
        }
        return contador;
    }
    
    /**
     * Método que mete cada cifra en una casilla
     * @param num
     * @param llenar 
     */
    public static void llenarArray(int num, int[] llenar){
        // Recorremos el array desde la ultima casilla hasta la primera para guardarlos en orden
        for (int i = llenar.length - 1; i >= 0; i--) {
            llenar[i] = num % 10; // El resto de dividire por 10 nos dá la última cifra
            num = num / 10; // Reducimos el número para la siguiente vuelta
            
        }
    }
    
    /**
     * Método que imprime el array desde el final hasta el principio
     * @param reves 
     */
    public static void mostrarAlReves(int[] reves){
        // Empezamos en la últimas posición (length - 1) y bajamos hasta la 0
        System.out.println("Número dado la vuelta: ");
        for (int i = reves.length - 1; i >= 0; i--) {
            System.out.print(reves[i]);       
        }
        System.out.println();
    }

}
