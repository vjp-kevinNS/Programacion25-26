package ejercicio18t7menoramayor10enteros;

/**
 * Diseña un método que tome como parámetros de entrada dos arrays de 5 enteros
 * y devuelva como salida un único array de 10 enteros con los elementos de los
 * anteriores arrays ordenados de menor a mayor.
 *
 * @author KevinNS
 */
public class Ejercicio18T7MenorAMayor10Enteros {

    public static void main(String[] args) {
        
        // Creamos dos arrays con 5 numeros enteros cada uno
        int[]primero = {3, 7, 0, 2, 5};
        int[]segundo = {8, 4, 1, 6, 9,};
        
        // LLamamos al método pero tenemos que poner otro int[]xxx que sea el 
        // resultado final por que si no no podremos llamar al método correctamente
        System.out.println("Combinando y ordenando los arrays...");
        
        int[]resultadoFinal = juntarYOrdenar(primero, segundo);
        
        // Mostramos el resultadoFinal usando un bucle for
        System.out.println("Resultado de los números ordenados: ");
        for (int i = 0; i < resultadoFinal.length; i++) {
            System.out.print(resultadoFinal[i] + " ");
        }
        System.out.println();
    }
    
    /**
     * Método que junta dos arrays de 5 y devuelve un array de 10
     * @param primer
     * @param segun
     * @return 
     */
    public static int[] juntarYOrdenar(int[]primer, int[]segun){
        // Creamos un array de salida con tamaño 10
        int[]resultado = new int[10];
        
        // Copiamos los datos del primer y segundo array
        for (int i = 0; i < 5; i++) {
            resultado[i] = primer[i]; 
            resultado[i + 5] = segun[i]; // 1 + 5 para empezar por la posición 5
        }
        
        // Segundo ordenamos usando el método de la burbuja
        int aux; // Variable aux para no perder el dato al intercambiar
        
        for (int i = 0; i < 9; i++) { // Recorre hasta el penúltimo
            for (int j = 0; j < 9 - i; j++) {
                if (resultado[j] > resultado[j + 1]) {
                    // Intercambio de valores usando la variable aux
                    aux = resultado[j];
                    resultado[j] = resultado[j + 1];
                    resultado[j + 1] = aux;
                }
                
            }
            
        }
        // Devolvemos el array ya listo
        return resultado;
    }

}
