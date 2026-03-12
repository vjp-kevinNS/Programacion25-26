package ejercicio14t10listasalumnos;

/**
 * La clase Asignatura está formada por: 
 * 
 * • Nombre de la asignatura. (String) 
 * 
 * • Nota de la Asignatura (float)
 *
 * @author KevinNS
 */
public class Asignatura {
    
    // Creamos los atributos
    
    private String nombreAsignatura;
    private float notaAsignatura;
    
    // Creamos los contructores por defecto

    public Asignatura() {
        this.nombreAsignatura = "";
        this.notaAsignatura = 0f;        
    }
    
    // Creamos los constructores parametrizados

    public Asignatura(String nombreAsignatura, float notaAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
        this.notaAsignatura = notaAsignatura;
    }
    
    // Creamos los getters y setters

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    public float getNotaAsignatura() {
        return notaAsignatura;
    }

    public void setNotaAsignatura(float notaAsignatura) {
        this.notaAsignatura = notaAsignatura;
    }
    
    // Creamos To String

    @Override
    public String toString() {
        return "Asignatura |" + " Nombre Asignatura: " + nombreAsignatura 
                + " | Nota Asignatura: " + notaAsignatura;
    }
    

}
