package proyectocoleccionistafiguras;

/**
 *
 * @author KevinNS
 */
public class Vitrina {

    // Creamos el atributo de tipo Figura   
    private Figura[][] huecoFigura;

    // Creamos el constructor por defecto
    public Vitrina() {
        huecoFigura = new Figura[3][3];
    }

    // Creamos el constructor parametrizado
    public Vitrina(Figura[][] huecoFigura) {
        this.huecoFigura = huecoFigura;
    }
    
    // Creamos los getters y setters

    public Figura[][] getHuecoFigura() {
        return huecoFigura;
    }

    public void setHuecoFigura(Figura[][] huecoFigura) {
        this.huecoFigura = huecoFigura;
    }
    
    // Creamos To String

    @Override
    public String toString() {
        return "Vitrina | " + " Hueco de la Figura: " + huecoFigura;
    }
    
}
