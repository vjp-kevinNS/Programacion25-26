package ejercicio14t10listasalumnos;

/**
 * Clase ALUMNO cuyos atributos son 2: 
 * 
 * • Nombre delAlumno. (String) 
 * 
 * • asignaturas (Array de la ClaseAsignatura)
 *
 * @author KevinNS
 */
public class Alumno {
    
    // Creamos los atributos
    
    private String nombreAlumno;
    private Asignatura[] notasAsign = new Asignatura[3];
    
    // Creamos los constructores por defecto

    public Alumno() {
        this.nombreAlumno = "";
        this.notasAsign = notasAsign;
    }
    
    // Creamos los contructores parametrrizados

    public Alumno(String nombreAlumno, Asignatura[] notasAsign) {
        this.nombreAlumno = nombreAlumno;
        this.notasAsign = notasAsign;
    }
    
    // Creamos los getters y setters

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public Asignatura[] getNotasAsign() {
        return notasAsign;
    }

    public void setNotasAsign(Asignatura[] notasAsign) {
        this.notasAsign = notasAsign;
    }
    
    // Creamos To String

    @Override
    public String toString() {
        return "Alumno | " + " Nombre Alumno: " + nombreAlumno 
                + " | Asignaturas: " + notasAsign;
    }
    
    
    

}
