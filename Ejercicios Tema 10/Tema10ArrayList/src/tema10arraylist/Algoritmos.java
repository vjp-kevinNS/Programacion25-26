package tema10arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author KevinNS
 */
public class Algoritmos {

    // 1. Rellenar
    public static void insertar(ArrayList<Coche> coches) {
        coches.add(new Coche(pedirColor(), pedirPotencia()));
    }

    public static String pedirColor() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Color: ");
        return entrada.nextLine();
    }

    public static int pedirPotencia() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Potencia (CV): ");
        return entrada.nextInt();
    }

    public static boolean pedirSeguir() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("¿Quieres añadir otro coche? (s/n): ");
        char respuesta = entrada.nextLine().charAt(0);
        return respuesta == 's';
    }

    // 2. Mostrar
    public static void mostrar(ArrayList<Coche> coches) {
        coches.forEach(coche -> System.out.println(coche));
    }

    // 3. Mostrar con filtro
    public static void mostrarPorPotencia(ArrayList<Coche> coches, int potencia) {
        for (Coche coche : coches) {
            if (coche.getPotencia() >= potencia) {
                System.out.println(coche);
            }
        }
    }

    // 4. Buscar
    public static boolean buscar(ArrayList<Coche> coches, int potencia) {
        int i = 0;
        boolean enc = false;

        while (i < coches.size() && !enc) {
            if (coches.get(i).getPotencia() == potencia) {
                System.out.println("Coche encontrado");
                enc = true;
            } else {
                i++;
            }

        }
        return enc;
    }

    // 5. Recorrer listas con iterador:
    // Mostrar la lista con iterador
    public static void mostrarConIterador(ArrayList<Coche> coches) {
        Iterator<Coche> it = coches.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    // Recorrer la lista con iterador y eliminar ciertos elementos
    public static void mostrarYEliminar(ArrayList<Coche> coches) {
        Iterator<Coche> it = coches.iterator();
        Coche cAux;

        while (it.hasNext()) {
            cAux = it.next();

            if (cAux.getColor().equalsIgnoreCase("azul")) {
                it.remove();
            }

            System.out.println(cAux);

        }
    }

    public static void main(String[] args) {
        ArrayList<Coche> coches = new ArrayList<>();
        Coche cocheVerde = new Coche("verde", 90);

        do {
            System.out.println("Insertando nuevo coche...");
            insertar(coches);
            System.out.println("¡Coche añadido correctamente!");

        } while (pedirSeguir());
//        coches.add(cocheVerde);

        // Mostramos la lista con iterador
        System.out.println("\n- MOSTRANDO COCHES CON ITERADOR -");
        mostrarConIterador(coches);

        // Mostramos todos los coches y eliminamos los azules
        System.out.println("\nEliminando coches azules...");
        mostrarYEliminar(coches);

        // Mostramos la lista con for-each
        System.out.println("\n- MOSTRANDO COCHES -");
        mostrar(coches);

//        System.out.println("Mostrando coches con potencia igual o superior a...");
//        mostrarPorPotencia(coches, pedirPotencia());
//        
//        System.out.println("¿La lista contiene mi coche verde de 90CV? " + buscarCoche(coches, cocheVerde));
//        
    

////        System.out.println("¿La lista contiene un coche de 90CV? " + buscar(coches, 90));
//
//        System.out.println("\n\nLos coches verdes son distintos:");
//        System.out.println("HashCode de cocheVerde: " + cocheVerde.hashCode());
//        System.out.println("HashCode del coche verde del arrayList: " + coches.get(2).hashCode());
    }

}
