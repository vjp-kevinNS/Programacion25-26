
/**
 * Alumno (hereda de Persona y tiene el atributo grupo).
 *
 * Dependiendo del tipo de persona (profesor o alumno) el método
 * saludar devolverá un String con un saludo del tipo “Hola, soy el
 * alumno … y estoy en el grupo de …) o bien “Hola, soy el profesor
 * … y soy de la especialidad de …).
 *
 * @author KevinNS
 */
public class Alumno extends Persona {

    //Creamos el atributo
    private String grupo;

    //Creamos el constructor por defecto añadiendo super
    public Alumno() {
        super();
        this.grupo = "";
    }

    //Creamos el constructor parametrizado añadiendo super
    public Alumno(String grupo, String nombre) {
        super(nombre);
        this.grupo = grupo;
    }

    //Creamos los getter y setter
    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    //Creamos el método con el Override previamente creado en la superclase
    /**
     * Método que nos dice el nombre del alumno y el grupo al que pertenece
     */
    @Override
    public String saludar() {
        return "Hola, soy el alumno " + this.getNombre()
                + " y soy del grupo: " + this.grupo;
    }

    //Creamos To String
    @Override
    public String toString() {
        return "Alumno llamado: " + super.getNombre() + " del grupo: "
                + this.grupo;
    }

}
