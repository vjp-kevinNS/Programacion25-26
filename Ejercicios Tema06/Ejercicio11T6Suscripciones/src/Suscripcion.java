
/**
 * Desarrolla un programa en Java que gestione el pago
 * de suscripciones en una plataforma online. Para ello, crea una clase
 * Suscripcion con el atributo precioBase y el método abstracto
 * calcularPrecio().
 *
 * @author KevinNS
 */
public abstract class Suscripcion{
    
    //Creamos el atributo
    private double precioBase;
    
    //Creamos el constructor por defecto
    public Suscripcion(){
        this.precioBase = 0.0;
    }
    
    //Creamos el constructor parametrizado
    public Suscripcion(double precioBase){
        this.precioBase = precioBase;
    }
    
    //Creamos el getter y el setter

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }
    
    //Creamos el método abstracto que usarán las subclases
    public abstract double calcularPrecio();
    
    //Creamos To String

    @Override
    public String toString() {
        return "Suscripcion{" + "precioBase: " + precioBase + '}';
    }
    

}
