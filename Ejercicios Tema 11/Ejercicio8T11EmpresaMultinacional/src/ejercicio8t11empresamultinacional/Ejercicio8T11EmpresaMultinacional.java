package ejercicio8t11empresamultinacional;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

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
public class Ejercicio8T11EmpresaMultinacional {

    /**
     * Método que añade una ciudad con al menos una sede con los datos que diga
     * el usuario
     *
     * @param lista
     */
    public static void añadirCiudad(ArrayList<Ciudad> lista) {
        Scanner entrada = new Scanner(System.in);

        // Pedimos al usuario el nombre de la ciudad
        System.out.println("Nombre de la ciudad: ");
        String ciudadNom = entrada.nextLine();

        // Creamos el objeto ciudad
        Ciudad nueva = new Ciudad(ciudadNom);

        // Creamos un bucle para añadir sedes mientras el usuario quiera
        String respuesta;
        do {
            System.out.println("Nombre de la sede: ");
            String sedeNom = entrada.nextLine();
            System.out.println("Ingresos: ");
            double ingresos = entrada.nextDouble();
            entrada.nextLine();

            // Añadimos al Set
            nueva.getConjuntoSedes().add(new Sede(sedeNom, ingresos));

            System.out.println("¿Deseas añadir otra sede en " + ciudadNom + "? (S/N): ");
            respuesta = entrada.nextLine();

        } while (respuesta.equalsIgnoreCase("S")); // Repite si dice si

        // Añadimos la ciudad completo a la lsita global
        lista.add(nueva);
    }

    /**
     * Método que muestra todas las ciudades con sus sedes
     *
     * @param lista
     */
    public static void mostrarCiudadesSedes(ArrayList<Ciudad> lista) {
        // Recorremos cada ciudad de la lista
        for (Ciudad ciudad : lista) {
            System.out.println("CIUDAD: " + ciudad.getNombreCiudad());
            // Recorremos el Set de sedes de esa ciudad
            for (Sede sede : ciudad.getConjuntoSedes()) {
                System.out.println("-> " + sede.getNombreSede() + ": "
                        + sede.getIngresos() + "€");
            }
        }
    }

    /**
     * Método que muestra las sedes con ingresos superiores a la media
     *
     * @param lista
     */
    public static void sedesSuperioresMedia(ArrayList<Ciudad> lista) {
        double sumaTotal = 0;
        int totalSedes = 0;

        // Usamoas for each para calcular la media global
        for (Ciudad ciudad : lista) {
            for (Sede sede : ciudad.getConjuntoSedes()) {
                sumaTotal += sede.getIngresos();
                totalSedes++;
            }
        }
        if (totalSedes == 0) // Evitamos dividir entre 0
        {
            return;
        }
        double media = sumaTotal / totalSedes;
        System.out.println("Media global: " + media + "€. Sedes que la superan:");

        //  Creamos un segundo for each para mostrar solo las que superen la media
        for (Ciudad ciudad : lista) {
            for (Sede sede : ciudad.getConjuntoSedes()) {
                if (sede.getIngresos() > media) {
                    System.out.println("-> " + sede.getNombreSede()
                            + " (" + sede.getIngresos() + "€)");
                }
            }
        }

    }

    /**
     * Método que busca una sede
     *
     * @param lista
     * @param buscada
     * @return
     */
    public static boolean buscarSede(ArrayList<Ciudad> lista, String buscada) {
        int i = 0;
        boolean encontrada = false;

        // Creamos un while para recorres la lista de ciudades
        while (i < lista.size() && !encontrada) {
            // Sacamos el iterador del conjunto de sedes de la ciudad actual
            Iterator<Sede> it = lista.get(i).getConjuntoSedes().iterator();

            // Creamos otro while para buscar dentro del conjunto
            while (it.hasNext() && !encontrada) {
                if (it.next().getNombreSede().equalsIgnoreCase(buscada)) {
                    encontrada = true; // Paramos si la localizamos
                }
            }
            i++;
        }
        return encontrada; // Retornamos el resultado booleano
    }

    /**
     * Método auxiliar para el menú de búsqueda
     *
     * @param lista
     */
    public static void buscarSedeMenu(ArrayList<Ciudad> lista) {
        Scanner entrada = new Scanner(System.in);

        // Indicamos al usuario que introduzca la sede a buscar
        System.out.println("Nombre de la sede a localizar: ");
        String nombreSede = entrada.nextLine();

        if (buscarSede(lista, nombreSede)) {
            System.out.println("RESULTADO: la sede existe");
        } else {
            System.out.println("RESULTRADO: sede no encontrada");
        }

    }

    /**
     * Método que añade una sede a una ciudad existente
     * 
     * @param lista 
     */
    public static void añadirSedeACiudad(ArrayList<Ciudad> lista) {
        Scanner entrada = new Scanner(System.in);

        // Preguntamos al usuario en que ciudad queire añadir la sede
        System.out.println("¿En qué ciudad quieres añadir la sede?: ");
        String ciudadUsu = entrada.nextLine();

        // Creamos un bucle while para buscar la ciudad por nombre
        int i = 0;
        Ciudad encontrada = null;

        while (i < lista.size() && encontrada == null) {
            if (lista.get(i).getNombreCiudad().equalsIgnoreCase(ciudadUsu)) {
                encontrada = lista.get(i);
            }
            i++;
        }
        // Si la ciudad existe, pedimos datos de la sede
        if (encontrada != null) {
            System.out.println("Nombre de la nueva sede: ");
            String nombreSede = entrada.nextLine();
            System.out.println("Ingresos: ");
            double ingresos = entrada.nextDouble();
            entrada.nextLine();
            
            // Se isnerta ordenada por el TreeSet
            encontrada.getConjuntoSedes().add(new Sede(nombreSede, ingresos));
            System.out.println("Sede añadida con éxito");
        }else{
            System.out.println("Error: Esa ciudad no está registrada");
        }
        
    }
    
    /**
     * Método que ordena las sedes con los ingresos de mayor a menor 
     * 
     * @param lista 
     */
    public static void mostrarIngMayorAMenor(ArrayList<Ciudad> lista){
        // Creamos un TreeSet temporal para volcar todas las sedes y que se ordenen entre sí
        TreeSet<Sede> rankingGlobal = new TreeSet<>();
        for (Ciudad ciudad : lista) {
            rankingGlobal.addAll(ciudad.getConjuntoSedes()); // Metemos todas las sedes de cada ciudad
        }
        System.out.println("---RANKING MUNDIAL DE INGRESOS---");
        for (Sede sede : rankingGlobal) { // Listado final con for each
            System.out.println(sede.getIngresos() + "€ -> " + sede.getNombreSede());
        }
    }

    /**
     * Método que muestra el menú
     */
    public static void mostrarMenu() {
        System.out.println("---------------------------------------------------");
        System.out.println("-----------------GESTION MULTINACIONAL-------------");
        System.out.println("----------------1. Añadir ciudad-------------------");
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

        // Creamos la lista global de ciudades
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
                        mostrarCiudadesSedes(listaCiudades);
                        break;
                    case 3:
                        sedesSuperioresMedia(listaCiudades);
                        break;
                    case 4:
                        buscarSedeMenu(listaCiudades);
                        break;
                    case 5:
                        añadirSedeACiudad(listaCiudades);
                        break;
                    case 6:
                        mostrarIngMayorAMenor(listaCiudades);
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
