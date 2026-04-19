package ejerciciorepaso9;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

/**
 * Se quiere desarrollar una aplicación para gestionar clientes de un taller
 * mecánico.
 *
 * Cada cliente tendrá: ID, nombre, teléfono y una lista de reparaciones. Cada
 * reparación tendrá: fecha, descripción y precio.
 *
 * Crear una estructura para almacenar los clientes.
 *
 * MENÚ:
 *
 * Añadir clientes con sus reparaciones.
 *
 * Mostrar todos los clientes con sus reparaciones.
 *
 * Buscar un cliente por ID.
 *
 * Eliminar un cliente.
 *
 * Añadir una reparación a un cliente.
 *
 * Calcular el coste total de las reparaciones de un cliente.
 *
 * Mostrar clientes ordenados por ID
 *
 * @author KevinNS
 */
public class EjercicioRepaso9 {

    /**
     * Método que añade el cliente con la reparación
     *
     * @param mapa
     */
    public static void añadirCliente(Map<Integer, Cliente> mapa) {
        Scanner entrada = new Scanner(System.in);

        // Pedimos los datos al usuario
        System.out.println("ID del cliente: ");
        int idCliente = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Nombre del cliente: ");
        String nombreCliente = entrada.nextLine();
        System.out.println("Tlfno del cliente: ");
        int tlfnoCliente = entrada.nextInt();
        entrada.nextLine();

        // Creamos la lista de reparacion
        ArrayList<Reparacion> listaReparacion = new ArrayList<>();

        // Creamos un do while para que el usuario nos indique la reparacioón y si quiere seguir añadiendo
        String reparacionNueva;

        do {
            System.out.println("¿Quieres añadir más reparaciones?(si/no)");
            reparacionNueva = entrada.nextLine();

            if (reparacionNueva.equalsIgnoreCase("si")) {
                // Pedimos la descripcion de la reparación
                System.out.println("Descripción de la reparación: ");
                String descReparacion = entrada.nextLine();
                System.out.println("Precio de la reparación: ");
                float precio = entrada.nextFloat();

                // Creamos la reparación
                Reparacion reparacion = new Reparacion(LocalDate.now(), descReparacion, precio);

                // Añadimos la reparación a la lista
                listaReparacion.add(reparacion);
            }

        } while (reparacionNueva.equalsIgnoreCase("si"));
        // Creamos el cliente
        Cliente nuevoCliente = new Cliente(idCliente, nombreCliente, tlfnoCliente, listaReparacion);

        // Añadimos el cliente al mapa
        mapa.put(idCliente, nuevoCliente);
    }

    /**
     * Método que muestra los clientes
     *
     * @param mapa
     */
    public static void mostrarClientes(Map<Integer, Cliente> mapa) {
        // Recorremos el mapa de clientes
        for (Cliente cliente : mapa.values()) {
            System.out.println("Nombre: " + cliente.getNombre());

            // Recorremos la lista de reparacion
            for (Reparacion reparacion : cliente.getListaReparaciones()) {
                System.out.println(reparacion);
            }
        }
    }

    /**
     * Método que busca a un cliente por su ID y muestra por pantalla la reparación
     * que necesita
     * 
     * @param mapa 
     */
    public static void buscarClienteId(Map<Integer, Cliente> mapa) {
        Scanner entrada = new Scanner(System.in);

        // Pedimos al usuario el ID que está buscando
        System.out.println("Introduce el ID del cliente: ");
        int idBuscado = entrada.nextInt();

        // Comprobamos si existe ese ID
        if (mapa.containsKey(idBuscado)) {
            
            // Creamos el cliente que buscamos
            Cliente clienteBuscado = mapa.get(idBuscado);
            System.out.println("Se ha encontrado al cliente con el ID: " + idBuscado 
                    + " Su nombre es " + clienteBuscado.getNombre());
            
            // Recorremos la lista ce reparaciones
            for (Reparacion reparacion : clienteBuscado.getListaReparaciones()) {
                System.out.println("Decripción de la reparación: " + reparacion.getDescripcion());
            }
        }else{
            System.out.println("No hay ningún cliente con ese ID");
        }
    }
    
