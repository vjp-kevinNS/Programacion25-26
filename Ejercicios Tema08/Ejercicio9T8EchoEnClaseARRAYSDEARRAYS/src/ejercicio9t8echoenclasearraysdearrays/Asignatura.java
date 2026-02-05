package ejercicio9t8echoenclasearraysdearrays;

/**
 *
 * @author KevinNS
 */
public class Asignatura {
    
    // Creamos los atributos
    private String nombre;
    private float nota;
    
    // Creamos los constructores por defecto
    public Asignatura(){
        this.nombre = "";
        this.nota = 0.0f;
    }
    
    public Asignatura(String nombre){
        this.nombre = nombre;
        this.nota = 0.0f;
    }
    
    // Creamos los constructores parametrizados
    public Asignatura(String nombre, float nota){
        this.nombre = nombre;
        this.nota = nota;
    }
    
    // Creamos los getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        return "Asignatura{" + "Nombre: " + nombre + "| Nota: " + nota + '}';
    }
    

}
