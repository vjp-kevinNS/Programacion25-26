package ejerciciorepaso;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Creamos un ArrayList de persona
 *
 * 1. Añadir una persona
 *
 * 2. Añadir personas hasta que el usuario diga
 *
 * 3. Mostrar todas las personas
 *
 * 4. Mostrar personas con mas edad
 *
 * @author KevinNS
 */
public class EjercicioRepaso {

    /**
     * Método que añade una persona a la lista con los datos introducidos por el
     * usuario
     *
     * @param listaPersona
     */
    public static void añadirPersona(ArrayList<Persona> listaPersona) {
        Scanner entrada = new Scanner(System.in);

        // Pedimos al usuario los datos de la persona
        System.out.println("Introduce los datos de la persona: ");
        System.out.println("Id: ");
        int id = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Nombre: ");
        String nombre = entrada.nextLine();
        System.out.println("Apellidos: ");
        String apellidos = entrada.nextLine();
        System.out.println("Edad: ");
        int edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Correo Electrónico: ");
        String correo = entrada.nextLine();

        // Creamos la persona
        Persona nuevaPersona = new Persona(id, nombre, apellidos, edad, correo);

        // Añadimos la persona a la lista
        listaPersona.add(nuevaPersona);
    }

    /**
     * Método que añade personas mientras el usuario quiera
     *
     * @param listaPersona
     */
    public static void añadirHastaQueQuieraUsuario(ArrayList<Persona> listaPersona) {
        Scanner entrada = new Scanner(System.in);
        // Creamos un do while que se repetirá hasta que el usuario quiera
        String añadirPersonaString;
        do {
            System.out.println("¿Quieres añadir a otra persona? (s/n)");
            añadirPersonaString = entrada.nextLine();

            if (añadirPersonaString.equalsIgnoreCase("s")) {
                añadirPersona(listaPersona);
                System.out.println("Persona añadida con éxito");
            }

        } while (añadirPersonaString.equalsIgnoreCase("s"));
    }

    /**
     * Método que muestra todas las personas creadas
     *
     * @param listaPersona
     */
    public static void mostrarTodasLasPersonas(ArrayList<Persona> listaPersona) {
        // Creamos un for each para recorred toda la lista
        for (Persona persona : listaPersona) {
            System.out.println("Se añadió a la lista: " + persona);
        }
    }

    /**
     * Método que muestra la persona con más edad
     *
     * @param listaPersona
     */
    public static void mostrarPersonaMasEdad(ArrayList<Persona> listaPersona) {
        // Creamos un objeto persona
        Persona nuevaPersona = new Persona(0, "", "", 0, "");
        // Recorremos la lista
        for (Persona persona : listaPersona) {
            if (persona.getEdad() > nuevaPersona.getEdad()) {
                nuevaPersona = persona;

            }
        }
        System.out.println("La persona con mas edad es: " + nuevaPersona);
    }

    /**
     * Método que muestra el menú
     */
    public static void mostrarMenu() {
        System.out.println("GESTION DE PERSONAS");
        System.out.println("1. Añadir persona");
        System.out.println("2. Añadir personas hasta que el usuario quiera");
        System.out.println("3. Mostrar todas las personas");
        System.out.println("4. Mostrar personas con mas edad");
        System.out.println("5. Salir del menú...");
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Creamos el ArrayList de persona
        ArrayList<Persona> listaPersonas = new ArrayList<>();

        // Creamos el menú controlando excepciones
        int opcion = 0;
        do {
            try {
                mostrarMenu();
                opcion = entrada.nextInt();
                switch (opcion) {
                    case 1:
                        añadirPersona(listaPersonas);
                        break;
                    case 2:
                        añadirHastaQueQuieraUsuario(listaPersonas);
                        break;
                    case 3:
                        mostrarTodasLasPersonas(listaPersonas);
                        break;
                    case 4:
                        mostrarPersonaMasEdad(listaPersonas);
                        break;
                    case 5:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción incorrecta");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error. Has introducido una letra");
                entrada.nextLine();
            }

        } while (opcion != 5);
    }

}
