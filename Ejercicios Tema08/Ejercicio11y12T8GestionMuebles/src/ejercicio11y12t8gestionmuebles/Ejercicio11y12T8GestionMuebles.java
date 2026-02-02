package ejercicio11y12t8gestionmuebles;
import java.util.Scanner; //Improtamos Scanner
/**
 * Crea una clase Mueble con precio y descripción como atributos. Crea
 * constructor por defecto y parametrizado, así como getters y setters. 
 * 
 * • Una vez creada la clase, crea en el main dos objetos de la clase mueble (crea uno
 * de ellos con el constructor por defecto y el otro con el parametrizado) e
 * implementa varias sentencias a tu gusto: cambia la descripción de los objetos
 * utilizando los setters, muestra la información de los objetos por pantalla.
 * 
 * Amplía el ejercicio anterior. Crea un vector de muebles (de 4 celdas) y
 * muestra al usuario las siguientes opciones: 
 * 
 * • Rellenar muebles (todos los muebles del vector). 
 * • Mostrar muebles. 
 * • Mostrar muebles por precio
 * 
 * (pediremos un precio al usuario y mostraremos todos los muebles con igual o
 * menor precio).
 *
 * @author KevinNS
 */
public class Ejercicio11y12T8GestionMuebles {
    
    public static void rellenarMuebles(Mueble[]rellenar){
        Scanner entrada = new Scanner(System.in); //Para que el usuario rellene los campos descripción y precio
        try {
            for (int i = 0; rellenar.length < 10; i++) {
            System.out.println("Datos del mueble " + (i + 1) + ": ");
            System.out.println("Descripción: ");
            String desc = entrada.nextLine();
            System.out.println("Precio: ");
            double precio = entrada.nextDouble();
            entrada.nextLine(); // Limpiamos el buffer
            
        // Creamos el objeto en la posición i
        rellenar[i] = new Mueble(precio, desc);
        }
        System.out.println("Datos rellenados...");
        
        } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Estás intentando acceder a un índice del array que no existe");
        }
    }
    

    public static void main(String[] args) {
        //LLamamos a Scanner
        Scanner entrada = new Scanner(System.in);
        
        // PARTE DEL EJERCICIO 11 QUE NOS PIDE CREAR DOS OBJETOS DE LA MISMA CLASE
        Mueble mueble1 = new Mueble(); // Constructor por defecto 
        Mueble mueble2 = new Mueble(300, "mesa de roble"); // Parametrizado
        
        // Cmabiamos los datos con el setter
        mueble1.setDescripcion("Silla de madera de pino");
        mueble1.setPrecio(105.50);
        
        // Imprimimos por pantalla el resultado
        System.out.println("El mueble 1 es " + mueble1.getDescripcion() 
                + " y tiene un precio de " + mueble1.getPrecio() + " Euros");
        System.out.println("El mueble 2 es " + mueble2.getDescripcion() 
                + " y tiene u precio de " + mueble2.getPrecio() + " Euros");
        
        // PARTE DEL EJERCICIO 12
        
        // Creamos el vector de la clase Mueble
        Mueble[]arrayMueble = new Mueble[4];
        
        // Creamos el menu con un do while y un switch
        
        int opcion;
        
        
        rellenarMuebles(arrayMueble);
    }

}
