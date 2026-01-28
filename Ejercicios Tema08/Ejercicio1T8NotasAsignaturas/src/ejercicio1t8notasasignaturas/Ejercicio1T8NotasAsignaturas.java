package ejercicio1t8notasasignaturas;
import java.util.Scanner; // Importamos Scanner
/**
 * Realiza un programa en JAVA en el que le pidas al usuario las notas de las 6
 * asignaturas del Ciclo de DAW y te calcule la nota media del curso. 
 * 
 * • Cada una de las asignaturas serán un objeto que se encuentran en un array de 6
 * posiciones, y cuyos atributos serán el nombre y la nota. 
 * 
 * • Crea un constructor con el que asigne directamente el nombre de la asignatura y la
 * nota al crear el objeto. El nombre de la asignatura se lo asignaremos
 * nosotros, en cambio, el atributo nota, será el usuario quien la introduzca
 * mediante un método. 
 * 
 * • Crea otro método que reciba el array con las 6 notas y devuelva la nota media (return). 
 * 
 * • Ejemplo de ejecución: 
 * Por favor, introduzca la nota de Programación: 6,5 
 * Introduzca la nota de Lenguajes de Marcas: 7,5 
 * Introduzca la nota de Bases de Datos: 7,5 
 * Introduzca la nota de Entornos de Desarrollo: 8 
 * Introduzca la nota de Sistemas Informáticos: 6,5
 * Por último, introduzca la nota de Formación y Orientación Laboral: 6 
 * Su nota media del curso es de: 7
 *
 * @author KevinNS
 */
public class Ejercicio1T8NotasAsignaturas {

    public static void main(String[] args) {
        // LLamamos a Scanner ya que desde aqui le pediremos al usuario las notas
        Scanner entrada = new Scanner(System.in);
        
        // Creamos el array
        Asignatura[] listaAsignatura = new Asignatura[6];
        
        // Asignamos un objeto del array a cada asignatura
        listaAsignatura[0] = new Asignatura("Programación", 0);
        listaAsignatura[1] = new Asignatura("Lenguaje de marcas", 0);
        listaAsignatura[2] = new Asignatura("Bases de Datos", 0);
        listaAsignatura[3] = new Asignatura("Entorno de desarrollo", 0);
        listaAsignatura[4] = new Asignatura("Sistemas Informaticos", 0);
        listaAsignatura[5] = new Asignatura("Formación y orientación laboral", 0);
        
        // Pedimos al usuario que introduzca la nota con un for
        for (int i = 0; i < listaAsignatura.length; i++) {
            System.out.println("Por favor, introduzca la nota de la asignatura " + listaAsignatura[i].getNombre());
            double notaUsuario = entrada.nextDouble();            
                    
        // Usamos el getter de la clase Asignatura para guardar la nota que ha dicho el usuairo
        listaAsignatura[i].setNota(notaUsuario);
        }
        
        // LLamamos al método para calcular la nota media
        double media = notaMedia(listaAsignatura);
        System.out.println("Su nota media del curso es: " + media);
        
    }
    
    /**
     * Método que calcula, sumando las notas de cada asignatura, la media total
     * @param asignatura
     * @return 
     */
    public static double notaMedia(Asignatura[]asignatura){
        
        double nota = 0;
        
        for (int i = 0; i < asignatura.length ; i++) {
            nota = nota + asignatura[i].getNota();
      
        }
        return nota / asignatura.length;
    }

}
