
/**
 * Hereda de Canidos
 * 
 * Los perros son cánidos, su sonido es el ladrido, su alimentación es
 * carnívora, su hábitat es doméstico y su nombre científico es Canis lupus
 * familiaris.
 *
 * @author KevinNS
 */
public class Perros extends Canidos {
    
    // Creamos el constructor parametrizado que hereda de la superclase (Canidos)
    // que a su vez hereda de la superclase (Animal)
    public Perros (String nombre, int edad, double peso){
        super(nombre, edad, peso);
    }
    
    // Creamos los métodos que hereda de la superclase con los datos añadiendo
    // Override
    
    @Override
    public String mostrarSonido(){
        return "Ladrido";
    }
    
    @Override
    public String mostrarAlimentacion(){
        return "Carnivora";
    }
    
    @Override
    public String mostrarHabitat(){
        return "Doméstico";
    }
    
    @Override
    public String mostrarNombreCientifico(){
        return "Canis Lupus Familiaris";
    }
}
