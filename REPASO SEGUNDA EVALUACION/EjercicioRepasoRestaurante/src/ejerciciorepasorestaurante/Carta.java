package ejerciciorepasorestaurante;

/**
 * Array de 4 platos y el nombre del restaurante
 *
 * @author KevinNS
 */
public class Carta {

    // Creamos los atributos
    private Plato[]platos;
    private String nombre;
    
    // Creamos los constructores por defecto

    public Carta() {
        this.platos = new Plato[4];
        this.nombre = "";
    }
    
    // Creamos los constructores parametrizados

    public Carta(String nombre) {
        this.platos = new Plato[4];
        this.nombre = nombre;
    }
    
    // Creamos los getters y setters

    public Plato[] getPlatos() {
        return platos;
    }

    public void setPlatos(Plato[] platos) {
        this.platos = platos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    // Creamos To String

    @Override
    public String toString() {
        return "Carta | " + "Platos: " + platos + " | nombre: " + nombre;
    }
    
    
}
