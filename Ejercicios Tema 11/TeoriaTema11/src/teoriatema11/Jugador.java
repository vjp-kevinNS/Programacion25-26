package teoriatema11;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author KevinNS
 */
public class Jugador {

    // Creamos los atributos
    private int id;
    private String nickname;
    private int edad;
    private Set<String> juegosFav;

    // Creamos los constructores por defecto
    public Jugador() {
        this.id = 0;
        this.nickname = "";
        this.edad = 0;
        this.juegosFav = new HashSet<>();
    }

    // Creamos los constructores parametrizados
    public Jugador(int id, String nickname, int edad) {
        this.id = id;
        this.nickname = nickname;
        this.edad = edad;
        this.juegosFav = new HashSet<>();
    }

    public Jugador(int id, String nickname, int edad, Set<String> juegosFav) {
        this.id = id;
        this.nickname = nickname;
        this.edad = edad;
        this.juegosFav = juegosFav;
    }

    // Creamos los getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Set<String> getJuegosFav() {
        return juegosFav;
    }

    public void setJuegosFav(Set<String> juegosFav) {
        this.juegosFav = juegosFav;
    }

    // Creamos To String
    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nickname=" + nickname + ", edad=" + edad + ", juegosFav=" + juegosFav + '}';
    }

    // Creamos los métodos
    private String pedirJuego() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Nombre del juego: ");
        return entrada.nextLine();
    }

    public void insertarJuegoFav() {
        juegosFav.add(pedirJuego());
    }

}
