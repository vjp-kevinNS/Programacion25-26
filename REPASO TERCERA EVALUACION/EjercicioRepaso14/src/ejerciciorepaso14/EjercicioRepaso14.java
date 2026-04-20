package ejerciciorepaso14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 * Una empresa hotelera quiere gestionar sus hoteles.
 *
 * Se dispone de un ArrayList de países.
 *
 * Cada País tendrá: Nombre-Un conjunto de hoteles(SET)
 *
 * Cada Hotel tendrá: Nombre-Número de habitaciones
 *
 * MENÚ:
 *
 * Añadir un país (con al menos un hotel)
 *
 * Mostrar países con sus hoteles
 *
 * Mostrar hoteles con más habitaciones que la media
 *
 * Buscar hotel por nombre (boolean)
 *
 * Añadir hotel a un país
 *
 * Mostrar hoteles ordenados de mayor a menor número de habitaciones
 *
 *
 * @author KevinNS
 */
public class EjercicioRepaso14 {

    /**
     * Método que añade un pais con sus hoteles
     *
     * @param lista
     */
    public static void añadirPaisYHotel(ArrayList<Pais> lista) {
        Scanner entrada = new Scanner(System.in);

        // Pedimos los datos del pais
        System.out.println("Nombre del pais: ");
        String nombrePais = entrada.nextLine();

        // Creamos un set de hoteles
        Set<Hotel> listaHoteles = new HashSet<>();

        // Creamos el do while
        String nuevoHotel;

        do {
            System.out.println("¿Quieres añadir un hotel al país: ?");
            nuevoHotel = entrada.nextLine();

            if (nuevoHotel.equalsIgnoreCase("si")) {

                // Pedimos los datos del hotel
                System.out.println("Nombre del hotel: ");
                String nombreHotel = entrada.nextLine();
                System.out.println("Número de habitaciones: ");
                int numHabitaciones = entrada.nextInt();
                entrada.nextLine();

                // Guardamos el hotel
                Hotel hotelAñadido = new Hotel(nombreHotel, numHabitaciones);

                // Lo añadimos a la lista
                listaHoteles.add(hotelAñadido);
            }

        } while (nuevoHotel.equalsIgnoreCase("si"));
        // Creamos el pais
        Pais nuevoPais = new Pais(nombrePais, listaHoteles);

        // Añadimos el pais a la lista
        lista.add(nuevoPais);
    }

    /**
     * Método que muestra los paises con sus hoteles
     *
     * @param lista
     */
    public static void mostrarPaisesConHoteles(ArrayList<Pais> lista) {
        // Recorremos los paises
        for (Pais pais : lista) {
            System.out.println("País con el nombre: " + pais.getNombrePais());
            // Recorremos los hoteles
            for (Hotel hotel : pais.getConjuntoHoteles()) {
                System.out.println("Hoteles del país: " + hotel.getNombreHotel()
                        + " | Número de habitaciones: " + hotel.getNumHabitaciones());
            }
        }
    }

    /**
     * Método que muestra los hoteles con la media de habitaciones mayor
     * 
     * @param lista 
     */
    public static void mostrarHotelesConMasHabitaciones(ArrayList<Pais> lista) {
        // Recorremos los paises
        for (Pais pais : lista) {
            // Creamos las variables que usaremos en la operación
            float suma = 0;
            int contador = 0;

            // Recorremos los hoteles
            for (Hotel hotel : pais.getConjuntoHoteles()) {
                suma += hotel.getNumHabitaciones();
                contador++;

            }
            // Realizamos la operación
            if (contador > 0) {
                float media = suma / contador;

                // Recorremos los hoteles otra vez
                for (Hotel hotel : pais.getConjuntoHoteles()) {
                    
                    if (hotel.getNumHabitaciones() > media) {
                        System.out.println("El hotel con el número de habitaciones superior a la media es: "
                                + hotel.getNombreHotel());
                    }

                }

            }

        }

    }
    
