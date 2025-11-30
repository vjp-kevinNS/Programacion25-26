
/**
 * Crea una clase Test en la que instancies un objeto de cada
 * subclase implementada anteriormente y muestres las
 * características de cada animal.
 *
 * Posteriormente, utiliza el polimorfismo para crear cada uno de
 * los objetos a partir de la superclase Animal y prueba los métodos
 * implementados nuevamente.
 *
 * @author KevinNS
 */
public class Test {

    // Creamos un método para mostrar las carácteristicas de cualquier animal
    public static void mostrarCaracteristicas(Animal animal) {
        // Usamos el to string de Animal
        System.out.println(animal.toString());
        System.out.println("Sonido: " + animal.mostrarSonido());
        System.out.println("Alimentación: " + animal.mostrarAlimentacion());
        System.out.println("Hábitat: " + animal.mostrarHabitat());
        System.out.println("Nombre Científico: " + animal.mostrarNombreCientifico());

    }

    public static void main(String[] args) {

        // Creamos los objetos, primero sin polimorfismo
        Perros perro = new Perros("Kenay", 10, 9.5);
        Lobos lobo = new Lobos("Lobezno", 5, 50.7);
        Leones leon = new Leones("Simba", 10, 190.0);
        Gatos gato = new Gatos("Lúa", 3, 7.5);
        
        mostrarCaracteristicas(perro);
        mostrarCaracteristicas(lobo);
        mostrarCaracteristicas(leon);
        mostrarCaracteristicas(gato);
        
        // Creamos los objetos usando el polimorfismo
        
        //Declaramos una variable de la clase abstracta Animal
        Animal tipoAnimal;
        
        tipoAnimal = new Perros("Sercan", 6, 25.0);
        mostrarCaracteristicas(tipoAnimal);
        tipoAnimal = new Lobos("Varian", 9, 40.0);
        mostrarCaracteristicas(tipoAnimal);
        tipoAnimal = new Leones("Scar", 15, 180.0);
        mostrarCaracteristicas(tipoAnimal);
        tipoAnimal = new Gatos("Sbaty", 9, 5.0);
        mostrarCaracteristicas(tipoAnimal);
    }

}
