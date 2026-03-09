package ejercicio13t10ventacoches2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Realiza un programa en el almacenes una lista de objetos de la clase VENTA
 * cuyos atributos son 2: • Nombre de Mes. • Ventas de coches del mes.
 *
 * • Se mostrará un menú en el que se le ofrezcan al usuario las siguientes
 * opciones:
 *
 * 1. Introducir las ventas de coches de cada uno de los meses del año . 
 * 2. Mostrar las ventas introducidas en el punto anterior. 
 * 3. Que muestre la suma total de ventas de coches del año. 
 * 4. Que muestre las ventas totales de los meses que empiezan por la letra A.
 * (Utiliza el método correspondiente de la clase String) 
 * 5. Que muestre el nombre del mes con más ventas.
 * 6. Salir del programa.
 *
 * • Controlaremos que el usuario elija una opción del menú entre 1 y 6. 
 * • Hasta que el usuario no pulse 6 no saldremos del programa.
 *
 * @author KevinNS
 */
public class Ejercicio13T10VentaCoches2 {

    /**
     * Método que introduce las ventas
     *
     * @param lista
     * @param nombres
     */
    public static void introducirVentas(ArrayList<Venta> lista, String[] nombres) {
        Scanner entrada = new Scanner(System.in);

        lista.clear(); // Limpiamos para no duplicar datos si se rellena otra vez
        System.out.println("Introduzca las ventas:");

        // Recorremos el array 
        for (int i = 0; i < nombres.length; i++) {
            
            // Pedimos el número de ventas
            System.out.print(nombres[i] + ": ");
            int cantidad = entrada.nextInt(); 

            // Creamos el objeto venta y lo metemos en la lista
            lista.add(new Venta(nombres[i], cantidad));
        }
    }

    /**
     * Método que muestra las ventas
     *
     * @param lista
     */
    public static void mostrarVentas(ArrayList<Venta> lista) {
        if (lista.isEmpty()) { // Para comprobar si la lista está vacía
            return;
        }
        // Recorremos con size
        for (int i = 0; i < lista.size(); i++) {

            // Sacamos el objeto con get(i) y luego usamos sus getters
            System.out.println(lista.get(i).getNombreMes() + ": " + lista.get(i).getVentasCochesMes());
        }
    }

    /**
     * Método que calcula la suma total de las ventas
     *
     * @param lista
     */
    public static void calcularSumaTotal(ArrayList<Venta> lista) {
        // Creamos la variable para acumular
        int total = 0;

        // Recorremos con size
        for (int i = 0; i < lista.size(); i++) {
            total += lista.get(i).getVentasCochesMes(); // Sumamos las ventas del objeto i al total
        }
        System.out.println("Total ventas anuales: " + total + " coches.");
    }

    /**
     * Método que muestra las ventas quew empieazan por A
     *
     * @param lista
     */
    public static void mostrarVentasEmpiezanA(ArrayList<Venta> lista) {
        int sumaA = 0;
        System.out.println("Ventas de meses que empiezan por 'A':");

        // Recorremos con size
        for (int i = 0; i < lista.size(); i++) {

            String mes = lista.get(i).getNombreMes();

            // Usamos toUpperCase para que de igual si usas mayúsculas o minúsculas
            // y startsWith para indicar la letra pore la que queremos que empiece
            if (mes.toUpperCase().startsWith("A")) {
                System.out.println("- " + mes + ": " + lista.get(i).getVentasCochesMes());
                sumaA += lista.get(i).getVentasCochesMes();
            }
        }
        System.out.println("Suma total de estos meses: " + sumaA);
    }

    /**
     * Método que busca el mes con el máximo de ventas
     *
     * @param lista
     */
    public static void buscarMesMaximo(ArrayList<Venta> lista) {
        if (lista.isEmpty()) { // Comprobamos si la lista está vacía
            return;
        }

        
        int max = lista.get(0).getVentasCochesMes(); // Suponemos que el primero es el máximo
        
        // Buscamos un número mas alto recorriendo la lista
        for (int i = 1; i < lista.size(); i++) {
            if (lista.get(i).getVentasCochesMes() > max) {
                max = lista.get(i).getVentasCochesMes(); // Actualizamos el valor
            }
        }

        // Buscamos quiénes tienen ese máximo
        System.out.print("Mes/es con récord de ventas (" + max + "): ");
        int j = 0; // Iniciamos el índice de busqueda en 0
        
        while (j < lista.size()) { // Mientras no lleguemos al final de la lista
            if (lista.get(j).getVentasCochesMes() == max) {
                System.out.print(lista.get(j).getNombreMes() + " "); // Imprimimos su nombre
            }
            j++; // Aanzamos manualmente hasta a la siguiente posición
        }
        System.out.println();
    }

    public static void mostrarMenu() {
        System.out.println("----------------GESTION DE VENTAS-----------------");
        System.out.println("----------------1.Introducir ventas---------------");
        System.out.println("----------------2.Mostrar ventas------------------");
        System.out.println("----------------3.Total de ventas-----------------");
        System.out.println("----------------4.Meses con 'a'-------------------");
        System.out.println("----------------5.Mes con mas ventas--------------");
        System.out.println("----------------6.SALIR DEL PROGRAMA--------------");
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Creamos la lista que almacenará objetos de tipo VENTA
        ArrayList<Venta> listaVentas = new ArrayList<>();

        // Array auxiliar con los nombres de los meses para facilitar la entrada
        String[] mesesAnio = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

        // LLamamos al método del menú y creamos el bucle para realizarlo
        int opcion = 0;

        do {
            try {
                mostrarMenu();
                opcion = entrada.nextInt();
                switch (opcion) {
                    case 1:
                        introducirVentas(listaVentas, mesesAnio);
                        break;
                    case 2:
                        mostrarVentas(listaVentas);
                        break;
                    case 3:
                        calcularSumaTotal(listaVentas);
                        break;
                    case 4:
                        mostrarVentasEmpiezanA(listaVentas);
                        break;
                    case 5:
                        buscarMesMaximo(listaVentas);
                        break;
                    case 6:
                        System.out.println("Saliendo del programa....");
                        break;
                    default:
                        System.out.println("Opción incorrecta");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error. Has introducido una letra");
                entrada.nextLine();
            }

        } while (opcion != 6);

    }

}
