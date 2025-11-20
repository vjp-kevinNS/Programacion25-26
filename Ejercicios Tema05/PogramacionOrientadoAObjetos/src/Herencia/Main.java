package Herencia;

/**
 *
 * @author KevinNS
 */
public class Main {


    public static void main(String[] args) {
        Personaje personaje = new Personaje();
        System.out.println(personaje);
        
        Jugador jugador = new Jugador(50, "Palo");
        System.out.println(jugador);
        
        Enemigo enemigo = new Enemigo(30, "Espada");
        System.out.println(enemigo);
        
        personaje.atacar();
        jugador.atacar();
        enemigo.atacar();
        
        jugador.recoger("moneda");
//        personaje.recoger("moneda");  // Personaje no tiene el método recoger
//        enemigo.recoger("moneda");    // Enemigo no tiene el método recoger

        enemigo.crearSoldados();
//        personaje.crearSoldados();
//        jugador.crearSoldados();

        System.out.println(jugador.getInventario());
        System.out.println(jugador.getVida());
        
        System.out.println(personaje.getVida());
        
        System.out.println(enemigo.getVida());
        jugador.atacar();
    }    

}