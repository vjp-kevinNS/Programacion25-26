
/**
 * Hereda de Canidos
 * 
 * Los lobos son cánidos, su sonido es el aullido, su alimentación
 * es carnívora, su hábitat es el bosque y su nombre científico es
 * Canis lupus.
 *
 * @author KevinNS
 */
public class Lobos extends Canidos{
    
    // Creamos el constructor parametrizado que hereda de la superclase (Canidos)
    // que a su vez hereda de la superclase (Animal)
    public Lobos(String nombre, int edad, double peso){
        super(nombre, edad, peso);
    }
    
    // Creamos los métodos que hereda de la superclase con los datos añadiendo
    // Override
    
    @Override
    public String mostrarSonido(){
        return "Aullido";
    }
    
    @Override
    public String mostrarAlimentacion(){
        return "Carnívora";
    }
    
    @Override
    public String mostrarHabitat(){
        return "Bosque";
    }
    
    @Override
    public String mostrarNombreCientifico(){
        return "Canis Lupus";
    }
}
