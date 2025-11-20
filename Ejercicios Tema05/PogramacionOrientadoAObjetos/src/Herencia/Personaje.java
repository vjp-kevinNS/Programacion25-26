package Herencia;

/**
 *
 * @author KevinNS
 */
public class Personaje {
    // ATRIBUTOS
    private int vida;

    // CONSTRUCTORES
    public Personaje() {
        this.vida = 100;        
    }
    
    public Personaje(int vida) {
        this.vida = vida;
    }

    // GETTERS Y SETTERS
    public int getVida() {
        return this.vida;
    }
    
    public void setVida(int vida) {
        this.vida = vida;
    }


    // MÉTODOS
    public void atacar() {
        System.out.println("Atacando...");
    }


    // TO STRING
    @Override
    public String toString() {
        return "El PERSONAJE tiene " + vida + "% de vida";
    }
}
    

