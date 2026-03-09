package ejerciciorepasoalmacén;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Crearemos una clase Producto que tendrá como atributos: nombre, categoria y
 * precio.
 *
 * Crearemos una matriz de 3 filas y 3 columnas que representará el almacén de
 * una tienda.
 *
 * Crearemos un menú con las siguientes opciones:
 *
 * 1- Rellenar el almacén de productos (rellenar la matriz en orden celda por
 * celda).
 *
 * 2- Rellenar el almacén indicando posición
 *
 * 3- Mostrar los productos de una categoría concreta.
 *
 * 4- Mostrar el producto más caro.
 *
 * 5- Mostrar productos que contengan una palabra o letra en su nombre.
 *
 * 6- Eliminar todos los productos de una categoría concreta.
 *
 * 7- Mostrar el precio medio de todos los productos.
 *
 * 8- Contar cuántos productos hay de una categoría concreta.
 *
 * 9- Salir del programa.
 *
 * @author KevinNS
 */
public class EjercicioRepasoAlmacén {

    /**
     * Método que rellena el almacen con los datos del producto indicados por el
     * usuario
     *
     * @param nuevoProducto
     */
    public static void rellenarAlamacen(Producto[][] nuevoProducto) {
        Scanner entrada = new Scanner(System.in);

        // Recorremos la matriz
        for (int i = 0; i < nuevoProducto.length; i++) {
            for (int j = 0; j < nuevoProducto[i].length; j++) {

                // Pedimos al usuario los datos del producto
                System.out.println("Indica el nombre del producto: ");
                String nombreProd = entrada.nextLine();
                System.out.println("Indica la categoria del producto: ");
                String categoriaProd = entrada.nextLine();
                System.out.println("Indica el precio del producto: ");
                float precioProd = entrada.nextFloat();
                entrada.nextLine(); // Limpiamos buffer

                // Creamos un objeto producto con los datos introducidos
                nuevoProducto[i][j] = new Producto(nombreProd, categoriaProd, precioProd);

            }

        }

    }

    /**
     * Método que rellena el almacen con los datos del producto indicados por el
     * usuario y que además indica la posición
     *
     * @param nuevoProducto
     */
    public static void rellenarAlmacenPosicion(Producto[][] nuevoProducto) {
        Scanner entrada = new Scanner(System.in);

        // Creamos un try catch para controlar el desborde
        try {
            // Pedimos al usuario la posición del producto
            System.out.println("Indica la fila: ");
            int filaUsu = entrada.nextInt();
            System.out.println("Indica la columna: ");
            int columnaUsu = entrada.nextInt();
            entrada.nextLine(); // Limpiamos buffer

            // Pedimos al usuario los datos del producto
            System.out.println("Indica el nombre del producto: ");
            String nombreProd = entrada.nextLine();
            System.out.println("Indica la categoria del producto: ");
            String categoriaProd = entrada.nextLine();
            System.out.println("Indica el precio del producto: ");
            float precioProd = entrada.nextFloat();

            // Creamos un objeto producto con los datos introducidos
            nuevoProducto[filaUsu][columnaUsu] = new Producto(nombreProd, categoriaProd, precioProd);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error. Posición fuera de rango");
        }

    }

    /**
     * Método que muetra los productos de la categoría que indique el usuario
     *
     * @param nuevoProducto
     */
    public static void mostrarProductosCategoria(Producto[][] nuevoProducto) {
        Scanner entrada = new Scanner(System.in);

        // Pedimos al usuario que indique la categoria del producto a mostrar
        System.out.println("Indica la categoria para mostrar sus productos: ");
        String categoriaUsu = entrada.nextLine();

        // Recorremos la matriz
        for (int i = 0; i < nuevoProducto.length; i++) {
            for (int j = 0; j < nuevoProducto[i].length; j++) {

                if (nuevoProducto[i][j] != null) { // Controlamos nulos

                    if (nuevoProducto[i][j].getCategoria().equalsIgnoreCase(categoriaUsu)) {
                        System.out.println("Mostrando productos de la categoria "
                                + categoriaUsu + " | " + nuevoProducto[i][j]);
                    }
                }

            }

        }
    }

    /**
     * Método que muestra el producto más caro de los introducidos
     *
     * @param nuevoProducto
     */
    public static void mostrarMasCaro(Producto[][] nuevoProducto) {
        // Creamos un objeto "masCaro"
        Producto masCaro = new Producto("", "", 0);

        // Recorremos la matriz
        for (int i = 0; i < nuevoProducto.length; i++) {
            for (int j = 0; j < nuevoProducto[i].length; j++) {

                if (nuevoProducto[i][j] != null) { // Controlamos nulos

                    if (nuevoProducto[i][j].getPrecio() > masCaro.getPrecio()) {
                        masCaro = nuevoProducto[i][j];
                    }

                }

            }

        }
        System.out.println("El producto más caro es: " + masCaro);
    }

    /**
     * Método que muestra los productos que contengan una palabra o letra
     * indicada por el usuario
     *
     * @param nuevoProducto
     */
    public static void mostrarProductoPalabraOLetra(Producto[][] nuevoProducto) {
        Scanner entrada = new Scanner(System.in);

        // Pedimos al usuario que indique la palabra/letra que debe contener el producto a mostrar
        System.out.println("Indica la palabra/letra que debe contener el producto para mostrarlo: ");
        String eleccionUsu = entrada.nextLine();

        // Recorremos la matriz
        for (int i = 0; i < nuevoProducto.length; i++) {
            for (int j = 0; j < nuevoProducto[i].length; j++) {

                if (nuevoProducto[i][j] != null) { // Controlamos nulos

                    if (nuevoProducto[i][j].getNombre().contains(eleccionUsu)) {
                        System.out.println("Palabra/letra elegida: " + eleccionUsu
                                + " | Estos productos la contienen: " + nuevoProducto[i][j]);
                    }

                }

            }

        }

    }

