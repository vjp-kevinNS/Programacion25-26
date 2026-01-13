package ejercicio15t7menugestionventas;

import java.util.Scanner; // Importamos Scanner

/**
 * Ejercicio 15.- Realiza un programa que muestre un menú en el que se le
 * ofrezcan al usuario las siguientes opciones:
 *
 * 1. Rellenar un array unidimensional de 12 posiciones con las ventas de coches
 * mensuales. Estas ventas serán números aleatorios entre 10 y 100. 
 * 2. Mostrar las ventas introducidas en el punto anterior. 
 * 3. Mostrar las ventas introducidas al revés. 
 * 4. Que muestre la suma total de ventas del año. 
 * 5. Que muestre las ventas totales de los meses pares. 
 * 6. Que muestre el nombre del mes con más ventas. (Necesitarás otro array con el nombre de los meses) 
 * 7. Salir del programa.
 *
 * • Hasta que el usuario no pulse 7 no saldremos del programa y se volverá a
 * mostrar el menú.
 *
 * @author KevinNS
 */
public class Ejercicio15T7MenuGestionVentas {

    public static void main(String[] args) {

        // Creamos el array para las ventas de los 12 meses
        int[] arrayVentas = new int[12];

        // Creamos el array con el nombre de los meses
        String[] nombresMeses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

        /**
         * Creamos un menú para que el usuario elija una opción. Para ello
         * haremos un bucle do while con un sitch case. Antes de eso
         * inicializaremos Scanner para poder leer los datos introducidos y
         * crearemos una variable para usarla en el menu.
         */
        Scanner entrada = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("----------------------------------------------");
            System.out.println("---------------MENU DE VENTAS-----------------");
            System.out.println("----------1.Rellenar ventas (10-100)----------");
            System.out.println("----------2.Mostrar ventas          ----------");
            System.out.println("----------3.Mostrar ventas al revés ----------");
            System.out.println("----------4.Suma total del año      ----------");
            System.out.println("----------5.Ventas totales m/pares  ----------");
            System.out.println("----------6.Mes con más ventas      ----------");
            System.out.println("----------7.SALIR                   ----------");
            System.out.println("---------------ELIJA UNA OPCION---------------");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:

                    break;
                default:
                    throw new AssertionError();
            }

        } while (true);

    }

    /**
     * OPCION 1. Método que rellena con aleatorios las ventas (10-100)
     *
     * @param aleatorio
     */
    public static void rellenarAleatorios(int[] aleatorio) {
        for (int i = 0; i < aleatorio.length; i++) {
            aleatorio[i] = (int) (Math.random() * 91) + 10;

        }
    }

    /**
     * OPCION 2. Metodo que muestra las ventas introducidas
     *
     * @param ventas
     * @param meses
     */
    public static void mostrarVentas(int[] ventas, String[] meses) {
        for (int i = 0; i < meses.length; i++) {
            System.out.println(ventas[i] + " : " + meses[i]);

        }
    }

    /**
     * OPCION 3. Método que muestra las ventas al revés
     *
     * @param ventas
     * @param meses
     */
    public static void ventaAlReves(int[] ventas, String[] meses) {
        for (int i = 0; i < meses.length; i--) {
            System.out.println(meses[i] + " : " + ventas[i]);

        }
    }
    
    /**
     * OPCION 4. Método que suma todas las ventas anuales
     * @param ventas
     * @return 
     */
    public static int sumarVentasAnuales(int[] ventas) {
        int sumaAcumulada = 0; // Empezamos la cuenta en 0
        for (int i = 0; i < ventas.length; i++) { // Recorremos todas las posiciones (con length)
            // Vamos añadiendo el valor de cada mes a nuestra suma
            sumaAcumulada = sumaAcumulada + ventas[i];

        }
        return sumaAcumulada; // Devolvemos el total
    }
    
    /**
     * OPCION 5. Método que suma las ventas de los meses pares solamente
     * @param pares
     * @return 
     */
    public static int sumarMesesPares(int[] pares){
        int sumaPares = 0;
        
        // Empezamos en i = 1 (Febrero) y saltamos de 2 en 2 (i += 2)
        for (int i = 0; i < pares.length; i += 2) {
            sumaPares += pares[i]; // Solo sumamos los meses 1, 3, 5, 7,9 y 11
            
        }
        return sumaPares;
    }
    
    

}
