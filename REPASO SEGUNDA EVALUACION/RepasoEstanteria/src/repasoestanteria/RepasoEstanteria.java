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
        Scanner entrada= new Scanner(System.in);
        
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
                Libro nuevoLibro = new Libro(tituloLibro, autoLibro, paginasLibro);                
            }
            
        }

    }

    public static void mostrarLibros(Libro[][] miLibro) {

    }

    public static void mayorNumPaginas(Libro[][] miLibro) {

    }

    public static void mostrarConPalabraOLetra(Libro[][] miLibro) {

    }

    public static void eliminarLibrosAutor(Libro[][] miLibro) {

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
        System.out.println("-----5.Eliminar todods los libros de un autor-----");
        System.out.println("--------------6.SALIR DEL PROGRAMA----------------");
        System.out.println("--------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Creamos una matriz libro 3x3
        Libro[][] miLibro = new Libro[3][3];

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
