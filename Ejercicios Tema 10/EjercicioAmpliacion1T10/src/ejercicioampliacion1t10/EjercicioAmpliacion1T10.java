package ejercicioampliacion1t10;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Una empresa que realiza encuestas de hábitos en familia nos ha pedido que
 * desarrollemos un software para recopilar información sobre las actividades
 * lúdicas de varias viviendas del país, para así aportar ideas a todos los
 * hogares.
 *
 * El analista ha decidido detallar en un cuaderno de carga una primera versión
 * de prueba para una sola vivienda. Para poder desarrollarla necesitaremos:
 *
 * - Una clase Actividad, que almacenará el nombre de la actividad a realizar,
 * el tipo de actividad (String) y un booleano, que estará a true cuando dicha
 * actividad sea para toda la familia y false en caso contrario.
 *
 * - Una clase Vivienda, que almacenará un String dirección y las actividades
 * que se realicen en esa vivienda (Elige la estructura de datos que creas más
 * conveniente para almacenar las actividades de la vivienda).
 *
 * Nuestro programa mostrará un menú que permita las siguientes opciones:
 *
 * 1. Añadir actividad (Se añadirán de una en una).
 *
 * 2. Mostrar actividades.
 *
 * 3. Mostrar actividades para toda la familia.
 *
 * 4. Mostrar actividades por tipo. (Pediremos al usuario qué tipo de actividad
 * desea mostrar).
 *
 * 5. Mostrar número de actividades.
 *
 * 6. Salir del programa.
 *
 * @author KevinNS
 */
public class EjercicioAmpliacion1T10 {
    
    /**
     * Método que añade una actividad a la vivienda con los datos introducidos 
     * por el usuario
     * 
     * @param vivienda 
     */
    public static void añadirActividad(Vivienda vivienda){
        Scanner entrada = new Scanner(System.in);
        
        // Pedimos al usuario los datos de la actividad
        System.out.println("Introduce los datos de la NUEVA ACTIVIDAD: ");
        System.out.println("Nombre de la actividad: ");
        String nombre = entrada.nextLine();
        System.out.println("Tipo de actividad: ");
        String tipo = entrada.nextLine();
        System.out.println("¿Es para toda la familia? (si/no): ");
        String respuesta = entrada.nextLine();
        
        // Convertimos el text "si" en true y cualquier otra cosa en false
        boolean esFamiliar = respuesta.equalsIgnoreCase("si");
        
        // Creamos el objeto Actividad y lo guardamos en el ArrayList de la vivienda
        vivienda.getListaActividades().add(new Actividad(nombre, tipo, esFamiliar));
        System.out.println("Actividad guardada con éxito");
    }
    
    /**
     * Método que muestra todas las asctividades creadas e indica si es apta o no
     * para toda la familia
     * 
     * @param vivienda 
     */
    public static void mostrarActividades(Vivienda vivienda){
        int num = 1; // Contador para poner "ACTIVIDAD 1, ACTIVIDAD 2..."
        
        // Creamos un bucle for each por cada actividad que haya en la lista de la vivienda
        for (Actividad actividad : vivienda.getListaActividades()) {
            System.out.println("ACTIVIDAD " + num + ": ");
            System.out.println("Nombre: " + actividad.getNombre());
            System.out.println("Tipo: " + actividad.getTipo());
            
            // Comprobamos el booleano para poner un mensaje
            if (actividad.isFamiliar()) {
                System.out.println("Recomendada para toda la familia");
            }else{
                System.out.println("NO recomendada para todas la familia");
            }
            num++; // Incrementamos el contador para la siguiente
        }
    }
    
    /**
     * Método que muestra la actividad por familia si es true
     * 
     * @param vivienda 
     */
    public static void mostrarPorFamiliares(Vivienda vivienda){
        System.out.println("---LISTA FAMILIAR---");
        // Recorremos la lista completa
        for (Actividad actividad : vivienda.getListaActividades()) {
            // Si el atributo familiar es true, imprimimos
            if (actividad.isFamiliar()) {
                System.out.println("-> " + actividad.getNombre());
            }
        }
        
    }
    
    /**
     * Método que muestra la actividad por tipo
     * 
     * @param vivienda 
     */
    public static void mostrarPorTipo(Vivienda vivienda){
        Scanner entrada = new Scanner(System.in);
        
        // Preguntamos al usuario que tipo de actividad quiere buscar
        System.out.println("¿Què tipo de actividad deseas buscar?");
        String actBuscada = entrada.nextLine();
        
        System.out.println("Actividades de tipo " + actBuscada + ": ");
        // Recorremos la lista buscando coincidencias
        for (Actividad actividad : vivienda.getListaActividades()) {
            if (actividad.getTipo().equalsIgnoreCase(actBuscada)) {
                System.out.println("-> " + actividad.getNombre());
            }
        }
    }
    
    public static void MostrarNumActividades(Vivienda vivienda){
        // Consultamos el tamaño actual del ArrayList usando .size que devuelve 
        // el total de elementos de la lista
        int total = vivienda.getListaActividades().size();
        System.out.println("Actualmente hay " + total + " actividades registradas en la vivienda");
    }

    /**
     * Método que muestra el menú
     */
    public static void mostrarMenu() {
        System.out.println("---------------------------------------------------");
        System.out.println("-----------------GESTION ACTIVIDADES---------------");
        System.out.println("----------------1. Añadir actividad----------------");
        System.out.println("----------------2. Mostrar actividades-------------");
        System.out.println("----------------3. Mostrar actividades para familia");
        System.out.println("----------------4. Mostrar actividades por tipo----");
        System.out.println("----------------5. Mostrar número actividades------");
        System.out.println("----------------6. SALIR DEL MENU------------------");
        System.out.println("---------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Creamos un objeto vivienda
        Vivienda nuevaVivienda = new Vivienda("Calle Falsa 123");

        // Creamos el menú controlando excepciones
        int opcion = 0;
        do {
            try {
                mostrarMenu();
                opcion = entrada.nextInt();
                switch (opcion) {
                    case 1:
                        añadirActividad(nuevaVivienda);
                        break;
                    case 2:
                        mostrarActividades(nuevaVivienda);
                        break;
                    case 3:
                        mostrarPorFamiliares(nuevaVivienda);
                        break;
                    case 4:
                        mostrarPorTipo(nuevaVivienda);
                        break;
                    case 5:
                        MostrarNumActividades(nuevaVivienda);
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
