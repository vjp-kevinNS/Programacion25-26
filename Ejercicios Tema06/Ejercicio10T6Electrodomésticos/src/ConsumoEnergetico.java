
/**
 * Crea una interfaz ConsumoEnergetico con los métodos:
 * 
 * • float calcularConsumo(float horasDeUso);
 * • float calcularFactura(float horasDeUso);
 *
 * @author KevinNS
 */
public interface ConsumoEnergetico {
    
    //Creamos los métodos que usará la clase Electrodomésticos
    
    public float calcularConsumo(float horasDeUso);
    public float calcularFactura(float horasDeUso);

}
