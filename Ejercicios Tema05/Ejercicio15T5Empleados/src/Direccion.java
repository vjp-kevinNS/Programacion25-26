
/**
 * Diseñar una clase Dirección con los atributos calle, número, piso y ciudad.
 *
 * @author KevinNS
 */
public class Direccion {

    //Creamos los atributos
    private String calle;
    private int numero;
    private int piso;
    private String ciudad;

    //Creamos los constructores por defecto
    public Direccion() {
        this.calle = "";
        this.numero = 0;
        this.piso = 0;
        this.ciudad = "";
    }

    //Creamos los constructores con sus parámetros
    public Direccion(String calle, int numero, int piso, String ciudad) {
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
        this.ciudad = ciudad;
    }

    //Creamos los getter y setters
    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    //Creamos To String
    @Override
    public String toString() {
        return "Esta es la dirección: " + this.calle + " Es la calle "
                + this.numero + " Es el número " + this.piso + " Es el piso " + this.ciudad
                + " Es la ciudad ";

    }
}
