package ejerciciorepaso15;

/**
 * Supermercado tendrá: Nombre-Ventas anuales
 *
 * @author KevinNS
 */
public class Supermercado implements Comparable<Supermercado>{
    
    // Creamos los atributos
    
    private String nombreSuper;
    private float ventasAnuales;
    
    // Creamos los constructores por defecto

    public Supermercado() {
        this.nombreSuper = "";
        this.ventasAnuales = 0.0f;
    }
    
    // Creamos los constructores parametrizados

    public Supermercado(String nombreSuper, float ventasAnuales) {
        this.nombreSuper = nombreSuper;
        this.ventasAnuales = ventasAnuales;
    }
    
    // Creamos los getters y setters

    public String getNombreSuper() {
        return nombreSuper;
    }

    public void setNombreSuper(String nombreSuper) {
        this.nombreSuper = nombreSuper;
    }

    public float getVentasAnuales() {
        return ventasAnuales;
    }

    public void setVentasAnuales(float ventasAnuales) {
        this.ventasAnuales = ventasAnuales;
    }
    
    // Creamos To String

    @Override
    public String toString() {
        return "Supermercado | " + " Nombre Supermercado: " + nombreSuper 
                + " | Ventas Anuales: " + ventasAnuales;
    }

    // Creamos compareTO
    
    @Override
    public int compareTo(Supermercado otro) {
        return(int)(this.getVentasAnuales() - otro.getVentasAnuales());
    }
    
    

}
