
/**
 * La suscripción de TV está gravada con un IVA del 21% 
 * 
 * @author KevinNS
 */
public class SuscripcionTv extends Suscripcion{
    
    //Creamos los atributos
    private double iva;
    
    //Creamos el constructor por defecto añadiendo super
    public SuscripcionTv(){
        super();
        this.iva = 21;
    }
    
    //Creamos el constructor parametrizado añadiendo super
    public SuscripcionTv(double iva, double precioBase){
        super(precioBase);
        this.iva = iva;
    }
    
    //Creamos el getter y setter

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }
    
    //Creamos el método que hereda de la superclase
        
    /**
     * Método que nos muestra el precio del producto con el iva
     * @return el precio
     */
    public double calcularPrecio(){
        
        double precio;
        precio = getPrecioBase() + (getPrecioBase() * (getIva() / 100));
        return precio;
    }
    
    //Creamos To String

    @Override
    public String toString() {
        return "La suscripción cuesta: " + getPrecioBase() + " y tiene un IVA del: " 
                + iva + "% " + " Precio final: " + calcularPrecio();
    }
    
}
