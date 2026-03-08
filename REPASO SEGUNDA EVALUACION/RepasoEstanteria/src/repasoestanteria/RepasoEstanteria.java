package repasoestanteria;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Crearemos una clase Libro que tendrá como atributos: título, autor y número
 * de páginas.
 *
 * Crearemos un menú con las siguientes opciones:
 *
 * 1- Rellenar la estantería de libros (rellenar la matriz en orden, posición
 * por posición).
 *
 * 2- Mostrar los libros de un autor en concreto.
 *
 * 3- Mostrar el libro con mayor número de páginas.
 *
 * 4- Buscar libros que contengan una palabra o letra en el título.
 *
 * 5- Eliminar todos los libros de un autor concreto.
 *
 * 6- Salir del programa.
 *
 * @author KevinNS
 */
public class RepasoEstanteria {

    /**
     * Método que rellena la estantería de libros con los doatos que pedimos
     * previamente al usuario
     *
     * @param miLibro
     */
    public static void rellenarEstanteria(Libro[][] miLibro) {
        Scanner entrada = new Scanner(System.in);

         // Recorremos la matriz 
        for (int i = 0; i < miLibro.length; i++) {
            for (int j = 0; j < miLibro[i].length; j++) {

                // Pedimos al usuarios los datos del libro
                System.out.println("Introduce los datos del libro: ");
                System.out.println();
                System.out.println("¿Qué título tiene el libro?: ");
                String tituloLibro = entrada.nextLine();
                System.out.println("¿Quién es el autor del libro?: ");
                String autoLibro = entrada.nextLine();
                System.out.println("¿Cuántas páginas tiene el libro?: ");
                int paginasLibro = entrada.nextInt();
                entrada.nextLine();

                // Creamos el objeto de libro con los datos introducidos
                miLibro[i][j] = new Libro(tituloLibro, autoLibro, paginasLibro);
                // RECORDAR ESTO QUE SIEMPRE ME EQUIVOCO!!!!!!!
            }

        }
//        try { 
//            // Aqui haremos como si el usuario tuviera que introducir la posición
//            // con un try catch para controlar el desborde
//            System.out.println("Introduce la fila: ");
//            int fila = entrada.nextInt();
//            System.out.println("Introduce la columna: ");
//            int columna = entrada.nextInt();
//            entrada.nextLine();
//
//            // Pedimos al usuarios los datos del libro
//            System.out.println("Introduce los datos del libro: ");
//            System.out.println();
//            System.out.println("¿Qué título tiene el libro?: ");
//            String tituloLibro = entrada.nextLine();
//            System.out.println("¿Quién es el autor del libro?: ");
//            String autoLibro = entrada.nextLine();
//            System.out.println("¿Cuántas páginas tiene el libro?: ");
//            int paginasLibro = entrada.nextInt();
//            entrada.nextLine();
//
//            // Creamos el objeto con las variables de posición
//            miLibro[fila][columna] = new Libro(tituloLibro, autoLibro, paginasLibro);
//
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Error. Está fuera de rango");
//        }

    }

    /**
     * Método que muestra los libros de un autor determinado eleijdo por el
     * usuario
     *
     * @param miLibro
     */
    public static void mostrarLibros(Libro[][] miLibro) {
        Scanner entrada = new Scanner(System.in);
        // Creamos un try catch para controlar que si no encontramos un libro nos dé error
        try {
            // Pedimos al usuario que indique el autor
            System.out.println("¿Qué autor quieres buscar?: ");
            String autorlibro = entrada.nextLine();

            boolean hayAutor = false; // Creamos éste boolean para indicar si hay libros de ese autor o no

            // Recorremos la matriz
            for (int i = 0; i < miLibro.length; i++) {
                for (int j = 0; j < miLibro[i].length; j++) {

                    if (miLibro[i][j] != null) { // Control de nulos

                        if (miLibro[i][j].getAutor().equalsIgnoreCase(autorlibro)) {
                            System.out.println(" Mostrando " + miLibro[i][j] + " del autor: "
                                    + autorlibro);
                            hayAutor = true; // Si encontramos al autor
                        }

                    }

                }

            }
            // Indicamos un mensaje si no se ha encotnrado al autor
            if (hayAutor == false) {
                System.out.println("No se ha encontrado al autor");
            }

        } catch (NullPointerException e) {
            System.out.println("Error. No se encuentra el libro");
        }

    }

