package ejerciciorepasovideoclub;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Crearemos una clase Pelicula que tendrá como atributos: titulo, genero y
 * duracion.
 *
 * Crearemos una matriz de 3 filas y 3 columnas que representará un videoclub
 * donde se almacenarán las películas.
 *
 * Crearemos un menú con las siguientes opciones:
 *
 * 1- Rellenar el videoclub de películas (rellenar la matriz en orden celda por
 * celda).
 *
 * 2- Rellenar el videoclub indicando posición
 *
 * 2- Mostrar las películas de un género concreto.
 *
 * 3- Mostrar la película con mayor duración.
 *
 * 4- Mostrar películas que contengan una palabra o letra en el título.
 *
 * 5- Eliminar todas las películas de un género concreto.
 *
 * 6- Mostrar la duración media de todas las películas.
 *
 * 7- Contar cuántas películas hay de un género concreto.
 *
 * 8- Salir del programa.
 *
 * @author KevinNS
 */
public class EjercicioRepasoVideoclub {

    /**
     * Método que rellena las peliculas del videoclub celda por celda con los
     * datos de las peliculas introducidos por el usuario
     *
     * @param nuevasPelis
     */
    public static void rellenarVideoclub(Pelicula[][] nuevasPelis) {
        Scanner entrada = new Scanner(System.in);

        // Recorremos la matriz
        for (int i = 0; i < nuevasPelis.length; i++) {
            for (int j = 0; j < nuevasPelis[i].length; j++) {

                // Pedimos al usuario que rellene los datos de la pelicula
                System.out.println("Indica el título de la película: ");
                String tituloPeli = entrada.nextLine();
                System.out.println("Indica el género de la película: ");
                String generoPeli = entrada.nextLine();
                System.out.println("Indica la duración de la película: ");
                float duracioPeli = entrada.nextFloat();
                entrada.nextLine();

                // Creamos un objeto pelicula con los datos introducidos
                nuevasPelis[i][j] = new Pelicula(tituloPeli, generoPeli, duracioPeli);
            }

        }

    }

    /**
     * Método que tambien rellena el videoclub de películas con los datos que
     * introduce el usuario pero en este caso también tiene que indicar la
     * posición que tendrá
     *
     * @param nuevasPelis
     */
    public static void rellenarVideoclubPosicion(Pelicula[][] nuevasPelis) {
        Scanner entrada = new Scanner(System.in);

        // Creamos un try catch para controlar el deborde
        try {
            // Pedimos al usuario que indique la posición en la que quiere meter las peliculas
            System.out.println("Indica la fila: ");
            int filaUsu = entrada.nextInt();
            System.out.println("Indica la columna: ");
            int columUsu = entrada.nextInt();
            entrada.nextLine();

            // Pedimos al usuario que rellene los datos de la pelicula
            System.out.println("Indica el título de la película: ");
            String tituloPeli = entrada.nextLine();
            System.out.println("Indica el género de la película: ");
            String generoPeli = entrada.nextLine();
            System.out.println("Indica la duración de la película: ");
            float duracioPeli = entrada.nextFloat();
            entrada.nextLine();

            // Creamos un objeto pelicula con los datos introducidos
            nuevasPelis[filaUsu][columUsu] = new Pelicula(tituloPeli, generoPeli, duracioPeli);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error. Posición fuera de rango");
        }

    }

