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
        
        /**
         * Creamos un bucle do while con un try catch para hacer el menú.
         * Utilizamos antes Scanner para pedirle la opción al usuario
         */
        Scanner entrada = new Scanner (System.in);
        int opcion;
        do {
            System.out.println("----------------------------------------------");
            System.out.println("---------------GESTION DE NOTAS---------------");
            System.out.println("--------------1.Rellenar notas----------------");
            System.out.println("--------------2.Mostrar notas-----------------");
            System.out.println("----------3.Mostrar mejor alumno--------------");
            System.out.println("------4.Mostrar alumno con mas suspensos------");
            System.out.println("-------5.Mostrar asignatura más dificil-------");
            System.out.println("-------------------6.SALIR--------------------");
            System.out.println("---------------ELIJA UNA OPCION---------------");
            System.out.println("----------------------------------------------");
            opcion = entrada.nextInt();
            
            switch (opcion) {
                case 1:
                    rellenarNotas(alumnos, nombreAlumnos, nombreAsignaturas);
                    break;
                case 2:
                    mostrarNotas(alumnos, nombreAlumnos, nombreAsignaturas);
                    break;
                case 3:
                    mejorAlumno(alumnos, nombreAlumnos, nombreAsignaturas);
                    break;
                case 4:
                    masSuspensos(alumnos, nombreAlumnos, nombreAsignaturas);
                    break;
                case 5:
                    asignaturaDificil(alumnos, nombreAlumnos, nombreAsignaturas);
                    break;
                case 6:
                    System.out.println("Saliendo del menú...");
                    break;
                default:
                    System.out.println("Opción no valida...");
            }
            
        } while (opcion != 6);

    }
    
    /**
     * OPCION 1. Método que rellena las notas de los alumnos
     * @param notas
     * @param alumnos
     * @param asignaturas 
     */
    public static void rellenarNotas(int[][]rellenar, String[]alumnos, String[]asignaturas){
        System.out.println("INTRODUCIENDO NOTAS DE ALUMNOS");
        for (int i = 0; i < ALUMNOS; i++) {
            System.out.println("Introduciendo notas de: " + alumnos[i]);
            for (int j = 0; j < ASIGNATURAS; j++) {
                rellenar[i][j] = (int) (Math.random() * 11);
            }
            System.out.println();
        }
    }
    
    /**
     * OPCION 2. Método que muestra las notas introducidas
     * @param mostrar
     * @param alumnos
     * @param asignaturas 
     */
    public static void mostrarNotas(int[][]mostrar, String[]alumnos, String[]asignaturas){
        System.out.println("MOSTRANDO NOTAS DE LOS ALUMNOS");
        for (int i = 0; i < ALUMNOS; i++) {
            System.out.println(alumnos[i] + " -> ");
            for (int j = 0; j < ASIGNATURAS; j++) {
                System.out.print(asignaturas[j] + ": " + mostrar[i][j] + " | ");
            }
            System.out.println();
        }
    }
    
    /**
     * OPCION 3. Método que muestra el alumno con la nota media más alta
     * @param mejor
     * @param alumno
     * @param asignatura 
     */
    public static void mejorAlumno(int[][]mejor, String[]alumno, String[]asignatura){
        int maxMedia = -1; // Inicializamos asi para que cualquier media sea mayor
        int indiceMejor = 0;
        
        for (int i = 0; i < ALUMNOS; i++) {
            int suma = 0;
            for (int j = 0; j < ASIGNATURAS; j++) {
                suma += mejor[i][j]; // Sumamos las 4 notas del alumno   
            }
            int media = (int)suma / ASIGNATURAS; // Calculamos la media
            if(media > maxMedia){
                maxMedia = media;
                indiceMejor = i; // Guardamos al mejor hasta ahora
            }
        }
        System.out.println("El mejor alumno es: " + alumno[indiceMejor] + " con un: " 
                + maxMedia + " de media total");
    }
    
    /**
     * OPCION 4. Método que muestra el alumno con más suspensos (nota de menos de 5)
     * @param suspenso
     * @param alumno
     * @param asignatura 
     */
    public static void masSuspensos(int[][]suspenso, String[]alumno, String[]asignatura){
        int maxSuspensos = -1; // Inicializamos asi para que cualquier media sea mayor
        int indiceAlumno = 0;
        
        for (int i = 0; i < ALUMNOS; i++) {
            int contador = 0;
            for (int j = 0; j < ASIGNATURAS; j++) {
                if (suspenso[i][j] < 5) contador++; // Si la nota es menor de 5, sumamos uno
        }
            if (contador > maxSuspensos) {
                maxSuspensos = contador;
                indiceAlumno = i;
            }
                
            }
        System.out.println("El alumno con mas suspensos es: " + alumno[indiceAlumno] + " que tiene " 
                + maxSuspensos + " suspensos");
    }
    
    /**
     * OPCION 5. Método que nos muestra la asignatura más dificil sabiendo el
     * total de suspensos
     * @param dificil
     * @param alumno
     * @param asignatura 
     */
    public static void asignaturaDificil(int[][]dificil, String[]alumno, String[]asignatura){
        int minMedia = 11; // Inicializamos alto para buscar el valor más bajo
        int indiceAsig = 0;
        
        for (int j = 0; j < ASIGNATURAS; j++) { // Cambiamos el orden. Primero columnas
            int suma = 0;
            for (int i = 0; i < ALUMNOS; i++) {
                suma += dificil[i][j]; // Sumamos las 4 notas de todos los alumnos   
            }
            int media = (int)suma / ALUMNOS; // Calculamos la media
            if(media < minMedia){
                minMedia = media;
                indiceAsig = j;
            }
        }
        System.out.println("La asignatura más dificil es: " + asignatura[indiceAsig] 
                + " (Total: " + minMedia + ")");
    }

}
