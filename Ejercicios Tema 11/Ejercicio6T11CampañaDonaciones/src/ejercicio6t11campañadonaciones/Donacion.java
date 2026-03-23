package ejercicio6t11campañadonaciones;

/**
 * • Clase Donacion, que almacenará el nombre de la persona que dona y la
 * cantidad donada
 *
 * @author KevinNS
 */
public class Donacion implements Comparable<Donacion> {

    // Creamos los atributos
    private String donante;
    private double importe;

    // Creamos los constructores por defecto
    public Donacion() {
        this.donante = "";
        this.importe = 0;
    }

    // Creamos los construcotres parametrizados
    public Donacion(String donante, double importe) {
        this.donante = donante;
        this.importe = importe;
    }

    // Creamos los getters y setters
    public String getDonante() {
        return donante;
    }

    public void setDonante(String donante) {
        this.donante = donante;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    // Creamos To String
    @Override
    public String toString() {
        return "Donacion | " + " Donante: " + donante + " | Importe: " + importe;
    }

    // Mñetodos necesarios
    @Override
    public int compareTo(Donacion otra) {
        if (this.importe < otra.importe) {
            return 1; // El menor va después
        }
        if (this.importe > otra.importe) {
            return -1; // El mayor va antes
        }
        return this.donante.compareTo(otra.donante); // Si el dinero es igual, decide el nombre
    }

}
