package ejercicio13y14gestionalumnos;

/**
 * clase Alumno, cuyos atributos serán nombre, edad y notaMedia. Crea
 * constructores por defecto, parametrizado, getters y setters.
 *
 * @author KevinNS
 */
public class Alumno {
    
    // Creamos los atributos
    private String nombre;
    private int edad;
    private double notaMedia;
    
    // Creamos los constructores por defecto
    public Alumno(){
        this.nombre = "";
        this.edad = 0;
        this.notaMedia = 0.0;
    }
    
    // Creamos los constructores parametrizados
    public Alumno(String nombre, int edad, double notaMedia){
        this.nombre = nombre;
        this.edad = edad;
        this.notaMedia = notaMedia;
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

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }
    
    // Creamos To String

    @Override
    public String toString() {
        return "Alumno{" + "Nombre: " + nombre + " | " + "Edad: " + edad + " | " + "Nota media: " + notaMedia + '}';
    }
    

}
