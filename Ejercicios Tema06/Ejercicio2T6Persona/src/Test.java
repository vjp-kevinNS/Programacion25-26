
/**
 * Crea una clase Test en la que instancies un objeto de cada
 * subclase implementada anteriormente y pruebes el método
 * saludar de cada objeto.
 * 
 * Posteriormente, utiliza el polimorfismo para crear cada uno de
 * los objetos a partir de la superclase Persona y prueba los
 * métodos implementados nuevamente.
 *
 * @author KevinNS
 */
public class Test {

    public static void main(String[] args) {
     
        //Creamos los objetos. Primero sin polimorfismo
        Profesor profesor1 = new Profesor("Programación", "Ana Isabel");
        Alumno alumno1 = new Alumno("DAW", "Kevin Núñez");
        
        System.out.println(profesor1.saludar());
        System.out.println(alumno1.saludar());
        
        //Creamos los objetos usando polimorfismo
        
        //Creamos la variable de la superclase abstracta
        Persona persona;
        
        persona = new  Profesor("Base de Datos", "Puerto Cruz");
        System.out.println(persona.saludar());
        persona = new Alumno("DAM", "Perico Palotes");
        System.out.println(persona.saludar());
    }

}
