package ejerciciorepaso5;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase Libro: Título–Autor–ISBN–Número de páginas
 *
 * Añadir un libro
 *
 * Mostrar todos los libros
 *
 * Buscar un libro por título
 *
 * Añadir libro (comprobando que no esté repetido por ISBN)
 *
 * Eliminar libro
 *
 * @author KevinNS
 */
public class EjercicioRepaso5 {

    /**
     * Método que añade un libro con los datos introducidos por el usuario
     *
     * @param lista
     */
    public static void añadirLibro(ArrayList<Libro> lista) {
        Scanner entrada = new Scanner(System.in);

        // Pedimos al usuario los datos
        System.out.println("Título del libro: ");
        String tituloUsu = entrada.nextLine();
        System.out.println("Autor del libro: ");
        String autorUsu = entrada.nextLine();
        System.out.println("ISBN del libro: ");
        String isbnUsu = entrada.nextLine();
        System.out.println("Número de páginas: ");
        int numPaginas = entrada.nextInt();
        entrada.nextLine();

        // Creamos el libro
        Libro nuevoLibro = new Libro(tituloUsu, autorUsu, isbnUsu, numPaginas);

        // Añadimos el libro a la lista
        lista.add(nuevoLibro);
    }

    /**
     * Método que muestra todos los libros
     *
     * @param lista
     */
    public static void mostrarLibros(ArrayList<Libro> lista) {
        // Comprobamos si la lista está vacía
        if (lista.isEmpty()) {
            System.out.println("No hay libros en la lista aún");
            return;
        }
        // Recorremos la lista
        for (Libro libro : lista) {
            System.out.println(libro + " ");
        }
    }

    /**
     * Método que busca un libro por el título que ha introducido el usuario
     *
     * @param lista
     */
    public static void buscarLibroTitulo(ArrayList<Libro> lista) {
        Scanner entrada = new Scanner(System.in);

        // Comprobamos si la lista está vacía
        if (lista.isEmpty()) {
            System.out.println("No hay libros en la lista aún");
            return;
        }

        // Preguntamos al usuario por el título del libro
        System.out.println("¿Qué título estás buscando?: ");
        String tituloBuscado = entrada.nextLine();

        int contador = 0;
        boolean encontrado = false; // Se pondrá a true si se encuentra

        // Creamos un bucle while para la búsqueda (que los otros los hice con for por que se me va la pinza)
        while (contador < lista.size() || encontrado == false) {
            if (lista.get(contador).getTituloLibro().equalsIgnoreCase(tituloBuscado)) {
                System.out.println("Se ha encontrado el libro con el título " + tituloBuscado);
                encontrado = true;
            }
            contador++;
        }
        if (encontrado = false) {
            System.out.println("No hay ningún libro con ese título");
        }
    }

    /**
     * Método que añade un libro pidiendole los datos al usuario y commprueba
     * si ya existe
     * 
     * @param lista 
     */
    public static void añadirCoomprobandoRepetidos(ArrayList<Libro> lista) {
        Scanner entrada = new Scanner(System.in);

        // Pedimos al usuario los datos
        System.out.println("Título del libro: ");
        String tituloUsu = entrada.nextLine();
        System.out.println("Autor del libro: ");
        String autorUsu = entrada.nextLine();
        System.out.println("ISBN del libro: ");
        String isbnUsu = entrada.nextLine();
        System.out.println("Número de páginas: ");
        int numPaginas = entrada.nextInt();
        entrada.nextLine();
        
        // Creamos el libro
        Libro nuevoLibro2 = new Libro(tituloUsu, autorUsu, isbnUsu, numPaginas);
        
        boolean repetido = false;
        
        for (Libro libro : lista) {
            if (libro.getTituloLibro().equalsIgnoreCase(autorUsu)) {
                repetido = true;
            }
        }
        if (repetido == true) {
            System.out.println("No se puede añadir el libro pro que ya existe");
        }else{
            System.out.println("Libro añadido con éxito");
            // Lo añado a la lista
            lista.add(nuevoLibro2);
        }
    }

    /**
     * Método que muestra el menú
     */
    public static void mostrarMenu() {
        System.out.println("GESTION DE BIBLIOTECA");
        System.out.println("1. Añadir libro");
        System.out.println("2. Mostrar todos los libros");
        System.out.println("3. Buscar libro por título");
        System.out.println("4. Añadir libro comprobando repetidos");
        System.out.println("5. Eliminar libro");
        System.out.println("6. Salir del menú...");
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Creamos la lista de libros
        ArrayList<Libro> listaLibros = new ArrayList<>();

        // Creamos el menú controlando excepciones
        int opcion = 0;

        do {
            try {
                mostrarMenu();
                opcion = entrada.nextInt();
                switch (opcion) {
                    case 1:
                        añadirLibro(listaLibros);
                        break;
                    case 2:
                        mostrarLibros(listaLibros);
                        break;
                    case 3:
                        buscarLibroTitulo(listaLibros);
                        break;
                    case 4:
                        añadirCoomprobandoRepetidos(listaLibros);
                        break;
                    case 5:

                        break;
                    case 6:
                        System.out.println("Saliendo del programa...");
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