    /**
     * Método que muestra las películas por el género que introduca el usuario
     *
     * @param nuevasPelis
     */
    public static void mostrarPelisGenero(Pelicula[][] nuevasPelis) {
        Scanner entrada = new Scanner(System.in);

        // Preguntamos al usuario que género quiere buscar para mostrar las pelis
        System.out.println("¿Qué género estás buscando?: ");
        String generoPeliUsu = entrada.nextLine();

        boolean hayPeli = false; // Para saber si hay o no esa pelicula

        // Recorremos la matriz
        for (int i = 0; i < nuevasPelis.length; i++) {
            for (int j = 0; j < nuevasPelis[i].length; j++) {

                if (nuevasPelis[i][j] != null) { // Controlamos nulos

                    if (nuevasPelis[i][j].getGenero().equalsIgnoreCase(generoPeliUsu)) {
                        System.out.println("Ha elegido el género: " + generoPeliUsu
                                + " | Mostrando las películas: " + nuevasPelis[i][j]);
                        hayPeli = true;
                    }
                }

            }

        }
        if (hayPeli == false) {
            System.out.println("No se ha encontrado la película");
        }
    }

    /**
     * Método que muestra la película con mayor duración
     *
     * @param nuevasPelis
     */
    public static void mostrarMayorDuracion(Pelicula[][] nuevasPelis) {

        // Creamos un objeto de pelicula para usarla en la comparación       
        Pelicula peliMayor = new Pelicula("", "", 0);

        // Recorremos la matriz
        for (int i = 0; i < nuevasPelis.length; i++) {
            for (int j = 0; j < nuevasPelis[i].length; j++) {

                if (nuevasPelis[i][j] != null) { // Controlamos nulos

                    if (nuevasPelis[i][j].getDuracion() > peliMayor.getDuracion()) {
                        peliMayor = nuevasPelis[i][j];
                    }
                }

            }

        }
        System.out.println("La peli con mayor duración es: " + peliMayor);

    }

    /**
     * Método que muestra las peliculas cuyo título contenga las palabras o
     * letras indicadas por el usuario
     *
     * @param nuevasPelis
     */
    public static void mostrarConPalabraOLetra(Pelicula[][] nuevasPelis) {
        Scanner entrada = new Scanner(System.in);

        // Pedimos al usuario que indique la palabra/letra que contenga el título
        System.out.println("¿Qúe letra/palabra lleva el título de la peli?: ");
        String palabraLetraUsu = entrada.nextLine();

        // Recorremos la matriz
        for (int i = 0; i < nuevasPelis.length; i++) {
            for (int j = 0; j < nuevasPelis[i].length; j++) {

                if (nuevasPelis[i][j] != null) { // Controlamos nulos

                    if (nuevasPelis[i][j].getTitulo().contains(palabraLetraUsu)) {
                        System.out.println("Palabra/Letra elegida: " + palabraLetraUsu
                                + " | Titulos que la contienen: " + nuevasPelis[i][j]);
                    }

                }

            }

        }
    }

    /**
     * Método que elimina el género (con sus películas) que indique el usuario
     *
     * @param nuevasPelis
     */
    public static void eliminarPelisGenero(Pelicula[][] nuevasPelis) {
        Scanner entrada = new Scanner(System.in);
        int contador = 0; // Creamos un contador para indicar las que se han eliminado

        // Pedimos al usuario que nos indique el género que desea eliminar
        System.out.println("¿Qué género de películas desea eliminar?: ");
        String generoUsu = entrada.nextLine();

        // Recorremos la matriz
        for (int i = 0; i < nuevasPelis.length; i++) {
            for (int j = 0; j < nuevasPelis[i].length; j++) {

                if (nuevasPelis[i][j] != null) { // Controlamos nulos

                    if (nuevasPelis[i][j].getGenero().equalsIgnoreCase(generoUsu)) {

                        System.out.println("Se van ha eliminar éstas películas: "
                                + nuevasPelis[i][j] + " del género: " + generoUsu);

                        nuevasPelis[i][j] = null; // La ponemos a null para borrarla
                        contador++; // Incrementamos el contador
                    }
                }

            }
        }
        if (contador > 0) {
            System.out.println("Se han eliminado: " + contador + " peliculas");
        } else {
            System.out.println("No se ha eliminado ninguna película");
        }
    }

