
package ejerciciorepaso13;

/**
 * Usuario-Puntuación
 * 
 * @author KevinNS
 */
public class Valoracion implements Comparable<Valoracion>{
    
    // Creamos los atributos
    
    private String usuario;
    private float puntuacion;
    
    // Cremos los cosntructores por defecto

    public Valoracion() {
        this.usuario = "";
        this.puntuacion = 0.0f;
    }
    
    // Creamos los constructores parametrizados

    public Valoracion(String usuario, float puntuacion) {
        this.usuario = usuario;
        this.puntuacion = puntuacion;
    }
    
    // Creamos los getters y setters

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public float getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(float puntuacion) {
        this.puntuacion = puntuacion;
    }
    
    // Creamos To String

    @Override
    public String toString() {
        return "Valoracion | " + " Usuario: " + usuario + " | Puntuación: " 
                + puntuacion;
    }
    
    // Creamos compare To

    @Override
    public int compareTo(Valoracion otro) {
       return(int)(this.puntuacion- otro.getPuntuacion());
       
    }
    
    
    
    
}
