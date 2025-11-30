/**
 * Rectángulo hereda de FiguraGeometrica
 * 
 * El rectángulo tiene como atributos su base y altura en centímetros.
 * 
 * @author KevinNS
 */
public class Rectangulo extends FiguraGeometrica{
    
    //Creamos los atributos
    private double base;
    private double altura;
    
    //Creamos los constructores por defecto añadiendo super
    public Rectangulo(){
        super();
        this.altura = 0;
        this.base = 0;
    }
    
    //Creamos los constructores por defecto añadiendo super
    public Rectangulo(String color, double base, double altura){
        super(color);
        this.altura = altura;
        this.base = base;
    }
    
    //Creamos los getter y setter

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    //Creamos los métodos heredados de la superclase
    
    /**
     * Método que calcula el área del rectángulo
     * @return el área del rectángulo
     */
    @Override
    public double calcularArea(){
        //Area = base * altura
        return base * altura;
    }
    
    /**
     * Método que calcula el perímetro del cuadrado
     * @return el perímetro del cuadrado
     */
    public double calcularPerimetro(){
        //Perímetro = 2 * base + 2 * altura
        return 2 * (base + altura);
    }

    //Creamos To String

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }

}
