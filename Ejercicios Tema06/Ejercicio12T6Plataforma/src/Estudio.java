
/**
 * Estudio es objeto de la clase Estudio, con los atributos nombre y último 
 * lanzamiento (String)
 * 
 * @author KevinNS
 */
public class Estudio {
    
    //Creamos los atributos 
    private String nombre;
    private String ultimoLanzamiento;
    
    //Creamos los constructores por defecto
    public Estudio(){
        this.nombre = "";
        this.ultimoLanzamiento = "";
    }
    
    //Creamos los constructores parametrizados
    public Estudio(String nombre, String ultimoLanzamiento){
        this.nombre = nombre;
        this.ultimoLanzamiento = ultimoLanzamiento;
    }
    
    //Creamos los getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUltimoLanzamiento() {
        return ultimoLanzamiento;
    }

    public void setUltimoLanzamiento(String ultimoLanzamiento) {
        this.ultimoLanzamiento = ultimoLanzamiento;
    }
    
    //Creamos To String

    @Override
    public String toString() {
        return "Estudio{" + "nombre=" + nombre + ", ultimoLanzamiento=" + ultimoLanzamiento + '}';
    }
    
    
}
