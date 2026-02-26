package repasoejt8asignatura;

import java.util.Scanner; // Importamos Scanner

/**
 * Realiza un programa en JAVA en el que le pidas al usuario las notas de las 6
 * asignaturas del Ciclo de DAM y te calcule la nota media del curso.
 *
 * • Cada una de las asignaturas serán un objeto que se encuentran en un array
 * de 6 posiciones, y cuyos atributos serán el nombre y la nota.
 *
 * • Crea un constructor con el que asigne directamente el nombre de la
 * asignatura y la nota al crear el objeto. El nombre de la asignatura se lo
 * asignaremos nosotros, en cambio, el atributo nota, será el usuario quien la
 * introduzca mediante un método.
 *
 * • Crea otro método que reciba el array con las 6 notas y devuelva la nota
 * media (return).
 *
 * @author KevinNS
 */
public class RepasoEjT8Asignatura {

    public static double notaMedia(Asignatura[] nota) {
        double guardarNota = 0; // Guardamos la nota

        // Recorremos el array
        for (int i = 0; i < nota.length; i++) {
            guardarNota = guardarNota + nota[i].getNota();

        }
        return guardarNota / nota.length;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Creamso el array de asignaturas
        Asignatura[] asignaturas = new Asignatura[6];

        // Asignamos una posición y el nombre de la asignatura
        asignaturas[0] = new Asignatura("Programación", 0);
        asignaturas[1] = new Asignatura("Bases de datos", 0);
        asignaturas[2] = new Asignatura("Sistemas informáticos", 0);
        asignaturas[3] = new Asignatura("Lenguaje de marcas", 0);
        asignaturas[4] = new Asignatura("Entornos de desarollo", 0);
        asignaturas[5] = new Asignatura("Inglés", 0);

        // Pedimos al usuario que introduzca la nota
        for (int i = 0; i < asignaturas.length; i++) {
            System.out.println("Introduzca la nota de " + asignaturas[i].getNombre());
            double notaUsuario = entrada.nextDouble();

            // Guardamos la nota que ha dicho el usuario con el setter
            asignaturas[i].setNota(notaUsuario);

        }
        
        // LLamamos al método para saber la nota media
       double notaMedia = notaMedia(asignaturas);
        System.out.println("Ls nota media es del curso es: " + notaMedia);
    }

}
