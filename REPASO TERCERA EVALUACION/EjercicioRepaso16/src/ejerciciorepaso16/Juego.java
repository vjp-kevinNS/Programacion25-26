package ejerciciorepaso16;

import java.util.ArrayList;

/**
 * Juego tendrá: ID-Nombre-Plataforma-Una lista de partidas
 *
 * @author KevinNS
 */
public class Juego {
    
    // Creamos los atributos
    
    private int idJuego;
    private String nombreJuego;
    private String plataformaJuego;
    private ArrayList<Partida>listaPartidas;
    
    // Creamos los constructores por defecto

    public Juego() {
        this.idJuego = 0;
        this.nombreJuego = "";
        this.plataformaJuego = "";
        this.listaPartidas = new ArrayList<>();
    }
    
    // Creamos lso constructores parametrizados

    public Juego(int idJuego, String nombreJuego, String plataformaJuego, ArrayList<Partida> listaPartidas) {
        this.idJuego = idJuego;
        this.nombreJuego = nombreJuego;
        this.plataformaJuego = plataformaJuego;
        this.listaPartidas = listaPartidas;
    }
    
    // Creamos los getters y setters

    public int getIdJuego() {
        return idJuego;
    }

    public void setIdJuego(int idJuego) {
        this.idJuego = idJuego;
    }

    public String getNombreJuego() {
        return nombreJuego;
    }

    public void setNombreJuego(String nombreJuego) {
        this.nombreJuego = nombreJuego;
    }

    public String getPlataformaJuego() {
        return plataformaJuego;
    }

    public void setPlataformaJuego(String plataformaJuego) {
        this.plataformaJuego = plataformaJuego;
    }

    public ArrayList<Partida> getListaPartidas() {
        return listaPartidas;
    }

    public void setListaPartidas(ArrayList<Partida> listaPartidas) {
        this.listaPartidas = listaPartidas;
    }
    
    // Creamos To String

    @Override
    public String toString() {
        return "Juego | " + " ID Juego: " + idJuego + " | Nombre Juego: " 
                + nombreJuego + " | Plataforma Juego: " + plataformaJuego 
                + " | Lista Partidas: " + listaPartidas;
    }
    
    

}
