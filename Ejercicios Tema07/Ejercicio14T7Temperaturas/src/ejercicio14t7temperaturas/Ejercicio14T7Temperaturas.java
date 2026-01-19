package ejercicio14t7temperaturas;
import java.util.Scanner; // Importamos Scanner
/**
 * Diseña programa que almacene las temperaturas medias de un mes que introduzca
 * un usuario. Para hacerlo más sencillo vamos a suponer que el mes tiene 28
 * días y está formado por 4 semanas de 7 días. 
 * 
 * Hasta que el usuario pulse 5, mostrar un menú que nos permita: 
 * 1. Rellenar las temperaturas. 
 * 2. Mostrar las temperaturas. 
 * 3. Visualizar la temperatura media del mes. 
 * 4. Día o días más calurosos del mes.
 *      Ejemplo: El día o días más calurosos fueron: 
 *      • ElJueves de la Semana 3 con 40 grados. 
 *      • El Sábado de la Semana 4 con 40 grados. 
 * 5. Salir del programa. 
 * 
 * • Fíjate que necesitarás otro array con el nombre de los días de la semana.
 *
 * @author KevinNS
 */
public class Ejercicio14T7Temperaturas {
    
    public final static int SEMANAS = 4;
    public final static int DIAS = 7;

    public static void main(String[] args) {
        
        // Creamos e inicializamos la matriz
        double[][]temperaturas = new double [SEMANAS][DIAS];
        String[] nombreDias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes",
                               "Sábado", "Domingo"};
        
        // Creamos el menú con un do while y un switch y llamamos a los métodos
        Scanner entrada = new Scanner(System.in);
        int opcion;
        do {            
            // Mostramos el menú al usuario
            System.out.println("----------------------------------------------");
            System.out.println("------------GESTION DE TEMPERATURAS-----------");
            System.out.println("----------1.Rellenar Temperaturas-------------");
            System.out.println("----------2.Mostrar Temperaturas--------------");
            System.out.println("----------3.Temperatura media del mes---------");
            System.out.println("----------4.Días más calurosos----------------");
            System.out.println("------------------5.SALIR---------------------");
            System.out.println("---------------ELIJA UNA OPCION---------------");
            System.out.println("----------------------------------------------");
            opcion = entrada.nextInt();
            
            // Ejecutamos la opción elegida
            switch (opcion) {
                case 1:
                    rellenarTemperaturas(temperaturas, nombreDias);
                    break;
                case 2:
                    mostrarTemperaturas(temperaturas, nombreDias);
                    break;
                case 3:
                    System.out.println("La media mensual es: " + calcularMedia(temperaturas));
                    break;
                case 4:
                    diasMasCalurosos(temperaturas, nombreDias);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no valida");
            }
        } while (opcion != 5); // El bucle sigue hasta que se pulse 5
                               
    }
    
    /**
     * OPCION 1. Método que rellena la matriz con datos que introduzca el usuario
     * @param rellenar
     * @param dias 
     */
    public static void rellenarTemperaturas(double[][]rellenar, String[] dias){
        Scanner entrada = new Scanner(System.in);       
        for (int i = 0; i < SEMANAS; i++) {
            System.out.println("Semana " + (i + 1) + ":");
            for (int j = 0; j < DIAS; j++) {
                System.out.println("Temperaturas del " + dias[j] + ": ");
                rellenar[i][j] = entrada.nextDouble(); // Leemos el dato
            }
        }
    }
    
    /**
     * OPCION 2. Método que muestra los datos almacenados
     * @param mostrar
     * @param dias 
     */
    public static void mostrarTemperaturas(double[][]mostrar, String[]dias){
        for (int i = 0; i < SEMANAS; i++) {
            System.out.println("Semana " + (i + 1) + "-> ");
            for (int j = 0; j < DIAS; j++) {
                System.out.println(dias[j] + ": " + mostrar[i][j] + "º | ");
            }
            System.out.println();
        }
    }
    
    /**
     * OPCION 3. Método que calcula la temperatura media 
     * @param media
     * @return 
     */
    public static double calcularMedia(double[][]media){
        double suma = 0;
        for (int i = 0; i < SEMANAS; i++) {
            for (int j = 0; j < DIAS; j++) {
                suma += media[i][j];
            } 
        }
        return suma / (SEMANAS * DIAS); // Dividimos entre el total de celdas
    }
    
    /**
     * OPCION 4. Método que muestra el día o días mas calurosos
     * @param caluroso
     * @param dia 
     */
    public static void diasMasCalurosos(double[][]caluroso, String[]dia){
        double maximo = caluroso[0][0];        
        // Primero buscamos cuál es la temperatura más alta
        for (int i = 0; i < SEMANAS; i++) {
            for (int j = 0; j < DIAS; j++) {
                if (caluroso[i][j] > maximo) {
                    maximo = caluroso[i][j];
                }
            }
        }        
        // Luego mostramos todos los dias que tengan esa temperatura máxima
        System.out.println("El día o días más calurosos fueron: ");
        for (int i = 0; i < SEMANAS; i++) {
            for (int j = 0; j < DIAS; j++) {
                if (caluroso[i][j] == maximo) {
                    System.out.println("El " + dia[j] + " de la semana " + (i + 1) 
                            + " con " + maximo + " grados");
                }
            }
        }
    }

}
