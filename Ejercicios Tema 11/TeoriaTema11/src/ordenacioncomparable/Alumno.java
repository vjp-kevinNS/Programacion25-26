
package ordenacioncomparable;

/**
 *
 * @author KevinNS
 */
public class Alumno implements Comparable<Alumno>{
    
    // Creamos los atributos
    private String nombre;
    private int numero;
            
    // Creamos los constructores por defecto

    public Alumno() {
        this.nombre = "";
        this.numero = 0;
    }
    
    // Creamos los constructores parametrizados

    public Alumno(String nombre, int numero) {
        this.nombre = nombre;
        this.numero = numero;
    }
    
    // Creamos lso getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    // Creamos To String

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", numero=" + numero + '}';
    }
    
    // METODO COMPARETO
    
    @Override
    //OPCION 1
    public int compareTo(Alumno a){
        if (this.numero < a.getNumero()) {
            return 1;
        }else if (this.numero > a.getNumero()){
            return -1;
        }else{
            return 0;
        }
    }
    
    // OPCION 2
//    public int compareTo(Alumno a){
//        return a.getNumero() - this.numero;
//    }
    
    // OPCION 3
//    public int compareTo(Alumno a){
//        return Integer.compare(a.getNumero(), this.numero);
//    }
    
    
}
