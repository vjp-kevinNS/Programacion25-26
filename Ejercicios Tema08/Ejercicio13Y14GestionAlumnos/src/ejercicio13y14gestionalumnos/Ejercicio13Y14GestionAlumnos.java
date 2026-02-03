package ejercicio13y14gestionalumnos;
import java.util.Scanner; // Importamos Scanner
/**
 * Diseña la clase Alumno, cuyos atributos serán nombre, edad y notaMedia. Crea
 * constructores por defecto, parametrizado, getters y setters. 
 * 
 * • En el main, crea un par de objetos de la claseAlumno. 
 * • Completa el main a tu gusto.
 * 
 * Amplía el ejercicio anterior. Crea un vector de 5 alumnos y muestra al
 * usuario las siguientes opciones: 
 * 
 * • Rellenar un alumno (pediremos posición e insertaremos al nuevo alumno en 
 * esa posición. Si la posición está ya rellena, volveremos a pedir una nueva 
 * posición las veces que sean necesarias). 
 * 
 * • Mostrar vector de alumnos (si una celda todavía no está rellena, no
 * mostraremos nada de esa celda). 
 * 
 * • Mostrar alumnos con nota media por encima de una nota dada.
 * 
 * • Mostrar cuántos alumnos hay con la nota media suspensa. 
 * 
 * • Buscar alumnos (pediremos nombre y mostraremos si está matriculado o no).
 *
 * @author KevinNS
 */
public class Ejercicio13Y14GestionAlumnos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Para que el usuario elija una opción del menú
        
        // EJERCICIO 13, CREARÉ DOS OBJETOS DE LA CLASE ALUMNO
        Alumno alumno1 = new Alumno(); // Por defecto
        Alumno alumno2 = new Alumno("Kevin", 32, 6); // Parametrizado
        
        // Rellenamos los datos de alumno1 con el setter
        alumno1.setNombre("Pepito");
        alumno1.setEdad(45);
        alumno1.setNotaMedia(10);
        
        //Mostramos el resultado por pantalla
        System.out.println("El alumno 1 se llama " + alumno1.getNombre() + " tiene " 
                + alumno1.getEdad() + " años. Esta es su nota media: " + alumno1.getNotaMedia());
        System.out.println(alumno2.toString());
        
        // EJERCICIO 14
    }

}
