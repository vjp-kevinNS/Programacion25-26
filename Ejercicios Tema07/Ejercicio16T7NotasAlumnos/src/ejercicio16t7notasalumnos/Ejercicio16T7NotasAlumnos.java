package ejercicio16t7notasalumnos;
import java.util.Scanner; // Importamos Scanner
/**
 * Sabiendo que tenemos una clase de 6 alumnos (Pepe, Juan, Ana, Marta, Pedro y
 * María), con 4 asignaturas cada uno (Lengua, Mates, Historia y Física),
 * realiza un programa que le dé al usuario las siguientes opciones: 
 * 
 * 1. Rellenar las notas de los alumnos. 
 * 2. Mostrar las notas introducidas en el punto anterior. 
 * 3. Que nos diga que alumno es el mejor de la clase.(nota media más alta). 
 * (Necesitarás utilizar otro array unidimensional con los nombres de los alumos) 
 * 4. Que nos diga el alumno con más suspensos. 
 * 5. Que nos diga cual es la asignatura más difícil. (nota media más baja). 
 * (Necesitarás utilizar otro array unidimensional con los nombres de las asignaturas) 
 * 6. Salir del programa.
 * 
 * • Hasta que el usuario no pulse 6 no saldremos del programa y se volverá a 
 * mostrar el menú.
 *
 * @author KevinNS
 */
public class Ejercicio16T7NotasAlumnos {
    
    // Declaramos las constantes 
    public final static int ALUMNOS = 6;
    public final static int ASIGNATURAS = 4;    

    public static void main(String[] args) {
        
        // Creamos la matriz y la inicializamos
        int[][] alumnos = new int[ALUMNOS][ASIGNATURAS];
        
        // Creamos los arrays con los nombres de alumnos y asignaturas
        String[]nombreAlumnos = {"Pepe", "Juan", "Ana", "Marta", "Pedro", "María"};
        String[]nombreAsignaturas = {"Lengua", "Mates", "Historia", "Física"};
        
        // LLamamos a los métodos 
        rellenarNotas(alumnos, nombreAlumnos, nombreAsignaturas);

    }
    
    public static void rellenarNotas(int[][]notas, String[]alumnos, String[]asignaturas){
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < ALUMNOS; i++) {
            System.out.println("El alumno " + (i + 1) + " -> ");
            for (int j = 0; j < ASIGNATURAS; j++) {
                System.out.println("Tiene éstas notas: " + asignaturas[j] + ": ");
                notas[i][j] = entrada.nextInt();
            }
            
        }
    }
    

}
