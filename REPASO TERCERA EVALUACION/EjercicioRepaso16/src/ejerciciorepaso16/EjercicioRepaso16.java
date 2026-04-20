package ejerciciorepaso16;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

/**
 * Cada Juego tendrá: ID-Nombre-Plataforma-Una lista de partidas
 *
 * Cada Partida tendrá: Fecha-Puntuación
 *
 * MENÚ:
 *
 * Añadir juego con su puntuación
 *
 * Mostrar juegos con sus puntuación
 *
 * Buscar juego por ID
 *
 * Eliminar juego por ID
 *
 * Añadir partida a un juego
 *
 * Mejor puntuación
 *
 * Mostrar juegos ordenados por ID
 *
 * @author KevinNS
 */
public class EjercicioRepaso16 {

    /**
     * Método que añade juegos y puntaciones
     *
     * @param mapa
     */
    public static void añadirJuegoConPuntuacion(Map<Integer, Juego> mapa) {
        Scanner entrada = new Scanner(System.in);

        // Pedimos los datos
        System.out.println("ID juego: ");
        int idJuego = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Nombre juego: ");
        String nombreJuego = entrada.nextLine();
        System.out.println("Plataforma: ");
        String plataforma = entrada.nextLine();

        // Creamos la lista de partida
        ArrayList<Partida> listaPartidas = new ArrayList<>();

        // Creamos el do while
        String partidaBuscada;

        do {
            System.out.println("¿Quieres introducir una partida al juego?: ");
            partidaBuscada = entrada.nextLine();

            if (partidaBuscada.equalsIgnoreCase("si")) {
                // Pedimos los datos de la partida
                System.out.println("Puntuación del juego: ");
                float puntuacion = entrada.nextFloat();
                entrada.nextLine();

                // Guardamos la partida
                Partida partidaAñadida = new Partida(LocalDate.now(), puntuacion);

                // La añadimos a la lista
                listaPartidas.add(partidaAñadida);
            }

        } while (partidaBuscada.equalsIgnoreCase("si"));
        // Creamos el juego
        Juego nuevoJuego = new Juego(idJuego, nombreJuego, plataforma, listaPartidas);

        // Le añadimos a la lista
        mapa.put(idJuego, nuevoJuego);
    }

    /**
     * Método que muestra los juegos con su puntuación
     *
     * @param mapa
     */
    public static void mostrarJuegosYPuntuacion(Map<Integer, Juego> mapa) {
        // Recorremos los juegos
        for (Juego juego : mapa.values()) {
            System.out.println("ID del juego: " + juego.getIdJuego() + " | Nombre del juego: "
                    + juego.getNombreJuego() + " | Plataforma: " + juego.getPlataformaJuego());
            // Recorremos las partidas
            for (Partida partida : juego.getListaPartidas()) {
                System.out.println("Fecha de la partida: " + partida.getFechaPartida()
                        + " | Puntuación : " + partida.getPuntuacion());
            }
        }
    }

    /**
     * Método que busca un juego por ID
     *
     * @param mapa
     */
    public static void buscarJuegoPorId(Map<Integer, Juego> mapa) {
        Scanner entrada = new Scanner(System.in);

        // Pedimos el ID del juego
        System.out.println("Introduce el ID: ");
        int idBuscado = entrada.nextInt();

        // Comprobamos si existe
        if (mapa.containsKey(idBuscado)) {

            // Guardamos un juego
            Juego juegoBuscado = mapa.get(idBuscado);

            System.out.println("El juego con ID " + idBuscado + " es: "
                    + juegoBuscado.getNombreJuego());

        } else {
            System.out.println("No hay ningún juego con ese ID");
        }
    }

    /**
     * Método que elimina un juego por su ID
     *
     * @param mapa
     */
    public static void eliminarJuegoPorId(Map<Integer, Juego> mapa) {
        Scanner entrada = new Scanner(System.in);

        // Pedimos el ID del juego a eliminar
        System.out.println("Introduce el ID del jeugo a eliminar: ");
        int idBuscado = entrada.nextInt();

        // Comprobamos si existe
        if (mapa.containsKey(idBuscado)) {
            mapa.remove(idBuscado);

            System.out.println("Se ha elimninado el juego");

        } else {
            System.out.println("No hay ningún juego con ese ID");
        }
    }

