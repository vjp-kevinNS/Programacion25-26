package ejerciciorepasomatrices;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Crear una clase que se llame compartimentos Crear una matriz de
 * compartimentos que sea de 3x3
 *
 * Crear un menu con la siguientes opciones:
 *
 * 1-Mostrar todos los compartimentos (comprobando los nulos) 2-Colocar un
 * compartimento en la posición indicada por el usuario (controlando
 * excepciones) 3-Eliminar un compartimento de la posición indicada(controlando
 * excepciones) 4-Mostrar compartimento con mas valor 5-Mostrar compartimento
 * con menos valor 6-Salir del programa
 *
 * @author KevinNS
 */
public class EjercicioRepasoMatrices {

    /**
     * Método que muestra las opciones del menú al usuario
     */
    public static void mostrarMenu() {
        System.out.println("--------------------------------------------------");
        System.out.println("----------------#OPCIONES DEL MENÚ#---------------");
        System.out.println("-------------1.Mostrar compartimentos-------------");
        System.out.println("--------------2.Colocar compartimento-------------");
        System.out.println("-------------3.Eliminar compartimento-------------");
        System.out.println("-----4.Mostrar compartimrntos con mas valor-------");
        System.out.println("----5.Mostrar compartimentos con menos valor-----");
        System.out.println("--------------6.SALIR DEL PROGRAMA----------------");
        System.out.println("--------------------------------------------------");
    }

    /**
     * Método que muestra los compartimentos
     *
     * @param compartimento
     */
    public static void mostrarCompartimentos(Compartimentos[][] compartimento) {

        // Recorremos la matriz
        for (int i = 0; i < compartimento.length; i++) {
            for (int j = 0; j < compartimento[i].length; j++) {
                // Controlamos que no esté vacía y mostramos
                if (compartimento[i][j] != null) {
                    System.out.println("Compartimento en la posicion " + i + " " + j
                            + compartimento[i][j]);
                }

            }

        }

    }

    /**
     * Método que pide al usuario la posición del objeto y todos sus datos.
     * Luego nos muestras la información de la posición y el objeto.
     *
     * @param compartimentos
     */
    public static void colocarCompartimentos(Compartimentos[][] compartimentos) {

        try {
            Scanner entrada = new Scanner(System.in);

            // Creamos las variables i y j para que el usuario indique en que posición quiere añadir el objeto
            int i = 0;
            int j = 0;

            // Pedimos al usuario la posición
            System.out.println("¿En qué posición quieres añadir el objeto(i)? :");
            i = entrada.nextInt();
            System.out.println("¿En qué posición quieres añadir el objeto(j)? :");
            j = entrada.nextInt();
            entrada.nextLine();

            // Pedimos al usuario los datos de los objetos que irán dentro del compartimento
            System.out.println("Introduce los datos de los objetos: ");
            System.out.println("");

            System.out.println("¿Qué objeto irá dentro del compartimento?: ");
            String objetos = entrada.nextLine();
            System.out.println("¿De que material está echo el objeto?: ");
            String material = entrada.nextLine();
            System.out.println("¿Què precio tiene?: ");
            float precio = entrada.nextFloat();

            // Creamos el objeto de compartimento con los datos del usuario
            Compartimentos compartimento = new Compartimentos(objetos, material, precio);

            // Añadimos el objeto a la matriz
            compartimentos[i][j] = compartimento;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Posición fuera de rango");
        }

    }

    /**
     * Método que elimina la posicion que indique el usuario
     *
     * @param compartimentos
     */
    public static void eliminarCompartimentos(Compartimentos[][] compartimentos) {
        Scanner entrada = new Scanner(System.in);

        // Creamos las variables i y j para que el usuario indique que posición borrar
        int i = 0;
        int j = 0;
        System.out.println("Elimina un compartimento: ");
        i = entrada.nextInt();
        j = entrada.nextInt();

        // Simplemente ponemos a null la posición indicada
        compartimentos[i][j] = null;
    }

    /**
     * Método que muestra el objeto del comaprtimento con más valor
     *
     * @param compartimentos
     */
    public static void mostrarConMasValor(Compartimentos[][] compartimentos) {
        // Creamos un objeto de compartimento para ir guardando el compartimento de mayor valor 
        Compartimentos compartimento = new Compartimentos("", "", 0);

        // Recorremos la matriz
        for (int i = 0; i < compartimentos.length; i++) {
            for (int j = 0; j < compartimentos[i].length; j++) {
                // Comparamos el valor de la matriz de compartimentos con  valor del objeto creado
                if (compartimentos[i][j].getPrecio() > compartimento.getPrecio()) {
                    compartimento = compartimentos[i][j]; // Si es mayor lo guardamos
                }

            }

        }
        System.out.println("El compartimento más valioso es: " + compartimento);
    }

    public static void mostrarConMenorValor(Compartimentos[][] compartimentos) {
        // Creamos un objeto de compartimento para ir guardando el compartimento de menor valor 
        Compartimentos compartimento = new Compartimentos("", "", 0);

        // Recorremos la matriz
        for (int i = 0; i < compartimentos.length; i++) {
            for (int j = 0; j < compartimentos[i].length; j++) {
                // Comparamos el valor de la matriz de compartimentos con valor del objeto creado
                if (compartimentos[i][j].getPrecio() < compartimento.getPrecio()) {
                    compartimento = compartimentos[i][j]; // Si es menor lo guardamos
                }

            }

        }
        System.out.println("El compartimento con menos valor es: " + compartimento);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Creamos la matriz de compartimentos
        Compartimentos[][] misCompartimentos = new Compartimentos[3][3];

        // LLamamos al método del menú y usamos un bucle para que el usuario
        // introduzca una opción
        int opcion = 0;

        do {
            mostrarMenu();
            opcion = entrada.nextInt();

            try {
                switch (opcion) {
                    case 1:
                        mostrarCompartimentos(misCompartimentos);
                        break;
                    case 2:
                        colocarCompartimentos(misCompartimentos);
                        break;
                    case 3:
                        eliminarCompartimentos(misCompartimentos);
                        break;
                    case 4:
                        mostrarConMasValor(misCompartimentos);
                        break;
                    case 5:
                        mostrarConMenorValor(misCompartimentos);
                        break;
                    case 6:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción incorrecta");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error. Has introducido una letra, introduce un número");
            }

        } while (opcion != 6);

    }

}
