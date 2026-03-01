package ejercicio6t10ventas;

import java.util.ArrayList; // Importamos ArrayList
import java.util.Scanner; // Importamos Scanner

/**
 * Realiza un programa en el que utilices una lista de enteros y que muestre un
 * menú en el que se le ofrezcan al usuario las siguientes opciones:
 *
 * 1. Introducir las ventas de coches de cada uno de los 12 meses del año. 2.
 * Mostrar las ventas introducidas en el punto anterior. 3. Mostrar las ventas
 * introducidas al revés. 4. Que muestre la suma total de ventas del año. 5. Que
 * muestre las ventas totales de los meses cuyo nombre contenga la letra a. 6.
 * Que muestre el nombre del mes (o meses) con más ventas. 7. Salir del
 * programa.
 *
 * • Necesitarás, un array unidimensional (o una lista) con el nombre de los
 * meses del año.
 *
 * • Controlaremos que el usuario elija una opción del menú entre 1 y 7. Hasta
 * que el usuario no pulse 7 no saldremos del programa.
 *
 * @author KevinNS
 */
public class Ejercicio6T10Ventas {
    
    /**
     * Método que muestra el menú al usuario
     */
    public static void mostrarMenu() {
        System.out.println("--------------------------------------------------");
        System.out.println("-----------#GESTION DE VENTAS ANUALES#------------");
        System.out.println("--------1.Ventas de coches por cada mes-----------");
        System.out.println("--------2.Mostrar las ventas introducidas---------");
        System.out.println("--------3.Mostrar ventas pero al revé3s-----------");
        System.out.println("--------4.Suma total de ventas del año------------");
        System.out.println("--------5.Ventas totales meses con letra 'a'------");
        System.out.println("--------6.Mostrar nombre de mes con mas ventas----");
        System.out.println("---------------7.SALIR DEL PROGRAMA---------------");
        System.out.println("--------------------------------------------------");
    }
    
    /**
     * Método que pide al usuario que rellene la lista de ventas de los 12 meses
     * @param lista
     * @param nombreMeses 
     */
    public static void rellenarVentas(ArrayList<Integer> lista, String[]nombreMeses){
        Scanner entrada = new Scanner(System.in);
        
        // Creamos una variable i y pedimos al usuario que introduzca los datos
        int i = 0;
        System.out.println("Introduzca las ventas para cada mes: ");
        
        // Usamos un while para recorrer los 12 meses del array de nombres
        while (i < nombreMeses.length) {
            System.out.println(nombreMeses[i] + ": ");
            int venta = entrada.nextInt();
            lista.add(venta); // Guardamos la venta en la lista
            i++; // Incrementamos el contador            
        }
    }
    
    /**
     * Método que muestra las ventas introducidas previamente
     * @param lista
     * @param nombreMeses 
     */
    public static void mostrarVentas(ArrayList<Integer>lista, String[]nombreMeses){
        // Usamos isEmpty() para comprobar si la lista está vacía antes de intentar leerla
        if (lista.isEmpty()) {
            System.out.println("Error: Primero debes introducir las ventas (opción 1)");
            return;
        }
        int i = 0;
        while (i < lista.size()) {
            // Mostramos el mes del Array y la venta del ArrayList que comparten posición
            System.out.println(nombreMeses[i] + " -> " + lista.get(i) + " ventas");
            i++;
        }
    }
    
    /**
     * Método que muestra las ventas pero al revés
     * @param lista
     * @param nombreMeses 
     */
    public static void mostrarAlReves(ArrayList<Integer>lista, String[]nombreMeses){
        // Igual que en el anterior comprobamos si la lista está vacía
        if (lista.isEmpty()) {
            return;
        }
        
        // Empezamos en la posición 11 (Diciembre) y bajamos hasta la 0 (Enero)
        int i = lista.size() - 1;
        System.out.println("Orden inverso: ");
        while (i >= 0) {
            System.out.println(nombreMeses[i] + ": " + lista.get(i));
            i--;
        }
    }
    
    /**
     * Método que suma todas las ventas anuales
     * @param lista 
     */
    public static void sumarVentasAnuales(ArrayList<Integer>lista){
        // Creamos una variable para ir sumando todos los .get(i)
        int total = 0;
        int i = 0;
        while (i < lista.size()) {
            total += lista.get(i); // Sumamos el valor actual a lo que ya teníamos
            i++;            
        }
        System.out.println("Ventas totales del año: " + total);
    }
    
    /**
     * Método que muestra las ventas de los meses que contengan una 'a'
     * @param lista
     * @param nombreMeses 
     */
    public static void ventaMesesConA(ArrayList<Integer>lista, String[]nombreMeses){
        // Igual que antes comprobamos si la lista está vacía
        if (lista.isEmpty()) {
            return;
        }
        int i = 0;
        System.out.println("Meses con la letra 'a': ");
        // Pasamos a minúsculas para que detecte A y a
        if (nombreMeses[i].toLowerCase().contains("a")) {
            System.out.println("- " + nombreMeses[i] + ": " + lista.get(i) );
        }
        i++;
    }
    
    /**
     * Método que muestra el mes con más ventas
     * @param lista
     * @param nombreMeses 
     */
    public static void mesConMasVentas(ArrayList<Integer>lista, String[]nombreMeses){
        // Igual que antes comprobamos si la lista está vacía
        if (lista.isEmpty()) {
            return;
        }
        // Primero encontramos el número máximo
        int max = lista.get(0); // Suponemos que el primero es el mayor
        int i = 1;
        while (i < lista.size()) {
            if (lista.get(i) > max) {
                max = lista.get(i); // Si encontramos uno mayor, actualizamos
            }
            i++;
        }
        
        // Despues buscamos quiénes empatan con ese máximo
        System.out.println("Mes/es con máximo de ventas (" + max + "): ");
        int j = 0;
        while (j < lista.size()) {
            if (lista.get(i) == max) {
                System.out.println(nombreMeses[j] + " ");
            }
            j++;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Creamos un array fijo para los meses (ya que no cambian)
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

        // Creamos un ArrayList para las ventas (lista de enteros)
        ArrayList<Integer> ventas = new ArrayList<>();

        // Creamos el bucle para el menú y llamamos al método que contiene el menú
        int opcion;
        do {
            mostrarMenu();
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    rellenarVentas(ventas, meses);
                    break;
                case 2:
                    mostrarVentas(ventas, meses);
                    break;
                case 3:
                    mostrarAlReves(ventas, meses);
                    break;
                case 4:
                    sumarVentasAnuales(ventas);
                    break;
                case 5:
                    ventaMesesConA(ventas, meses);
                    break;
                case 6:
                    mesConMasVentas(ventas, meses);
                    break;
                case 7:
                    System.out.println("Saliendo del programa....");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        } while (opcion != 7);

    }
}
