/**
 * Subclase que extiende la funcionalidad de Superheroe.
 * Está obligada a sobreescribir el método entrenar(), que es abstracto.
 * No puede sobreescribir el método presentarse(), que es final.
 * 
 * Sus características (atributos) son: nombre (heredada) y fuerzaBruta (propia).
 * Por defecto, su fuera bruta será de 500.
 * Entrena corriendo levantando edificios de 10 pisos.
 * 
 * @author KevinNS
 */
public class Hulk extends Superheroe {
    // ATRIBUTOS
    private int fuerzaBruta;

    // CONSTRUCTORES
    public Hulk() {
        super();
        this.fuerzaBruta = 500;
    }

    public Hulk(String nombre, int fuerzaBruta) {
        super(nombre);
        this.fuerzaBruta = fuerzaBruta;
    }

    // GETTERS Y SETTERS
    public int getFuerzaBruta() {
        return fuerzaBruta;
    }

    public void setFuerzaBruta(int fuerzaBruta) {
        this.fuerzaBruta = fuerzaBruta;
    }

    // MÉTODOS
    @Override
    public void entrenar() {
        System.out.println("\n - ENTRENAMIENTO DE " + super.getNombre() + " -");
        System.out.println("Levantar edificios de 10 pisos.");
    }

    // TO STRING
    @Override
    public String toString() {
        return "Superhéroe Hulk:" + 
                "\n · Nombre: " + super.getNombre() +
                "\n · Fuerza bruta:" + fuerzaBruta;
    }



   
}