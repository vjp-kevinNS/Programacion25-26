
/**
 *
 * @author KevinNS
 */
public class Heroe {
    
    //Creamos los atributos
    private String nombre;
    private int vida;
    private String habilidad;
    
    //Creamos los constructores por defecto
    public Heroe(){
        this.nombre = "";
        this.vida = 100;
        this.habilidad = "";
    }
    
    //Creamos los constructores parametrizados
    public Heroe(String nombre, int vida, String habilidad){
        this.nombre = nombre;
        this.vida = vida;
        this.habilidad = habilidad;
    }
    
    //Creamos los getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }
    
    //Creamos To String
    @Override
    public String toString(){
        return "Héroe: " + this.nombre + " | Habilidad: " + this.habilidad +
                " | Vida: " + this.vida;
    }
    
}
