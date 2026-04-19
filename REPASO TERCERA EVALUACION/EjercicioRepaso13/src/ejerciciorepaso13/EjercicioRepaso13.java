package ejerciciorepaso13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

/**
 * Cada Producto tendrá:ID-Nombre-Precio-Una lista de valoraciones
 *
 * Cada Valoración tendrá: Usuario-Puntuación
 *
 * MENÚ:
 *
 * Añadir producto con puntuación
 *
 * Mostrar productos con sus puntuaciones
 *
 * Buscar producto por ID
 *
 * Eliminar producto
 *
 * Añadir valoración a un producto
 *
 * Calcular media
 *
 * Mostrar productos ordenados por ID
 *
 * @author KevinNS
 */
public class EjercicioRepaso13 {

    /**
     * Método que añade un producto con su valoración pidiendole los datos al
     * usuario
     *
     * @param mapa
     */
    public static void añadirProductoConPuntuacion(Map<Integer, Producto> mapa) {
        Scanner entrada = new Scanner(System.in);

        // Pedimos los datos del producto
        System.out.println("ID producto: ");
        int idProducto = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Nombre producto: ");
        String nombreProd = entrada.nextLine();
        System.out.println("Precio producto: ");
        float precioProd = entrada.nextFloat();
        entrada.nextLine();

        // Creamos la lista de valoraciones
        ArrayList<Valoracion> listaValoraciones = new ArrayList<>();

        // Creamos el do while
        String nuevaValoracion;

        do {
            System.out.println("¿Quieres añadir otra valoración?(si/no)");
            nuevaValoracion = entrada.nextLine();

            if (nuevaValoracion.equalsIgnoreCase("si")) {
                // Pedimos los datos de la puntuacion
                System.out.println("Usuario: ");
                String usuario = entrada.nextLine();
                System.out.println("Puntuación: ");
                float puntuacion = entrada.nextFloat();
                entrada.nextLine();

                // Guardamos la valoración
                Valoracion valoracionAñadida = new Valoracion(usuario, puntuacion);

                // Añadimos la valoración
                listaValoraciones.add(valoracionAñadida);
            }

        } while (nuevaValoracion.equalsIgnoreCase("si"));
        // Creamos el producto
        Producto nuevoProducto = new Producto(idProducto, nombreProd, precioProd, listaValoraciones);

        // Añadimos el producto a la lista
        mapa.put(idProducto, nuevoProducto);
    }

    /**
     * Método que muestra el producto con sus valoraciones
     *
     * @param mapa
     */
    public static void mostrarProductoYValoraciones(Map<Integer, Producto> mapa) {
        // Recorremos los productos
        for (Producto producto : mapa.values()) {
            System.out.println("Nombre producto: " + producto.getNombreProducto() 
                    + " ID " + producto.getIdProducto());
            // Recorremos las valoraciones
            for (Valoracion valoracion : producto.getListaValoraciones()) {
                System.out.println("Usuario de la valoración: " + valoracion.getUsuario()
                        + " | Valoración: " + valoracion.getPuntuacion());
            }
        }
    }

    /**
     * Método que busca un producto por ID
     *
     * @param mapa
     */
    public static void buscarProductoId(Map<Integer, Producto> mapa) {
        Scanner entrada = new Scanner(System.in);

        // Pedimos el ID del producto
        System.out.println("Introduce el ID del producto: ");
        int idBuscado = entrada.nextInt();

        // Comprobamos si existe
        if (mapa.containsKey(idBuscado)) {

            // Guardamos el producto buscado
            Producto productoBuscado = mapa.get(idBuscado);
            System.out.println("El producto con ese ID es: " + productoBuscado.getNombreProducto());

        } else {
            System.out.println("No hay ningún producto con ese ID");
        }
    }

    /**
     * Método que elimina un producto por su ID
     *
     * @param mapa
     */
    public static void eliminarProducto(Map<Integer, Producto> mapa) {
        Scanner entrada = new Scanner(System.in);

        // Pedimos el ID
        System.out.println("Introduce el ID del producto a eliminar: ");
        float idBuscado = entrada.nextFloat();
        System.out.println(mapa);
        // Comprobamos si existe
        if (mapa.containsKey(idBuscado)) {
            mapa.remove(idBuscado);

            System.out.println("Producto eliminado");

        } else {
            System.out.println("No hay ningún producto con ese ID");
        }
    }

    /**
     * Método que calcula la media de puntuaciones de un producto
     * 
     * @param mapa 
     */
    public static void calcularMedia(Map<Integer, Producto> mapa) {
        // Recorremos los productos
        for (Producto producto : mapa.values()) {

            // Creamos la variable que usaremos en la operación
            float suma = 0;
            
            // Recorremos las valoraciones
            for (Valoracion valoracion : producto.getListaValoraciones()) {
                suma += valoracion.getPuntuacion();
            }
            
            float media = suma / producto.getListaValoraciones().size();
            System.out.println("La media de valoraciones del producto " + producto.getNombreProducto() 
                    + " es: " + media);
        }
    }
    
    /**
     * Método que muestra un producto por su ID
     * 
     * @param mapa 
     */
    public static void mostrarProductosPorId(Map<Integer, Producto> mapa){
        Scanner entrada = new Scanner(System.in);
        
        // Pedimos el ID
        System.out.println("Introduce el ID del producto que buscas: ");
        int idBuscado = entrada.nextInt();
        
        // Comprobamos si existe
        if (mapa.containsKey(idBuscado)) {
           
           // Guardamos el producto
           Producto productoBuscado = mapa.get(idBuscado);
           System.out.println("El producto con ese ID es: " + productoBuscado.getNombreProducto());
        }
    }

    /**
     * Método que muestra el menú
     */
    public static void mostrarMenu() {
        System.out.println("GESTION DE COCHES");
        System.out.println("1. Añadir producto con puntuación");
        System.out.println("2. Mostrar productos con sus puntuaciones");
        System.out.println("3. Buscar producto por ID");
        System.out.println("4. Eliminar producto");
        System.out.println("5. Añadir valoración a un producto");
        System.out.println("6. Calcular media");
        System.out.println("7. Mostrar productos ordenados por ID");
        System.out.println("8. Salir del menú...");
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Creamos el mapa de producto
        Map<Integer, Producto> mapaProducto = new HashMap();

        // Creamos el menú controlando excepciones
        int opcion = 0;

        do {
            try {
                mostrarMenu();
                opcion = entrada.nextInt();
                switch (opcion) {
                    case 1:
                        añadirProductoConPuntuacion(mapaProducto);
                        break;
                    case 2:
                        mostrarProductoYValoraciones(mapaProducto);
                        break;
                    case 3:
                        buscarProductoId(mapaProducto);
                        break;
                    case 4:
                        eliminarProducto(mapaProducto);
                        break;
                    case 5:
                        añadirProductoConPuntuacion(mapaProducto);
                        break;
                    case 6:
                        calcularMedia(mapaProducto);
                        break;
                    case 7:
                        mostrarProductosPorId(mapaProducto);
                        break;
                    case 8:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción incorrecta");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error. Has introducidco una letra");
                entrada.nextLine();
            }

        } while (opcion != 8);

    }

}
