
/**
 * Interfaz Volador, con los métodos obtenerMensajeVolador, aumentarAlturaVuelo, 
 * bajarAlturaVuelo y mostrarAlturaVuelo.
 *
 * @author KevinNS
 */
public interface Volador {
    
    //Creamos los métodos que usará, en este caso, Murciélago
    
    public String obtenerMensajeVolador();
    public void aumentarAlturaVuelo();
    public void bajarAlturaVuelo();
    public void mostrarAlturaVuelo();
}
