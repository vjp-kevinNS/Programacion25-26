/**
 * Clase final. 
 * No permite la herencia, es decir, ninguna clase
 * puede heredad de ella. Aquí termina su legado.
 * Es la forma de controlar que no se extienda su funcionalidad.
 * 
 * @author KevinNS
 */
public final class Instructor {
    // ATRIBUTOS
    private int aniosExperiencia;

    // CONSTRUCTORES
    public Instructor() {
        this.aniosExperiencia = 0;
    }

    public Instructor(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    // GETTERS Y SETTERS
    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    // MÉTODOS
    public void motivar() {
        System.out.println("¡Mueve el culo! El mundo no se salvará solo.");
    }

    // TO STRING
    @Override
    public String toString() {
        return "Instructor con " + aniosExperiencia + " años de experiencia";
    }

}
