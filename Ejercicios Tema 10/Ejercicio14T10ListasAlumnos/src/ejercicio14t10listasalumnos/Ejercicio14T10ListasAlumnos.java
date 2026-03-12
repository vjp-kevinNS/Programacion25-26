package ejercicio14t10listasalumnos;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Realiza un programa en el almacenes una lista de objetos de la clase ALUMNO
 * cuyos atributos son 2: • Nombre delAlumno. (String) • asignaturas (Array de
 * la ClaseAsignatura)
 *
 * • A su vez, la clase Asignatura está formada por: • Nombre de la asignatura.
 * (String) • Nota de laAsignatura (float)
 *
 * • Sabiendo que tenemos varios alumnos (los que desee el usuario) con 3
 * asignaturas cada uno (Lengua, Mates y Física), realiza un programa que le dé
 * al usuario las siguientes opciones:
 *
 * 1. Introducir un nuevo alumno junto a sus notas. (uno solo, si se quieren
 * introducir mas volveríamos a entrar aquí)
 *
 * 2. Mostrar los alumnos introducidos hasta el momento (junto a sus notas).
 *
 * 3. Que nos diga que alumno es el mejor de la clase. (nota media más alta) .
 *
 * 4. Que nos diga cual es la asignatura más difícil. (mayor número de
 * suspensos).
 *
 * 5. Salir del programa.
 *
 * • Controlaremos que el usuario elija una opción del menú entre 1 y 5. Hasta
 * que el usuario no pulse 5 no saldremos del programa.
 *
 * @author KevinNS
 */
public class Ejercicio14T10ListasAlumnos {
    
    /**
     * Método que pide al usuario el nombre del alumno, lo crea y lo añade a la 
     * lista
     * 
     * @param lista 
     */
    public static void introducirAlumno(ArrayList<Alumno> lista){
        Scanner entrada = new Scanner(System.in);
        
        // Pedimos al usuario el nombre del alumno
        System.out.println("Introduce el nombre del alumno: ");
        String nombreAlumno = entrada.nextLine();
        
        // Creamos un array temporal para guardar las 3 asignaturas
        Asignatura[]notasTemporales = new Asignatura[3];
        
        // Creamos un String con los nombres fijos de las asignaturas ya que los sabemnos
        String[]nombresAsig = {"Lengua", "Mates", "Física"};
        
        // Recorremos el array sabiendo que son 3 las notas
        for (int i = 0; i < 3; i++) {
            System.out.println("Introduce la nota de: " + nombresAsig[i] + ": ");
            float nota = entrada.nextFloat();
            
            // Creamos el objeto de Asignatura y lo metemos en el array temporal
            notasTemporales[i] = new Asignatura(nombresAsig[i], nota);
        }
        
        // Creamos el alumno con su nombre y su array de 3 notas y lo metemos en la lista
        lista.add(new Alumno(nombreAlumno, notasTemporales));
        System.out.println("Alumno registrado");
    }
    
    /**
     * Método que muestra los alumnos y de paso hemos calculado su media
     * @param lista 
     */
    public static void mostrarAlumnos(ArrayList<Alumno> lista){
        // Recorremos el array
        for (int i = 0; i < lista.size(); i++) {
            Alumno alumno = lista.get(i); // Sacamos al alumno de la posición i
            System.out.println("Alumno: " + alumno.getNombreAlumno() + " | ");
            
            float sumaNotas = 0; // Variable para sumar las notas de este alumno
            
            // Recorremos el array de 3 notas del alumno
            for (int j = 0; j < alumno.getNotasAsign().length; j++) {
                System.out.println(alumno.getNotasAsign()[j].getNombreAsignatura() 
                        + ": " + alumno.getNotasAsign()[j].getNotaAsignatura() + " " );
                // Vamos sumando las notas
                sumaNotas += alumno.getNotasAsign()[j].getNotaAsignatura(); 
                
            }
            
            // Calculamos la media dividiendo entre 3
            float media = sumaNotas / 3;
            System.out.println("| MEDIA: " + media);
            
        }
    }
    
