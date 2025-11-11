/**
 * Clase Rueda que contiene los siguientes atributos privados:
 * • material (de tipo cadena)
 * • pulgadas (de tipo entero)
 *
 * • La clase Rueda contendrá los siguientes métodos públicos:
 * • establecerMaterial
 * • establecerPulgadas.
 * • obtenerMaterial.
 * • obtenerPulgadas.
 *
 * @author KevinNS
 */
public class Rueda {

    //Creamos los atributos privados
    private String material;
    private int pulgadas;

    //Creamos los constructores por defecto
    public Rueda() {
        this.material = "";
        this.pulgadas = 0;
    }

    //Creamos los constructores con sus parámetros
    public Rueda(String material, int pulgadas) {
        this.material = material;
        this.pulgadas = pulgadas;
    }

    //Creamos los getters y setters
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    //Creamos los métodos públicos
    /**
     * Método que establece el material de las ruedas
     */
    public void establecerMaterial(String material) {
        this.material = material;
    }
    /**
     * Método que establece las pulgadas de las ruedas
    */
    public void establecerPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }
    /**
     * Método que nos dá el material de las ruedas
     * @return material de las ruedas
     */
    public String obtenerMaterial() {
        return this.material;
    }
    /**
     * Método que nos dá las pulgadas de las ruedas
     * @return pulgadas de las ruedas
     */
    public int obtenerPulgadas() {
        return this.pulgadas;
    }

    //Creamos To String
    @Override
    public String toString() {
        return "de: " + this.material
                + ". Tienen las siguientes pulgadas: " + this.pulgadas;
    }
}
