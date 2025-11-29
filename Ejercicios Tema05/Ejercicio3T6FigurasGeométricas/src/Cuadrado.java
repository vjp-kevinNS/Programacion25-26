/**
 * Cuadrado hereda de FiguraGeometrica, pero en este caso heredamos de Rectangulo
 * 
 * El cuadrado tiene como atributos la longitud de sus lados en centímetros.
 * @author KevinNS
 */
public class Cuadrado extends Rectangulo { //En este caso como area y perimetro
    //es lo mismo que el del rectángulo heredamos de ese esos datos para no 
    //repetir código
    
    //Creamos el atributo
    private double longitud;
    
    //Creamos el constructor con los atributos de Rectangulo
    public Cuadrado(){
        super();
        this.longitud = 0;
    }
    
    //Creamos el constructor parametrizado con los atributos de Rectangulo
    public Cuadrado(double longitud, String color){
        super(color, longitud, longitud);
        this.longitud = longitud;
    }
    
    //Creamos el getter y setter

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
    
    // NOTA: En este caso no necesitamos sobrescribir calcularArea() 
    // ni calcularPerimetro()porque los heredamos de Rectangulo por lo tanto
    // no necesitamos crear ningún método
    
    //Creamos To String

    @Override
    public String toString() {
        // Reutilizamos calcularArea y calcularPerimetro del Rectangulo
        return "Cuadrado (%s) - Longitud: %.2f | Área: %.2f | Perímetro: %.2f\n" + 
            getColor() + longitud + calcularArea() + calcularPerimetro();
    }
    
}