    /**
     * Método que muestra el libro con mayor número de páginas
     *
     * @param miLibro
     */
    public static void mayorNumPaginas(Libro[][] miLibro) {
        // Creamos un objeto para
        Libro mayorNum = new Libro();

        // Recorremos la matriz
        for (int i = 0; i < miLibro.length; i++) {
            for (int j = 0; j < miLibro[i].length; j++) {

                if (miLibro[i][j] != null) { // Control de nulos

                    if (miLibro[i][j].getNumPaginas() > mayorNum.getNumPaginas()) {
                        mayorNum = miLibro[i][j];
                    }
                }
            }

        }
        // RECORDAR QUE SIMPLEMENTE TENEMOS QUE MOSTRARLO!!!!
        System.out.println("El libro con mayor número de páginas es: " + mayorNum);

    }

    /**
     * Método que muestra el libro que contenga en su título una letra o palabra
     * elejida por el usuario
     *
     * @param miLibro
     */
    public static void mostrarConPalabraOLetra(Libro[][] miLibro) {
        Scanner entrada = new Scanner(System.in);

        // Pedimos al usuario que indique la letra o palabra a buscar
        System.out.println("¿Qué letra/palabra contiene el título?: ");
        String eleccionUsu = entrada.nextLine();

        // Recorremos la matriz
        for (int i = 0; i < miLibro.length; i++) {
            for (int j = 0; j < miLibro[i].length; j++) {

                if (miLibro[i][j] != null) { // Control de nulos

                    if (miLibro[i][j].getTitulo().contains(eleccionUsu)) {
                        System.out.println("Mostrando libro que contiene la letra/palabra: "
                                + eleccionUsu + " " + miLibro[i][j]);
                    }

                }

            }

        }

    }

    /**
     * Método que elimina los libros de un autor determinado elejido por el
     * usuario
     *
     * @param miLibro
     */
    public static void eliminarLibrosAutor(Libro[][] miLibro) {
        Scanner entrada = new Scanner(System.in);

        // Pedimos al usuario que indique que el autor
        System.out.println("¿Qué autor quieres eliminar?: ");
        String autorUsu = entrada.nextLine();

        // Creamos un contador para indicar cuántos libros se han elimninado
        int contador = 0;

        // Recorremos la matriz
        for (int i = 0; i < miLibro.length; i++) {
            for (int j = 0; j < miLibro[i].length; j++) {

                if (miLibro[i][j] != null) { // Control de nulos

                    if (miLibro[i][j].getAutor().equalsIgnoreCase(autorUsu)) {
                        miLibro[i][j] = null; // Lo ponemos a null para borrarlo
                        contador++; // Incrementamos el contador

                    }
                }

            }

        }
        // RECORDAR ESTO, SI NO NO SE CONTABILIZA COMO QUEREMOS 
        if (contador > 0) {
            System.out.println("Se han eliminado " + contador + " libros");
        } else {
            System.out.println("No hay libros de ese autor");
        }

    }

    /**
     * Método que muestra el menú al usuario
     */
    public static void mostrarMenu() {
        System.out.println("--------------------------------------------------");
        System.out.println("---------------GESTION DE ESTANTERIA--------------");
        System.out.println("----------1.Rellenar estanteria de libros---------");
        System.out.println("----------2.Mostrar libros de un autor------------");
        System.out.println("-----3.Mostrar libro con mayor num de páginas-----");
        System.out.println("--------4.Mostrar libro con palabra/letra---------");
        System.out.println("-----5.Eliminar todos los libros de un autor------");
        System.out.println("--------------6.SALIR DEL PROGRAMA----------------");
        System.out.println("--------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Creamos una matriz libro 3x3 (1x2 para probar más rapido)
        Libro[][] miLibro = new Libro[1][2];

        //Creamos el menú controlando Input....
        int opcion = 0;

        do {
            mostrarMenu();
            opcion = entrada.nextInt();
            try {
                switch (opcion) {
                    case 1:
                        rellenarEstanteria(miLibro);
                        break;
                    case 2:
                        mostrarLibros(miLibro);
                        break;
                    case 3:
                        mayorNumPaginas(miLibro);
                        break;
                    case 4:
                        mostrarConPalabraOLetra(miLibro);
                        break;
                    case 5:
                        eliminarLibrosAutor(miLibro);
                        break;
                    case 6:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción incorrecta");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error. Has introducido una letra");
            }
        } while (opcion != 6);

    }

}
