
/**
 * Aquí crearemos todo el proceso
 * • Nota 1: Cada una de las asignaturas serán un objeto cuyos atributos serán el nombre y la nota.
 * • Nota 2: Crea un constructor con el que puedas asignar directamente el nombre de la asignatura al crear el
 * objeto. En cambio, el atributo nota, será el usuario quien lo introduzca mediante un método al que se le
 * pase la nota como argumento.
 * • Nota 3: Crea otro método que reciba las 6 notas como argumentos y devuelva la nota media (return)
 *
 * @author KevinNS
 */
public class NotasDAW {

    //Creamos los atributos
    private String nombre;
    private double nota;

    //Creamos los constructores
    public NotasDAW(String nombre) {
        this.nombre = nombre;
        this.nota = 0;
    }

    //Creamos los getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    //Creamos el método para calcular la nota media del curso ya que el método
    //al que se le pasa la nota lo tenemos en el setter setNota
    public static double calcularMedia(double n1, double n2, double n3, double n4, double n5, double n6) {
        return (n1 + n2 + n3 + n4 + n5 + n6) / 6;
    }

    //Creamos To String
    @Override
    public String toString() {
        return "En la asignatura: " + this.nombre + ("tienes ésta nota " + this.nota);
    }
}
