package ejercicio1t8notasasignaturas;

/**
 *
 * @author KevinNS
 */
public class Asignatura {
    
    // Creamos los atributos
    private String nombre;
    private double nota;
    
    // Creamos los constructores por defecto
    public Asignatura(){
        this.nombre = "";
        this.nota = 0;
    }
    
    // Creamos los constructores pramaetrizados
    public Asignatura(String nombre, double nota){
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

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
    // Creamos To String

    @Override
    public String toString() {
        return "Asignatura{" + "nombre=" + nombre + ", nota=" + nota + '}';
    }
    
}
