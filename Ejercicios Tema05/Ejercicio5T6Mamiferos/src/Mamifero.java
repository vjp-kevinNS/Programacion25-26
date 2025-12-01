
/**
 * Desarrolla un programa en JAVA, orientado a objetos, en el que crees una 
 * clase llamada Mamifero con los atributos nombre, sexo, color y edad.
 *
 * @author KevinNS
 */
public class Mamifero {
    
    //Creamos los atributos
    private String nombre;
    private String sexo;
    private String color;
    private int edad;
    
    //Creamos los constructores por defecto
    public Mamifero(){
        this.nombre = "";
        this.sexo = "";
        this.color = "";
        this.edad = 0;
    }
    
    //Creamos los atributos parametrizados
    public Mamifero(String nombre, String sexo, String color, int edad){
        this.nombre = nombre;
        this.sexo = sexo;
        this.color = color;
        this.edad = edad;
    }
    
    //Creamos los getter y setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //Creamos To String

    @Override
    public String toString() {
        return "Mamifero: " + " Nombre: " + nombre + " sexo: " + sexo 
                + " color: " + color + " edad:" + edad;
    }
    
}
