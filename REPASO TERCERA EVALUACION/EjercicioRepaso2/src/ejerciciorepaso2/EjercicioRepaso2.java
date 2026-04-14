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

    public static void añadirHastaQueUsuarioDiga(ArrayList<Persona>lista){
        Scanner entrada = new Scanner(System.in);
        String respuesta; // Para la respuesta del usuario(si/no)
        
        while (lista.) {            
            
        }
        
    }
    
//    public static void mostrarPersonas(ArrayList<Persona> lista) {
//        // Recorremos la lista
//        for (Persona persona : lista) {
//            System.out.println(persona + " ");
//        }
//    }
    
    public static void buscarPersonaNombre(ArrayList<Persona>lista){
        
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

                        break;
                    case 3:
                        mostrarPersonas(persona);
                        break;
                    case 4:

                        break;
                    case 5:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción incorrecta");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error. Has introducido una letra");
            }

        } while (opcion != 5);
    }

}
