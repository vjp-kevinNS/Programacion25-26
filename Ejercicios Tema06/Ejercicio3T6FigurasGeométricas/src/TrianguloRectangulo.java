
/**
 * TranguloRectangulo hereda de Triangulo
 * 
 * Para el triángulo rectángulo se requiere:
 * 
 * • Un método que calcule y devuelva la hipotenusa del triángulo.
 * • Un método para determinar qué tipo de triángulo es: Equilátero, Isósceles
 * o Escaleno.
 *
 * @author KevinNS
 */
public class TrianguloRectangulo extends Triangulo{
    
    // En este caso no tenemos que crear ningún atributo ya que los hereda
    // directamente de la clase Triangulo. Por lo tanto creamos directamente
    // el constructor parametrizado añadiendo super
    
    public TrianguloRectangulo(double base, double altura, String color){
        super(base, altura, color);
        
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
    
    //Creamos el método propio, es decir, que no hereda de FiguraGeometrica
    
    /**
     * Método que calcula la hipotenusa del triángulo rectángulo
     * @return la hipotenusa del triángulo rectángulo
     */
    public double calcularHipotenusa(){
        //Hipotenusa (Cateto1^2 + Cateto2^2 = Hipotenusa^2)
        return Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
    }
    
    //En este caso ya si usamos el método de FiguraGeometrica con el Override
    
    /**
     * Método que calcula el perímetro del triángulo rectángulo 
     * @return el perímetro del triángulo rectángulo
     */
    @Override
    public double calcularPerimetro(){
        // Perimetro = cateto + cateto + hipotenusa
        return base + altura + calcularHipotenusa();
    }
    
    // Creamos el método que nos dira si el triángulo recángulo es EQUILATERO
    // ESCALENO o ISOSCELES
    
    /**
     * Método que nos dice el tipo de triángulo rectángulo. No he añadido el 
     * equilátero ya que un triángulo rectángulo nunca puede serlo
     * @return el tipo de triángulo rectángulo
     */
    public String tipoTriangulo(){
        
        double lado1 = base;
        double lado2 = altura;
        
        //Creamos un if para la comparación
        if (lado1 == lado2) {
            return "Triángulo Rectángulo Isósceles (base y altura son iguales)";
        } else {
            return "Triángulo Rectángulo Escaleno (base y altura son diferentes)";
            
            // Un triángulo rectángulo nunca puede ser EQUILATERO
        }
    }
 
}
