
/**
 * Interfaz ControlRemoto con los siguientes métodos de tipo void: 
 * apagar(), encender(), bajarVolumen(), subirVolumen() y cambiarCanal(float canal).
 *
 * @author KevinNS
 */
public interface ControlRemoto {
    
    //Creamos los métodos que usaran las clases Televisor y Radio
    
    public void apagar();
    public void encender();
    public void bajarVolumen();
    public void subirVolumen();
    public void cambiarCanal(float canal);

}
