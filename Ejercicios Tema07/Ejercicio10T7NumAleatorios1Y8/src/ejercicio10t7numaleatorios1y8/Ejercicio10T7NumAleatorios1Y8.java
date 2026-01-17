package ejercicio10t7numaleatorios1y8;

/**
 * Escribe un programa que contenga un método que rellene un vector de 10
 * números enteros con números aleatorios entre 1 y 8, pudiendo contener
 * elementos duplicados. 
 * 
 * • Otro método visualizará el array creado. Luego, otro método debe sustituir 
 * cada valor repetido por 0. Para terminar, vuelve a visualizar el array ya modificado. 
 * 
 * • Ejemplo de ejecución: 
 * Se han generado los siguientes números: 8 1 5 7 2 1 5 4 3 6 
 * Sustituimos los elementos repetidos por un 0: 8 0 0 7 2 0 0 4 3 6
 *
 * @author KevinNS
 */
public class Ejercicio10T7NumAleatorios1Y8 {
    
    // Declaramos una constante que sea el tamaño del array para usarlo
    public final static int TAMAÑO = 10;

    public static void main(String[] args) {
        
        // Creamos el array
        int[]numeros = new int[TAMAÑO];
        
        // LLamamos a los métodos
        rellenarAleatorios(numeros);
        System.out.println("Se han rellenado los siguientes números: ");
        mostrarArray(numeros);
        
        System.out.println("");
        
        sustituirRepetidos(numeros);
        System.out.println("Sustituimos los números repetidos por un 0: ");
        mostrarArray(numeros);
        
        System.out.println("");
    }
    
    /**
     * Método que rellena el array con aleatoriso entre 8 y 1
     * @param aleatorio 
     */
    public static void rellenarAleatorios(int[]aleatorio){
        for (int i = 0; i < TAMAÑO; i++) {
            aleatorio[i] = (int)(Math.random() * 8) +1;
            
        }
    }
    
    /**
     * Método que muestra el contenido del array
     * @param mostrar 
     */
    public static void mostrarArray(int[]mostrar){
        for (int i = 0; i < TAMAÑO; i++) {
            System.out.print(mostrar[i] + " "); // Usamos el indice para referenciar al dato     
        }
    }
    
    /**
     * Método que sustituye los números repetidos en el array
     * @param repe 
     */
    public static void sustituirRepetidos(int[]repe){
        // Usamos un bucle anidado para comparar cada número con los siguientes
        for (int i = 0; i < TAMAÑO; i++) {
            if (repe[i] == 0) continue; { // Si ya es 0 no hace falta comparar
            
            for (int j = i + 1; j < TAMAÑO; j++) {
                // Si encontramos el mismo valor mas adelante lo ponemos a 0
                if (repe[i] == repe[j]) {
                    repe[j] = 0;
                    
                }    
            }
                
            } 
        }
    }

}
