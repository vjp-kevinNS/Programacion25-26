package ejerciciorepaso12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 * Una importante empresa multinacional nos ha solicitado un programa para
 * gestionar las distintas sedes que tiene repartidas a lo largo del mundo. Para
 * ello, dispondremos de un arrayList de ciudades.
 *
 * De cada ciudad, almacenaremos su nombre y un conjunto de sedes (elige el tipo
 * de conjunto que prefieras).
 *
 * • De cada sede almacenaremos el nombre de la sede y sus ingresos anuales.
 *
 * • Implementa las siguientes opciones para el software:
 *
 * • Añadir una ciudad(al menos pediremos los datos de una sede. Después de
 * añadir cada sede, preguntaremos al usuario si desea seguir añadiendo sedes).
 *
 * • Mostrar todas las ciudades junto con sus sedes.
 *
 * • Método que muestre el nombre de las sedes cuyos ingresos anuales son
 * superiores a la media.
 *
 * • Buscar por nombre de sede. (El método retornará un booleano).
 *
 * • Añadir sede (pediremos el nombre de la ciudad y, si ésta existe en el
 * arrayList, pediremos los datos de la nueva sede y los insertaremos).
 *
 * • Mostrar todas las sedes ordenadas de mayor a menor número de ingresos
 * anuales
 *
 * (PISTA: Utiliza una estructura de datos donde ir añadiendo todas las sedes de
 * manera ordenada).
 *
 * @author KevinNS
 */
public class EjercicioRepaso12 {

    /**
     * Método que añade ciudades con sus sede
     *
     * @param lista
     */
    public static void añadirCiudad(ArrayList<Ciudad> lista) {
        Scanner entrada = new Scanner(System.in);

        // Pedimos los datos de la ciudad
        System.out.println("Nombre de la ciudad: ");
        String nombreCiudad = entrada.nextLine();

        // Creamos el Set de Sedes
        Set<Sede> conjuntoSede = new HashSet<>();

        // Creamos el do while para que se añadan sedes hasta que el usuario quiera
        String nuevaSede;

        do {
            System.out.println("¿Quieres añadir más sedes?: ");
            nuevaSede = entrada.nextLine();

            if (nuevaSede.equalsIgnoreCase("si")) {
                // Pedimos los datos de la sede
                System.out.println("Nombre de la sede: ");
                String nombreSede = entrada.nextLine();
                System.out.println("Ingresos anuales: ");
                float ingresosAnuales = entrada.nextFloat();
                entrada.nextLine();

                // Creamos la sede
                Sede sedeAñadida = new Sede(nombreSede, ingresosAnuales);

                // La añadimos al conjunto
                conjuntoSede.add(sedeAñadida);
            }

        } while (nuevaSede.equalsIgnoreCase("si"));

        // Creamos la ciudad
        Ciudad nuevaCiudad = new Ciudad(nombreCiudad, conjuntoSede);

        // La añadimos a la lista
        lista.add(nuevaCiudad);
    }

    /**
     * Método que muestra las ciudades con sus sedes
     *
     * @param lista
     */
    public static void mostrarCiudadesYSedes(ArrayList<Ciudad> lista) {
        // Recorremos las ciudades
        for (Ciudad ciudad : lista) {
            System.out.println("Nombre de la ciudad: " + ciudad.getNombreCiudad());

            // Recorremos las sedes
            for (Sede sede : ciudad.getConjuntoSedes()) {
                System.out.println("Nombre de la sede: " + sede.getNombreSede()
                        + " | Sus ingresos anuales son: " + sede.getIngresosAnuales());
            }
        }
    }

    /**
     * Método que calcula le media de ingresos anuales de las sedes
     *
     * @param lista
     */
    public static void sedesSobreMedia(ArrayList<Ciudad> lista) {
        // Creamos las variables para usarlas en la operación
        float total = 0;
        int contador = 0;

        // Recorremos las ciudades
        for (Ciudad ciudad : lista) {
            // Recorremos las sedes
            for (Sede sede : ciudad.getConjuntoSedes()) {
                contador++;
                total += sede.getIngresosAnuales();
            }
        }
        float media = total / contador;

        System.out.println("MEDIA DE TODAS LAS SEDES: " + media);

        System.out.println("SEDES CON INGRESOS SUPERIOR A LA MEDIA:");
        // Recorremos las ciudades
        for (Ciudad ciudad : lista) {
            // Recorremos las sedes
            for (Sede sede : ciudad.getConjuntoSedes()) {

                if (sede.getIngresosAnuales() > media) {
                    System.out.println(sede);
                }
            }
        }
    }

