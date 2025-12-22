import java.util.Scanner; //Importamos Scanner
/**
 * Realiza un programa en JAVA en el que le preguntes al usuario por el precio 
 * de un producto y cuantas unidades quiere comprar y el programa le calculará 
 * el total de la compra.
 * 
 * • Muestra por pantalla el resultado de la siguiente forma:
 * Por favor, introduzca el precio del modelo de ordenador que desea comprar:
 * XXXX.XX
 * ¿Cuántas unidades quiere llevarse? XX
 * El precio total de su compra es de: XXXX.XX Euros
 *
 * @author KevinNS
 */
public class Ejercicio23T2Producto {

    public static void main(String[] args) {
        
        //Pedimos al usuario el precio del ordenador que quiere comprar
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, introduzca el precio del modelo de ordenador que desea comprar:");
        double precio = entrada.nextDouble();
        
        //Ahora pedimos las unidades
        System.out.println("¿Cuántas unidades quiere llevarse?"); 
        int unidades = entrada.nextInt();
        
        //Calculamos el precio multplicando precio por unidades
        double total = precio * unidades;
        
        //Imprimimos el resultado por pantalla
        System.out.println("El precio total de su compra es de: " + total + " Euros.");
             

    }

}
