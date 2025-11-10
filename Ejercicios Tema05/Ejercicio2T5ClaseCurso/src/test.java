
/**
 * Para probar el funcionamiento de la clase Curso, crear otra clase llamada Test
 *(dentro del mismo paquete) que contenga el método main, donde se creen dos
 * objetos de la clase Curso: curso1 y curso2.
 * Luego realizar las siguientes operaciones:
 * • Establece el nombre y el número de horas, primero en el objeto curso1 y luego en curso2.
 * • Muestra los datos de los 2 cursos creados.
 * • Por último, muestra el número de cursos creados almacenados en el atributo estático de clase
 * numeroDeClientes.
 *
 * @author kevinNS
 */
public class test {

    public static void main(String[] args) {
        //Creamos los objetos que utilizaremos en el main (curso1 y curso2)
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();

        //Establecemos el nombre y el número de horas
        curso1.establecerNombreyHoras("Programación", 190);
        curso2.establecerNombreyHoras("Base de datos", 120);

        //Mostramos los datos de los dos cursos creados
        System.out.println("Datos del curso 1: ");
        System.out.println("Nombre del curso: " + curso1.obtenerNombre());
        System.out.println("Horas del curso: " + curso1.obtenerHoras());

        System.out.println("Datos del curso 2: ");
        System.out.println("Nombre del curso: " + curso2.obtenerNombre());
        System.out.println("Horas del curso: " + curso2.obtenerHoras());

        //Mostramos el número de cursos creados almacenados
        System.out.println("Número de cursos creados: " + Curso.verNumeroCursos());

    }

}
