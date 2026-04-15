package ejerciciorepaso6;

import java.util.ArrayList;

/**
 * Crear clase alumno(nombre, apellido, edad y arraylist de notas)
 *
 * @author KevinNS
 */
public class Alumno {
    
    // Creamos los atributos
    private String nombreAlumno;
    private String apellidoAlumno;
    private int edadAlumno;
    private ArrayList<Asignatura> notas;
    
    // Creamos los cosntructores por defecto

    public Alumno() {
        this.nombreAlumno = "";
        this.apellidoAlumno = "";
        this.edadAlumno = 0;
        this.notas = new ArrayList<>();
    }

    // Crreamos los constructores parametrizados
    
    public Alumno(String nombreAlumno, String apellidoAlumno, int edadAlumno, ArrayList<Asignatura> notas) {
        this.nombreAlumno = nombreAlumno;
        this.apellidoAlumno = apellidoAlumno;
        this.edadAlumno = edadAlumno;
        this.notas = notas;
    }
    
    // Creamos los getters y setters

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public String getApellidoAlumno() {
        return apellidoAlumno;
    }

    public void setApellidoAlumno(String apellidoAlumno) {
        this.apellidoAlumno = apellidoAlumno;
    }

    public int getEdadAlumno() {
        return edadAlumno;
    }

    public void setEdadAlumno(int edadAlumno) {
        this.edadAlumno = edadAlumno;
    }

    public ArrayList<Asignatura> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Asignatura> notas) {
        this.notas = notas;
    }
    
    // Creamos To String

    @Override
    public String toString() {
        return "Alumno | " + " Nombre Alumno: " + nombreAlumno + " | Apellido Alumno: " 
                + apellidoAlumno + " | Edad Alumno: " + edadAlumno + " | Notas: " 
                + notas;
    }
    
    
    
    

}
