
package tema08arraysdeobjetos;

/**
 *
 * @author KevinNS
 */
public class Marcador {
    
    // ATRIBUTOS
    
    private String color;
    private float precio;
    
    // Creamos los constructores por defecto
    public Marcador(){
        this.color = "";
        this.precio = 0.0f;
    }
    
    // Creamos los constructores parametrizados
    public Marcador(String color, float precio){
        this.color = color;
        this.precio = precio;
    }
    
    // Creamos los getters y setters

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    // Creamos To String
    @Override
    public String toString() {
        return "Marcador{" + "color = " + color + ", precio = " + precio + '}';
    }
    
    
}
