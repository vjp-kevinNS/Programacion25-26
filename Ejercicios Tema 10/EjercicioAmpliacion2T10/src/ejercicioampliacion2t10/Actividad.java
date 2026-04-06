
package ejercicioampliacion2t10;

/**
 *
 * @author KevinNS
 */
public class Actividad {
    
    // Creamos los atributos
    private String nombre;
    private String tipo;
    private boolean familiar;
    
    // Creamos los constructores por defecto

    public Actividad() {
        this.nombre = "";
        this.tipo = "";
        this.familiar = false;
    }
    
    // Creamos los contructores parametrizados

    public Actividad(String nombre, String tipo, boolean familiar) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.familiar = familiar;
    }
    
    // Creamos los getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isFamiliar() {
        return familiar;
    }

    public void setFamiliar(boolean familiar) {
        this.familiar = familiar;
    }
    
    // Creamos To String

    @Override
    public String toString() {
        return "Actividad | " + " Nombre: " + nombre + " | Tipo: " + tipo 
                + " | Familiar: " + familiar;
    }
    
    

}
