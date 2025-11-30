
/**
 * Hereda de Felinos
 * 
 * Los leones son felinos, su sonido es el rugido, su alimentación
 * es carnívora, su hábitat es la sabana y su nombre científico es
 * Panthera leo.
 *
 * @author KevinNS
 */
public class Leones extends Felinos {
    
    // Creamos el constructor parametrizado que hereda de la superclase (Felinos)
    // que a su vez hereda de la superclase (Animal)
    public Leones(String nombre, int edad, double peso){
        super(nombre, edad, peso);
    }
    
    // Creamos los métodos que hereda de la superclase con los datos añadiendo
    // Override
    
    @Override
    public String mostrarSonido(){
        return "Rugido";
    }
    
    @Override
    public String mostrarAlimentacion(){
        return "Carnívora";
    }
    
    @Override
    public String mostrarHabitat(){
        return "La sabána";
    }
    
    @Override
    public String mostrarNombreCientifico(){
        return "Panthera Leo";
    }
}

