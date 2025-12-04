
/**
 * Superclase llamada Vehiculo que contenga un atributo velocidad y el método 
 * abstracto mostrarMovimiento
 * 
 * @author KevinNS
 */
public abstract class Vehiculo {
    
    //Creamos el atributo
    protected int velocidad;
    
    //Creamos el constructor por defecto
    public Vehiculo(){
        this.velocidad = 0;
    }
    
    //Creamos el cosntructor parametrizado
    public Vehiculo(int velocidadInicial){
        this.velocidad = velocidadInicial;
    }
    
    //Creamos el getter y setter

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
    //Creamos el método que heredaran las subclases
    public abstract void mostrarMovimiento();
       
    //Creamos To String

    @Override
    public String toString() {
        return "El vehículo lleva ésta velocidad: " + velocidad;
    }
    
}



