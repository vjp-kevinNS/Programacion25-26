/**
 * Círculo hereda de FiguraGeometrica
 * 
 * El círculo tiene como atributo su radio en centímetros
 * 
 * @author KevinNS
 */
public class Circulo extends FiguraGeometrica {
    
    //Creamos el atributo
    private double radio;
    
    //Creamos el constructor por defecto añadiendo super
    public Circulo(){
        super();
        this.radio = 0;
    }
    
    //Creamos el constructor parametrizado
    public Circulo(String color, double radio){
        super(color);
        this.radio = radio;
    }
    
    //Creamos el getter y setter

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    //Creamos los métodos heredados de la superclase con el Override
    
    /**
     * Método que calcula el área del círculo
     * @return el área del círculo
     */
    @Override
    public double calcularArea(){
        //Area = PI * radio * radio
        return Math.PI * radio * radio;
    }
    
    /**
     * Método que calcula el perímetro del círculo
     * @return el perímetro del círculo
     */
    @Override
    public double calcularPerimetro(){
        //Area = 2 * PI * radio
        return 2 * Math.PI * radio;
    }
    
    //Creamos To String

    @Override
    public String toString() {
        return "Círculo (Color: " + getColor() + ") | Área: " + calcularArea() + 
           " | Perímetro: " + calcularPerimetro();
    }
    
}
