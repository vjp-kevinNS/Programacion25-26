
package repasoproyectocoleccionista;

/**
 * Clase Figura que tendrá como atributos: nombre, colección y valor
 * 
 * @author KevinNS
 */
public class Figura {
    
    // Creamos los atributos
    private String nombre;
    private String coleccion;
    private float valor;
    
    // Creamos los constructores por defecto
    public Figura() {
        this.nombre = "";
        this.coleccion = "";
        this.valor = 0f;
    }
    
    // Creamos los constructores parametrizados
    public Figura(String nombre, String coleccion, float valor) {
        this.nombre = nombre;
        this.coleccion = coleccion;
        this.valor = valor;
    }
    
    // Creamos los getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColeccion() {
        return coleccion;
    }

    public void setColeccion(String coleccion) {
        this.coleccion = coleccion;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    // Creamos To String

    @Override
    public String toString() {
        return "Figura | " + " Nombre: " + nombre + " | Coleccion: " + coleccion + " | Valor: " + valor;
    }
    
    
    
}
