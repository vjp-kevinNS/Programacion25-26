package ejerciciorepaso15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

/**
 * Una empresa quiere gestionar supermercados.
 *
 * Se dispone de un ArrayList de ciudades.
 *
 * Cada Ciudad tendrá: Nombre-Un conjunto de supermercados
 *
 * Cada Supermercado tendrá: Nombre-Ventas anuales
 *
 * MENÚ:
 *
 * Añadir ciudad con supermercados
 *
 * Mostrar ciudades y supermercados
 *
 * Mostrar supermercados con ventas superiores a la media
 *
 * Buscar supermercado por nombre
 *
 * Añadir supermercado a ciudad
 *
 * Mostrar supermercados ordenados por ventas
 *
 * @author KevinNS
 */
public class EjercicioRepaso15 {

    /**
     * Método que añade ciudades con sus supermercados
     *
     * @param lista
     */
    public static void añadirCiudadYSuper(ArrayList<Ciudad> lista) {
        Scanner entrada = new Scanner(System.in);

        // Pedimos los datos de la ciudad
        System.out.println("Nombre ciudad: ");
        String nombreCiudad = entrada.nextLine();

        // Creamos el conjunto de supermercados
        Set<Supermercado> conjuntoSupermercados = new HashSet<>();

        // Creamos un do while
        String nuevoSuper;

        do {
            // Preguntamos si quiere añadir un supermercado
            System.out.println("¿Quieres añadir un supermercado?: ");
            nuevoSuper = entrada.nextLine();

            if (nuevoSuper.equalsIgnoreCase("si")) {
                // Pedimos los datos del supermercado
                System.out.println("Nombre del supermercado: ");
                String nombreSuper = entrada.nextLine();
                System.out.println("Ventas anuales: ");
                float ventas = entrada.nextFloat();
                entrada.nextLine();

                // Guardamos el supermercado
                Supermercado superAñadido = new Supermercado(nombreSuper, ventas);

                // Lo añadimos al conjunto
                conjuntoSupermercados.add(superAñadido);

                System.out.println("Supermercado añadido");
            }

        } while (nuevoSuper.equalsIgnoreCase("si"));
        // Creamos la ciudad
        Ciudad nuevaCiudad = new Ciudad(nombreCiudad, conjuntoSupermercados);

        // La añadimos a la lista
        lista.add(nuevaCiudad);
    }

    /**
     * Método que muestra las ciudades con sus supermercados
     *
     * @param lista
     */
    public static void mostrarCiudadesYSuper(ArrayList<Ciudad> lista) {
        // Recorremos las ciudades
        for (Ciudad ciudad : lista) {
            System.out.println("Nombre ciudad -> " + ciudad.getNombreCiudad());

            // Recorremos los supermercados
            for (Supermercado supermercado : ciudad.getConjuntoSupermercado()) {
                System.out.println("Nombre supermercado -> " + supermercado.getNombreSuper()
                        + " | Ventas anuales -> " + supermercado.getVentasAnuales());
            }
        }
    }

    /**
     * Método que muestra el supermercado con las ventas anuales superior a la
     * media
     *
     * ESTE METODO SIEMPRE SE ME OLVIDA COMO SE HACE!!!!!!!
     *
     * @param lista
     */
    public static void mostrarSuperConVentasSuperiorAMedia(ArrayList<Ciudad> lista) {
        // Comprobamos si la lista está vacía
        if (lista.isEmpty()) {
            System.out.println("La lista está vacía");

        } else {
            // Recorremos las ciudades
            for (Ciudad ciudad : lista) {
                // Creamos las variables que usaremos en la operación
                int contador = 0;
                float suma = 0;

                // Recorremos los supermercados
                for (Supermercado supermercado : ciudad.getConjuntoSupermercado()) {
                    suma += supermercado.getVentasAnuales();
                    contador++;
                }
                if (contador > 0) {
                    float media = suma / contador;

                    // Recorremos otra vez los supermercados
                    for (Supermercado supermercado : ciudad.getConjuntoSupermercado()) {
                        if (supermercado.getVentasAnuales() > media) {
                            System.out.println("El supermercado con ventas mayor que la media es: "
                                    + supermercado.getNombreSuper() + " con unas ventas anuales de: "
                                    + supermercado.getVentasAnuales());
                        }
                    }
                }
            }
        }
    }

