package ejercicio7t8temperaturasmes;
import java.util.Scanner; // Importamos Scanner
/**
 * Diseña programa que almacene las temperaturas medias de un mes. Para ello
 * crearemos un array unidimensional de 30 posiciones relleno con objetos de la
 * clase Día. 
 * 
 * Hasta que el usuario pulse 5, mostrar un menú que nos permita:
 * 
 * 1. Rellenar de forma aleatoria las temperaturas. Además el día 1 del mes no
 * tiene porqué ser un Lunes, será un día aleatorio de la semana. 
 * 
 * 2. Mostrar las temperaturas. Ejemplo: Jueves día 1: 40 grados, Viernes día 2: 35 grados,
 * Sábado día 3: 38 grados… 
 * 
 * 3. Visualizar la temperatura media del mes. 
 * 
 * 4. Día o días más calurosos del mes. Ejemplo: El día o días más calurososfueron: •
 * ElJueves día 1 con 40 grados. • El Sábado día 18 con 40 grados.
 * 
 * 5. Salir del programa. 
 * 
 * • Fíjate que necesitarás otro array con el nombre de los días de la semana.
 *
 * @author KevinNS
 */
public class Ejercicio7T8TemperaturasMes {

    public static void main(String[] args) {
        
        // Creamos el array de 30 posiciones de la clase Dia y un array con el 
        // nombre de los días de la semana
        Dia[]mes = new Dia[30];
        String[] nombreDias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes",
                               "Sábado", "Domingo"};

    }
    
    /**
     * Método que rellena con números aleatorios entre 10 y 40 (la temperatura)
     * un array de 30 posiciones usando los dias de la semana aleatoriamente 
     * también
     * @param lista
     * @param semana 
     */
    public static void rellenarAleatorios(Dia[]aleatorio, String[]semana){
        // Elegimos un día de la semana aleatorio para empezar (0 a 6)
        int empezar = (int) (Math.random() * 7);
               
        for (int i = 0; i < aleatorio.length; i++) {
            int temp = (int)(Math.random() * 31) + 10; // Temperatura aleatorio entre 10 y 40 grados
            String nombre = semana[(empezar + 1) % 7]; // vamos rotando el día con %
            
            // Metemos el objeto en el array
            aleatorio[i] = new Dia(nombre, temp);
        }
        System.out.println("Has rellenado el mes con éxito");
    }
    
    /**
     * Método que muestra los grados que hace cada día. Además controla la que
     * no nos salte la excepción
     * @param mostrar 
     */
    public static void mostrarTemperaturas(Dia[]mostrar){       
        for (int i = 0; i < mostrar.length; i++) {
            System.out.println(mostrar[i].getNombreDia() + ( "día" ) + (i + 1) 
                    + (": " + mostrar[i].getTemperatura() + " grados"));
            
        }
    }
    
    /**
     * Método que calcula la media de temperatura del mes
     * @param media 
     */
    public static void calcularMedia(Dia[]media){
        double suma = 0;
        for (int i = 0; i < media.length; i++) {
            suma += media[i].getTemperatura();
        }
        System.out.println("La temperatura media del mes es: " + (suma / media.length) + " grados");
    }
    
    public static void mostrarTempMasAlta(Dia[]alta){
        // Primero buscamos cuál es la temperatura más alta
        int max = 0;
        for (int i = 0; i < alta.length; i++) {
            if (alta[i].getTemperatura() > max) {
                max = alta[i].getTemperatura();
            }
        }
        
        // Luego buscamos los días que tengan esa temperatura
        System.out.println("El día o días mas calurosos fueron: ");
        for (int i = 0; i < alta.length; i++) {
            if (alta[i].) {
                
            }
        }
    }

}