    /**
     * Método que añade una partida a un juego
     *
     * @param mapa
     */
    public static void añadirPartida(Map<Integer, Juego> mapa) {
        Scanner entrada = new Scanner(System.in);

        // Pedimos el id del jeugo al que añadir una partida
        System.out.println("Introduce el ID del juego al que añadir partida: ");
        int idBuscado = entrada.nextInt();

        // Comprobamos si existe
        if (mapa.containsKey(idBuscado)) {

            // Guardamos el juego
            Juego juego = mapa.get(idBuscado);

            // Pedimos los datos de la partida
            System.out.println("Puntuación de la partida: ");
            float puntuacion = entrada.nextFloat();
            entrada.nextLine();

            // Creamos la partida
            Partida partidaAñadida = new Partida(LocalDate.now(), puntuacion);

            // La añadimos a la lista
            juego.getListaPartidas().add(partidaAñadida);

            System.out.println("Partida añadida al juego " + juego.getNombreJuego());

        } else {
            System.out.println("No hay ningún jeugo con ese ID");
        }
    }

    /**
     * Método que muestra el juego con mayor puntuación
     * 
     * @param mapa 
     */
    public static void mostrarMejorPuntuacion(Map<Integer, Juego> mapa) {
        // Creamos un ArrayList de partidas
        ArrayList<Partida> listaPartidas = new ArrayList<>();

        // Recorremos los juegos
        for (Juego juego : mapa.values()) {
            
            float puntuacionMayor = 0;
            
            // Recorremos las partidas
            for (Partida partida : listaPartidas) {
                
                if (partida.getPuntuacion() > puntuacionMayor) {
                    puntuacionMayor = partida.getPuntuacion();
                }
            }
            System.out.println("El juego " + juego.getNombreJuego() 
                    + " tiene una puntuación máxima de " + puntuacionMayor);
        }
    }

    /**
     * Método que muestra los juegos ordenados por ID
     * 
     * @param mapa 
     */
    public static void mostrarOrdenadosPorId(Map<Integer, Juego> mapa) {
        Scanner entrada = new Scanner(System.in);
        
        // Creamos una lsita de partidas
        ArrayList<Partida>listaPartidas = new ArrayList<>();
        
        // Recorremos los juegos
        for (Juego juego : mapa.values()) {
            
            // Recorremos las partidas
            for (Partida partida : listaPartidas) {
                // Añadimos la partida a la lista
                listaPartidas.add(partida);
            }            
        }
        // Usamos compareTo
        Collections.sort(listaPartidas);   
       
        // Hacemos un for para mostrar la nueva lista
        for (Partida partida : listaPartidas) {
            System.out.println(partida);
        }

    }

    /**
     * Método que muestra el menú
     */
    public static void mostrarMenu() {
        System.out.println("GESTION DE JUEGOS");
        System.out.println("1. Añadir juego con su puntuación");
        System.out.println("2. Mostrar juegos con sus puntuación");
        System.out.println("3. Buscar juego por ID");
        System.out.println("4. Eliminar juego por ID");
        System.out.println("5. Añadir partida a un juego");
        System.out.println("6. Mostrar juegos con valoración superior a la media");
        System.out.println("7. Mostrar juegos ordenados por ID");
        System.out.println("8. Salir del menú...");
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Creamos el mapa de juego
        Map<Integer, Juego> mapaJuegos = new HashMap();

        // Creamos el menú controlando excepciones
        int opcion = 0;

        do {
            try {
                mostrarMenu();
                opcion = entrada.nextInt();
                switch (opcion) {
                    case 1:
                        añadirJuegoConPuntuacion(mapaJuegos);
                        break;
                    case 2:
                        mostrarJuegosYPuntuacion(mapaJuegos);
                        break;
                    case 3:
                        buscarJuegoPorId(mapaJuegos);
                        break;
                    case 4:
                        eliminarJuegoPorId(mapaJuegos);
                        break;
                    case 5:
                        añadirPartida(mapaJuegos);
                        break;
                    case 6:
                        mostrarMejorPuntuacion(mapaJuegos);
                        break;
                    case 7:
                        mostrarOrdenadosPorId(mapaJuegos);
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
