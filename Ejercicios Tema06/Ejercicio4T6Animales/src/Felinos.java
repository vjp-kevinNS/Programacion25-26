
/**
 * Subclase de animal
 * 
 * @author KevinNS
 */
public abstract class Felinos extends Animal {
    
    // Creamos el constructor parametrizado heredado de la superclase (Animal)
    public Felinos(String nombre, int edad, double peso){
        super(nombre, edad, peso);
    }
    
    // Como no implementa los métodos abstractos de la superclase (Animal), 
    // esta clase sigue siendo abstracta.
    
}
