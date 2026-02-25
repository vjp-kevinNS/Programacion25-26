
package proyectocoleccionistafiguras;

/**
 *
 * @author KevinNS
 */
public class Figura {
    
    // Creamos los atributos
    private String nombrePersonaje;
    private String coleccion;
    private float valorPieza;
    
    // Creamos los constructores por defecto

    public Figura() {
        this.nombrePersonaje = "";
        this.coleccion = "";
        this.valorPieza = 0f;
    }
    
    // Creamos los constructores por defecto

    public Figura(String nombrePersonaje, String coleccion, float valorPieza) {
        this.nombrePersonaje = nombrePersonaje;
        this.coleccion = coleccion;
        this.valorPieza = valorPieza;
    }
    
    // Creamos los getters y setters

    public String getNombrePersonaje() {
        return nombrePersonaje;
    }

    public void setNombrePersonaje(String nombrePersonaje) {
        this.nombrePersonaje = nombrePersonaje;
    }

    public String getColeccion() {
        return coleccion;
    }

    public void setColeccion(String coleccion) {
        this.coleccion = coleccion;
    }

    public float getValorPieza() {
        return valorPieza;
    }

    public void setValorPieza(float valorPieza) {
        this.valorPieza = valorPieza;
    }
    
    // Creamos To String

    @Override
    public String toString() {
        return "Figura | " + " Figura con el nombre: " + nombrePersonaje + " | Coleccion: " + coleccion + " | Valor: " + valorPieza;
    }
    
    
    
}
