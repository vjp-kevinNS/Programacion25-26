
/**
 * Crea otra interfaz Pagable con los métodos:
 * 
 * ○ float pagoTarjeta();
 * ○ float pagoEfectivo();
 * ○ float pagoPaypal();
 * ○ void procesarPago();
 *
 * @author KevinNS
 */
public interface Pagable {
    
    //Creamos los métodos que tendrá que implementar la clase Carrito
    public void pagoTarjeta();
    public void pagoEfectivo();
    public void pagoPaypal();
    public void procesarPago();

}
