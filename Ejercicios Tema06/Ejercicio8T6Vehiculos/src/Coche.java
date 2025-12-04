
/**
 * La clase Coche hereda de Vehículo
 * 
 * La clase Coche tiene el atributo aireEncendido y los siguientes métodos:
 * 
 * • mostrarMovimiento. Muestra el mensaje “El coche está circulando a … km/h”.
 * • encenderAire. Si el aire no está encendido, lo enciende, muestra el mensaje
 * “El coche ha encendido el aire. La velocidad se reduce” y decrementa el 
 * atributo velocidad en 10 km/h. Si el aire está encendido, muestra el mensaje
 * “El aire ya está encendido”.
 *
 * @author KevinNS
 */
public class Coche extends Vehiculo {
    
    //Creamos el atributo
    private boolean aireEncendido;
    
    //Creamos el constructor por defecto añadiendo super
    public Coche(){
        super();
        this.aireEncendido = false;
    }
    
    //Creamos el cosntructor parametrizado añadiendo super
    public Coche(int velocidadInicial, boolean aireEncendido){
        super(velocidadInicial);
        this.aireEncendido = false;
    }
    
    //Creamos el getter y setter

    public boolean isAireEncendido() {
        return aireEncendido;
    }

    public void setAireEncendido(boolean aireEncendido) {
        this.aireEncendido = aireEncendido;
    }
    
    //Creamos el método que hereda de Vehiculo
    
    /**
     * Método heredado que nos dice a qué velocidad circula el coche
     */
    @Override
    public void mostrarMovimiento(){
        System.out.println("El coche está circulando a: " + this.velocidad 
                + "kms/h");
    }
    
    //Creamos el método propio
    
    /**
     * Método propio de la clase que, si el aire está encendido, baja la 
     * velocidad 10km/h. Si estaba ya encendido nos los dice
     */
    public void encenderAire(){
        if (!this.aireEncendido) {
            this.aireEncendido = true;
            this.velocidad -= 10;
            System.out.println("El coche ha encendido el aire. La velocidad se reduce 10km/h");
            
        } else {
            System.out.println("El aire ya está encendido");
        }
    }
    
    //Creamos To String

    @Override
    public String toString() {
        return "El Coche tiene el aire: " + aireEncendido;
    }
    
}
