
/**
 * La clase Moto hereda de Vehículo
 * 
 * La clase Moto tiene el atributo haciendoCaballito y los siguientes métodos:
 * 
• mostrarMovimiento. Muestra el mensaje “La moto está circulando a … km/h”.
• hacerCaballito. Si la moto no está haciendo un caballito, lo hace, muestra el 
* mensaje “La moto está haciendo un caballito. La velocidad aumenta” y aumenta 
* el atributo velocidad en 15 km/h. Si la moto está haciendo un caballito, 
* muestra el mensaje “La moto ya está haciendo un caballito”.

 * @author KevinNS
 */
public class Moto extends Vehiculo {
    
    //Creamos el atributo
    private boolean haciendoCaballito;
    
    //Creamos el constructor por defecto añadiendo super
    public Moto(){
        super();
        this.haciendoCaballito = false;
    }
    
    //Creamos el contructor parametrizado añadiendo super
    public Moto(int velocidadInicial, boolean haciendoCaballito){
        super(velocidadInicial);
        this.haciendoCaballito = false;
    }
    
    //Creamos el getter y setter

    public boolean isHaciendoCaballito() {
        return haciendoCaballito;
    }

    public void setHaciendoCaballito(boolean haciendoCaballito) {
        this.haciendoCaballito = haciendoCaballito;
    }
    
    //Creamos el método que hereda de Vehículo
    
    /**
     * Método heredado que nos muestra a que velocidad circula la moto
     */
    @Override
    public void mostrarMovimiento(){
        System.out.println("La moto está circulando a: " + this.velocidad 
                + "kms/h");
    }
    
    //Creamos el método propio
    public void hacerCaballito(){
        if (!haciendoCaballito) {
            this.haciendoCaballito = true;
            this.velocidad += 15;
            System.out.println("La moto está haciendo un caballito. La velocidad aumenta 15kms/h");
            
        } else {
            System.out.println("La moto ya está haciendo un caballito");
        }
    }
    
}
