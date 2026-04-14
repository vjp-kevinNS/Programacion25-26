package ejerciciorepaso2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * * Creamos un ArrayList de persona
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
public class EjercicioRepaso2 {

    public static void añadirPersona(ArrayList<Persona> lista) {
        Scanner entrada = new Scanner(System.in);

        // Pedimos al usuario los datos 
        System.out.println("Indica el ID: ");
        int idUsu = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Indica el nombre: ");
        String nombreUsu = entrada.nextLine();
        System.out.println("Indica los apellidos: ");
        String apellidosUsu = entrada.nextLine();
        System.out.println("Indica la edad: ");
        int edadUsu = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Indica el email: ");
        String emailUsu = entrada.nextLine();

        // Creamos la persona
        Persona nuevaPersona = new Persona(idUsu, nombreUsu, apellidosUsu, edadUsu, emailUsu);

        // Añadimos la persona a la lista
        lista.add(nuevaPersona);

    }

    public static void mostrarPersonas(ArrayList<Persona> lista) {
        // Recorremos la lista
        for (Persona persona : lista) {
            System.out.println(persona + " ");
        }
    }

    public static void buscarPersonaNombre(ArrayList<Persona> lista) {
        Scanner entrada = new Scanner(System.in);

        // Preguntamos al usuario el nombre a buscar
        System.out.println("¿Qué nombre quires buscar?: ");
        String nombreUsu = entrada.nextLine();

        boolean encontrado = false; // Para indicar si se ha encontrado ese nombre
        Persona auxiliar; // Para guardar a la persona si se ha encontrado

        // Recorremos la lista
        for (Persona persona : lista) {
            if (persona.getNombre().equalsIgnoreCase(nombreUsu)) {
                auxiliar = persona;
                encontrado = true;
            }
        }

        if (encontrado == false) {
            System.out.println("No se ha encontrado a la persona con ese nombre");
        } else {
            System.out.println("Se ha encontrado a la persona con el nombre: " + nombreUsu);
        }
    }

    public static void eliminarEdadMenor(ArrayList<Persona> lista) {
        Scanner entrada = new Scanner(System.in);
        int contador = 0; // Para indicar cuántas personas se han borrado

        // Pedimos al usuario la edad a buscar
        System.out.println("Introduce la edad para eliminar la que sea menor: ");
        int edadUsu = entrada.nextInt();

        // Recorremos la lista
        for (Persona persona : lista) {
            if (persona.getEdad() < edadUsu) {
                lista.remove(persona);
                contador++;
            }
        }
        System.out.println("Personas borradas con éxito. Se han borrado: " + contador);
    }
    

    public static void clonarListaPorEdad(ArrayList<Persona> lista) {
        Scanner entrada = new Scanner(System.in);
        int contador = 0; // Para indicar cuántas personas de han añadido

        // Creamos una lista vacía
        ArrayList<Persona> nuevaLista = new ArrayList<>();

        // Pedimos al usuario la edad para añadirla a la nueva lista
        System.out.println("Introduce la edad: ");
        int edadUsu = entrada.nextInt();

        // Recorremos la lista
        for (Persona persona : lista) {
            if (persona.getEdad() == edadUsu) {
                nuevaLista.add(persona);
                contador++;
            }

        }
        System.out.println("Se han añadido " + contador + " personas con la edad: " + edadUsu);
        // Mostramos la nueva lista
        mostrarPersonas(nuevaLista);
    }

    /**
     * Método que muestra el menú
     */
    public static void mostrarMenu() {
        System.out.println("GESTION DE PERSONAS");
        System.out.println("1. Añadir persona");
        System.out.println("2. Mostrar todas las personas");
        System.out.println("3. Buscar persona por nombre");
        System.out.println("4. Eliminar persona con la edad menor indicada");
        System.out.println("5. Clonar lista por edad");
        System.out.println("6. Salir del menú...");
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Creamos un ArrayList de persona
        ArrayList<Persona> persona = new ArrayList<>();

        // Creamos el menú controlando excepciones
        int opcion = 0;

        do {
            try {
                mostrarMenu();
                opcion = entrada.nextInt();
                switch (opcion) {
                    case 1:
                        añadirPersona(persona);
                        break;
                    case 2:
                        mostrarPersonas(persona);
                        break;
                    case 3:
                        buscarPersonaNombre(persona);
                        break;
                    case 4:
                        eliminarEdadMenor(persona);
                        break;
                    case 5:
                        clonarListaPorEdad(persona);
                        break;
                    case 6:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción incorrecta");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error. Has introducido una letra");
            }

        } while (opcion != 6);
    }

}
