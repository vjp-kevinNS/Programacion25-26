package ejerciciorepaso6;

/**
 * Clase ASIGNATURA (nombre y nota)
 *
 * @author KevinNS
 */
public class Asignatura {
    
    // Creamos los atributos
    private String nombreAsignatura;
    private float nota;
    
    // Creamos lso contructores por defecto

    public Asignatura() {
        this.nombreAsignatura = "";
        this.nota = 0.0f;
    }
    
    // Creamos los constructores parametrizados

    public Asignatura(String nombreAsignatura, float nota) {
        this.nombreAsignatura = nombreAsignatura;
        this.nota = nota;
    }
    
    // Creamos los getters y setters

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
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
        return "Asignatura | " + " Nombre Asignatura: " + nombreAsignatura 
                + " | Nota: " + nota;
    }
    
    

}
