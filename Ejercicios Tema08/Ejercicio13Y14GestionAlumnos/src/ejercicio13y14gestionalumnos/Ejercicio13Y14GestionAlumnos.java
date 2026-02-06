package ejercicio13y14gestionalumnos;

import java.util.Scanner; // Importamos Scanner

/**
 * Diseña la clase Alumno, cuyos atributos serán nombre, edad y notaMedia. Crea
 * constructores por defecto, parametrizado, getters y setters.
 *
 * • En el main, crea un par de objetos de la claseAlumno. • Completa el main a
 * tu gusto.
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
    
    /**
     * Método para guardar a un alumno en una posición del array
     * @param rellenar 
     */
    public static void rellenarAlumno(Alumno[] rellenar) {
        Scanner entrada = new Scanner(System.in); // Para que el usuario rellene los datos
        System.out.println("¿En qué hueco (0-4) quieres guardar al alumno?");
        int posicion = entrada.nextInt();
        entrada.nextLine(); // Limpiamos el buffer (lo añadí por que al mostrar la información el campo nombre no se imprimía por pantalla)
        
        // Controlamos que el hueco no esté ocupado (no sea null)
        if (rellenar[posicion] != null){
        System.out.println("Esta posición ya está ocupada");
            
        } else {
            System.out.println("Introduzca el nombre: ");
            String nombre = entrada.nextLine();
            entrada.nextLine();
            System.out.println("Introduzca la edad: ");
            int edad = entrada.nextInt();
            System.out.println("Introduzca la nota media: ");
            double notaMedia = entrada.nextDouble();
            entrada.nextLine();
            
            // Creamos el objeto y lo guardamos en la posición seleccionada
            rellenar[posicion] = new Alumno(nombre, edad, notaMedia);
            System.out.println("¡Estudiante registrado!");
        }

    }
    
    /**
     * Método que muestra la información del alumno
     * @param mostrar 
     */
    public static void mostrarAlumno(Alumno[]mostrar){
        System.out.println("---- MOSTRANDO ALUMNOS ----");
        for (int i = 0; i < mostrar.length; i++) {
            
            // Solo intentamos mostrar si el hueco no está vacío
            if (mostrar[i] != null) {
                
                // Accedemos a la información usando los getters de la clase Alumno
                String nombreAlumno = mostrar[i].getNombre();
                int edadAlumno = mostrar[i].getEdad();
                double notaMedia = mostrar[i].getNotaMedia();
            
            
            // Mostramos el resultado
            System.out.println("Posición [" + i + "] del Alumno " + nombreAlumno 
                    + " | Edad: " + edadAlumno + " | Nota media: " + notaMedia);
            }else{
                // Para avisar de que un hueco está vacio
                System.out.println("La posición [" + i + "] está vacía");
            }      
        }
    }
    
    /**
     * Método que pide al usuario que introduzca una nota mínima y si el alumno
     * supera dicha nota se imprima su información por pantalla
     * @param notaMejor 
     */
    public static void notaMediaPorEncima(Alumno[]notaMejor){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce la nota a superar: ");
        double notaIntroducida = entrada.nextDouble();
        
        for (int i = 0; i < notaMejor.length; i++) {
            // Sólo miramos si el hueco no está vacio
            if (notaMejor[i] != null) {
                
                // Comparamos la nota del alumno actual con la introducida usando
                // los getters para acceder a los datos
                if (notaMejor[i].getNotaMedia() >= notaIntroducida) {
                    
                    // Si cumple la condición mostramos los datos
                    String nombre = notaMejor[i].getNombre();
                    double nota = notaMejor[i].getNotaMedia();
                    
                    // Imprimimos el resultado por pantalla 
                    System.out.println("Alumno: " + nombre + " | Nota media: " + nota);
                }
            }           
        }
    }
    
    /**
     * Método que muestra por pantalla los alumnos con una nota media menor que 5
     * @param suspenso 
     */
    public static void notaSuspensa(Alumno[]suspenso){
        int contador = 0; // Creamos un contador a 0 para ir aumentandolo
        
        for (int i = 0; i < suspenso.length; i++) {
            
            // Sólo miramos si el hueco no está vacío
            if (suspenso[i] != null) {
                
                // Si su nota es menor que 5 incrementamos el contador
                if (suspenso[i].getNotaMedia() < 5) {
                    contador = contador + 1;
                    
                }
            }   
        }  
        // Imprimimos el resultado por pantalla
        System.out.println("El número total de alumnos suspensos es: " + contador);
    }
    
    /**
     * Método que nos dice si el alumno introducido figura en la lista
     * @param buscar 
     */
    public static void buscarAlumnos(Alumno[]buscar){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el nombre del alumno que desea buscar");
        String nombreABuscar = entrada.nextLine();
        
        // Creamos un bucle while hasta que hayamos mirado todos los huecos y no lo hayamos encontrado
        
        // Creamos las variables que usaremos en el bucle
        int i = 0;
        boolean alumnoEncontrado = false;
       
        while (i < buscar.length && alumnoEncontrado == false) {            
            // Verificamos que el hueco actual no esté vacío
            if (buscar[i] != null) {
                
                // Sacamos el nombre del alumno de esa posición usando el getter
                String nombreAlumnoEnLaPosicion = buscar[i].getNombre();
                // Comparamos los nombres ignorando mayúsculas y minúsculas
                if (nombreAlumnoEnLaPosicion.equalsIgnoreCase(nombreABuscar)) {
                    System.out.println("El alumno " + nombreABuscar 
                            + " si está matriculado");
                    alumnoEncontrado = true; // Esto hará que el bucle se detenga
                }
            }
            // Miramos la siguiente posición
            i = i + 1;
        }
        // Si al terminar el bucle la variable sigue siendo false, es que no estaba
        if (alumnoEncontrado == false) {
            System.out.println("El alumno " + nombreABuscar + " no ha sido encontrado");
        }
    }
    
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

        // -------------- EJERCICIO 14 -----------------
        
        // Creamos el array de 5 alumnos
        Alumno[] listaAlumnos = new Alumno[5];
        
        // Creamos el menú para que el usuario elija una opcion
        int opcion;
        do {            
             System.out.println("============================================");
            System.out.println("============ GESTION DE ALUMNOS =============");
            System.out.println("============ 1.Rellenar alumnos =============");
            System.out.println("============ 2.Mostrar alumnos ==============");
            System.out.println("======= 3.Alumnos por encima de la nota =====");
            System.out.println("======== 4.Alumnos nota media suspensa ======");
            System.out.println("============ 5.Buscar alumnos  ==============");
            System.out.println("============ 6.SALIR DEL PROGRAMA ===========");
            System.out.println("=============================================");
            opcion = entrada.nextInt();
            
            switch (opcion) {
                case 1:
                    rellenarAlumno(listaAlumnos);
                    break;
                case 2:
                    mostrarAlumno(listaAlumnos);
                    break;
                case 3:
                    notaMediaPorEncima(listaAlumnos);
                    break;
                case 4:
                    notaSuspensa(listaAlumnos);
                    break;
                case 5:
                    buscarAlumnos(listaAlumnos);
                    break;
                case 6:
                    System.out.println("Saliendo del menú...");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
                       
        } while (opcion != 6);
    }

}
