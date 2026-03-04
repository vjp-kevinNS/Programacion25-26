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
 * 1. Introducir las ventas de coches de cada uno de los meses del año . 2.
 * Mostrar las ventas introducidas en el punto anterior. 3. Que muestre la suma
 * total de ventas de coches del año. 4. Que muestre las ventas totales de los
 * meses que empiezan por la letra A. (Utiliza el método correspondiente de la
 * clase String) 5. Que muestre el nombre del mes con más ventas. 6. Salir del
 * programa.
 *
 * • Controlaremos que el usuario elija una opción del menú entre 1 y 6. • Hasta
 * que el usuario no pulse 6 no saldremos del programa.
 *
 * @author KevinNS
 */
public class Ejercicio13T10VentaCoches2 {

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
        
        ArrayList<Integer>ventas = new ArrayList<>();
        
        // LLamamos al método del menú y creamos el bucle para realizarlo
        int opcion = 0;

        do {
            mostrarMenu();
            opcion = entrada.nextInt();

            if (opcion < 1 || opcion > 6) {
                System.out.println("Error. Elija una opción entre 1 y 6");

                try {
                    switch (opcion) {
                        case 1:

                            break;
                        case 2:

                            break;
                        case 3:

                            break;
                        case 4:

                            break;
                        case 5:

                            break;
                        case 6:
                            System.out.println("Saliendo del programa....");
                            break;
                        default:
                            System.out.println("Opción incorrecta");
                    }

                } catch (InputMismatchException e) {
                }
            }

        } while (opcion != 6);

    }

}
