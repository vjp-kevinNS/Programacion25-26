
/**
 * La suscripción al periódico está gravada con un IVA del 10% 
 * 
 * @author KevinNS
 */
public class SuscripcionPeriodico extends Suscripcion{
    
    //Creamos el atributo
    private double iva;
    
    //Creamos el constructor por defecto añadiendo super
    public SuscripcionPeriodico(){
        super();
        this.iva = 10;
    }
    
    //Creamos el constructor parametrizado añadiendo super
    public SuscripcionPeriodico(double iva, double precioBase){
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
