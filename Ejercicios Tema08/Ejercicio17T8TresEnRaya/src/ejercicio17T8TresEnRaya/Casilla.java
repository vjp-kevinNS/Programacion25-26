package ejercicio17T8TresEnRaya;

/**
 * Clase Casilla, que contendrá un atributo ficha de tipo String (“O” o “X”) y
 * otro atributo de tipo booleano llamado ocupada.
 *
 * @author KevinNS
 */
public class Casilla {
    
    // Creamos los atributos
    private String ficha;
    private boolean ocupada;
    
    // Creamos los constructores por defecto

    public Casilla() {
        this.ficha = "";
        this.ocupada = false;
    }
    
    // Creamos los constructores parametrizados

    public Casilla(String ficha, boolean ocupada) {
        this.ficha = ficha;
        this.ocupada = ocupada;
    }
    
    // Creamos los getters y setters

    public String getFicha() {
        return ficha;
    }

    public void setFicha(String ficha) {
        this.ficha = ficha;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }
    
    // Creamos To String

    @Override
    public String toString() {
        return "Casilla{" + "Ficha: " + ficha + " | Ocupada: " + ocupada + '}';
    }
    
    

}
