package tema08arraysdeobjetos;

import java.util.Arrays; // Importamos la clase arrays

/**
 *
 * @author KevinNS
 */
public class UsoClaseArrays {

    public static void main(String[] args) {

        // 1. Importamos la clase array (arriba) y tambien creamos el array
        int[] numeros = new int[10];
        int[] vector = new int[10];

        // 2. MÉTODOS DE LA CLASE ARRAYS
        // 2.1. fill(vector, indiceInicioIncluido, indiceFinExcluido)
        // Rellena todo el array de refencias al mismo objeto. Más útil para
        // tipos de datos
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);

        }
        System.out.println();
        Arrays.fill(numeros, -1);

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);

        }
        System.out.println();
        Arrays.fill(numeros, 0, 6, 3);

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
            
        }    
        System.out.println();
        
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random() * 10);
        }
        
            // 2.2. equals(vector1, vector2): nos dice si dos arrays son iguales
            // (mismo tamaño y mismos valores en cada posición)
            
        System.out.println(Arrays.equals(numeros, vector));
              
            // 2.3. toString(vector): muestra por pantalla los datos que contiene
            // el vector (igual que el método toString)
            
        System.out.println(Arrays.toString(numeros));
                                
            //2.4. sort(vector): ordena el array de mayor a menor
            // OJO!! Hay que implementar la interfaz Comparable en la clase con
            // la que creamos los objetos
            
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));
                        
            // 2.5. binarySearch(vector, dato): busca el dato en el array que debe
            // estar ordenado
        
        System.out.println(Arrays.binarySearch(numeros, 11));
            
        if(Arrays.binarySearch(numeros, 11) < 0)    
            System.out.println("El número 11 no está en el array");
    }
}
