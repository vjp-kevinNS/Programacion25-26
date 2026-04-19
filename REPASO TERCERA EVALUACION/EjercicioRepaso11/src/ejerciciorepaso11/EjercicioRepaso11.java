package ejerciciorepaso11;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

/**
 * Se quiere desarrollar una aplicación para gestionar coches.
 *
 * Cada Coche tendrá: ID-Marca-Modelo-Una lista de revisiones
 *
 * Cada Revisión tendrá: Fecha-Descripción-Coste
 *
 * MENÚ:
 *
 * Añadir coche con revisiones
 *
 * Mostrar coches con sus revisiones
 *
 * Buscar coche por ID
 *
 * Eliminar coche
 *
 * Añadir revisión
 *
 * Calcular coste total
 *
 * Mostrar coches ordenados por ID
 *
 * @author KevinNS
 */
public class EjercicioRepaso11 {
    
    /**
     * Método que añade el coche con sus revisiones pidiendole los datos al
     * usuario
     * 
     * @param mapa 
     */
    public static void añadirCocheConRevisiones(Map<Integer, Coche> mapa){
        Scanner entrada = new Scanner(System.in);
        
        // Pedimos los datos del coche
        System.out.println("ID del coche: ");
        int idCoche = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Marca del coche: ");
        String marcaCoche = entrada.nextLine();
        System.out.println("Modelo del coche: ");
        String modeloCoche = entrada.nextLine();
        
        // Creamos la lista de revisión
        ArrayList<Revision>listaRevision = new ArrayList<>();
        
        // Creasmos un do while para que el usuario indique si quiere seguir añadiendo revisiones
        String nuevaRevision;
        
        do {
            System.out.println("¿Quieres añadir una revisión?(si/no): ");
            nuevaRevision = entrada.nextLine();
            
            if (nuevaRevision.equalsIgnoreCase("si")) {
                // Pedimos los datos de la revisión
                System.out.println("Descripción de la revisión: ");
                String descRevision = entrada.nextLine();
                System.out.println("Coste de la revisión: ");
                float costeRevision = entrada.nextFloat();
                entrada.nextLine();
                
                // Guardamos la revisión
                Revision revisionCoche = new Revision(LocalDate.now(), descRevision, costeRevision);
                
                // Añadimos la revisión a la lista
                listaRevision.add(revisionCoche);
            }
            
        } while (nuevaRevision.equalsIgnoreCase("si"));
        
        // Creamos el coche
        Coche cocheAñadido = new Coche(idCoche, marcaCoche, modeloCoche, listaRevision);
        
        // Añadimos el coche al map
        mapa.put(idCoche, cocheAñadido);
    }
    
    /**
     * Método que muestras los coches con sus revisiones
     * 
     * @param mapa 
     */
    public static void mostrarCochesConRevisiones(Map<Integer, Coche> mapa){
        // Recorremos el mapa de coches
        for (Coche coche : mapa.values()) {
            System.out.println("ID del coche -> " + coche.getIdCoche() 
                    + " | Marca del coche: " + coche.getMarcaCoche() + " | Modelo del coche: " 
                    + coche.getModeloCoche());
            
            // Recorremos la lista de revision
            for (Revision revision : coche.getListaRevisiones()) {
                System.out.println(revision);
            }
        }
    }
    
    /**
     * Método que busca un coche y su revisión por el ID que introduce el usuario
     * 
     * @param mapa 
     */
    public static void buscarCochesPorId(Map<Integer, Coche> mapa){
        Scanner entrada = new Scanner(System.in);
        
        // Pedimos el ID
        System.out.println("Introduce el ID del coche que buscas: ");
        int idBuscado = entrada.nextInt();
        entrada.nextLine();
        
        // Comprobamos si existe
        if (mapa.containsKey(idBuscado)) {
            
            // Guardamos el coche con ese ID
            Coche cocheConId = mapa.get(idBuscado);
            System.out.println("Se ha encontrado el coche con el ID " + idBuscado 
                    + " | Es el modelo: " + cocheConId.getModeloCoche());
            
            // Recorremos la lista de revision
            for (Revision revision : cocheConId.getListaRevisiones()) {
                System.out.println("Revisión: " + revision.getDescripcionRevision()
                        + " | Con un costo de: " + revision.getCosteRevision());
            }
        }else{
            System.out.println("No hay ningún coche con ese ID");
        }
    }
    
    /**
     * Método que elimina un coche con el ID proporcionado por el usuario
     * 
     * @param mapa 
     */
    public static void eliminarCoche(Map<Integer, Coche> mapa){
        Scanner entrada = new Scanner(System.in);
        
        // Pedimos el ID
        System.out.println("Introduce el ID del coche que quieres eliminar: ");
        int idBuscado = entrada.nextInt();
        entrada.nextLine();
        
        // Comprobamos si existe
        if (mapa.containsKey(idBuscado)) {
            mapa.remove(idBuscado);
            
            System.out.println("Se ha borrado el coche con el ID " + idBuscado);
            
        }else{
            System.out.println("No hay ningún coche con ese ID");
        }
    }
    
