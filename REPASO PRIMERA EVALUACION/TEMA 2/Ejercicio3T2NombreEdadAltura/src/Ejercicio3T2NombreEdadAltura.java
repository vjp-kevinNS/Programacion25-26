import java.util.Scanner; //Importamos Scanner
/**
 * Realiza un programa en JAVA que escriba por pantalla tu nombre completo en una
 * línea, en la línea siguiente tu edad y en la siguiente tu altura(con decimales).
 * Para ello deberás, previamente, almacenar tu edad y altura en dos variables 
 * que sean del tipo más óptimo posible (aprovechando la memoria).
 *
 * @author KevinNS
 */
public class Ejercicio3T2NombreEdadAltura {

    public static void main(String[] args) {

        //Creamos las variables
        int edad = 32;
        double altura = 1.70;
        
        System.out.println("Nombre: Kevin Núñez Sánchez");
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
        
        
        //Ahora pediremos al usuario que meta sus datos
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        String nombre = entrada.nextLine();
        System.out.println("Introduce tu edad: ");
        edad = entrada.nextInt();
        System.out.println("Introduce tu altura: ");
        altura = entrada.nextDouble();
        
        System.out.println("Nombre: " + nombre + " Edad: " + edad + " Altura: " + altura);
    }
    
   

}
