
/**
 * Crea una clase Test en la que instancies un objeto de cada subclase
 * implementada anteriormente y pruebes el método realizarOperacion de cada objeto.
 * 
 * Posteriormente, utiliza el polimorfismo para crear cada uno de los objetos 
 * a partir de la superclase Calculadora y prueba los métodos implementados nuevamente.
 *
 * @author KevinNS
 */
public class Test {

    
    public static void main(String[] args) {
        
        //Creamos los objetos, primero sin poliformismo
        Suma suma = new Suma(5, 9);
        suma.realizarOperacion();
        
        Multiplicacion multiplicacion = new Multiplicacion(6, 5.5);
        multiplicacion.realizarOperacion();
        
        Potencia potencia = new Potencia(10, 2);
        potencia.realizarOperacion();
        
        //Creamos los objetos con poliformismo
        
        //Declaramos una única variable de la superclase abstracta.
        
        Calculadora calculadora;  //Esta variable puede apuntar a cualquier 
                                  //objeto que herede de Calculadora
                                  
        System.out.println("---Usando Suma---");
        calculadora = new Suma(8, 9);
        calculadora.realizarOperacion();
        
        System.out.println("---Usando Multiplicación---");
        calculadora = new Multiplicacion(3, 6);
        calculadora.realizarOperacion();
        
        System.out.println("---Usando Potencia---");
        calculadora = new Potencia(7, 3);
        calculadora.realizarOperacion();
    }

}
