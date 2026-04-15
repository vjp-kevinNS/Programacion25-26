package ejerciciorepaso4;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Clase Restaurante: Nombre–Tipo de cocina–Número de mesas–Dirección
 *
 * Añadir un restaurante
 *
 * Mostrar todos los restaurantes
 *
 * Buscar un restaurante por palabra introducida
 *
 * Añadir restaurante (comprobando que no esté repetido)
 *
 * Eliminar restaurante
 *
 * @author KevinNS
 */
public class EjercicioRepaso4 {

    /**
     * Método que añade un restaurante a la lista con los datos proporcionados
     * por el usuario
     *
     * @param lista
     */
    public static void añadirRestaurante(ArrayList<Restaurante> lista) {
        Scanner entrada = new Scanner(System.in);

        // Pedimos al usuario los datos del restaurante
        System.out.println("Introduce el nombre: ");
        String nombreRest = entrada.nextLine();
        System.out.println("¿Qué tipo de cocina es: ?");
        String tipoCocina = entrada.nextLine();
        System.out.println("¿Cuántas mesas tiene: ?");
        int numMesas = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Dirección del restaurante: ");
        String direccion = entrada.nextLine();

        // Creamos el restaurante
        Restaurante nuevoRestaurante = new Restaurante(nombreRest, tipoCocina, numMesas, direccion);

        // Añadimos el restaurante a la lista
        lista.add(nuevoRestaurante);
    }

    /**
     * Método que muestra todos los restaurantes
     *
     * @param lista
     */
    public static void mostrarRestaurantes(ArrayList<Restaurante> lista) {
        // Comprobamos is la lista está vacía
        if (lista.isEmpty()) {
            System.out.println("No hay restaurantes en la lista");
            return;
        }
        // Recorremos la lista
        for (Restaurante restaurante : lista) {
            System.out.println(restaurante); // Los mostramos
        }
    }

    /**
     * Método que busca los restaurantes que contienen la palabra introducida
     * por el usuario
     *
     * @param lista
     */
    public static void buscarRestauranteConPalabra(ArrayList<Restaurante> lista) {
        Scanner entrada = new Scanner(System.in);
        
        // Comprobamos si la lista está vacía
        if (lista.isEmpty()) {
            System.out.println("No hay restaurantes en la lista");
            return;
        }
        // Preguntamos al usuario la letra que debe contener el restaurante a mostrar
        System.out.println("¿Qué letra contiene el restaurante?: ");
        String palabraUsuario = entrada.nextLine();
        
        // Creamos un bucle while para la busqueda
        int contador = 0;
        boolean encontrado = false;

        while (contador < lista.size() || encontrado == false) {
            if (lista.get(contador).getNombreRest().toLowerCase().contains(palabraUsuario)) {
                encontrado = true;
                System.out.println("Restaurantes que contienen una letra a en su nombre: " + lista.get(contador));
            }
            contador++;
        }
        if (encontrado = false) {
            System.out.println("No se ha encontrado ningún restaurante que contenga la letra a en su nombre");
        }
    }

    /**
     * Método que, como el primero, añade restaurantes pidiendo los datos al usuario
     * pero comprobando si existe ya ese restaurante, que en ese caso nos dirá
     * que ese restaurante ya existe y no se puede añadir
     * 
     * @param lista 
     */
    public static void añadirComprobandoRepetidos(ArrayList<Restaurante> lista) {
        Scanner entrada = new Scanner(System.in);

        // Pedimos al usuario los datos del restaurante
        System.out.println("Introduce el nombre: ");
        String nombreRest = entrada.nextLine();
        System.out.println("¿Qué tipo de cocina es: ?");
        String tipoCocina = entrada.nextLine();
        System.out.println("¿Cuántas mesas tiene: ?");
        int numMesas = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Dirección del restaurante: ");
        String direccion = entrada.nextLine();
        
        // Creamos el restaurante
        Restaurante nuevoRestaurante2 = new Restaurante(nombreRest, tipoCocina, numMesas, direccion);
        
        boolean duplicado = false;
        
        // Recorremos la lista
        for (Restaurante restaurante : lista) {
            if (restaurante.getNombreRest().equalsIgnoreCase(nombreRest)) {
                duplicado = true;
            }
        }
        if (duplicado == true) {
            System.out.println("No se puede añadir el restaurante por que ya existe");
        }else{
            System.out.println("Restaurante añadido con éxito");
            // Lo añado a la lista
            lista.add(nuevoRestaurante2);
        }
        
    }
    
    /**
     * Método que elimina el restaurante elegido por el usuario
     * 
     * @param lista 
     */
    public static void eliminarRestaurante(ArrayList<Restaurante> lista){
        Scanner entrada = new Scanner(System.in);
        
        // Preguntamos al usuario el nombre del restaurante que quiere borrar
        System.out.println("¿Qué restaurante quieres eliminar de la lista?");
        String nombreUsu = entrada.nextLine();
        
        boolean encontrado = false;
        
        // IMPORTANTE YA QUE LO ESTABA HACIENDO MAL
        // Hay que usar Iterator y while:
        
        Iterator<Restaurante> it = lista.iterator();
        
        while (it.hasNext()) {            
            Restaurante restaurante = it.next();
            
            if (restaurante.getNombreRest().equalsIgnoreCase(nombreUsu)) {
                it.remove();
                encontrado = true;
            }
        }
        if (encontrado) {
            System.out.println("Se ha borrado el restaurante con el nombre " +nombreUsu);
        }else{
            System.out.println("No se ha encotnrado el restaurante");
        }

    }

    /**
     * Método que muestra el menú
     */
    public static void mostrarMenu() {
        System.out.println("GESTION DE COCINA");
        System.out.println("1. Añadir restaurante");
        System.out.println("2. Mostrar todos los restaurantes");
        System.out.println("3. Buscar un restaurante con palabra introducida");
        System.out.println("4. Añadir restaurante (comprobando repetidos)");
        System.out.println("5. Eliminar restaurante");
        System.out.println("6. Salir del menú...");
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Creamos la lista de restaurante
        ArrayList<Restaurante> listaRestaurante = new ArrayList<>();

        // Creamos el menu controlando excepciones
        int opcion = 0;

        do {
            try {
                mostrarMenu();
                opcion = entrada.nextInt();
                switch (opcion) {
                    case 1:
                        añadirRestaurante(listaRestaurante);
                        break;
                    case 2:
                        mostrarRestaurantes(listaRestaurante);
                        break;
                    case 3:
                        buscarRestauranteConPalabra(listaRestaurante);
                        break;
                    case 4:
                        añadirComprobandoRepetidos(listaRestaurante);
                        break;
                    case 5:
                        eliminarRestaurante(listaRestaurante);
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
