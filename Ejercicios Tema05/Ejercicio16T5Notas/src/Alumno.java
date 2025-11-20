
/**
 * Clase Alumno con los atributos nombre y nota
 *
 * @author KevinNS
 */
public class Alumno {

    //Creamos los atributos
    private String nombre;
    private int nota;

    //Creamos los constructores por defecto
    public Alumno() {
        this.nombre = "";
        this.nota = nota;
    }

    //Creamos los constructores con sus parámetros
    public Alumno(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    //Creamos los getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    //Creamos To String
    @Override
    public String toString() {
        return "El alumno " + this.nombre + " tiene ésta nota: " + this.nota;
    }

}
