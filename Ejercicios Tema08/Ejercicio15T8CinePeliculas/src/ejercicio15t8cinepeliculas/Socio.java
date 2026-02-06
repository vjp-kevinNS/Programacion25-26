package ejercicio15t8cinepeliculas;

/**
 * De los socios almacenaremos los siguientes datos: nombre y precio abonado (al
 * ser una Asociación, los socios aportan “la voluntad”).
 *
 * @author KevinNS
 */
public class Socio {
    
    // Creamos los atributos
    private String nombre;
    private double precioAbonado;
    
    // Creamos los constructores por defecto

    public Socio() {
        this.nombre = "";
        this.precioAbonado = 0;
    }
    
    // Creamos los constructores parametrizados
    public Socio(String nombre, double precioAbonado) {
        this.nombre = nombre;
        this.precioAbonado = precioAbonado;
    }
    
    // Creamos los getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioAbonado() {
        return precioAbonado;
    }

    public void setPrecioAbonado(double precioAbonado) {
        this.precioAbonado = precioAbonado;
    }
    
    // Creamos To String

    @Override
    public String toString() {
        return "Socio{" + " Nombre: " + nombre + " | Precio Abonado: " + precioAbonado + '}';
    }
    
    

}
