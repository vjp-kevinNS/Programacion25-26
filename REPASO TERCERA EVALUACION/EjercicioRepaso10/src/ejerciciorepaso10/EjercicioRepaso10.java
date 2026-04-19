package ejerciciorepaso10;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

/**
 * Se quiere desarrollar una aplicación para gestionar restaurantes.
 *
 * Cada Restaurante tendrá: ID-Nombre-Tipo de cocina-Una lista de reseñas
 *
 * Cada Reseña tendrá: Fecha-Comentario-Puntuación
 *
 * MENÚ:
 *
 * Añadir restaurante con sus reseñas
 *
 * Mostrar todos los restaurantes con sus reseñas
 *
 * Buscar un restaurante por ID
 *
 * Eliminar un restaurante
 *
 * Añadir una reseña a un restaurante
 *
 * Calcular la media de puntuaciones
 *
 * Mostrar restaurantes ordenados por ID
 *
 * @author KevinNS
 */
public class EjercicioRepaso10 {

    /**
     * Método que añade un restaurante con sus reseñas
     * 
     * @param mapa 
     */
    public static void añadirRestauranteConReseñas(Map<Integer, Restaurante> mapa) {
        Scanner entrada = new Scanner(System.in);

        // Pedimos los datos del restaurante
        System.out.println("Id del restaurante: ");
        int idRest = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Nombre del restaurante: ");
        String nombreRest = entrada.nextLine();
        System.out.println("Tipo de cocina: ");
        String tipoCocina = entrada.nextLine();

        // Creamos la lista de reseñas 
        ArrayList<Reseña> listaReseña = new ArrayList<>();

        // Creamos un do while con un if dentro para ir añadiendo reseñas hasta que el usuario quiera
        String nuevaReseña; // IMPORTANTE CREARLO FUERA DEL BUCLE

        do {
            System.out.println("¿Quieres añadir reseñas?(si/no): ");
            nuevaReseña = entrada.nextLine();
            
            // IMPORTANTE
            if (nuevaReseña.equalsIgnoreCase("si")) {
                // Pedimos los datos de la reseña (sin la fecha, que esa por defecto es la actual)
                System.out.println("Comentario de la reseña: ");
                String comentarioUsu = entrada.nextLine();
                System.out.println("Puntuación de la reseña: ");
                float puntuacionReseña = entrada.nextFloat();
                entrada.nextLine();
                
                // Creamos la reseña
                Reseña reseña = new Reseña(LocalDate.now(), comentarioUsu, puntuacionReseña);
                
                // Añadimos la reseña a la lista
                listaReseña.add(reseña);
            }

        } while (nuevaReseña.equalsIgnoreCase("si"));
        // Creamos el restaurante
        Restaurante nuevoRestaurante = new Restaurante(idRest, nombreRest, tipoCocina, listaReseña);
        
        // Añadimos el restuarante al mapa
        mapa.put(idRest, nuevoRestaurante);
    }
    
    /**
     * Método que muestra el restaurante con sus reseñas
     * 
     * @param mapa 
     */
    public static void mostrarRestauranteConReseña(Map<Integer, Restaurante> mapa){
        // Recorremos el mapa de restaurante
        for (Restaurante restaurante : mapa.values()) {
            System.out.println("Restaurante ID-> " + restaurante.getIdRest() 
                    + " Nombre -> " + restaurante.getNombreRest());
            
            // Recorremos la lista de reseña
            for (Reseña reseña : restaurante.getListaReseñas()) {
                System.out.println(reseña);
            }
        }
    }
    
    /**
     * Método que busca un restaurante con su reseña por el ID que indica el
     * usuario
     * 
     * @param mapa 
     */
    public static void buscarRestaurantePorId(Map<Integer, Restaurante> mapa){
        Scanner entrada = new Scanner(System.in);
        
        // Pedimos el ID
        System.out.println("Introduce el ID que estás buscando: ");
        int idBuscado = entrada.nextInt();
        
        // Comprobamos si existe ese id
        if (mapa.containsKey(idBuscado)) {
            
            // Guardamos el restaurante con ese ID
            Restaurante restauranteBuscado = mapa.get(idBuscado);
            System.out.println("Restaurante con ID -> " + idBuscado + " Con el nombre -> "
            + restauranteBuscado.getNombreRest());
            
            // Recorremos la lista de reseñas
            for (Reseña reseña : restauranteBuscado.getListaReseñas()) {
                System.out.println("Esto es lo que pone en las/la reseña: " + reseña.getComentario());
            }
        }else{
            System.out.println("No se ha encontrado ningún restaurante con ese ID");
        }
    }
    
    /**
     * Método que elimina un restaurante pidiendole al usuario el ID que quiere
     * eliminar
     * 
     * @param mapa 
     */
    public static void eliminarRestaurante(Map<Integer, Restaurante> mapa){
        Scanner entrada = new Scanner(System.in);
        
        // Pedimos el ID
        System.out.println("Introduce el ID del restaurante que quieres elimninar: ");
        int idBuscado = entrada.nextInt();
        
        // Comprobamos si existe ese ID y si es asi lo eliminamos
        if (mapa.containsKey(idBuscado)) {
            mapa.remove(idBuscado);
            
            System.out.println("Restaurante eliminado");
        }else{
            System.out.println("No hay ningún restaurante con ese ID");
        }
    }
    
