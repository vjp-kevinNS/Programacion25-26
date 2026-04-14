
package ejercicio1t12agendatelefonica;

/**
 *• Nombre • Edad • Número de móvil 
 * 
 * @author KevinNS
 */
public class Contacto implements Comparable<Contacto> {
    
    // Creamos los atributos
    private String nombre;
    private int edad;
    private String numMovil;
    
    // Creamos los contructores por defecto

    public Contacto() {
        this.nombre = "";
        this.edad = 0;
        this.numMovil = "";
    }
    
    // Creamos los contructores parametrizados

    public Contacto(String nombre, int edad, String numMovil) {
        this.nombre = nombre;
        this.edad = edad;
        this.numMovil = numMovil;
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

    public String getNumMovil() {
        return numMovil;
    }

    public void setNumMovil(String numMovil) {
        this.numMovil = numMovil;
    }
    
    // Creamos To String

    @Override
    public String toString() {
        return "Contacto | " + " Nombre: " + nombre + " | Edad: " + edad 
                + " | Número de Movil: " + numMovil;
    }
    
    // Creamos el método CompareTo para que el orden sea de menor a mayor edad

    @Override
    public int compareTo(Contacto otro) {
        return this.edad - otro.edad; // Si es negativo es menor, si es positivo mayor
    }
    
    
}