    /**
     * Método que busca un hotel por su nombre
     * 
     * @param lista 
     */
    public static void buscarHotelPorNombre(ArrayList<Pais> lista){
        Scanner entrada = new Scanner(System.in);
        
        // Comprobamos si la lista está vacía
        if (lista.isEmpty()) {
            System.out.println("La lista está vacía");
        }
        
        // Pedimos el nombre del hotel
        System.out.println("Introduce el nombre del hotel: ");
        String nombreBuscado = entrada.nextLine();
        
        boolean encontrado = false;
        int contador = 0;
        
        // Creamos un while para recorrer los países
        while (contador < lista.size() || encontrado == false) {
            Iterator<Hotel> it = lista.get(contador).getConjuntoHoteles().iterator();
            contador++;
            
            // Recorremos los hoteles
            while (it.hasNext() || encontrado == false) {
                Hotel hotel = it.next();
                
                if (hotel.getNombreHotel().equalsIgnoreCase(nombreBuscado)) {
                    System.out.println("Hotel: " + hotel);
                    encontrado = true;
                }
            }
        }
        if (encontrado == false) {
            System.out.println("No hay ningún hotel con ese nombre");
        }
        
    }
    
    /**
     * Método que añade un hotel a un país
     * 
     * @param lista 
     */
    public static void añadirHotelAPais(ArrayList<Pais> lista){
        Scanner entrada = new Scanner(System.in);
        
        // Comprobamos si la lista está vacía
        if (lista.isEmpty()) {
            System.out.println("La lista está vacía");
        }else{
            // Preguntamos en qué país quiere añadir el hotel
            System.out.println("¿En qué país quieres añadir el hotel?: ");
            String hotelAñadido = entrada.nextLine();
            
            // Recorremos los paises
            for (Pais pais : lista) {
                
                if (pais.getNombrePais().equalsIgnoreCase(hotelAñadido)) {
                    
                    // Pedimos los datos del hotel
                    System.out.println("Nombre del hotel: ");
                    String nombreHotel = entrada.nextLine();
                    System.out.println("Número de habitaciones: ");
                    int numeroHabitaciones = entrada.nextInt();
                    entrada.nextLine();
                    
                    // Guardamos el hotel
                    Hotel nuevoHotel = new Hotel(nombreHotel, numeroHabitaciones);
                    
                    // Lo añadimos a la lista
                    pais.getConjuntoHoteles().add(nuevoHotel);
                    
                    System.out.println("Hotel añadido");
                }
            }
        }
    }
    
    /**
     * Método que muestra los hoteles ordenados de mayor a menor según su número
     * de habitaciones
     * 
     * @param lista 
     */
    public static void mostrarOrdenados(ArrayList<Pais> lista){
        // Creamos un ArrayList de hoteles
        ArrayList<Hotel>listaHoteles = new ArrayList<>();
        
        // Recorremos los países
        for (Pais pais : lista) {
            // Recorremos los hoteles
            for (Hotel hotel : pais.getConjuntoHoteles()) {
                // Añadimos el hotel a la lista
                listaHoteles.add(hotel);
            }
        }
        // Ordenamos la lista de nuevos hoteles
        Collections.sort(listaHoteles);
        
        // Hacemos un for para mostrar la nueva lista
        for (Hotel hotel : listaHoteles) {
            System.out.println(hotel);
        }
    }

    /**
     * Método que muestra el menú
     */
    public static void mostrarMenu() {
        System.out.println("GESTION DE HOTELES");
        System.out.println("1. Añadir un país (con al menos un hotel)");
        System.out.println("2. Mostrar países con sus hoteles");
        System.out.println("3. Mostrar hoteles con más habitaciones que la media");
        System.out.println("4. Buscar hotel por nombre");
        System.out.println("5. Añadir hotel a un país");
        System.out.println("6. Mostrar hoteles ordenados de mayor a menor número de habitaciones");
        System.out.println("7. Salir del menú...");
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Creamos una lista de hoteles
        ArrayList<Pais> listaPaises = new ArrayList<>();

        // Creamos el menú controlando excepciones
        int opcion = 0;

        do {
            try {
                mostrarMenu();
                opcion = entrada.nextInt();
                switch (opcion) {
                    case 1:
                        añadirPaisYHotel(listaPaises);
                        break;
                    case 2:
                        mostrarPaisesConHoteles(listaPaises);
                        break;
                    case 3:
                        mostrarHotelesConMasHabitaciones(listaPaises);
                        break;
                    case 4:
                        buscarHotelPorNombre(listaPaises);
                        break;
                    case 5:
                        añadirHotelAPais(listaPaises);
                        break;
                    case 6:
                        mostrarOrdenados(listaPaises);
                        break;
                    case 7:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción incorrecta");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error. Has introducidco una letra");
                entrada.nextLine();
            }

        } while (opcion != 7);

    }

}