    /**
     * Método que busca al alumno con la media más alta
     * 
     * @param lista 
     */
    public static void calcularMejorAlumno(ArrayList<Alumno> lista){
        // Si la lista está vacía no hacemos nada
        if (lista.isEmpty()){
            return;
        }
        
        float maxMedia = -1; // Para guardar la nota que va siendo mayor
        String nombreMejor = ""; // Para guardar el nombre del mejor alumno
        int i = 0; // Lo creamos para el bucle while para hacer la búsqueda
        
        // Creamos el bucle while para buscar la nota más alta
        while(i < lista.size()){
            Alumno alumno = lista.get(i);
            float suma = 0;
            // Sumamos sus 3 notas para calcular la media aquí
            for (int j = 0; j < 3; j++) {
                suma += alumno.getNotasAsign()[j].getNotaAsignatura();
                
            }
            float mediaActual = suma / 3;
            
            // Si su media es mayor que ña máxima que teníamos...
            if (mediaActual > maxMedia) {
                maxMedia = mediaActual; // Actualizamos
                nombreMejor = alumno.getNombreAlumno(); // Guardamos su nombre
            }
            i++; // Avanzamos el índice manualmente
        }
        System.out.println("El mejor alumno es: " + nombreMejor + " con un " + maxMedia);      
    }
    
    /**
     * Método que muestra la asignatura más difícil en función de los suspensos
     * que tiene
     * 
     * @param lista 
     */
    public static void asignaturaMasDificil(ArrayList<Alumno> lista){
        // Si la lista está vacía no hacemos nada
        if (lista.isEmpty()){
            return;
        }
        
        // Creamos un array de 3 enteros para contar los suspensos que contará las
        // 3 asignaturas
        int[]suspensos = new int[3];
        
        // Recorremos el array de alumnos
        for (int i = 0; i < lista.size(); i++) {
            // Recorremos el array de notas también
            for (int j = 0; j < 3; j++) {
                // Accedemos al alumno y las notas, elegimos la materia y sacamos la nota
                // Si esa nota es menor que 5, es un suspenso
                if (lista.get(i).getNotasAsign()[j].getNotaAsignatura()< 5) {
                    // Si ha suspendido sumamos 1 al contador de esa asignatura
                    suspensos[j]++;
                }
                
            }
            
        }
        
        // Ahora necesitamos saber cuál de los 3 contadores es el mayor
        String[]nombresAsig = {"Lengua", "Mates", "Física"}; // Para pdoer mostrar el resultado final
        int maxSuspensos = -1; // Para guardar el máximo de suspensos
        int indiceDificil = 0; // Para recordar qué número de asignatura es la "ganadora"
        int k = 0; // Indice manual para el bucle de búsqeda
        
        // Creamos un bucle while para hacer la búsqueda
        while (k < 3) {
            
            // Si el número de suspensos de la asginatura (k) supera al mayor actual
            if (suspensos[k] > maxSuspensos) {
                maxSuspensos = suspensos[k]; // Guardamos y memorizamos qué asignatura era
                indiceDificil = k;
            }
            // Pasamos a la siguiente asignatura
            k++;           
        }
        System.out.println("La asignatura más difícil es: " +nombresAsig[indiceDificil] 
                + " con " + maxSuspensos + " suspensos");
    }
    
    /**
     * Método que muestra el menú
     * 
     */
    public static void mostrarMenu() {
        System.out.println("--------------------------------------------------");
        System.out.println("----------------GESTION DE ALUMNOS----------------");
        System.out.println("-----------1.Introducir un nuevo alumno-----------");
        System.out.println("-----------------2.Mostrar alumnos----------------");
        System.out.println("-------------3.Alumno mejor de la clase-----------");
        System.out.println("--------------4.Asignatura más difícil------------");
        System.out.println("---------------5.SALIR DEL PROGRAMA---------------");
        System.out.println("--------------------------------------------------");

    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        // Creamos el ArrayList de alumno
        ArrayList<Alumno> listaClase = new ArrayList<>();

        // Creamos el menu controlando excepciones
        int opcion = 0;
        do {
            try {
                mostrarMenu();
                opcion = entrada.nextInt();
                switch (opcion) {
                    case 1:
                        introducirAlumno(listaClase);
                        break;
                    case 2:
                        mostrarAlumnos(listaClase);
                        break;
                    case 3:
                        calcularMejorAlumno(listaClase);
                        break;
                    case 4:
                        asignaturaMasDificil(listaClase);
                        break;
                    case 5:
                        System.out.println("Saliendo del programa....");
                        break;
                    default:
                        System.out.println("Opcion incorrecta");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error. Has introducido una letra");
                entrada.nextLine();
            }

        } while (opcion != 5);

    }

}
