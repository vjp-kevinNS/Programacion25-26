package ejerciciorepasoalumnos;

/**
 * Clase Alumno que tendrá como atributos: nombre, edad y nota.
 *
 * @author KevinNS
 */
public class Alumno {
    
    // Creamos los atributos 
    private String nombre;
    private int edad;
    private float nota;
    
    // Creamos los constructores por defecto

    public Alumno() {
        this.nombre = "";
        this.edad = 0;
        this.nota = 0f;
    }
    
    // Creamos los constructores parametrizados

    public Alumno(String nombre, int edad, float nota) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota = nota;
    }
    
    // Creamos los getters y setters

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

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
    
    // Creamos To String

    @Override
    public String toString() {
        return "Alumno | " + " Nombre: " + nombre + " | Edad: " + edad + " | Nota:" + nota;
    }
    
    

}
