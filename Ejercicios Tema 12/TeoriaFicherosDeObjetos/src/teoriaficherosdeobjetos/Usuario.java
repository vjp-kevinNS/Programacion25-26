
package teoriaficherosdeobjetos;

import java.io.Serializable;

/**
 *
 * @author KevinNS
 */
public class Usuario implements Serializable{ // Serializable: para poder escribir los objetos en el fichero
    
    // Creamos los atributos
    
    private String nombre;
    private String email;
    private transient String clave; // Este atributo no se escribirá en el fichero
    
    // Creamos los cosntructores por defecto

    public Usuario() {
        this.nombre = "";
        this.email = "";
        this.clave = "";
    }
    
    // Creamos los constructores parametrizados

    public Usuario(String nombre, String email, String clave) {
        this.nombre = nombre;
        this.email = email;
        this.clave = clave;
    }
    
    // Creamos los getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    // Creamos To String

    @Override
    public String toString() {
        return "Usuario | " + " Nombre: " + nombre + " | Email: " + email 
                + " | Clave: " + clave;
    }
    
    
}
