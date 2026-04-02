package ejercicio11t11alumnos;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * Implementa un programa en el que crees la clase Alumno con los atributos dni
 * (String), número de expediente (int) y nota media (float).
 *
 * • Tu programa deberá mostrar las siguientes opciones:
 *
 * • Añadir alumno.
 *
 * • Mostrar alumnos (ordenados de menor a mayor número de expediente).
 *
 * • Buscar por número de expediente.
 *
 * • Mostrar alumnos por nota.
 *
 * • Utiliza como ED un conjunto.
 *
 * @author KevinNS
 */
public class Ejercicio11T11Alumnos {

    /**
     * Método que pide al usuario los datos del alumno y los añade al lista
     *
     * @param lista
     */
    public static void añadirAlumno(Set<Alumno> lista) {
        Scanner entrada = new Scanner(System.in);

        // Pedimos los datos del alumno al usuario
        System.out.println("Introduco DNI: ");
        String dni = entrada.nextLine();
        System.out.println("Nº de expediente: ");
        int expediente = entrada.nextInt();
        System.out.println("Nota media: ");
        float notaMedia = entrada.nextFloat();
        entrada.nextLine();

        // Al añadirlo al TreeSet se usa el compareTo para ponerlo en su sitio
        lista.add(new Alumno(dni, expediente, notaMedia));
        System.out.println("Alumno registrado correctamente");
    }

    /**
     * Método que muestra los alumnos ordenados de menro a mayor
     *
     * @param lista
     */
    public static void mostrarAlumnoOrdenados(Set<Alumno> lista) {
        // Comprobamos si el conjunto está vacío
        if (lista.isEmpty()) {
            System.out.println("No hay alumnos en el sistema");
            return;
        }
        System.out.println("----LISTA DE ALUMNOS ORDENADOS (MENOR A MAYOR)----");
        // Recorremos el conjunto entero con for each
        for (Alumno alumno : lista) {
            System.out.println("DNI: " + alumno.getDni() + " | Espediente: "
                    + alumno.getNumExpediente() + " | Nota media: " + alumno.getNotaMedia());
        }
    }

    /**
     * Método que busca un alumno por su número de expediente indicado por el
     * usuario
     *
     * @param lista
     */
    public static void buscarAlumnoExpediente(Set<Alumno> lista) {
        Scanner entrada = new Scanner(System.in);

        // Pedimos al usuario el expediente a buscar
        System.out.println("Introduce el expediente a localizar: ");
        int buscado = entrada.nextInt();

        // Como en los Sets no hay índices(0, 1, 2...), necesitamos un Iterador
        Iterator<Alumno> it = lista.iterator();
        Alumno encontrado = null; // Variable para guardar el resultado si lo encontramos

        // Creamos un bucle while para la búsqueda
        while (it.hasNext() && encontrado == null) {
            Alumno actual = it.next(); // Sacamos al siguiente alumno de la lista
            if (actual.getNumExpediente() == buscado) { // Comparamos expedientes
                encontrado = actual; // Si coincide lo guardamos
            }
        }
        // Si lo hemos encontrado lo mostramos
        if (encontrado != null) {
            System.out.println("LOCALIZADO: El DNI es: " + encontrado.getDni()
                    + " con nota: " + encontrado.getNotaMedia());
        } else {
            System.out.println("No existe ningún alumno con el expediente: " + buscado);
        }
    }

    /**
     * Método que muestra al alumno por la nota que introduzca el usuario
     *
     * @param lista
     */
    public static void mostrarPorNota(Set<Alumno> lista) {
        Scanner entrada = new Scanner(System.in);

        // Pedimos al usuario la nota media a buscar
        System.out.println("Introduce la nota media a buscar: ");
        float notaBuscada = entrada.nextFloat();
        boolean encontrado = false; // Para saber si hay al menos uno

        System.out.println("Alumnos con nota: " + notaBuscada + ": ");
        // Usamos un for each para mirar a todos
        for (Alumno alumno : lista) {
            if (alumno.getNotaMedia() == notaBuscada) { // Si la nota coincide...
                System.out.println("- DNI: " + alumno.getDni() + " (Exp: "
                        + alumno.getNumExpediente() + ")");
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Nadie tiene exactamente esa nota");
        }
    }

    /**
     * Método que muestra el menú
     */
    public static void mostrarMenu() {
        System.out.println("---------------------------------------------------");
        System.out.println("-----------------GESTION ALLUMNOS------------------");
        System.out.println("----------------1. Añadir alumno-------------------");
        System.out.println("----------------2. Mostrar alumnos(menor a mayor)--");
        System.out.println("----------------3. Buscar por num expediente-------");
        System.out.println("----------------4. Mostrar alumnos por nota--------");
        System.out.println("----------------5. SALIR DEL MENU------------------");
        System.out.println("---------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Creamos un TreeSet ya que nos piden que los alumnos estén ordenados
        Set<Alumno> conjuntoAlumnos = new TreeSet<>();

        // Creamos el menú controlando excepciones
        int opcion = 0;

        do {
            try {
                mostrarMenu();
                opcion = entrada.nextInt();

                switch (opcion) {
                    case 1:
                        añadirAlumno(conjuntoAlumnos);
                        break;
                    case 2:
                        mostrarAlumnoOrdenados(conjuntoAlumnos);
                        break;
                    case 3:
                        buscarAlumnoExpediente(conjuntoAlumnos);
                        break;
                    case 4:
                        mostrarPorNota(conjuntoAlumnos);
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
