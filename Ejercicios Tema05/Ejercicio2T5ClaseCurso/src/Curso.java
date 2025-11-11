
/**
 * Diseñar una clase curso que contenga los siguientes atributos privados:
 * • nombre (de tipo cadena)
 * • numeroHoras (de tipo entero)
 * Además dispondrá de un atributo estático llamado numeroDeCursos de tipo entero
 * Contendrá los siguientes métodos públicos:
 * • establecerNombreyHoras.
 * • obtenerNombre.
 * • obtenerHoras.
 * Además dispondrá de dos métodos estáticos (para trabajar con el
 * atributo estático):
 * • sumarCursos
 * • verNumeroCursos
 *
 * @author kevinNS
 */
public class Curso {

    //Creamos los atributos privados
    private String nombre;
    private int numeroHoras;
    //Creamos el atributo estático
    public static int numeroDeCursos = 0;

    //Creamos los constructores por defecto
    public Curso() {
        this.nombre = "";
        this.numeroHoras = 0;
        sumarCursos();
    }

    //Creamos los constructores con sus parámetros
    public Curso(String nombre, int numeroHoras, int numeroDeCursos) {
        this.nombre = nombre;
        this.numeroHoras = numeroHoras;
        sumarCursos();
    }

    //Creamos los getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroHoras() {
        return numeroHoras;
    }

    public void setNumeroHoras(int numeroHoras) {
        this.numeroHoras = numeroHoras;
    }

    public int getNumeroDeCursos() {
        return numeroDeCursos;
    }

    public void setNumeroDeCursos(int numeroDeCursos) {
        this.numeroDeCursos = numeroDeCursos;
    }

    //Creamos los métodos públicos
    
    /**
     * Método que establece el nombre y las hroas del curso
     * @param nombre
     * @param numeroHoras 
     */
    public void establecerNombreyHoras(String nombre, int numeroHoras) {
        this.nombre = nombre;
        this.numeroHoras = numeroHoras;
    }
    /**
     * Método que nos dá el nombre del curso
     * @return el nombre del curso
     */
    public String obtenerNombre() {
        return this.nombre;
    }
    /**
     * Método que nos dá las horas del curso
     * @return las horas del curso
     */
    public int obtenerHoras() {
        return this.numeroHoras;
    }

    //Creamos los métodos estáticos
    
    /**
     * Método que suma los cursos
     */
    public static void sumarCursos() {
        numeroDeCursos++;
    }
    /**
     * Método para ver el número de cursos
     * @return 
     */
    public static int verNumeroCursos() {
        return numeroDeCursos;
    }

    //Creamos To String
    @Override
    public String toString() {
        return "El curso con nombre: " + this.nombre + "Tiene un total de "
                + this.numeroHoras + " horas : ";
    }

}