    /**
     * Método que elimina los productos de una categoría indicada por el usuario
     *
     * @param nuevoProducto
     */
    public static void eliminarProductoCategoria(Producto[][] nuevoProducto) {
        Scanner entrada = new Scanner(System.in);
        int contador = 0; // Para indicar cuantos productos se han eliminado

        // Pedimos al usuario la categoria(con sus productos) que quiera elimninar
        System.out.println("¿Què categoría con todos sus productos quieres eliminar?: ");
        String eleccionUsu = entrada.nextLine();

        // Recorremos la matriz
        for (int i = 0; i < nuevoProducto.length; i++) {
            for (int j = 0; j < nuevoProducto[i].length; j++) {

                if (nuevoProducto[i][j] != null) { // Controlamos nulos

                    if (nuevoProducto[i][j].getCategoria().equalsIgnoreCase(eleccionUsu)) {

                        System.out.println("La categoría que quiere eliminar el usuario es: "
                                + eleccionUsu + " | Se van a borrar el/los siguientes producto/s: "
                                + nuevoProducto[i][j]);

                        nuevoProducto[i][j] = null; // Lo ponemos a null para borrar la categoria
                        contador++; // Incrementamos el contador

                    }

                }

            }

        }
        if (contador > 0) {
            System.out.println("Se han eliminado " + contador + " productos");
        }

    }

    /**
     * Método que muestra el precio medio de todos los productos
     *
     * @param nuevoProducto
     */
    public static void mostrarPrecioMedio(Producto[][] nuevoProducto) {
        // Creamos las variables que usaremos en la operación
        float media = 0;
        float contador = 0;

        // Recorremos la matriz
        for (int i = 0; i < nuevoProducto.length; i++) {
            for (int j = 0; j < nuevoProducto[i].length; j++) {

                if (nuevoProducto[i][j] != null) { // Controlamos nulos

                    media = media + nuevoProducto[i][j].getPrecio();

                    media = media / nuevoProducto[i][j].getPrecio();
                    media = nuevoProducto[i][j].getPrecio();

                }

            }

        }
        System.out.println("El precio medio de los productos es: " + media);

    }
    
    /**
     * Método que muestra la cantidad de productos de una categoría elegida 
     * por el usuario
     * 
     * @param nuevoProducto 
     */
    public static void contarProductosCategoria(Producto[][] nuevoProducto) {
        Scanner entrada = new Scanner(System.in);
        
        // Pedimos al usuario que indique la categoría de los productos que quiera msotrar+
        System.out.println("Indica la categoría de los productos que quieras mostrar: ");
        String eleccionUsu= entrada.nextLine();
        
        int contador= 0; // Creamos un contador para mostrar la cantidad de productos de esa categoría
        
        // Recorremos la matriz
        for (int i = 0; i < nuevoProducto.length; i++) {
            for (int j = 0; j < nuevoProducto[i].length; j++) {
                
                if (nuevoProducto[i][j] != null) { // Controlamos nulos
                    
                    if (nuevoProducto[i][j].getCategoria().equalsIgnoreCase(eleccionUsu)) {
                        System.out.println("Categoría elegida por el usuario: " 
                                +eleccionUsu + " | Los productos de esa categoría son: " 
                                + nuevoProducto[i][j]);
                        contador++; // Incrementamos el contador
                    }
                    
                }
                
            }           
        }
        if (contador > 0) {
            System.out.println("Número de productos de esa categoría: " + contador);
        }
    }

    /**
     * Método que muestra el menú al usuario
     */
    public static void mostrarMenu() {
        System.out.println("--------------------------------------------------");
        System.out.println("----------------GESTION DE ALMACEN----------------");
        System.out.println("----------1.Rellenar almacén de productos---------");
        System.out.println("------2.Rellenar almacén indicando posición-------");
        System.out.println("-----3.Mostrar productos de una categoría---------");
        System.out.println("------------4.Mostrar producto más caro-----------");
        System.out.println("------5.Mostrar producto con palabra/letra--------");
        System.out.println("-6.Eliminar todos los productos de una categoría--");
        System.out.println("---7.Mostrar precio medio de todos los productos--");
        System.out.println("--8.Contar cuántos productos hay de una categoría-");
        System.out.println("---------------9.SALIR DEL PROGRAMA---------------");
        System.out.println("--------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Creamos la matriz
        Producto[][] nuevoProducto = new Producto[1][2];

        // Creamos el menú controlando excepciones
        int opcion = 0;

        do {

            try {
                mostrarMenu();
                opcion = entrada.nextInt();
                
                switch (opcion) {
                    case 1:
                        rellenarAlamacen(nuevoProducto);
                        break;
                    case 2:
                        rellenarAlmacenPosicion(nuevoProducto);
                        break;
                    case 3:
                        mostrarProductosCategoria(nuevoProducto);
                        break;
                    case 4:
                        mostrarMasCaro(nuevoProducto);
                        break;
                    case 5:
                        mostrarProductoPalabraOLetra(nuevoProducto);
                        break;
                    case 6:
                        eliminarProductoCategoria(nuevoProducto);
                        break;
                    case 7:
                        mostrarPrecioMedio(nuevoProducto);
                        break;
                    case 8:
                        contarProductosCategoria(nuevoProducto);
                        break;
                    case 9:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción incorrecta");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error. Has introducido una letra");
                entrada.nextLine();
            }

        } while (opcion != 9);

    }

}
