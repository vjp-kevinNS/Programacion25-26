
/**
 * Es la super clase de circulo, rectangulo y cuadrado
 * 
 * Implementa una clase FiguraGeometrica que contenga un atributo color y 
 * dos métodos abstractos que permitan calcular el área y el perímetro de
 * la figura
 *
 * @author KevinNS
 */
public abstract class FiguraGeometrica {
    
    //Creamos el atributo
    private String color;
    
    //Creamos el constructor por defecto
    public FiguraGeometrica(){
        this.color = "";
    }
    
    //Creamos el constructor parametrizado
    public FiguraGeometrica(String color){
        this.color = color;
    }
    
    //Creamos el getter y setter

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    //Creamos los métodos
    
    /**
     * Metodos abstractos que deberan usarse en las clases que heredan de esta
     * Uno para calcular el área y otro para calcular el perímetro
     * 
     */
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
    
    //Creamos To String

    @Override
    public String toString() {
        return "FiguraGeometrica{" + "color=" + color + '}';
    }
    

}
