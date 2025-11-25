/**
 * Superclase de la jerarquía.
 * 
 * ABSTRACCIÓN
 * Es una clase abstracta porque contiene un método abstracto.
 * Si tenemos un método abstracto y no declaramos la clase como abstracta,
 * nos dará error de compilación.
 * 
 * Un método abstracto es un comportamiento que declaramos en la superclase,
 * pero implementamos en las subclases, porque todos los superhéroes tienen
 * ese comportamiento en común, pero cada uno lo implementa de manera distinta.
 * 
 * Las clases hijas están obligadas a sobreescribir el método abstracto, 
 * es decir, a especificar cómo entrena cada superhéroe.
 * 
 * Para declarar una clase como abstracta, escribimos abstract delante de class:
 * public abstract class Superheroe.
 * 
 * Para declarar un método como abstracto, escribimos abstract delante del tipo de dato:
 * public abstract void entrenar();.
 * 
 * FINAL
 * Esta clase tiene un método final que las subclases no pueden sobreescribir.
 * Para declarar un método final, escribirmos final delante del tipo de dato:
 * public final void presentarse();.
 * 
 * RESUMEN
 *  · Podemos forzar la herencia con abstracción:
 *    las subclases sobreescriben los métodos abstractos
 * 
 *  · Podemos impedir la herencia con valores finales: 
 *    los métodos finales no permiten la sobreescritura en subclases.
 *    También las clases pueden ser finales, de manera que ninguna clase
 *    pueda heredar de ella (ver Instructor e InstructorHeredado).
 * 
 * @author KevinNS
 */
public abstract class Superheroe {
    // ATRIBUTOS
    private String nombre;

    // CONSTRUCTORES
    public Superheroe() {
        this.nombre = "";
    }
    
    public Superheroe(String nombre) {
        this.nombre = nombre;
    }

    // GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // MÉTODOS
    /**
     * Método abstracto. 
     * Lo declaramos, pero no lo implementamos;
     * deben hacerlo las subclases (cada una a su manera),
     * es decir, todos los superhéroes entrenan, pero
     * cada uno a su manera.
     */
    public abstract void entrenar();
    
    /**
     * Método final. 
     * Las subclases no pueden sobreescribirlo, 
     * es decir, todos los superhéroes se presentan
     * y todos lo hacen igual.
     */
    public final void presentarse() {
        System.out.println("¡Hola! Soy " + this.nombre + " y mi misión es salvar el mundo.");
    }

    // TO STRING
    @Override
    public String toString() {
        return "Superheroe " + nombre;
    }

}