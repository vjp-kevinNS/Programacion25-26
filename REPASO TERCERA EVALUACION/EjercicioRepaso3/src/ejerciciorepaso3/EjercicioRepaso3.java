package ejerciciorepaso3;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * Modelo-Matrícula-Planta-Número de aparcamiento
 *
 * Añadir un aparcamiento
 *
 * Mostrar todos los aparcamientos
 *
 * Buscar mi coche
 *
 * Añadir aparcamiento (comprobando que no esté repetido)
 *
 * @author KevinNS
 */
public class EjercicioRepaso3 {

    /**
     * Método que añade aparcamientos pidiendole los datos al usuario
     *
     * @param lista
     */
    public static void añadirAparcamiento(ArrayList<Aparcamiento> lista) {
        Scanner entrada = new Scanner(System.in);

        // Pedimos los datos al usuario
        System.out.println("Modelo del coche: ");
        String modeloUsu = entrada.nextLine();
        System.out.println("Matrícula del coche: ");
        String matriUsu = entrada.nextLine();
        System.out.println("Planta del aparcamiento: ");
        int plantaUsu = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Número de aparcamiento: ");
        int numAparcUsu = entrada.nextInt();
        entrada.nextLine();

        // Creamos el nuevo aparcamiento
        Aparcamiento miAparcamiento = new Aparcamiento(modeloUsu, matriUsu, plantaUsu, numAparcUsu);

        // Añadimos el aparcamiento a la lista
        lista.add(miAparcamiento);
    }

    /**
     * Método que muestra todos los aparcamientos
     *
     * @param lista
     */
    public static void mostrarTodos(ArrayList<Aparcamiento> lista) {
        // Recorremos la lista
        for (Aparcamiento aparcamiento : lista) {
            System.out.println(aparcamiento);
        }
    }

    /**
     * Método que busca la matricula elegida por el usuario y muestra donde está
     * aparcado
     *
     * @param lista
     */
    public static void buscarCoche(ArrayList<Aparcamiento> lista) {
        Scanner entrada = new Scanner(System.in);

        // Preguntamos al usuario por la matrícula a buscar
        System.out.println("¿Qué matrícula estás buscando?: ");
        String matriculaUsu = entrada.nextLine();

        // Recorremos la lista
        for (Aparcamiento aparcamiento : lista) {
            if (aparcamiento.getMatricula().equalsIgnoreCase(matriculaUsu)) {
                System.out.println("El vehículo con matrícula " + aparcamiento.getMatricula()
                        + " está aparcado en la planta " + aparcamiento.getPlanta()
                        + " con el número de aparcamiento " + aparcamiento.getNumAparcamiento());
            }
        }
    }

    public static void añadirAparcamientoComprobandoRepetido(ArrayList<Aparcamiento> lista) {
        Scanner entrada = new Scanner(System.in);

        // Pedimos los datos al usuario: Modelo-Matrícula-Planta-Número de aparcamiento
        System.out.println("Modelo del vehículo: ");
        String modeloUsu = entrada.nextLine();
        System.out.println("Matrícula del vehículo: ");
        String matriculaUsu = entrada.nextLine();
        System.out.println("Planta del aparcamiento: ");
        int plantaUsu = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Número de aparcamiento: ");
        int numAparcamiento = entrada.nextInt();
        entrada.nextLine();

        // Creamos el aparcamiento
        Aparcamiento nuevoAparcamiento = new Aparcamiento(modeloUsu, matriculaUsu, plantaUsu, numAparcamiento);

        boolean duplicado = false;

        // Recorremos la lista
        for (Aparcamiento aparcamiento : lista) {
            if (aparcamiento.getMatricula().equalsIgnoreCase(matriculaUsu)) {
                duplicado = true;
            }
        }
        if (duplicado == true) {
            System.out.println("No puedes aparcar el coche por que ya está aparcado");
        } else {
            System.out.println("Aparcamiento creado");
            lista.add(nuevoAparcamiento);
        }
    }    
        /**
         * Método que muestra el menú
         */
    public static void mostrarMenu() {
        System.out.println("GESTION DE APARCAMIENTOS");
        System.out.println("1. Añadir aparcamiento");
        System.out.println("2. Mostrar todos los aparcamientos");
        System.out.println("3. Buscar mi coche");
        System.out.println("4.          ");
        System.out.println("5.          ");
        System.out.println("6.          ");
        System.out.println("7. Salir del menú...");
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Creamos la lista de aparcamientos
        ArrayList<Aparcamiento> listaAparcar = new ArrayList<>();

        // Creamos el menu controlando excepciones
        int opcion = 0;

        do {
            try {
                mostrarMenu();
                opcion = entrada.nextInt();
                switch (opcion) {
                    case 1:
                        añadirAparcamientoComprobandoRepetido(listaAparcar);
                        break;
                    case 2:
                        mostrarTodos(listaAparcar);
                        break;
                    case 3:
                        buscarCoche(listaAparcar);
                        break;
                    case 4:

                        break;
                    case 5:

                        break;
                    case 6:

                        break;
                    case 7:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción incorrecta");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error. Has introducido una letra");
            }

        } while (opcion != 7);
    }
}
