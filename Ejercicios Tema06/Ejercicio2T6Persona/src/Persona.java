
/**
 * Desarrolla un programa en JAVA, orientado a objetos, en el que crees una 
 * clase llamada Persona que contenga un atributo nombre y el método abstracto 
 * saludar
 *
 * @author KevinNS
 */
public abstract class Persona {
    
    //Creamos el atributo
    private String nombre;
    
    //Creamos el constructor por defecto
    public Persona(){
        this.nombre = "";
    }
    
    //Creamos el constructor parametrizado
    public Persona(String nombre){
        this.nombre = nombre;
    }
    
    //Creamos los getter y setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //Creamos el método abstracto
    public abstract String saludar();
    
    //Creamos To String

    @Override
    public String toString() {
        return "Profesor o alumno llamado: " + this.nombre;
    }
    

}
