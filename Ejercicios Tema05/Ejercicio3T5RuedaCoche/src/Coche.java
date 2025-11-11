/**
 *Diseñar una clase Coche que contenga los siguientes atributos privados:
    • marca (de tipo cadena)
    • modelo (de tipo cadena)
    • ruedas (objeto de tipo Rueda)
* 
• La clase Coche contendrá los siguientes métodos públicos:
    • establecerMarca
    • establecerModelo.
    • obtenerMarca.
    • obtenerModelo.
    • establecerRueda.
    • obtenerRueda.
 * @author KevinNS
 */
public class Coche {
    
    //Creamos los atributos privados
    private String marca;
    private String modelo;
    private Rueda rueda;
    
    //Creamos los constructores por defecto
    public Coche(){
        this.marca = "";
        this.modelo = "";
        this.rueda = new Rueda(); //sabemos que rueda ya existe
    }
    
    //Creamos los constructores con sus parámetros
    public Coche(String marca, String modelo, Rueda rueda){
        this.marca = marca;
        this.modelo = modelo;
        this.rueda = rueda;
    }
    
    //Creamos los getter y setters

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Rueda getRuedas() {
        return rueda;
    }

    public void setRuedas(Rueda rueda) {
        this.rueda = rueda;
    }
    
    //Creamos los métodos
    /**
     * Método que establece el modelo del coche
     */
    public void establecerModelo(String modelo){
        this.modelo = modelo;
    }
    /**
     * Método que establece la marca del coche
     */
    public void establecerMarca(String marca){
        this.marca = marca;
    }
    /**
     * Método que nos dá el modelo del coche 
     * @return modelo del coche
     */
    public String obtenerModelo(){
        return this.modelo;
    }
    /**
     * Método que nos dá la marca del coche
     * @return marca del coche
     */
    public String obtenerMarca(){
        return this.marca;
    }
    /**
     * Método que establece las ruedas del coche
     */
    public void establecerRueda(Rueda rueda){
        this.rueda = rueda;
    }
    /**
     * Método que nos dá las ruedas del coche
     * @return ruedas del coche
     */
    public Rueda obtenerRuedas(){
        return this.rueda;
    }
    
    //Creamos To String
    @Override
    public String toString(){
        return "La marca del coche es: " + this.marca + " , el modelo es: "
                + this.modelo + " y usa las ruedas " + this.rueda;
    }
}
