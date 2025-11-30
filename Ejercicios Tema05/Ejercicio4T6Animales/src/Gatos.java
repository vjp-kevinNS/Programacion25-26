
/**
 * Hereda de Felinos
 * 
 * Los gatos son felinos, su sonido es el maullido, se alimenta de
 * ratones, su hábitat es doméstico y su nombre científico es
 * Felis silvestris catus.
 *
 * @author KevinNS
 */
public class Gatos extends Felinos{
    
    // Creamos el constructor parametrizado que hereda de la superclase (Felinos)
    // que a su vez hereda de la superclase (Animal)
    public Gatos(String nombre, int edad, double peso){
        super(nombre, edad, peso);
    }
    
    // Creamos los métodos que hereda de la superclase con los datos añadiendo
    // Override
    
    @Override
    public String mostrarSonido(){
        return "Maullido";
    }
    
    @Override
    public String mostrarAlimentacion(){
        return "Ratones";
    }
    
    @Override
    public String mostrarHabitat(){
        return "Doméstico";
    }
    
    @Override
    public String mostrarNombreCientifico(){
        return "Felis Silvestris Catus";
    }
}


