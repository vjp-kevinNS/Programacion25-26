package ejercicio11t11alumnos;

/**
 * Clase Alumno con los atributos dni (String), número de expediente (int) y
 * nota media (float).
 *
 * @author KevinNS
 */
public class Alumno implements Comparable<Alumno>{
    
    // Creamos los atributos
    
    private String dni;
    private int numExpediente;
    private float notaMedia;
    
    // Creamos los constructores por defecto

    public Alumno() {
        this.dni = "";
        this.numExpediente = 0;
        this.notaMedia = 0f;
    }
    
    // Creamos los constructores parametrizados

    public Alumno(String dni, int numExpediente, float notaMedia) {
        this.dni = dni;
        this.numExpediente = numExpediente;
        this.notaMedia = notaMedia;
    }
    
    // Creamos los getters y setters

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getNumExpediente() {
        return numExpediente;
    }

    public void setNumExpediente(int numExpediente) {
        this.numExpediente = numExpediente;
    }

    public float getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(float notaMedia) {
        this.notaMedia = notaMedia;
    }
    
    
    // Creamos To String

    @Override
    public String toString() {
        return "Alumno | " + " DNI: " + dni + " | Número Expediente: " 
                + numExpediente + " | Nota Media: " + notaMedia;
    }
    
    // Creamos el método CompareTo
    
    @Override
    public int compareTo(Alumno otro){
        // Si el expediente es menor, el resultado es negativo, si es mayor es positivo
        return this.numExpediente - otro.numExpediente;
    }
    
    

}
