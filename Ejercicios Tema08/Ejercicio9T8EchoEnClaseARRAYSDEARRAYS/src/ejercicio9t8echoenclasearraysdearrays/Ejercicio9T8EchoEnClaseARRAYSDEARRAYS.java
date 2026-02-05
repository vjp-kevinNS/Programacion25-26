package ejercicio9t8echoenclasearraysdearrays;

import java.util.Scanner;
import java.util.Arrays;

/**
 * Tenemos un aula de 3 alumnos (Pepe, Juan y Marta), con 4 asignaturas cada uno
 * (Lengua, Mates, Historia y Física).
 *
 * • Para guardar la información utilizaremos un array de 3 posiciones que
 * contiene objetos de la clase Alumno.
 *
 * La clase Alumno tendrá un atributo que será el nombre del alumno de tipo
 * String, y un array de la clase Asignatura.
 *
 * La clase Asignatura tendrá un atributo de tipo String que será el nombre de
 * la asignatura y otro atributo llamado nota de tipo float.
 *
 * • Realiza un programa que le dé al usuario las siguientes opciones: 1.
 * Rellenar las notas de los alumnos.
 *
 * 2. Mostrar las notas introducidas en el punto anterior.
 *
 * 3. Que nos diga que alumno es el mejor de la clase. (nota media más alta).
 * (Necesitarás utilizar otro array unidimensional con los nombres de los
 * alumos)
 *
 * 4. Que nos diga el alumno con más suspensos.
 *
 * 5. Que nos diga cual es la asignatura más difícil. (nota media más baja)
 * (Necesitarás utilizar otro array unidimensional con los nombres de las
 * asignaturas)
 *
 * 6. Salir del programa.
 *
 * • Hasta que el usuario no pulse 6 no saldremos del programa y se volverá a
 * mostrar el menú.
 *
 * @author KevinNS
 */
public class Ejercicio9T8EchoEnClaseARRAYSDEARRAYS {
    
    public static void rellenar(Alumno[] alumno) {
        String[] nombreAlumnos = {"Pepe", "Juan", "Marta"};
        for (int i = 0; i < alumno.length; i++) {
            alumno[i] = new Alumno(nombreAlumnos[i]);
            alumno[i].rellenarNotas();
        }
    }

    public static void mostrar(Alumno[] alumnos) {
        for (Alumno alumno : alumnos) {
            System.out.println(alumno.toString());
        }
    }

    public static void mejorAlumno(Alumno[] alumnos) {
        Alumno mejorAlumno = new Alumno();
        float mejorMedia = 0;

        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i].calcularMedia() > mejorMedia) {
                mejorAlumno = alumnos[i];
                
                // Actualizamos mejorMedia             
                mejorMedia = alumnos[i].calcularMedia();
            }
        }
        System.out.println("El mejor alumno es " + mejorAlumno.getNombre() + " y su media es "
                + mejorMedia);

    }

    public static void peorAlumno(Alumno[] alumnos) {
        Alumno peorAlumno = new Alumno();
        float peorMedia = 11; // Empezamos con un valor alto para poder bajar

        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i].calcularMedia() < peorMedia) {
                peorAlumno = alumnos[i];
                
                // Actualizamos peorMedia             
                peorMedia = alumnos[i].calcularMedia();
            }       
        }
        System.out.println("El peor alumno es " + peorAlumno.getNombre() + " y su media es "
                + peorMedia);

    }

    public static void asignaturaMasDificil(Alumno[] alumnos) {
        // 1. Variables para guardar cuál es la asignatura con la nota más baja
        float notaMinimaMedia = 11; // Empezamos con un valor mayor que 10
        String nombreDificil = "";

        for (int j = 0; j < alumnos[0].getNotas().length; j++) {
            float sumaNotaAsignaturas = 0;

            for (int i = 0; i < alumnos.length; i++) {
                sumaNotaAsignaturas += alumnos[i].getNotas()[j].getNota();
            }
            // Calculamos la media de esa asignatura en específico
            float mediaActual = sumaNotaAsignaturas / alumnos.length;
            // Comparamos las medias para encontrar la más difícil (la más baja)
            if (mediaActual < notaMinimaMedia) {
                notaMinimaMedia = mediaActual;
                // Sacamos el nombre directamente de la asignatura del primer alumno
                nombreDificil = alumnos[0].getNotas()[j].getNombre();
            }
        }
        // Mostramos el resultado final
        System.out.println("La asignatura más difícil es: " + nombreDificil
                + " con una media de " + notaMinimaMedia);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Creamos el array de Alumnos
        Alumno[] alumnos = new Alumno[3];

        // Creamos el menu
        int opcion;
        do {
            System.out.println("=============================================");
            System.out.println("============ GESTION DE ALUMNOS =============");
            System.out.println("============ 1.Rellenar notas ===============");
            System.out.println("============ 2.Mostrar notas ================");
            System.out.println("============ 3.Mejor alumno ================ ");
            System.out.println("============ 4.Peor alumno ==================");
            System.out.println("============ 5.Asignatura más difícil =======");
            System.out.println("============ 6.SALIR DEL PROGRAMA ===========");
            System.out.println("=============================================");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Rellenando notas...");
                    rellenar(alumnos);
                    break;
                case 2:
                    System.out.println("Mostrando notas: ");
                    mostrar(alumnos);
                    break;
                case 3:
                    System.out.println("Alumno con la mejor nota: ");
                    mejorAlumno(alumnos);
                    break;
                case 4:
                    System.out.println("Alumno con la peor nota: ");
                    peorAlumno(alumnos);
                    break;
                case 5:
                    System.out.println("Asignatura más difícil: ");
                    asignaturaMasDificil(alumnos);
                    break;
                case 6:
                    System.out.println("Saliendo del programa.......");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        } while (opcion != 6);

    }

}