    /**
     * Método que muestra la media de la duración de las pelí8culas
     *
     * @param nuevasPelis
     */
    public static void duracionMediaPelis(Pelicula[][] nuevasPelis) {

        // Creamos estas variables para usarlas al sacar la media
        int contador = 0;
        float mediaDuracion = 0;

        // Recorremos la matriz
        for (int i = 0; i < nuevasPelis.length; i++) {
            for (int j = 0; j < nuevasPelis[i].length; j++) {

                if (nuevasPelis[i][j] != null) { // Controlamos nulos

                    // RECORDAR ESTO QUE SE ME OLVIDA SIEMPRE!!!!!!!!!!!!!!!!
                    mediaDuracion = mediaDuracion + nuevasPelis[i][j].getDuracion();
                    contador++;

                }

            }

        }
        // Fuera de los for dividimos media entre el contador
        mediaDuracion = mediaDuracion / contador;
        System.out.println("La media de la duración de las películas es: " + mediaDuracion);

    }
    
    /**
     * Método que cuenta las películas de un género previamente introducido por
     * el usuario
     * 
     * @param nuevasPelis 
     */
    public static void contarPelisGenero(Pelicula[][] nuevasPelis) {
        Scanner entrada = new Scanner(System.in);

        // Pedimos al usuario que introduzca el género a contar
        System.out.println("¿Qué género (con sus pelis) quieres contar: ");
        String contarGenero = entrada.nextLine();

        int contador = 0;

        // Recorremos la matriz
        for (int i = 0; i < nuevasPelis.length; i++) {
            for (int j = 0; j < nuevasPelis[i].length; j++) {

                if (nuevasPelis[i][j] != null) { // Controlamos nulos

                    if (nuevasPelis[i][j].getGenero().equalsIgnoreCase(contarGenero)) {
                        contador++;
                    }
                }

            }

        }
        System.out.println("El género " + contarGenero + " tiene " + contador + " películas");

    }

    /**
     * Método que muestra el menú al usuario
     */
    public static void mostrarMenu() {
        System.out.println("--------------------------------------------------");
        System.out.println("----------------GESTION DE VIDEOCLUB--------------");
        System.out.println("------------1.Rellenar videoclub de pelis---------");
        System.out.println("-----2.Rellenar videoclub indicando posición------");
        System.out.println("-------3.Mostrar peliculas de un género-----------");
        System.out.println("---------4.Mostrar peli con mayor duración--------");
        System.out.println("--------5.Mostrar pelis con palabra/letra---------");
        System.out.println("-----6.Eliminar todos las pelis de un género------");
        System.out.println("---7.Mostrar duración media de todas las pelis----");
        System.out.println("-----8.Contar cuántas pelis hay de un género------");
        System.out.println("---------------9.SALIR DEL PROGRAMA---------------");
        System.out.println("--------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Creamos la matriz de Pelicula
        Pelicula[][] nuevasPelis = new Pelicula[1][2];

        // Creamos el menu controlando excepciones
        int opcion = 0;

        do {
            mostrarMenu();
            opcion = entrada.nextInt();
            try {
                switch (opcion) {
                    case 1:
                        rellenarVideoclub(nuevasPelis);
                        break;
                    case 2:
                        rellenarVideoclubPosicion(nuevasPelis);
                        break;
                    case 3:
                        mostrarPelisGenero(nuevasPelis);
                        break;
                    case 4:
                        mostrarMayorDuracion(nuevasPelis);
                        break;
                    case 5:
                        mostrarConPalabraOLetra(nuevasPelis);
                        break;
                    case 6:
                        eliminarPelisGenero(nuevasPelis);
                        break;
                    case 7:
                        duracionMediaPelis(nuevasPelis);
                        break;
                    case 8:
                        contarPelisGenero(nuevasPelis);
                        break;
                    case 9:
                        System.out.println("Saliendo del programa....");
                        break;
                    default:
                        System.out.println("Opción incorrecta");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error. Has introducido una letra");
            }

        } while (opcion != 9);
    }

}