    /**
     * Método que añade una reseña a un restaurante
     * 
     * @param mapa 
     */
    public static void añadirReseña(Map<Integer, Restaurante> mapa){
        Scanner entrada = new Scanner(System.in);
        
        // Como en los anteriores, pedimos el ID
        System.out.println("Introduce el ID del restaurante al que añadir la reseña");
        int idBuscado = entrada.nextInt();
        
        // Comprobamos si existe
        if (mapa.containsKey(idBuscado)) {
            
            // Pedimos los datos de la reseña
            System.out.println("Comentario de la reseña: ");
            String comentarioRese = entrada.nextLine();
            System.out.println("Puntuación de la reseña: ");
            int puntuacion = entrada.nextInt();           
            
            // Creamos la reseña
            Reseña reseñaAñadida = new Reseña(LocalDate.now(), comentarioRese, puntuacion);
            
            // Guardamos el restaurante al que añadimos la reseña
            Restaurante restauranteReseña = mapa.get(idBuscado);
            
            // Añadimos el restaurante a la lista
            restauranteReseña.getListaReseñas().add(reseñaAñadida);
            
            // Actualizamos el mapa con los datos introducidos
            mapa.put(idBuscado, restauranteReseña);
            
        }else{
            System.out.println("No hay ningñun restaurante con ese ID");
        }
    }
    
    /**
     * Método que calcula la media de las puntuaciones dadas en las reseñas
     * 
     * @param mapa 
     */
    public static void calcularMedia(Map<Integer, Restaurante> mapa){
        Scanner entrada = new Scanner(System.in);
        
        // Pedimos el ID
        System.out.println("Introduce el ID: ");
        int idBuscado = entrada.nextInt();
        
        // Comprobamos si existe
        if (mapa.containsKey(idBuscado)) {
            
            // Guardamos el restaurante con ese ID
            Restaurante restauranteBuscado = mapa.get(idBuscado);
            
            // Creamos las variables para la operación
            int contador = 0;
            float suma = 0;
            
            // Recorremos la lista de reseñas
            for (Reseña reseña : restauranteBuscado.getListaReseñas()) {
                suma += reseña.getPuntuacion();
                contador++;
            }
            
            // Calculamos la media
            if (contador > 0) {
                float media = suma / contador;
                System.out.println("Media de puntuaciones: " + media);
                
            }else{
                System.out.println("No hay reseñas");
            }
        }else{
            System.out.println("No hay ningún restaurante con ese ID");
        }
    }
    
    /**
     * Método que muestra los restaurantes ordenados por su ID
     * 
     * @param mapa 
     */
    public static void mostrarOrdenadosPorId(Map<Integer, Restaurante> mapa){
        
        // Pasamos el Map a ArrayList
        ArrayList<Restaurante>lista = new ArrayList<>(mapa.values());
        
        // Ordenamos usando el compareTo de la clase restaurante
        Collections.sort(lista);
        
        // Recorremos y mostramos ya ordenado(POR ID EN ESTE CASO)
        for (Restaurante restaurante : lista) {
            System.out.println("ID: " + restaurante.getIdRest());
            System.out.println("Nombre: " + restaurante.getNombreRest());
            
            for (Reseña reseña : restaurante.getListaReseñas()) {
                System.out.println(reseña);
            }  
        }
    }

    /**
     * Método que muestra el menú
     */
    public static void mostrarMenu() {
        System.out.println("GESTION DE RESTAURANTE");
        System.out.println("1. Añadir restaurante con sus reseñas");
        System.out.println("2. Mostrar restaurantes con sus reseñas");
        System.out.println("3. Buscar restaurante por ID");
        System.out.println("4. Eliminar un restaurante");
        System.out.println("5. Añadir reseña a un restaurante");
        System.out.println("6. Calcular la media de puntuaciones");
        System.out.println("7. Mostrar restaurantes ordenados por ID");
        System.out.println("8. Salir del menú...");
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Creamos el mapa de restaurante
        Map<Integer, Restaurante> mapaRestaurante = new HashMap<>();

        // Creamos el menú controlando excepciones
        int opcion = 0;

        do {
            try {
                mostrarMenu();
                opcion = entrada.nextInt();
                switch (opcion) {
                    case 1:
                        añadirRestauranteConReseñas(mapaRestaurante);
                        break;
                    case 2:
                        mostrarRestauranteConReseña(mapaRestaurante);
                        break;
                    case 3:
                        buscarRestaurantePorId(mapaRestaurante);
                        break;
                    case 4:
                        eliminarRestaurante(mapaRestaurante);
                        break;
                    case 5:
                        añadirReseña(mapaRestaurante);
                        break;
                    case 6:
                        calcularMedia(mapaRestaurante);
                        break;
                    case 7:
                        mostrarOrdenadosPorId(mapaRestaurante);
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