    /**
     * Método que elimina un cliente (ID) introducido por el usuario
     * 
     * @param mapa 
     */
    public static void eliminarCliente(Map<Integer, Cliente> mapa){
        Scanner entrada = new Scanner(System.in);
        
        // Pedimos al ususario que nos diga el cliente que quiere eliminar (ID)
        System.out.println("Indica el ID del cliente que quieres eliminar");
        int idBuscado = entrada.nextInt();
        
        // Comprobamos si existe ese cliente y si es así lo eliminamos
        if (mapa.containsKey(idBuscado)) {
            mapa.remove(idBuscado);
            
            System.out.println("Se ha eliminado al cliente");
        }else{
            System.out.println("No existe un cliente con ese ID");
        }
        
        
    }
    
    /**
     * Método que añade una reparación al cliente buscándolo por el ID introducido
     * por el usuario
     * 
     * @param mapa 
     */
    public static void añadirReparacion(Map<Integer, Cliente> mapa){
        Scanner entrada = new Scanner(System.in);
        
        // Pedimos al usuario el ID del cliente al que vamos a añadir la reparación
        System.out.println("Indica el ID del cliente para añadirle una reparación ");
        int idBuscado = entrada.nextInt();
        
        // Comprobamos si existe
        if (mapa.containsKey(idBuscado)) {
            
            // Pedimos al usuario la reparación que quiere introducir
            System.out.println("Indica la reparación que quieres añadir al vehículo del cliente");
            String reparacionAñadida = entrada.nextLine();
            System.out.println("¿Cuál es el precio de la nueva reparación?: ");
            float precioNueva = entrada.nextFloat();
            
            // Creamos la reparación
            Reparacion nuevaReparacion = new Reparacion(LocalDate.now(), reparacionAñadida, precioNueva);
            
            // Guardamos el cliente al que queremos añadir la reparación
            Cliente clienteReparacion = mapa.get(idBuscado);
            
            // Lo añadimos a la lista
            clienteReparacion.getListaReparaciones().add(nuevaReparacion);
            
            // Actualizamos el mapa con los datos introducidos
            mapa.put(idBuscado, clienteReparacion);
            
        }else{
            System.out.println("No hay ningún cliente con ese ID");
        }
    }
    
    /**
     * Método que ordena por ID usando el compareTo creado en la clase Cliente
     * 
     * @param mapa 
     */
    public static void ordenarPorId(Map<Integer, Cliente> mapa){
        
        // Pasamos el Map a ArrayList
        ArrayList<Cliente>lista = new ArrayList<>();
        
        // Ordenamos usando el CompareTo de la clase cliente
        Collections.sort(lista);
        
        // Recorremos y mostramos ya ordenado
        for (Cliente cliente : lista) {
            System.out.println("ID: " + cliente.getId());
            System.out.println("Nombre: " + cliente.getNombre());
            
            for (Reparacion reparacion : cliente.getListaReparaciones()) {
                System.out.println(reparacion);
            }
        }
    }

    /**
     * Método que muestra el menú
     */
    public static void mostrarMenu() {
        System.out.println("GESTION DE CLIENTES");
        System.out.println("1. Añadir clientes con sus reparaciones");
        System.out.println("2. Mostrar clientes con sus reparaciones");
        System.out.println("3. Buscar cliente por ID)");
        System.out.println("4. Eliminar un cliente");
        System.out.println("5. Añadir reparación a un cliente");
        System.out.println("6. Mostrar clientes ordenados por ID");
        System.out.println("7. Salir del menú...");
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Creamos el mapa de clientes
        Map<Integer, Cliente> mapaClientes = new HashMap();

        // Creamos el menú controlando excepciones
        int opcion = 0;

        do {
            try {
                mostrarMenu();
                opcion = entrada.nextInt();
                switch (opcion) {
                    case 1:
                        añadirCliente(mapaClientes);
                        break;
                    case 2:
                        mostrarClientes(mapaClientes);
                        break;
                    case 3:
                        buscarClienteId(mapaClientes);
                        break;
                    case 4:
                        eliminarCliente(mapaClientes);
                        break;
                    case 5:
                        añadirReparacion(mapaClientes);
                        break;
                    case 6:
                        ordenarPorId(mapaClientes);
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
