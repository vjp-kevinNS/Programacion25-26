
/**
 * Crea una clase main llamada Test en la que implementes el método 
 * procesarVehiculo(Vehiculo vehiculo). Este método no devuelve nada y realiza
 * lo siguiente:
 * 
 * • Muestra el movimiento del vehículo.
 * • Si el vehículo es un coche, enciende el aire y muestra el movimiento del 
 * coche.
 * • Si el vehículo es una moto, hace un caballito y muestra el movimiento de la
 * moto.
 * • Posteriormente, instancia un Vehiculo de cada tipo (Coche y Moto) e invoca 
 * al método procesarVehiculo pasándole ambos objetos.
 *
 * @author KevinNS
 */
public class Test {
    
    //Creamos un método que utiliza polimorfismo (puede recibir cualquier objeto
    //que sea de tipo Vehiculo o que herede de él (Coche o Moto)
    
    public static void procesarVehiculo(Vehiculo vehiculo){
        
        // 1-Muestra el movimiento inicial
        vehiculo.mostrarMovimiento();
        
        // 2-Comprobamos si el objeto es un coche
        if (vehiculo instanceof Coche) {
            Coche coche = (Coche) vehiculo;
            coche.encenderAire();
            coche.mostrarMovimiento(); 
            
        // 3-Si no es un Coche comprobamos si es una Moto
        }else if (vehiculo instanceof Moto) {
            Moto moto = (Moto) vehiculo;
            moto.hacerCaballito();
            moto.mostrarMovimiento();
        }else{
            System.out.println("Vehículo no reconocido");
        }
    }

    public static void main(String[] args) {
        
        //Creamos los objetos asignándoles una velocidad inicial
        Coche miCoche = new Coche(80, true);
        Moto miMoto = new Moto(95, true);
        
        System.out.println("Velocidad inicial del coche: " + miCoche.getVelocidad() 
                + "kms/h" );
        System.out.println("Velocidad inicial de la moto: " + miMoto.getVelocidad() 
                + "kms/h" );
        
        //Procesar el coche
        procesarVehiculo(miCoche);
        //Procesar la moto
        procesarVehiculo(miMoto);

    }

}
