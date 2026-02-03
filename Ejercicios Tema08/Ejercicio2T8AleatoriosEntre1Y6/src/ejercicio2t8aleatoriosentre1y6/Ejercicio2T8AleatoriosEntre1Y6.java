package ejercicio2t8aleatoriosentre1y6;
import java.util.Scanner; //Importamos Scanner
/**
 * Escribir un programa en JAVA que contenga un método que rellena un array
 * unidimensional (vector) de enteros ALEATORIOS entre el 1 y el 6, y luego,
 * otro método, lo muestre por pantalla, utilizando el bucle for-each. 
 * 
 * • El programa también tendrá un método donde el usuario elegirá la longitud del
 * array entre 1 y 10. Este método también controla que el usuario nos
 * introduzca un número entero y no una letra (mediante excepciones). 
 * 
 * En caso de que el usuario introduzca el dato incorrecto se lo volveremos a pedir las
 * veces que hagan falta.
 *
 * @author KevinNS
 */
public class Ejercicio2T8AleatoriosEntre1Y6 {
    
    /**
     * Método que pide la longitud al usuario y controla que introduzca números 
     * entero del 1 al 10 y además no introduzca letras
     * @return 
     */
    public static int elegirLongitud(){
        Scanner entrada = new Scanner(System.in);
        int longitud = 0;
        boolean datoCorrecto= false;
        
        // Creamos un while con un try catch y a su vez un if else que se repite 
        // hasta que el dato sea válido
        while (!datoCorrecto) {            
            System.out.println("Introduce la longitud del array (1-10)");
            try {
                longitud = entrada.nextInt(); // Intentamos leer un entero
                
                // Verificamos si está en el rango solicitado
                if (longitud >= 1 && longitud <= 10) {
                    datoCorrecto = true; // Salimos del bucle
                }else{
                    System.out.println("Error. El número debe estar entre 1 y 10");
                }
            } catch (Exception e) {
                // Si el usuario introduce una letra saltaría aquí
                System.out.println("Error. Debes introducir número enteros, no letras");
                entrada.nextLine(); // Limpiamos el buffer
            }
        }
        return longitud;
    }
    
    /**
     * Método que rellena el array con números aleatorios entre 1 y 6
     * @param aleat 
     */
    public static void rellenarAleatorios(int[]aleat){
        for (int i = 0; i < aleat.length; i++) {
            aleat[i] = (int)(Math.random() * 6) + 1;
        }
        System.out.println("Array rellenado con éxito");
    }
    
    /**
     * Método que muestra el array con un for-each
     * @param mostrar 
     */
    public static void mostrarArray(int[]mostrar){
        System.out.println("Contenido del array: ");
        for (int i : mostrar) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        // LLamamos al métod opara elegir la longitud y guardamos el resultado
        int longitud = elegirLongitud();
        
        // Creamos el array con el tamaño que el usuario eligió
        int[]miArray = new int[longitud];
        
        // LLamamos al método para rellenar con aleatorios entre 1 y 6 el array
        rellenarAleatorios(miArray);
        
        // Por último llamamos al metodo mostrar array
        mostrarArray(miArray);
    }

}
