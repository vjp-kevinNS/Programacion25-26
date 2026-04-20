
package examentemas10y11clubdeportivo;

/**
 *
 * @author KevinNS
 */
public class Equipo implements Comparable<Equipo>{
    
    // Creamos los atributos
    
    private String codigoEquipo;
    private String nombreEquipo;
    private int trofeosGanados;
    
    // Creamos los constructores por defecto

    public Equipo() {
        this.codigoEquipo = "";
        this.nombreEquipo = "";
        this.trofeosGanados = 0;
    }
    
    // Creamos los cosntructores parametrizados

    public Equipo(String codigoEquipo, String nombreEquipo, int trofeosGanados) {
        this.codigoEquipo = codigoEquipo;
        this.nombreEquipo = nombreEquipo;
        this.trofeosGanados = trofeosGanados;
    }
    
    // Creamos los getters y setters

    public String getCodigoEquipo() {
        return codigoEquipo;
    }

    public void setCodigoEquipo(String codigoEquipo) {
        this.codigoEquipo = codigoEquipo;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public int getTrofeosGanados() {
        return trofeosGanados;
    }

    public void setTrofeosGanados(int trofeosGanados) {
        this.trofeosGanados = trofeosGanados;
    }
    
    // Creamos To String

    @Override
    public String toString() {
        return "Equipo | " + " Código Equipo: " + codigoEquipo + " | Nombre Equipo: " 
                + nombreEquipo + " | Trofeos Ganados: " + trofeosGanados;
    }

    // Creamos Compare To
    
    @Override
    public int compareTo(Equipo otro) {
       return this.getTrofeosGanados() - otro.getTrofeosGanados();
    }
    
    
    
}
