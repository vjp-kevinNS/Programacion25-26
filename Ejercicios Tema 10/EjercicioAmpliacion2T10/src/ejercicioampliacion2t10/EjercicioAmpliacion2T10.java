package ejercicioampliacion2t10;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Una vez se ha probado por nuestro departamento de Testing el programa
 * anterior, nuestro analista decide detallar un programa algo más complejo. En
 * esta segunda versión, nuestro programa debe funcionar para 3 viviendas.
 *
 * Nuestro programa mostrará un menú que permita las siguientes opciones:
 *
 * 1. Rellenar viviendas (Añadiremos las direcciones de las viviendas, pero NO
 * añadiremos actividades).
 *
 * 2. Añadir actividad (Preguntaremos al usuario la posición de la vivienda
 * donde insertar la actividad)
 *
 * 3. Mostrar viviendas (Mostraremos la información de la vivienda junto con sus
 * actividades).
 *
 * 4. Mostrar actividades para toda la familia (las de todas las viviendas).
 *
 * 5. Mostrar actividades por tipo. (Pediremos al usuario qué tipo de actividad
 * desea mostrar).
 *
 * 6. Mostrar número de actividades (de entre todas las viviendas).
 *
 * 7. Salir del programa.
 *
 * @author KevinNS
 */
public class EjercicioAmpliacion2T10 {
    
    /**
     * Método que añade las direcciones de las viviendas con los datos intruducidos
     * por el usuario
     * 
     * @param casas 
     */
    public static void añadirDireccion(Vivienda[] casas){
        Scanner entrada = new Scanner (System.in);
        
        // Recorremos con un for normal ya que el tamaño es fijo (3)
        for (int i = 0; i < casas.length; i++) {
            // Pedimos la dirección al usuario
            System.out.println("Introduce dirección para la vivienda " + i + ": ");
            String direccion = entrada.nextLine();
            
            // Creamos el objeto Vivienda y lo metemos en el hueco i del vector
            casas[i] = new Vivienda(direccion);     
        }
        System.out.println("Direcciones guardadas");
    }
    
    /**
     * Método que añade la actividad a la vivienda que elija el usuario, además 
     * de pedir los datos de la actividad
     * 
     * @param casas 
     */
    public static void añadirActividad(Vivienda[] casas){
        Scanner entrada = new Scanner(System.in);
        int posicion = -1;
        
        // Creamos un bucle while para asegurar que el usuario mete una posición válida (0, 1, 2)
        while (posicion < 0 || posicion >= casas.length) {            
            // Pedimos la posición al usuario
            System.out.println("¿En qué posición de vivienda quieres añadir?: ");
            posicion = entrada.nextInt();
            
            // Si introduce una posición no válida lo decimos
            if (posicion < 0 || posicion >= casas.length) {
                System.out.println("Error. Posición incorrecta");
            }
        }
        // Comprobamos si la vivienda ha sido creada en la opción 1
        if (casas[posicion] == null) {
            System.out.println("Esa vivienda no tiene dirección");
            return;
        }
        entrada.nextLine(); // Limpiamos buffer
        // Pedimos al usuario los datos de la actividad
        System.out.println("Nombre actividad: ");
        String nombreAct = entrada.nextLine();
        System.out.println("Tipo: ");
        String tipoAct = entrada.nextLine();
        System.out.println("¿Es familiar? (si/no): ");
        String respuesta= entrada.nextLine();
        boolean familiar = respuesta.equalsIgnoreCase("si");
        
        // Añadimos la actividad al ArrayList de la vivienda elegida
        casas[posicion].getListaActividades().add(new Actividad(nombreAct, tipoAct, familiar));
        System.out.println("Actividad añadida a la vivienda " + posicion);
    }
    
    /**
     * Método que muestra todas las viviendas
     * 
     * @param casas 
     */
    public static void mostrarViviendas(Vivienda[] casas){
        // Recorremos el vector de 3 viviendas
        for (Vivienda casa : casas) {
            if (casa != null) { // Solo si el hueco noi está vacío
                System.out.println("VIVIENDA EN: " + casa.getDireccion());
                // Recorremos la lista de actividades de la vivienda
                for (Actividad act : casa.getListaActividades()) {
                    System.out.println("-> " + act.getNombre() + " (" + act.getTipo() + ")");
                }
            }
        }
    }
    
    /**
     * Método que muestra todas las actividades familiares
     * 
     * @param casas 
     */
    public static void mostrarTodasActFamiliares(Vivienda[] casas){
        System.out.println("---ACTIVIDADES FAMILIARES---");
        for (Vivienda casa : casas) {
            if (casa != null) {
                for (Actividad act : casa.getListaActividades()) {
                    if (act.isFamiliar()) { // Filtro booleano
                        System.out.println("-> " + act.getNombre() + "(En "+ casa.getDireccion() + ")");
                    }
                }
            }
        }
    }
    
    /**
     * Método que muestra el tipo de actividades que el usuario elija
     * 
     * @param casas 
     */
    public static void mostrarActPorTipo(Vivienda[] casas){
        Scanner entrada = new Scanner(System.in);
        
        // Preguntamos al usuario qué actividad busca
        System.out.println("¿Qué tipo de actividad buscas?: ");
        String actBuscada = entrada.nextLine();
        
        for (Vivienda casa : casas) {
            if (casa != null) {
                for (Actividad act : casa.getListaActividades()) {
                    if (act.getTipo().equalsIgnoreCase(actBuscada)) {
                        System.out.println("-> " + act.getNombre() + " [Casa: " 
                                + casa.getDireccion() + "]");
                    }
                }
            }
        }
    }
    
    /**
     * Método que muestra el número total de actividades creadas
     * 
     * @param casas 
     */
    public static void mostrarNumActividades(Vivienda[] casas){
        int acumulador = 0;
        for (Vivienda casa : casas) {
            if (casa != null) {
                // Sumamos el tamaño de cada lista individual
                acumulador += casa.getListaActividades().size();
            }
        }
        System.out.println("Total de actividades registradas entre las 3 viviendas: " 
                + acumulador );
    }

    /**
     * Método que muestra el menú
     */
    public static void mostrarMenu() {
        System.out.println("---------------------------------------------------");
        System.out.println("-----------------GESTION 3 VIVIENDAS---------------");
        System.out.println("----------------1. Añadir dirección----------------");
        System.out.println("----------------2. Añadir actividades--------------");
        System.out.println("----------------3. Mostrar viviendas---------------");
        System.out.println("----------------4. Mostrar actividades familiares--");
        System.out.println("----------------5. Mostrar actividades por tipo----");
        System.out.println("----------------6. Mostrar número de actividades---");
        System.out.println("----------------7. SALIR DEL MENU------------------");
        System.out.println("---------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Creamos el vector: Un array de 3 posiciones para guardar objetos Vivienda
        Vivienda[] viviendas = new Vivienda[3];

        // Creamos el menú controlando excpeciones
        int opcion = 0;
        do {
            try {
                mostrarMenu();
                opcion = entrada.nextInt();
                switch (opcion) {
                    case 1:
                        añadirDireccion(viviendas);
                        break;
                    case 2:
                        añadirActividad(viviendas);
                        break;
                    case 3:
                        mostrarViviendas(viviendas);
                        break;
                    case 4:
                        mostrarTodasActFamiliares(viviendas);
                        break;
                    case 5:
                        mostrarActPorTipo(viviendas);
                        break;
                    case 6:
                        mostrarNumActividades(viviendas);
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
