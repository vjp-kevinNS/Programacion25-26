
/**
 * Desarrolla una clase de prueba con un método main para crear
 * las cuatro figuras y probar sus respectivos métodos.
 *
 * Posteriormente, utiliza el polimorfismo para crear cada uno de
 * los objetos a partir de la superclase FiguraGeometrica y prueba
 * los métodos implementados nuevamente
 *
 * @author KevinNS
 */
public class Prueba {

    public static void main(String[] args) {

        //Creamos los objetos, primero sin polimorfismo
        
        //Circulo (necesitamos radio)
        Circulo circulo = new Circulo("Azul", 5.0);
        System.out.println("Círculo (Rojo): Área = " + circulo.calcularArea()
                + " | Perímetro = " + circulo.calcularPerimetro());
        //Rectángulo (necesitamos basde y altura)
        Rectangulo rectangulo = new Rectangulo("Rojo", 10.0, 4.0);
        System.out.println("Rectángulo (Azul): Área = " + rectangulo.calcularArea() 
                + " | Perímetro = " + rectangulo.calcularPerimetro());
        //Cuadrado (necesita sólo lado, que pasa como base y altura
        Cuadrado cuadrado = new Cuadrado(6.0, "Verde");
        System.out.println("Cuadrado (Verde): Área = " + cuadrado.calcularArea() 
                + " | Perímetro = " + cuadrado.calcularPerimetro());
        //Triángulo Rectángulo  (necesita base y altura/catetos)
        TrianguloRectangulo trianguloRectangulo = new TrianguloRectangulo(4.0, 3.0, "Amarillo");
        System.out.println("Triángulo (Amarillo): Área = " + trianguloRectangulo.calcularArea() 
                + " | Perímetro = " + trianguloRectangulo.calcularPerimetro());
        
        // Podemos llamar a métodos específicos de TrianguloRectangulo
        System.out.println("  -> Hipotenusa: " + trianguloRectangulo.calcularHipotenusa());
        System.out.println("  -> Tipo: " + trianguloRectangulo.tipoTriangulo());
        
        
        //Ahora usamos el polimorfismo
        
        // Declaramos una variable que es del tipo de la superclase abstracta
        // Esta variable puede almacenar cualquier objeto que herede de ella
        
        FiguraGeometrica figura; 
        
        //Guardamos un rectángulo en la variable
        figura = new Rectangulo("Morado", 8, 2);
        System.out.println("Área de la figura (Rectángulo): " + figura.calcularArea());
        //Guardamos un cuadrado en la variable
        figura = new Cuadrado(5.0, "Negro");
        System.out.println("Área de la figura (Cuadrado): " + figura.calcularArea());
        //Guardamos un circulo en la variable
        figura = new Circulo("Gris", 10.0);
        System.out.println("Área de la figura (Círculo): " + figura.calcularArea());
    }

}
