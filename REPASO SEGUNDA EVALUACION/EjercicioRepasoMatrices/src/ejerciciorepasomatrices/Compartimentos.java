package ejerciciorepasomatrices;

/**
 * String objetos, String material, float precio
 *
 * @author KevinNS
 */
public class Compartimentos {

    // Creamos los atributos
    private String objetos;
    private String material;
    private float precio;

    // Creamos los constructores por defecto
    public Compartimentos() {
        this.objetos = "";
        this.material = "";
        this.precio = 0f;
    }

    // Creamos los constructores parametrizados
    public Compartimentos(String objetos, String material, float precio) {
        this.objetos = objetos;
        this.material = material;
        this.precio = precio;
    }

    // Creamos los getters y setters
    public String getObjetos() {
        return objetos;
    }

    public void setObjetos(String objetos) {
        this.objetos = objetos;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    // Creamos To String
    @Override
    public String toString() {
        return "Compartimentos " + " | Objetos: " + objetos + " | Material: " + material + " | Precio: " + precio;
    }

}
