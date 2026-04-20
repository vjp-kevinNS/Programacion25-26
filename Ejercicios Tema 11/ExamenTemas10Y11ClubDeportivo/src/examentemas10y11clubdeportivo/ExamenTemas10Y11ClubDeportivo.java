package examentemas10y11clubdeportivo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author KevinNS
 */
public class ExamenTemas10Y11ClubDeportivo {

    /**
     * Método que añade un deporte con sus equipos con los datos introducidos
     * por el usuario
     *
     * @param lista
     */
    public static void añadirDeporteConEquipo(ArrayList<Deporte> lista) {
        Scanner entrada = new Scanner(System.in);

        // Pedimos al usuario los datos del Deporte
        System.out.println("Nombre del deporte: ");
        String nombreDeporte = entrada.nextLine();

        // Creamos la lista de equipos
        Set<Equipo> conjuntoEquipos = new HashSet<>();

        // Creamos un bucle para que el usuario añada equipos hasta que decida parar
        String nuevoEquipo;

        do {
            // Preguntamos al usuario si quieres añadi un equipo
            System.out.println("¿Quieres añadir un equipo?(si/no): ");
            nuevoEquipo = entrada.nextLine();

            if (nuevoEquipo.equalsIgnoreCase("si")) {
                // Pedimos los datos del equipo que quiere añadir
                System.out.println("Código del equipo: ");
                String codigoEquipo = entrada.nextLine();
                System.out.println("Nombre del equipo: ");
                String nombreEquipo = entrada.nextLine();
                System.out.println("Número de trofeos ganados: ");
                int trofeosGanados = entrada.nextInt();
                entrada.nextLine();

                // Guardamos el equipo
                Equipo equipoGuardado = new Equipo(codigoEquipo, nombreEquipo, trofeosGanados);

                // Añadimos el equipo a la lista
                conjuntoEquipos.add(equipoGuardado);
            }

        } while (nuevoEquipo.equalsIgnoreCase("si"));
        // Creamos el deporte
        Deporte nuevoDeporte = new Deporte(nombreDeporte, conjuntoEquipos);

        // Lo añadimos a la lista
        lista.add(nuevoDeporte);
    }

    /**
     * Método que muestra los deportes con sus equipos creados anteriormente
     *
     * @param lista
     */
    public static void mostrarDeportesYSusEquipos(ArrayList<Deporte> lista) {
        // Comprobamos si la lista está vacía
        if (lista.isEmpty()) {
            System.out.println("La lista aún está vacía");

        } else {
            // Recorremos los deportes
            for (Deporte deporte : lista) {
                System.out.println("Nombre del deporte -> " + deporte.getNombreDeporte());
                // Recorremos los equipos
                for (Equipo equipo : deporte.getConjuntoEquipos()) {
                    System.out.println("Código del equipo -> " + equipo.getCodigoEquipo()
                            + " | Nombre del equipo -> " + equipo.getNombreEquipo()
                            + " | Trofeos ganados -> " + equipo.getTrofeosGanados());
                }
            }
        }
    }

    /**
     * Método que pide el nombre de un equipo y muestra el nombre del deporte al
     * que pertenece.
     * 
     * No está bien pero este método  se me olvida siempre y si sigo con el
     * me como todo el tiempo
     *
     * @param lista
     */
    public static void buscarEquipo(ArrayList<Deporte> lista) {
        Scanner entrada = new Scanner(System.in);

        // Comprobamos si la lista está vacía
        if (lista.isEmpty()) {
            System.out.println("La lista está vacía");

        } else {
            // Creamos una lista de equipos
            ArrayList<Equipo> listaEquipos = new ArrayList<>();

            // Pedimos el nombre del equipo
            System.out.println("Introduce el nombre del equipo que buscas: ");
            String nombreBuscado = entrada.nextLine();

            boolean encontrado = false; // Variable para avisar si se ha encontrado el equipo

            // Creamos un do while para la búsqueda
            do {

                // Recorremos la lista de deportes
                for (Deporte deporte : lista) {

                    if (deporte.getConjuntoEquipos().contains(nombreBuscado) || encontrado == true) {

                        // Recorremos la lista de deporte
                        for (Equipo equipo : deporte.getConjuntoEquipos()) {
                            if (equipo.getNombreEquipo().equalsIgnoreCase(nombreBuscado)) {
                                encontrado = true;
                            }
                        }
                    }
                    System.out.println("El deporte al que pertenece el equipo es: "
                            + deporte.getNombreDeporte());
                }

            } while (encontrado != false);
            System.out.println("No hay ningún equipo con ese nombre. Sigue buscando");
        }

    }
    
