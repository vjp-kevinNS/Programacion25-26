package tema10arraylist;

/**
 *
 * @author KevinNS
 */
public class Coche {

    // ATRIBUTOS
    private String color;
    private int potencia;

    // CONSTRUCTORES
    public Coche() {
        this.color = "";
        this.potencia = 0;
    }

    public Coche(String color, int potencia) {
        this.color = color;
        this.potencia = potencia;
    }

    // GETTERS Y SETTERS
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    // TO STRING
    @Override
    public String toString() {
        return "Coche{" + "color=" + color + ", potencia=" + potencia + '}';
    }

}
