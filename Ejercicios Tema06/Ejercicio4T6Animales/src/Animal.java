
/**
 * Animal es la clase raíz y contiene los atributos nombre, edad, y peso.
 * 
 * Esta clase debe tener métodos abstractos para mostrar el sonido, la
 * alimentación, el hábitat y el nombre científico del animal.
 *
 * @author KevinNS
 */
public abstract class Animal {
    
    //Creamos los atributos
    private String nombre;
    private int edad;
    private double peso;
    
    //Creamos los constructores por defecto
    public Animal(){
        this.nombre = "";
        this.edad = 0;
        this.peso = 0;
    }
    
    //Creamos los constructores parametrizados
    public Animal(String nombre, int edad, double peso){
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }
    
    //Creamos los getter y setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    //Creamos los métodos abstractos que usarán las demás subclases
    
    public abstract String mostrarSonido();
    public abstract String mostrarAlimentacion();
    public abstract String mostrarHabitat();
    public abstract String mostrarNombreCientifico();
    
    //Creamos To String

    @Override
    public String toString() {
        return "Animal = " + " Nombre: " + nombre + " Edad: " + edad + "  Peso: " + peso;
    }
    
    

}
