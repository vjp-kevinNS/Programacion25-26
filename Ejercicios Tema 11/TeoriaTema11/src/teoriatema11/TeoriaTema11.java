package teoriatema11;

import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Un estudio de videojuegos nos ha encargado un software que gestione los
 * jugadores de su plataforma.
 *
 * Los jugadores se almacenarán en un mapa con clave ID y valor Jugador.
 *
 * Cada jugador contiene un conjunto de juegos.
 *
 * La clase Jugador tiene como atributos:
 *
 * ID (Integer) nickname (String) edad (int) juegos favoritos (Set)
 *
 * Funcionalidades-> Mostraremos por consola un menú que permita:
 *
 * Añadir jugador Añadir juego favorito a un jugador Mostrar todos los jugadores
 * Buscar jugador por ID Filtrar jugadores por juego Eliminar jugador Mostrar
 * juego más popular Recomendar jugadores con gustos similares
 *
 * @author KevinNS
 */
public class TeoriaTema11 {

    // Métodos que piden al usuario los datos del jugador
    public static int pedirInt(String texto) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("texto");
        return entrada.nextInt();
    }

    public static String pedirString(String texto) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("texto");
        return entrada.nextLine();
    }

    /**
     * Método que añade un jugador al mapa con su id, nickname, edad y sin
     * juegos favoritos
     *
     * @param mJugadores
     */
    public static void insertarJugador(Map<Integer, Jugador> mJugadores) {
        int id = pedirInt("ID: ");
        mJugadores.put(id, new Jugador(id, pedirString("Nickname:"), pedirInt("Edad: ")));

        System.out.println("Jugador añadido al mapa correctamente");
    }

    /**
     * Método que muestra todos los jugadores del mapa
     *
     * @param mJugadores
     */
    public static void mostrarJugadores(Map<Integer, Jugador> mJugadores) {
        if (!mJugadores.isEmpty()) {
            for (Integer id : mJugadores.keySet()) {
                System.out.println(mJugadores.get(id));
            }

        } else {
            System.out.println("No hay jugadores registrados");
        }
    }

    /**
     * Método que busca un jugador por su id y lo muestra
     *
     * @param id
     * @param mJugadores
     */
    public static void buscarJugador(int id, Map<Integer, Jugador> mJugadores) {
        if (!mJugadores.isEmpty()) {
            if (mJugadores.containsKey(id)) {
                System.out.println(mJugadores.get(id));

            }

        } else {
            System.out.println("No hay jugadores registrados");
        }
    }

    /**
     * Método que inserta un juego favorito al jugador indicado por su id
     *
     * @param mJugadores
     */
    public static void agregarJuegosFav(Map<Integer, Jugador> mJugadores) {
        if (!mJugadores.isEmpty()) {
            int id = pedirInt("ID del jugador: ");

            if (mJugadores.containsKey(id)) {
                Jugador jugador = mJugadores.get(id);
                jugador.insertarJuegoFav();

            } else {
                System.out.println("No hay jugadores registrados");
            }
        }
    }

    /**
     * Método que elimina un jugador del mapa por su id
     *
     * @param id
     * @param mJugadores
     */
    public static void eliminarJugador(int id, Map<Integer, Jugador> mJugadores) {
        if (!mJugadores.isEmpty()) {

            if (mJugadores.containsKey(id)) {
                mJugadores.remove(id);
                System.out.println("Jugador con id " + id + " elinado correctamente");
            }

        } else {
            System.out.println("No hay jugadores registrados");
        }
    }

    /**
     * Método que muestra los jugadores que tienen como favorito el jeugo pasado
     * por parámetro
     *
     * @param juego
     * @param mJugadores
     */
    public static void mostrarJugadoresPorJuego(String juego, Map<Integer, Jugador> mJugadores) {
        if (!mJugadores.isEmpty()) {

            // Recorrer el mapa
            for (Integer id : mJugadores.keySet()) {

                // Filtramos por juego
                if (mJugadores.get(id).getJuegosFav().contains(juego)) {
                    // Mostramos los jugadores
                    System.out.println(mJugadores.get(id));
                }

            }
        } else {
            System.out.println("No hay jugadores registrados");
        }
    }
    
    /**
     * Método que muestra el juego más popular
     * 
     * @param mJugadores 
     */
    public static void mostrarJuegoMasPopular(Map<Integer, Jugador> mJugadores) {
        //Creamos un mapa para guardar como clave el nombre del juego y como valor
        // ir contando las veces que aparece
        Map<String, Integer> cuentaJuegos = new HashMap<>();

        // Recorremos el mapa
        for (Integer id : mJugadores.keySet()) {
            // Recorremos el conjunto de jeugos de cada jugador
            for (String juego : mJugadores.get(id).getJuegosFav()) {
                // Comprobamos su el juego está o no en el mapa
                // Si no está, lo añadimos (nombre como clave y 1 como valor)
                if (!cuentaJuegos.containsKey(juego)) {
                    cuentaJuegos.put(juego, 1);

                } else {
                    // Si está, lo añadimos e incrementramos en 1 su contador
                    cuentaJuegos.put(juego, cuentaJuegos.get(id) + 1);
                }

            }
        }
        // Buscamos el juego con mayor número de apariciones
        int max = 0;
        for (String clave : cuentaJuegos.keySet()) {
            if (cuentaJuegos.get(clave) > max) {
                max = cuentaJuegos.get(clave);
            }
        }
        // Mostramos los juegos más populares
        System.out.println("-JUEGOS MAS POPULARES-");
        for (String clave : cuentaJuegos.keySet()) {
            if (cuentaJuegos.get(clave) == max) {
                System.out.println(clave);
            }
        }
    }
    
    public static void recomendarJugadores(int idJugador, Map<Integer, Jugador> mJugadores){
        // Tomamos como referencia el conjunto de juegos del jugador recibido por parámetro
        Set<String> cRef = new HashSet(mJugadores.get(idJugador).getJuegosFav());
        
        boolean enc = false;
        
        // Recorremos el mapa comparando el conjunto de referencia
        // con el conjunto de juegos de cada jugador dque no sea el
        // recibido por parámetro
        
        for (Integer id: mJugadores.keySet()) {
            if (id != idJugador) {
                // Creamos un conjunto donde guardar los jeugos comunes de los 2 jugadores
                Set<String>juegosComunes = new HashSet(mJugadores.get(id).getJuegosFav());
                
                if (juegosComunes.retainAll(cRef)) { // Deja en juegosComunes sólo los jeugos comúnes de ambos jugadores
                    enc = true;
                    System.out.println(mJugadores.get(id).getNickname() + ": " + juegosComunes.toString());
                }
            }
        }
        if (!enc) {
            System.out.println("No hay juegos con gustos similares");
        }
    }

    public static void main(String[] args) {
        Map<Integer, Jugador> mJugadores = new HashMap<>();
        int opcion = 0;
        do {
            try {
                System.out.println("-MENU-");
                System.out.println("1. Añadir jugador");
                System.out.println("2. Añadir juego favorito a un jugador");
                System.out.println("3. Mostrar todos los jugadores");
                System.out.println("4. Buscar jugador por ID");
                System.out.println("5. Filtrar jugadores por juego");
                System.out.println("6. Eliminar jugador");
                System.out.println("7. Mostrar juego más popular");
                System.out.println("8. Recomendar jugadores con gustos similares");
                System.out.println("9. Salir");
                opcion = pedirInt("Opción");

                switch (opcion) {
                    case 1:
                        insertarJugador(mJugadores);
                        break;
                    case 2:
                        agregarJuegosFav(mJugadores);
                        break;
                    case 3:
                        mostrarJugadores(mJugadores);
                        break;
                    case 4:
                        buscarJugador(pedirInt("ID: "), mJugadores);
                        break;
                    case 5:
                        mostrarJugadoresPorJuego(pedirString("Juego: "), mJugadores);
                        break;
                    case 6:
                        eliminarJugador(pedirInt("ID: "), mJugadores);
                        break;
                    case 7:
                        mostrarJuegoMasPopular(mJugadores);
                        break;
                    case 8:
                        recomendarJugadores(pedirInt("ID: "), mJugadores);
                        break;
                    case 9:
                        System.out.println("Saliendo del programa");
                        break;
                    default:
                        System.out.println("Opción incorrecta");
                }

            } catch (InputMismatchException e) {
                System.out.println("ERROR. Introduce un número entre 1 y 9");
            }

        } while (opcion != 9);

    }

}