    /**
     * Método que añade una revisión al coche con el ID proporcionado por el
     * usuario
     * 
     * @param mapa 
     */
    public static void añadirRevision(Map<Integer, Coche> mapa){
        Scanner entrada = new Scanner(System.in);
        
        // Pedimos el ID 
        System.out.println("Introduce el ID para añadir una revisión: ");
        int idBuscado = entrada.nextInt();
        entrada.nextLine();
        
        // Comprobamos si existe
        if (mapa.containsKey(idBuscado)) {
            
            // Pedimos los datos de la revision
            System.out.println("Descripción de la revisión: ");
            String descRevision = entrada.nextLine();
            System.out.println("Coste de la revisión: ");
            float costeRevision = entrada.nextFloat();
            entrada.nextLine();
            
            // Creamos la revisión
            Revision revisionNueva = new Revision(LocalDate.now(), descRevision, costeRevision);
            
            // Guardamos el coche con ese ID
            Coche cocheRevision = mapa.get(idBuscado);
            
            // Añadimos el coche a la lista
            cocheRevision.getListaRevisiones().add(revisionNueva);
            
            // Actualizamos el mapa con los nuevos datos
            mapa.put(idBuscado, cocheRevision);
            
        }else{
            System.out.println("No hay ningún coche con ese ID");
        }
    }
    
    /**
     * Método que calcula el coste total de las revisiones
     * @param mapa 
     */
    public static void calcularCosteTotal(Map<Integer, Coche> mapa){
        Scanner entrada = new Scanner(System.in);
        
        // Pedimos el ID
        System.out.println("Introduce el ID: ");
        int idBuscado = entrada.nextInt();
        entrada.nextLine();
        
        // Comprobamos si existe 
        if (mapa.containsKey(idBuscado)) {
            
            // Guardamos el coche
            Coche cocheUsuario = mapa.get(idBuscado);
            
            double total = 0; // Variable para usarla en la operación
            
            // Recorremos la lista de revisión
            for (Revision revision : cocheUsuario.getListaRevisiones()) {
                total = revision.getCosteRevision();
            }
            System.out.println("Coste total de las revisiones: " + total + "€");
            
        }else{
            System.out.println("No hay ningún coche con ese ID" );
        }
    }
    
    /**
     * Método que meustra el coche con el ID introducido por el usuario
     * 
     * @param mapa 
     */
    public static void mostrarCochesPorId(Map<Integer, Coche> mapa){
       // Pasamos el mapa a ArrayList
       ArrayList<Coche>lista = new ArrayList<>(mapa.values());
       
       // Ordenamos usando el compareTo
       Collections.sort(lista);
       
       // Recorremos y mostramo ya ordenado 
        for (Coche coche : lista) {
            System.out.println("ID -> " + coche.getIdCoche());
            System.out.println(" Marca y modelo -> " + coche.getMarcaCoche() 
                    + " " + coche.getModeloCoche());
            
            // Recorremos las revisiones
            for (Revision revision : coche.getListaRevisiones()) {
                System.out.println(revision);
            }
        }
        
    }

    /**
     * Método que muestra el menú
     */
    public static void mostrarMenu() {
        System.out.println("GESTION DE COCHES");
        System.out.println("1. Añadir coche con revisiones");
        System.out.println("2. Mostrar coches con sus revisiones");
        System.out.println("3. Buscar coche por ID");
        System.out.println("4. Eliminar un coche");
        System.out.println("5. Añadir revisión a un coche");
        System.out.println("6. Calcular coste total");
        System.out.println("7. Mostrar coches ordenados por ID");
        System.out.println("8. Salir del menú...");
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        // Creamos el mapa de coche
        Map<Integer, Coche> mapaCoches = new HashMap<>();

        // Creamos el menú controlando excepciones
        int opcion = 0;

        do {
            try {
                mostrarMenu();
                opcion = entrada.nextInt();
                switch (opcion) {
                    case 1:
                        añadirCocheConRevisiones(mapaCoches);
                        break;
                    case 2:
                        mostrarCochesConRevisiones(mapaCoches);
                        break;
                    case 3:
                        buscarCochesPorId(mapaCoches);
                        break;
                    case 4:
                        eliminarCoche(mapaCoches);
                        break;
                    case 5:
                        añadirRevision(mapaCoches);
                        break;
                    case 6:
                        calcularCosteTotal(mapaCoches);
                        break;
                    case 7:
                        mostrarCochesPorId(mapaCoches);
                        break;
                    case 8:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción incorrecta");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error. Has introducidco una letra");
                entrada.nextLine();
            }

        } while (opcion != 8);

    }

}
