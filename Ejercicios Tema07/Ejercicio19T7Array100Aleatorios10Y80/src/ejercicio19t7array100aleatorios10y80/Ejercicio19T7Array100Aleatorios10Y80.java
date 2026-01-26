package ejercicio19t7array100aleatorios10y80;

/**
 * Realiza un programa que cree un vector de 100 posiciones con números
 * aleatorios entre 10 y 80. Una vez creado este vector, el programa deberá
 * mostrar el mayor, el menor, el valor que más se repite y la media.
 *
 * @author KevinNS
 */
public class Ejercicio19T7Array100Aleatorios10Y80 {
    
    // Para este usaré constantes
    private final static int TAMAÑO = 100;
    private final static int MIN = 10;
    private final static int MAX = 80;

    public static void main(String[] args) {
        // Creamos el array de 100 posiciones
        int[]numeros = new int[TAMAÑO];
        
        // LLamamos a los métodos
        rellenarAleatorios(numeros);
        analizarDatos(numeros);

    }
    
    /**
     * Método que rellena el array con números elatorios entre 10 y 80
     * @param aleatorio 
     */
    public static void rellenarAleatorios(int[]aleatorio){
        for (int i = 0; i < TAMAÑO; i++) {
            aleatorio[i] = (int)(Math.random() * (MAX - MIN + 1) + MIN);
            
        }
        System.out.println("Array de " + TAMAÑO + " número generado");
    }
    
    public static void analizarDatos(int[]analizar){
        // Creamos las variables que usaremos
        int mayor = analizar[0];
        int menor = analizar[0];
        double suma = 0;
        
        // Creamos un array auxiliar para contar repèticiones
        int[]auxiliar = new int [MAX + 1];
        
        for (int i = 0; i < TAMAÑO; i++) {
            if(analizar[i] > mayor) mayor = analizar[i]; {
            
        }
            if (analizar[i] < menor) menor = analizar[i];{
            
        }
            suma += analizar[i];
            auxiliar[analizar[i]]++; // Cada vez qwue sale un número sumamos 1
    
        }
        
        // Calculamos cuál se repite más
        int masRepe = MIN;
        int veces = 0;
        for (int i = MIN; i <= MAX; i++) {
            if (auxiliar[i] > veces) {
                veces = auxiliar[i];
                masRepe = i;   
            }  
        }
        
        System.out.println("--- Informe del Array ---");
        System.out.println("Número Mayor: " + mayor);
        System.out.println("Número Menor: " + menor);
        System.out.println("Media: " + (suma / TAMAÑO));
        System.out.println("Valor más repetido: " + masRepe + " (" + veces + " veces)");
    }

}