    /**
     * Método que muestra el mapa de quipos
     * 
     * Me he liado ya demasiado y he intentado de todo pero se me ha olvidado 
     * como se hacía.
     * 
     * Al final ha quedado así, que se que no está bien pero no queria dejarlo vacío
     * 
     * @param mapa 
     */
    public static void mostrarMapaEquipos(Map<Integer,Deporte>mapa){
        Scanner entrada = new Scanner(System.in);
        
        // Pedimos el nombre del equipo a buscar
        System.out.println("Introduce el código del equipo: ");
        int codigoEquipo = entrada.nextInt();
             
        // Comprobamos si existe
        if (mapa.containsKey(codigoEquipo)) {
            
            // Guardamos el equipo
            
            // Recorremos la lista de deportes
            for (Deporte deporte : mapa.values()) {
               // Recorremos los equipos
                for (Equipo equipo : deporte.getConjuntoEquipos()) {
                    System.out.println("EL equipo con código: " + equipo.getCodigoEquipo()
                            + " está dentro del deporte " + deporte.getNombreDeporte());
                }
            }
        }else{
            System.out.println("No hay equipos con ese código");
        }
        
    }
    
    /**
     * Método que muestra los equipos por el número de trofeos
     * 
     * Este tambien me he quedado bloqueado y no recordaba cómo se hacía 
     * 
     * 
     * @param lista 
     */
    public static void mostrarOrdenadosPorTrofeos(ArrayList<Deporte> lista){        
        // Creamos una lista auxiliar
        ArrayList<Equipo>listaEquipos = new ArrayList<>();
        
        // Recorremos la lista de deportes
        for (Deporte deporte : lista) {
            
            // Recorremos la lista de equipos
            for (Equipo equipo : deporte.getConjuntoEquipos()) {
      
                Collections.sort(listaEquipos);
            }
        } 

        // Volvemos a recorrer los deportes y los equipos
        for (Deporte deporte : lista) {
            System.out.println("Deporte: " + deporte.getNombreDeporte());
            
            for (Equipo equipo : deporte.getConjuntoEquipos()) {
                System.out.println("Equipos: " +  equipo.getNombreEquipo() 
                        + " | Trofeos: " + equipo.getTrofeosGanados());
            }
        }
    }

    /**
     * Método que muestra el menú
     */
    public static void mostrarMenu() {
        System.out.println("--------------------------------------------------");
        System.out.println("-------------GESTION CLUB DEPORTIVO---------------");
        System.out.println("-------1. Añadir un deporte con sus equipos-------");
        System.out.println("-------2. Mostrar deportes y quipos---------------");
        System.out.println("-------3. Buscar equipo en deporte----------------");
        System.out.println("-------4. Mostrar mapa de equipos-----------------");
        System.out.println("-------5. Mostrar equipos ordenados(por trofeos)--");
        System.out.println("-------6. Salir del programa----------------------");
        System.out.println("--------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Creamos la lista de deportes
        ArrayList<Deporte> listaDeportes = new ArrayList<>();
        
        // Creamos un mapa de equipos
        Map<Integer,Deporte>mapaDeportes = new HashMap<>();

        // Creamos el menú controlando excepciones
        int opcion = 0;

        do {
            try {
                mostrarMenu();
                opcion = entrada.nextInt();
                switch (opcion) {
                    case 1:
                        añadirDeporteConEquipo(listaDeportes);
                        break;
                    case 2:
                        mostrarDeportesYSusEquipos(listaDeportes);
                        break;
                    case 3:
                        buscarEquipo(listaDeportes);
                        break;
                    case 4:
                        mostrarMapaEquipos(mapaDeportes);
                        break;
                    case 5:
                        mostrarOrdenadosPorTrofeos(listaDeportes);
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
