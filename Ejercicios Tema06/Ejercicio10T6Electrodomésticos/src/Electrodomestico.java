
/**
 * Crea una clase Electrodoméstico con los atributos kwh, precioKwh y eficiencia,
 * y que implemente la interfaz ConsumoEnergetico.
 *
 * El consumo se calcula multiplicando las horas de uso por los kwh por
 * el factor de eficiencia. La factura se calcula multiplicando elconsumo por el
 * precio del kwh. Ten en cuenta que el factor de eficiencia varía según la 
 * eficiencia:
 * 
 * ○ A++: 0,5
 * ○ A+: 0,7
 * ○ A: 1
 * ○ B: 1.2
 *
 * @author KevinNS
 */
public class Electrodomestico implements ConsumoEnergetico{
    
    //Creamos los atributos
    private float kwh;
    private float precioKwh;
    private String eficiencia;
    
    //Creamos los constructores por defecto
    public Electrodomestico(){
        this.kwh = 0;
        this.precioKwh = 0;
        this.eficiencia = "";
    }
    
    //Creamos los constructores parametrizados
    public Electrodomestico(float kwh, float precioKwh, String eficiencia){
        this.kwh = kwh;
        this.precioKwh = precioKwh;
        this.eficiencia = eficiencia;
    }
    
    //Creamos lo getter y los setter

    public float getKwh() {
        return kwh;
    }

    public void setKwh(float kwh) {
        this.kwh = kwh;
    }

    public float getPrecioKwh() {
        return precioKwh;
    }

    public void setPrecioKwh(float precioKwh) {
        this.precioKwh = precioKwh;
    }

    public String getEficiencia() {
        return eficiencia;
    }

    public void setEficiencia(String eficiencia) {
        this.eficiencia = eficiencia;
    }

    //Creamos el método para obtener el factor eficiencia
    
    /**
     * Método que, según el consumo, nos da la eficiencia del electrodoméstico 
     * @return la eficiencia
     */
    public float obtenerFactorEficiencia(){
        switch (eficiencia) {
            case "A++":
                return 0.5f;
            case "A+":
                return 0.7f;
            case "A":
                return 1f;
            case "B":
                return 1.2f;
            default:
                return 1f; //por defecto
        }
    }
    
    //Creamos los métodos que nos manda ConsumoEnergético
    
    /**
     * Método que calcula el consumo del electrodoméstico
     * @param horasDeUso
     * @return el consumo
     */
    public float calcularConsumo(float horasDeUso){
        return horasDeUso * kwh * obtenerFactorEficiencia();
    }
    
    /**
     * Método que calcula el gasto del electrodoméstico
     * @param horasDeUso
     * @return el gasto
     */
    public float calcularFactura(float horasDeUso){
        return calcularConsumo(horasDeUso) * precioKwh;
    }
    
    //Creamos To String

    @Override
    public String toString() {
        return "Este electrodoméstico consume (kwh): " + kwh +
                " . El precio del Kwh está: " + precioKwh +
                " . Su eficiencia es: " + eficiencia;
    }
    

}
