package Enemigos;


import Enemigos.Malware;


/**
 * Virus es un pulpito pequeñito con tentáculos afilados.
 * Además de las caracteristicas que hereda de Malware, tiene una tasa de
 * replicación, que es un número entero
 * Su glitch siempre se manifiesta así: Los bordes del Virus tiemblan en patrones
 * hexadecimáles dejando estelas amarillas y líneas duplicadas.
 * Además de infectar y propagarse como Malware, tiene el comportamiento de 
 * mutar() en el que duplica su tasa de replicación y se muestra por pantalla 
 * como
 * 
 * @author Nullshade
 */
public class Virus extends Malware {
    
    //Creamos los atributos
    private int tasaReplicacion;
    
    //Creamos los constructores por defecto añadiendo super
    public Virus(){
        super();
        this.tasaReplicacion = 0;
    }
    
    //Creamos el constructor parametrizado añadiendo super
    public Virus(int tasaReplicacion, String nombre, int gradoSeveridad, String velocidadPropagacion, String glitch){
        super(nombre, gradoSeveridad, velocidadPropagacion, glitch);
        this.tasaReplicacion = tasaReplicacion;
    }
    
    //Creamos los getter y setter

    public int getTasaReplicacion() {
        return tasaReplicacion;
    }

    public void setTasaReplicacion(int tasaReplicacion) {
        this.tasaReplicacion = tasaReplicacion;
    }
    
    //Creamos el métodos que hereda de Malware
    
    /**
     * Método que duplica la tasa de replicación y muestra por pantalla las 
     * características de Virus
     */
    @Override
    public void mutar(){
        this.tasaReplicacion *= 2;
        System.out.println(toString());
    }
    
    //Creamos To String

    @Override
    public String toString() {
        return super.toString() + " | Virus con tasa de replicación: " + tasaReplicacion;
    }
    
}
