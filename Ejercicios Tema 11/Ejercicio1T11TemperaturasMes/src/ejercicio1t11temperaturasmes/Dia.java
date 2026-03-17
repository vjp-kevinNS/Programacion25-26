
package ejercicio1t11temperaturasmes;

/**
 *
 * @author KevinNS
 */
public class Dia {
    
    // Creamos los atributos
    private String nombreDia;
    private int temperatura;
    
    
    // Creamos los constructores por defecto

    public Dia() {
        this.nombreDia = "";
        this.temperatura = 0;
    }
    
    // Creamos los cosntructores parametrizados

    public Dia(String nombreDia, int temperatura) {
        this.nombreDia = nombreDia;
        this.temperatura = temperatura;
    }
    
    // Creamos los getter y setter

    public String getNombreDia() {
        return nombreDia;
    }

    public void setNombreDia(String nombreDia) {
        this.nombreDia = nombreDia;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }
    
    
    // Creamos To String

    @Override
    public String toString() {
        return "Dia | " + "Nombre Dia " + nombreDia + " | Temperatura" + temperatura;
    }
    
    
    
}
