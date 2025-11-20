
import java.util.Scanner; //Importamos Scanner

/**
 * Realizar un programa en JAVA, orientado a objetos, donde el usuario
 * introduzca el nombre y la nota de un alumno (número entero entre 0 y 10) y se
 * escribirá su calificación según el valor de la nota ingresada: • 0 a 4 =
 * Suspenso. • 5 a 6 = Bien. • 7 a 8 = Notable. • 9 a 10 = Sobresaliente. •
 * Nota: Se le avisará al usuario de un error en caso de que la nota que nos
 * introduzca no esté entre 0 y 10. En una clase Test crea 3 objetos y los
 * métodos que consideres necesarios
 *
 * @author KevinNS
 */
public class Test {

    //Creamos los métodos
    /**
     * Método que pide al usuario introducir el nombre del alumno
     *
     * @return
     */
    public static String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe el nombre del alumno");
        String nombre = entrada.nextLine();
        return nombre;
    }

    /**
     * Método muestra la nota introducida por el usuario y nos dice si está
     * aprobado o suspendido. Para ello haremos un switch.
     *
     * @param nota
     */
    public static int pedirNota() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce la nota del alumno");
        int nota = entrada.nextInt();
        switch (nota) {
            case 0, 1, 2, 3, 4:
                System.out.println("Suspenso");
                break;
            case 5, 6:
                System.out.println("Bien");
                break;
            case 7, 8:
                System.out.println("Notable");
                break;
            case 9, 10:
                System.out.println("Sobresaliente");
                break;
            default:
                System.out.println("No has introducido un número entre 0 y 10");
                break;
        }
        return nota;
    }

    //
    public static void mostrarDatosAlumno(Alumno alumno) {
        System.out.println("Nombre " + alumno.getNombre());
        System.out.println("Nota " + alumno.getNota());
        
    }
    
    public static void main(String[] args) {

        //Creamos los objetos, en este caso serán 3 alumnos que tendrán notas diferentes
        Alumno alumno1 = new Alumno("Alumno 1", 0);
        Alumno alumno2 = new Alumno("Alumno 2", 0);
        Alumno alumno3 = new Alumno("Alumno 3", 0);

        //LLamamamos a los métodos
        //Primero para pedir el nombre
        alumno1.setNombre(pedirNombre());
        alumno2.setNombre(pedirNombre());
        alumno3.setNombre(pedirNombre());
        //Segundo para pedir la nota
        alumno1.setNota(pedirNota());
        alumno2.setNota(pedirNota());
        alumno3.setNota(pedirNota());

        //Tercero mostrar los datos de cada alumno
        mostrarDatosAlumno(alumno1);
        mostrarDatosAlumno(alumno2);
        mostrarDatosAlumno(alumno3);
    }
    
}
