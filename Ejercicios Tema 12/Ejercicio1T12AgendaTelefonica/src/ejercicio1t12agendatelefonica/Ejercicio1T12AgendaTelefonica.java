package ejercicio1t12agendatelefonica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Ayudándote de la clausula throws, realiza el siguiente programa con listas y
 * capturando todas las excepciones que te sean posibles:
 *
 * • Implementa una aplicación en Java que escriba una agenda telefónica con los
 * siguientes atributos para cada contacto:
 *
 * • Nombre • Edad • Número de móvil
 *
 * • Además, crearás un menú que le permita al usuario las siguientes opciones:
 *
 * 1. Añadir contactos a la agenda: Pediremos los datos de un contacto al
 * usuario y lo introducimos en la lista.
 *
 * 2. Visualizar la lista de contactos.
 *
 * 3. Eliminar contactos de la lista: Pediremos el número de teléfono y
 * eliminamos el contacto.
 *
 * 4. Mostrar todos los contactos ordenados por su edad.
 *
 * 5. Salir del programa.
 *
 * • Hasta que el usuario no pulse 5 no saldremos del programa y se volverá a
 * mostrar el menú.
 *
 * @author KevinNS
 */
public class Ejercicio1T12AgendaTelefonica {
    
    /**
     * Método que pide los datos del contacto al usuario y lo añade a la lista
     * 
     * Además delegamos el control de excepciones al main
     * 
     * @param lista
     * @throws Exception 
     */
    public static void añadirContacto(ArrayList<Contacto>lista)throws Exception{
        Scanner entrada = new Scanner(System.in);
        
        // Pedimos los datos del contacto al usuario
        System.out.println("Introduce el nombre: ");
        String nombreCont = entrada.nextLine();
        System.out.println("Introduce la edad: ");
        int edadCont = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Introduce número de teléfono: ");
        String numCont = entrada.nextLine();
        
        // Creamos el contacto y lo añadimos a la lista
        lista.add(new Contacto(nombreCont, edadCont, numCont));
        
        System.out.println("Contacto guardado con éxito");
        
    }
    
    /**
     * Método que muestra todos los contactos creados
     * 
     * @param lista 
     */
    public static void visualizarListaContactos(ArrayList<Contacto>lista){
        // Comprobamos si la lista está vacía
        if (lista.isEmpty()) {
            System.out.println("La agenda no tiene contactos todavía");
        }else{
            // Recorremos y mostramos
            System.out.println("---LISTA DE CONTACTOS---");
            for (Contacto contacto : lista) {
                System.out.println(contacto.toString());
            }
        }
    }
    
    /**
     * Método que elimina el contacto preguntale al usuario que número quiere
     * eliminar
     * 
     * Además delegamos el control de excepciones al main
     * 
     * @param lista
     * @throws Exception 
     */
    public static void eliminarContacto(ArrayList<Contacto>lista)throws Exception{
        Scanner entrada = new Scanner(System.in);
        
        // Pedimos al usuario que nos indique el número de móvil que quiere borrar
        System.out.println("Indica el número de móvil que quires eliminar de la lista de cotnactos: ");
        String telBuscado = entrada.nextLine();
        
        // Lo sacamos de la lista
        Iterator<Contacto> it = lista.iterator();
        boolean borrado = false; // Para saber si lo encontramos
        
        // Mientras queden elementos y no hayamos borrado nada...
        while (it.hasNext() && !borrado) {            
            Contacto actual = it.next(); // Saltamos al siguiente contacto
            // Comparamos el teléfono
            if (actual.getNumMovil().equals(telBuscado)) { // Comparamos el teléfono
                it.remove(); // El iterador borra el contacto de la lista
                borrado = true;
            }
        }
        if (borrado) {
            System.out.println("Contacto eliminado");
        }else{
            System.out.println("No se encontró ningún contacto con ese teléfono");
        }
    }
    
    /**
     * Método que ordena la lista de contactos por edad y los muestra
     * 
     * @param lista 
     */
    public static void mostrarOrdenados(ArrayList<Contacto>lista){
        // Si hay menos de 2, no hace falta ordenar
        if (lista.size() < 2) {
            System.out.println("Necesitas al menos 2 contactos para ordenar");
            return;
        }
        
        // Usamos Collections.sort para ordenar la lista automáticamente por edad
        Collections.sort(lista);
        System.out.println("---AGENDA ORDENADA POR EDAD(menor a mayor): ");
        // Aprovechamso el método de visualizar para mostrar el resultado
        visualizarListaContactos(lista);
    }

    /**
     * Método que muestra el menú
     */
    public static void mostrarMenu() {
        System.out.println("---------------------------------------------------");
        System.out.println("-----------------AGENDA TELEFONICA-----------------");
        System.out.println("-----------------1.Añadir contactos----------------");
        System.out.println("-----------------2.Visualizar lista contactos------");
        System.out.println("-----------------3.Eliminar contacto---------------");
        System.out.println("-----------------4.Mostrar contactos ordenados-----");
        System.out.println("-----------------5.SALIR DEL PROGRAMA--------------");
        System.out.println("---------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Creamos la lista de contactos
        ArrayList<Contacto> agenda = new ArrayList<>();

        // Creamos el menú controlando excepciones
        int opcion = 0;

        do {
            try {
                mostrarMenu();
                opcion = entrada.nextInt();

                switch (opcion) {
                    case 1:
                        añadirContacto(agenda);
                        break;
                    case 2:
                        visualizarListaContactos(agenda);
                        break;
                    case 3:
                        eliminarContacto(agenda);
                        break;
                    case 4:
                        mostrarOrdenados(agenda);
                        break;
                    case 5:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción incorrecta");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error. Has intruducido una letra");
                entrada.nextLine();
            } catch (Exception e) {
                System.out.println("Error desconocido");
                entrada.nextLine();
            }

        } while (opcion != 5);

    }

}
