package Enemigos;


import Enemigos.Malware;


/**
 * Gusano es un gusano gigante con segmentos de datos; se arrastra entre nodos 
 * del espacio vacío perforando túneles digitales.
 * Además de las características de Malware, tiene una profundidad de penetración
 * que es un número entero.
 * Su glitch siempre se manifiesta así: cuándo emerge o desaparece, el suelo del
 * espacio vacío se deforma en un túnel espiralado que dura unos segundos.
 * Además de infectar y propagarse como Malware, tiene el comportamiento de 
 * mutar(), que incrementa en 5 su profundidad de penetración y se muestra por
 * pantalla como gusano con sus características.
 * 
 * @author Nullshade
 */
public class Gusano extends Malware{
    
    //Creamos el atributo
    private int profundidadPenetracion;
    
    //Creamos el constructor por defecto añadiendo super
    public Gusano(){
        super();
        this.profundidadPenetracion = 0;
    }
    
    //Creamos el constructor parametrizado añadiendo super
    public Gusano(int profundidadPenetracion, String nombre, int gradoSeveridad, String velocidadPropagacion, String glitch){
        super(nombre, gradoSeveridad, velocidadPropagacion, glitch);
        this.profundidadPenetracion = profundidadPenetracion;
    }
    
    //Creamos los getter y setter

    public int getProfundidadPenetracion() {
        return profundidadPenetracion;
    }

    public void setProfundidadPenetracion(int profundidadPenetracion) {
        this.profundidadPenetracion = profundidadPenetracion;
    }
    
    //Creamos el método que hereda de Malware
    
    /**
     * Método que incrementa en 5 el grado de penetración y además nos muestra
     * por pantalla las características de Gusano
     */
    @Override
    public void mutar(){
        this.profundidadPenetracion += 5;
        System.out.println(toString());
    }
    
    //Creamos To String

    @Override
    public String toString() {
        return super.toString() + " | Gusano tiene una profundidad de penetración de: " 
                + profundidadPenetracion;
    }
    
    
}
