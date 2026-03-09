package ejerciciorepasoalumnos;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Crearemos una clase Alumno que tendrá como atributos: nombre, edad y nota.
 *
 * Crearemos un array de 10 alumnos.
 *
 * Crearemos un menú con las siguientes opciones:
 *
 * 1- Introducir los datos de los alumnos.
 *
 * 2- Mostrar todos los alumnos.
 *
 * 3- Mostrar el alumno con la nota más alta.
 *
 * 4- Mostrar los alumnos que tengan una nota mayor que la indicada por el
 * usuario.
 *
 * 5- Buscar un alumno por su nombre.
 *
 * 6- Ordenar los alumnos por nota de mayor a menor.
 *
 * 7- Mostrar la nota media de la clase.
 *
 * 8- Salir del programa.
 *
 * @author KevinNS
 */
public class EjercicioRepasoAlumnos {

    /**
     * Método que pide al usuario los datos de los alumnos para rellenar el
     * array
     *
     * @param alumnosClase
     */
    public static void rellenarClase(Alumno[] alumnosClase) {
        Scanner entrada = new Scanner(System.in);

        // Recorremos el array
        for (int i = 0; i < alumnosClase.length; i++) {

            // Pedimos al usuario los datos del alumno
            System.out.println("Nombre del alumno: ");
            String nombreAlumno = entrada.nextLine();
            System.out.println("Edad del alumno: ");
            int edadAlumno = entrada.nextInt();
            System.out.println("Nota del alumno: ");
            float notaAlumno = entrada.nextFloat();
            entrada.nextLine();

            // Creamos el objeto alumno con los datos introducidos
            alumnosClase[i] = new Alumno(nombreAlumno, edadAlumno, notaAlumno);

        }

    }

    /**
     * Método que muestra todos los alumnos de la clase
     *
     * @param alumnosClase
     */
    public static void mostrarAlumnos(Alumno[] alumnosClase) {

        // Recorremos el array
        for (int i = 0; i < alumnosClase.length; i++) {

            if (alumnosClase[i] != null) { // Controlamos nulos

                System.out.println("Mostrando alumnos de la clase: " + alumnosClase[i]);

            }

        }

    }

    /**
     * Método que muestra el alumno con la nota más alta
     *
     * @param alumnosClase
     */
    public static void alumnoConNotaMasAlta(Alumno[] alumnosClase) {
        // Creamos el objeto "alumnoNotaMasAlta"
        Alumno alumnoNotaMasAlta = new Alumno("", 0, 0);

        // Recorremos el array
        for (int i = 0; i < alumnosClase.length; i++) {

            if (alumnosClase[i] != null) { // Controlamos nulos

                if (alumnosClase[i].getNota() > alumnoNotaMasAlta.getNota()) {
                    alumnoNotaMasAlta = alumnosClase[i];
                }

            }

        }
        System.out.println("El alumno con la nota más alta es: " + alumnoNotaMasAlta);

    }

    /**
     * Método que muestra al alumno que tenga mayor nota a la indicada por el
     * usuario
     *
     * @param alumnosClase
     */
    public static void alumnoConNotaMayorIndicada(Alumno[] alumnosClase) {
        Scanner entrada = new Scanner(System.in);

        // Pedimos al usuario que indique que nota tiene que superar el alumno para mostrarse
        System.out.println("Indica la nota a superar: ");
        float notaASuperar = entrada.nextFloat();
        
        // Recorremos el array
        for (int i = 0; i < alumnosClase.length; i++) {

            if (alumnosClase[i] != null) { // Controlamos nulos

                if (alumnosClase[i].getNota() > notaASuperar ) {

                    System.out.println("El alumno que supera esa nota es: " + alumnosClase[i]);
                }

            }

        }
    }
    
