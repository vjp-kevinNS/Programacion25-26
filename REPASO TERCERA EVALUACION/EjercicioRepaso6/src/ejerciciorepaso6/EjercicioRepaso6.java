package ejerciciorepaso6;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Crear clase alumno(nombre, apellido, edad y arraylist de notas) Clase
 * asignatura (nombre y nota)
 *
 * Menu:
 *
 * Añadir alumno con sus notas
 *
 * Mostrar alumno con sus notas
 *
 * Mostrar alumno con nota más alta
 *
 * @author KevinNS
 */
public class EjercicioRepaso6 {

    /**
     * Método que añadio un alumno con su nota pidiendole los datos al usuario
     *
     * @param lista
     */
    public static void añadirAlumno(ArrayList<Alumno> lista) {
        Scanner entrada = new Scanner(System.in);

        // Pedimos los datos al usuario
        System.out.println("Nombre alumno: ");
        String nombreAlumno = entrada.nextLine();
        System.out.println("Apellido alumno: ");
        String apellidoAlumno = entrada.nextLine();
        System.out.println("Edad alumno: ");
        int edadAlumno = entrada.nextInt();
        entrada.nextLine();

        // Creamos un ArrayList de asignatura
        ArrayList<Asignatura> notasAlumno = new ArrayList<>();

        String pedir;

        // Creamos un do while para pedir asignaturas hasta que el usuario diga
        do {
            System.out.println("¿Quieres añadir una asignatura?(si/no)");
            pedir = entrada.nextLine();

            if (pedir.equalsIgnoreCase("si")) {
                // Pedimos los datos de la asignatura al usuario
                System.out.println("Nombre asignatura: ");
                String nombreAsignatura = entrada.nextLine();
                System.out.println("Nota alumno: ");
                float notaAlumno = entrada.nextFloat();
                entrada.nextLine();

                // Creamos la asignatura
                Asignatura nuevaAsignatura = new Asignatura(nombreAsignatura, notaAlumno);

                // Añadimos la asignatura a la lista
                notasAlumno.add(nuevaAsignatura);
            }

        } while (pedir.equalsIgnoreCase("si"));
        // Creamos un alumno
        Alumno nuevoAlumno = new Alumno(nombreAlumno, apellidoAlumno, edadAlumno, notasAlumno);

        // Añadimos el alumno a la lista
        lista.add(nuevoAlumno);
    }

    /**
     * Método que muestra los alumnos con sus notas
     *
     * @param lista
     */
    public static void mostrarAlumnos(ArrayList<Alumno> lista) {
        // Recorremos la lista de alumnos
        for (Alumno alumno : lista) {
            System.out.println("El alumno " + alumno.getNombreAlumno() + " con apellido: "
                    + alumno.getApellidoAlumno() + " con la edad: " + alumno.getEdadAlumno());

            // Recorremos la lsita de asignaturas
            for (Asignatura asignatura : alumno.getNotas()) {
                System.out.println("Nombre asignatura " + asignatura.getNombreAsignatura()
                        + " tiene esta nota: " + asignatura.getNota());

            }
        }
    }

    /**
     * Método que muestra el alumno con la notas más alta 
     * 
     * @param lista 
     */
    public static void alumnoConNotaMasAlta(ArrayList<Alumno> lista) {
        int auxiliar = 0;
        Alumno alumnoMax = new Alumno();

        // Recorremos la lista de alumnos
        for (Alumno alumno : lista) {            
            int sumaNotas = 0;
            
            // Recorremos la lsita de asignaturas
            for (Asignatura asignatura : alumno.getNotas()) {
                sumaNotas += asignatura.getNota();
                
            }
            if (sumaNotas > auxiliar) {
                alumnoMax = alumno;
            }
    
        }
        System.out.println("El alumno con mas nota: " + alumnoMax.getNombreAlumno());
    }

    /**
     * Método que muestra el menú
     */
    public static void mostrarMenu() {
        System.out.println("GESTION DE ALUMNOS");
        System.out.println("1. Añadir alumno con sus notas");
        System.out.println("2. Mostrar alumno con sus notas");
        System.out.println("3. Mostrar alumno con nota más alta");
        System.out.println("4. ");
        System.out.println("5. ");
        System.out.println("6. Salir del menú...");
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Creamos la lista de alumno
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();

        // Creamos el menu controlando excepciones
        int opcion = 0;

        do {
            try {
                mostrarMenu();
                opcion = entrada.nextInt();
                switch (opcion) {
                    case 1:
                        añadirAlumno(listaAlumnos);
                        break;
                    case 2:
                        mostrarAlumnos(listaAlumnos);
                        break;
                    case 3:
                        alumnoConNotaMasAlta(listaAlumnos);
                        break;
                    case 4:

                        break;
                    case 5:

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
