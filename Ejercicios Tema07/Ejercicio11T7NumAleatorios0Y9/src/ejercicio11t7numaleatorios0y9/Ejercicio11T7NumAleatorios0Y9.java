package ejercicio11t7numaleatorios0y9;

/**
 * Escribe un programa que contenga un método que rellene un vector de 10
 * números enteros con números aleatorios entre 0 y 9, sin repetir. 
 * 
 * • Otro método visualizará el array creado. 
 * 
 * • Ejemplo de ejecución: Se ha generado el siguiente array:
 *   8 1 5 7 2 0 9 4 3 6
 *
 * @author KevinNS
 */
public class Ejercicio11T7NumAleatorios0Y9 {

    public static void main(String[] args) {
        
        // Creamos el array
        int [] numeros = new int[9];
        
        // LLamamos a los métodos
        rellenarAletorios(numeros);
        System.out.println("Se ha rellenado el siguiente array sin repetir números");
        mostrarArray(numeros);

    }
    
    /**
     * Método que rellena el array con número aleatorios entre 0 y 9
     * @param aleatorios 
     */
    public static void rellenarAletorios(int[]aleatorios){
        int rellenados = 0;
        
        // Creamos un bucle while para que se repita mientras no haya rellenado
        // todos los huecos del array
        while (rellenados < aleatorios.length) {            
            // Generamos un número aletorio entre 0 y 9
            int numero = (int)(Math.random() * 10);
            boolean repetido = false;
            
            // Comprobamos si el número ya está en las posiciones rellenadas
            for (int i = 0; i < aleatorios.length; i++) {
                if (aleatorios[i] == numero) {
                    repetido = true;
                    break; // Si lo hemos encontrado dejamos de buscar
                }
            }
            // Si el número no estaba repetido seguimos
            if (repetido == false) {
                aleatorios[rellenados] = numero;
                rellenados++;
            }
        }
        
    }
    
    public static void mostrarArray(int[]mostrar){
        for (int i = 0; i < mostrar.length; i++) {
            System.out.print(mostrar[i] + " ");
            
        }
        System.out.println();
    }

}
