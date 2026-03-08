package repasorestauranterepeticion;

/**
 * Clase Restaurante (String nombre, Plato[] platos)
 *
 * @author KevinNS
 */
public class Restaurante {
    
    // Creamos los atributos
    private String nombre;
    private Plato[]plato;
    
    // Creamos los constructores por defecto

    public Restaurante() {
        this.nombre = "";
        this.plato = new Plato[3];
    }
    
    // Creamos los contructores por defecto

    public Restaurante(String nombre, Plato[] plato) {
        this.nombre = nombre;
        this.plato = plato;
    }
    
    // Creamos los getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Plato[] getPlato() {
        return plato;
    }

    public void setPlato(Plato[] plato) {
        this.plato = plato;
    }
    
    // Creamos To String

    @Override
    public String toString() {
        return "Restaurante | " + " Nombre: " + nombre + " | Plato: " + plato;
    }
    
    

}