    /**
     * Método que añade un supermercado a una ciudad
     * 
     * @param lista 
     */
    public static void añadirSupermercadoACiudad(ArrayList<Ciudad> lista) {
        Scanner entrada = new Scanner(System.in);

        // Comprobamos si la lista está vacía
        if (lista.isEmpty()) {
            System.out.println("La lista está vacía");

        } else {
            // Pedimos el nombre de la ciudad a la que añadir el supermercado
            System.out.println("Introduce el nombre de la ciudad: ");
            String ciudadBuscada = entrada.nextLine();
            
            // Recorremos las ciudades
            for (Ciudad ciudad : lista) {
                
                // Recorremos los supermecados
                for (Supermercado supermercado : ciudad.getConjuntoSupermercado()) {
                    
                    // Pedimos los datos del supermercado
                    System.out.println("Nombre del supermercado: ");
                    String nuevoSuper = entrada.nextLine();
                    System.out.println("Ventas anuales: ");
                    float ventasAnuales = entrada.nextFloat();
                    entrada.nextFloat();
                    
                    // Guardamos el supermercado
                    Supermercado superAñadido = new Supermercado(nuevoSuper, ventasAnuales);
                    
                    // Lo añadimos a la lista
                    ciudad.getConjuntoSupermercado().add(superAñadido);
                }
            }
            
        }
    }

    /**
     * Método que muestra el supermercado por su nombre
     *
     * @param lista
     */
    public static void buscarSuperPorNombre(ArrayList<Ciudad> lista) {
        Scanner entrada = new Scanner(System.in);

        // Comprobamos si la ista está vacía
        if (lista.isEmpty()) {
            System.out.println("La lista está vacía");

        } else {
            // Pedimos el nombre del supermercado
            System.out.println("Introduce el nombre del supermercado: ");
            String superBuscado = entrada.nextLine();

            boolean encontrado = false;

            // Recorremos las ciudades
            for (Ciudad ciudad : lista) {

                // Recorremos los supermercados
                for (Supermercado supermercado : ciudad.getConjuntoSupermercado()) {
                    if (supermercado.getNombreSuper().equalsIgnoreCase(superBuscado)) {
                        encontrado = true;
                        System.out.println("Se ha encontrado el super con el nombre "
                                + supermercado.getNombreSuper());
                    }

                }
            }
            if (encontrado == false) {
                System.out.println("No hay ningún supermercado con ese nombre");
            }
        }
    }

    /**
     * Método que muestra los supermercados ordenados
     *
     * @param lista
     */
    public static void mostrarOrdenados(ArrayList<Ciudad> lista) {
        Scanner entrada = new Scanner(System.in);

        // Creamos un ArrayList de supermercado
        ArrayList<Supermercado> listaSuper = new ArrayList<>();

        // Comprobamos si la lista está vacía
        if (lista.isEmpty()) {
            System.out.println("La lista está vacía");

        } else {
            // Recorremos las ciudades
            for (Ciudad ciudad : lista) {
                // Recorremos los supermercados
                for (Supermercado supermercado : ciudad.getConjuntoSupermercado()) {

                    // Lo añadimos a la lista
                    listaSuper.add(supermercado);
                }
            }
            // Lo ordenamos con Collections.Sort
            Collections.sort(listaSuper);

            // Volvemos a recorrer los supermercados
            for (Supermercado supermercado : listaSuper) {
                System.out.println(supermercado);
            }
        }

    }

    /**
     * Método que muestra el menú
     */
    public static void mostrarMenu() {
        System.out.println("GESTION DE SUPERMERCADO");
        System.out.println("1. Añadir ciudad con supermercados");
        System.out.println("2. Mostrar ciudades y supermercados");
        System.out.println("3. Mostrar supermercados con ventas superiores a la media");
        System.out.println("4. Buscar supermercado por nombre");
        System.out.println("5. Añadir supermercado a ciudad");
        System.out.println("6. Mostrar supermercados ordenados por ventas");
        System.out.println("7. Salir del menú...");
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Creamos la lista de ciudades
        ArrayList<Ciudad> listaCiudades = new ArrayList<>();

        // Creamos el menú controlando excepciones
        int opcion = 0;

        do {
            try {
                mostrarMenu();
                opcion = entrada.nextInt();
                switch (opcion) {
                    case 1:
                        añadirCiudadYSuper(listaCiudades);
                        break;
                    case 2:
                        mostrarCiudadesYSuper(listaCiudades);
                        break;
                    case 3:
                        mostrarSuperConVentasSuperiorAMedia(listaCiudades);
                        break;
                    case 4:
                        buscarSuperPorNombre(listaCiudades);
                        break;
                    case 5:
                        añadirSupermercadoACiudad(listaCiudades);
                        break;
                    case 6:
                        mostrarOrdenados(listaCiudades);
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