    /**
     * Método que muestra al alumno con el nombre que indique el usuario
     * 
     * @param alumnosClase 
     */
    public static void buscarAlumnoNombre(Alumno[] alumnosClase) {
        Scanner entrada = new Scanner(System.in);
        
        // Pedimos al usuario que indique el nombre del alumno que quiera mostrar
        System.out.println("Indica el nombre del alumno que quieres mostrar: ");
        String nombreAlumno = entrada.nextLine();
        
        boolean alumnoEcontrado = false;
        
        // Recorremos el array
        for (int i = 0; i < alumnosClase.length; i++) {
            
            if (alumnosClase[i] != null) {
                
                if (alumnosClase[i].getNombre().equalsIgnoreCase(nombreAlumno)) {
                    System.out.println("El alumno elegido por el usuario es: " 
                            + nombreAlumno + " | Sus datos son: " +alumnosClase[i]);
                    alumnoEcontrado = true;
                }
            }
            
        }
        if (alumnoEcontrado == true) {
            System.out.println("Alumno encontrado");
        }else{
            System.out.println("No se ha encontrado al alumno");
        }

    }
    
    /**
     * Método que muestra a los alumnos ordenador por su nota de mayort a menor
     * 
     * @param alumnosClase 
     */
    public static void ordenarPorNotaMayorMenor(Alumno[] alumnosClase) {
        // Creamos un objeto auxiliar
        Alumno auxiliar = new Alumno("", 0, 0);
        
        // Recorremos el array dos veces para comparar entre un alumno y otro
        for (int i = 0; i < alumnosClase.length - 1; i++) {
            for (int j = 0; j < alumnosClase.length -i - 1; j++) {
                
                if (alumnosClase[i] != null) { // Controlamos nulos
                    
                    if (alumnosClase[j].getNota() < alumnosClase[j + 1].getNota()) {
                        auxiliar = alumnosClase[j];
                        alumnosClase[j] = alumnosClase[j + 1];
                        alumnosClase[j + 1] = auxiliar;                                              
                    }
                }
                
                
            }
            
        }
        mostrarAlumnos(alumnosClase);
    }
    
    /**
     * Método que muestra la nota media de toda la clase
     * 
     * @param alumnosClase 
     */
    public static void mostrarNotaMediaClase(Alumno[] alumnosClase) {
        // Creamos la variable media para usarla en la operación
        float media = 0;
        
        // Recorremos el array
        for (int i = 0; i < alumnosClase.length; i++) {
            
            if (alumnosClase[i] != null) { // Controlamos nulos
                
                media = media + alumnosClase[i].getNota();
                media = media / alumnosClase[i].getNota();
                
                media = alumnosClase[i].getNota();
                
            }
            
        }       
        System.out.println("La nota media de la clase es: " + media);
    }

    /**
     * Método que muestra el menú al usuario
     */
    public static void mostrarMenu() {
        System.out.println("--------------------------------------------------");
        System.out.println("------------------GESTION DE CLASE----------------");
        System.out.println("------------1.Rellenar clase de alumnos-----------");
        System.out.println("------------2.Mostrar todos los alumnos-----------");
        System.out.println("-------3.Mostrar alumno con nota mas alta---------");
        System.out.println("--4.Mostrar alumnos con nota mayor a la indicada--");
        System.out.println("-----------5.Buscar alumno por su nombre----------");
        System.out.println("---6.Ordenar alumnos por nota de mayor a menor----");
        System.out.println("---------7.Mostrar nota media de la clase---------");
        System.out.println("---------------8.SALIR DEL PROGRAMA---------------");
        System.out.println("--------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Creamos el array de 10 alumnos (3 para probar rápido)
        Alumno[] alumnosClase = new Alumno[2];

        // Creamos el menú llamando al metodo y controlando excepciones
        int opcion = 0;
        do {

            try {
                mostrarMenu();
                opcion = entrada.nextInt();
                switch (opcion) {
                    case 1:
                        rellenarClase(alumnosClase);
                        break;
                    case 2:
                        mostrarAlumnos(alumnosClase);
                        break;
                    case 3:
                        alumnoConNotaMasAlta(alumnosClase);
                        break;
                    case 4:
                        alumnoConNotaMayorIndicada(alumnosClase);
                        break;
                    case 5:
                        buscarAlumnoNombre(alumnosClase);
                        break;
                    case 6:
                        ordenarPorNotaMayorMenor(alumnosClase);
                        break;
                    case 7:
                        mostrarNotaMediaClase(alumnosClase);
                        break;
                    case 8:
                        System.out.println("Saliendo del programa....");
                        break;
                    default:
                        System.out.println("Opción incorrecta");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error. Has introducido una letra");
                entrada.nextLine();
            }

        } while (opcion != 8);

    }

}
