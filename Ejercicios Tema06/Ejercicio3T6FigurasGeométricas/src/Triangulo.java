
/**
 * Es la super clase de TrianguloRectangulo
 * 
 * El triángulo tiene como atributos su base y altura en centímetros
 * 
 * @author KevinNS
 */
public abstract class Triangulo extends FiguraGeometrica {
    
    //Creamos los atributos usando protected para que TrianguloRectangulo
    //acceda directamente a ellos
    
    protected double base;
    protected double altura;
    
    //Creamos el constructor por defecto añadiendo super
    public Triangulo(){
        super();
        this.altura = 0;
        this.base = 0;
    }
    
    //Creamos el constructor parametrizado añadiendo super
    public Triangulo(double base, double altura, String color){
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
    
    //Creamos los métodos
    //Primero añadimos el método calculaArea que es válido para cualquier triángulo
    
    /**
     * Método que calcula el área del triángulo
     * @return el área del triángulo
     */
    @Override
    public double calcularArea() {
        // Fórmula: (base * altura) / 2
        return (base * altura) / 2;
    }

    // No añadimos calcularPerimetro aquí. Obligamos a la clase TrianguloRectangulo
    // a que lo haga, porque solo ella sabrá calcularlo (base + altura + hipotenusa)
    // ya que es dificil calcular el perímetro sin saber el tercer lado
    
    //Creamos To String

    @Override
    public String toString() {
        return "Triangulo{" + "base=" + base + ", altura=" + altura + '}';
    }
    
}
