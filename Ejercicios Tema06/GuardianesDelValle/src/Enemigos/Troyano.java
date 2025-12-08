package Enemigos;


import Enemigos.Malware;


/**
 * Troyano es una araña gigante hecho de paneles de código negro; sus patas
 * parecen rutass de archivo que se extiendes silenciosamente.
 * Además de las caracteristicas de Malware, tiene una puerta trasera activa,
 * que puede estar abierto o cerrada.
 * Su glitch siempre se manifiesta así: su cuerpo parpadea entre dos versiones 
 * de sí mismo.
 * Además de infectar y propagarse como Malware, tiene el comportamiento de mutar()
 * que activa su puerta trasera si no lo estaba y se muestra por pantalla como
 * troyano con sus características.
 * 
 * @author Nullshade
 */
public class Troyano extends Malware{
    
    //Creamos los atributos
    private boolean puertaTrasera;
    
    //Creamos el constructor por defecto añadiendo super
    public Troyano(){
        super();
        this.puertaTrasera = false;
    }
    
    //Creamos el constructor parametrizado añadiendo super
    public Troyano(boolean puertaTrasera, String nombre, int gradoSeveridad, String velocidadPropagacion, String glitch){
        super(nombre, gradoSeveridad, velocidadPropagacion, glitch);
        this.puertaTrasera = false;
    }
    
    //Creamos los getter y setter

    public boolean isPuertaTrasera() {
        return puertaTrasera;
    }

    public void setPuertaTrasera(boolean puertaTrasera) {
        this.puertaTrasera = puertaTrasera;
    }
    
    //Creamos el método que hereda de Malware
    
    /**
     * Método que, si está cerrada la puerta trasera, la abre y además muestra
     * por pantalla las carácteristicas de Troyano
     */
    @Override
    public void mutar(){
        //Si la puerta está cerrada, se abre
        if (!puertaTrasera) {
            puertaTrasera = true;
            System.out.println("La puerta trasera ha sido abierta");      
        }
        System.out.println(toString());
    }
    
    //Creamos To String

    @Override
    public String toString() {
        return super.toString() + " | Troyano tiene la puerta trasera: " 
                + puertaTrasera;
    }
    
    
}
