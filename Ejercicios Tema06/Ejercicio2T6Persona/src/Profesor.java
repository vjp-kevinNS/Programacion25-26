
/**
 * Profesor (hereda de Persona y tiene el atributo especialidad)
 *
 * Dependiendo del tipo de persona (profesor o alumno) el método
 * saludar devolverá un String con un saludo del tipo “Hola, soy el
 * alumno … y estoy en el grupo de …) o bien “Hola, soy el profesor
 * … y soy de la especialidad de …).
 *
 * @author KevinNS
 */
public class Profesor extends Persona {

    //Creamos el atributo
    private String especialidad;

    //Creamos el constructor por defecto añadiendo super
    public Profesor() {
        super();
        this.especialidad = "";
    }

    //Creamos el constructor parametrizado añadiendo super
    public Profesor(String especialidad, String nombre) {
        super(nombre);
        this.especialidad = especialidad;
    }

    //Creamos los getter y setter
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    //Creamos el método con el Override previamente creado en la superclase
    /**
     * Método que nos dice el nombre del profesor y su especialidad
     */
    @Override
    public String saludar() {
        return "Hola, soy el profesor " + super.getNombre()
                + " y mi especialidad es: " + this.especialidad;
    }

    //Creamos To String
    @Override
    public String toString() {
        return "Profesor que se llama: " + super.getNombre() + " y su especialdad es:"
                + this.especialidad;
    }

}