    /**
     * Método que busca la sede introducida por el usuarioo
     *
     * @param lista
     */
    public static void buscarSedes(ArrayList<Ciudad> lista) {
        Scanner entrada = new Scanner(System.in);

        // Comprobamos si la lista está vacía
        if (lista.isEmpty()) {
            System.out.println("No hay ninguna ciudad añadida");
            return;
        }

        // Pedimos el nombre de la sede
        System.out.println("Indica el nombre de la sede que buscas: ");
        String nombreBuscado = entrada.nextLine();

        boolean encontrado = false;
        int contador = 0;

        // Creamos un while para recorrer las ciudades
        while (contador < lista.size() || encontrado == false) {
            Iterator<Sede> it = lista.get(contador).getConjuntoSedes().iterator();
            contador++;

            // Recorremos las sedes
            while (it.hasNext() || encontrado == false) {
                Sede sede = it.next();

                if (sede.getNombreSede().equalsIgnoreCase(nombreBuscado)) {
                    System.out.println("Sede: " + sede);
                    encontrado = true;
                }
            }
        }
        if (encontrado == false) {
            System.out.println("No hay ninguna sede con ese nombre");
        }
    }

    /**
     * Método que añade una sede a la ciudad eelegida por el usuario
     * 
     * @param lista 
     */
    public static void añadirSede(ArrayList<Ciudad> lista) {
        Scanner entrada = new Scanner(System.in);

        // Comprobamos si la lista está vacía
        if (lista.isEmpty()) {
            System.out.println("No hay ciudades en la lista");
            
        } else {
            // Preguntamos a que ciudad quiere añadir la sede
            System.out.println("¿A qué ciudad quieres añadir una sede?: ");
            String ciudadBuscada = entrada.nextLine();

            // Recorremos las ciudades
            for (Ciudad ciudad : lista) {

                if (ciudad.getNombreCiudad().equalsIgnoreCase(ciudadBuscada)) {

                    // Pedimos los datos de la sede
                    System.out.println("Nombre de la sede: ");
                    String nombreSede = entrada.nextLine();
                    System.out.println("Ingresos anuales: ");
                    float ingresosAnuales = entrada.nextFloat();
                    entrada.nextLine();

                    // Guardamos esa sede
                    Sede sedeAñadida = new Sede(nombreSede, ingresosAnuales);

                    // La añadimos a la ciudad
                    ciudad.getConjuntoSedes().add(sedeAñadida);

                }
            }
        }

    }
    
    /**
     * Método que usando el compareTo ordena las sedes de menor a mayor ingresos
     * 
     * @param lista 
     */
    public static void mostrarSedesMayorAMenorIngresos(ArrayList<Ciudad> lista){
        // Creamos un ArrayList de sedes
        ArrayList<Sede>nuevaListaSedes = new ArrayList<>();
        
        // Recorremos las ciudades
        for (Ciudad ciudad : lista) {
            
            // Recorremos las sedes
            for (Sede sede : ciudad.getConjuntoSedes()) {
                nuevaListaSedes.add(sede);
            }
        }
        // Ordenamos la lista de nuevas sedes
        Collections.sort(nuevaListaSedes);
        
        // Hacemos un for para mostrar la nueva lsita
        for (Sede sede : nuevaListaSedes) {
            System.out.println(sede);
        }
       
    }

    /**
     * Método que muestra el menú
     */
    public static void mostrarMenu() {
        System.out.println("---------------------------------------------------");
        System.out.println("---------------GESTION MULTINACIONAL---------------");
        System.out.println("----------------1. Añadir ciudad y sedes-----------");
        System.out.println("----------------2. Mostrar ciudades y sedes--------");
        System.out.println("----------------3. Sedes sobre la media------------");
        System.out.println("----------------4. Buscar sede---------------------");
        System.out.println("----------------5. Añadir sede---------------------");
        System.out.println("-------6. Mostrar sedes mayor a menor ingresos-----");
        System.out.println("----------------7. SALIR DEL MENU------------------");
        System.out.println("---------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Creamos la lista de Ciudad
        ArrayList<Ciudad> listaCiudades = new ArrayList<>();

        // Creamos el menú controlando excepciones
        int opcion = 0;
        do {
            try {
                mostrarMenu();
                opcion = entrada.nextInt();
                switch (opcion) {
                    case 1:
                        añadirCiudad(listaCiudades);
                        break;
                    case 2:
                        mostrarCiudadesYSedes(listaCiudades);
                        break;
                    case 3:
                        sedesSobreMedia(listaCiudades);
                        break;
                    case 4:
                        buscarSedes(listaCiudades);
                        break;
                    case 5:
                        añadirSede(listaCiudades);
                        break;
                    case 6:
                        mostrarSedesMayorAMenorIngresos(listaCiudades);
                        break;
                    case 7:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción incorrecta");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error. Has introducido una letra");
                entrada.nextLine();
            }

        } while (opcion != 7);

    }

}
