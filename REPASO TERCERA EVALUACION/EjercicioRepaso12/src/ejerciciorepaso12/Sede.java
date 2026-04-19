package ejerciciorepaso12;

/**
 * De cada sede almacenaremos el nombre de la sede y sus ingresos anuales
 *
 * @author KevinNS
 */
public class Sede implements Comparable<Sede>{
    
    // Creamos los atributos
    
    private String nombreSede;
    private float ingresosAnuales;
    
    // Creamos los constructores por defecto

    public Sede() {
        this.nombreSede = "";
        this.ingresosAnuales = 0.0f;
    }
    
    // Creamos los constructores parametrizados

    public Sede(String nombreSede, float ingresosAnuales) {
        this.nombreSede = nombreSede;
        this.ingresosAnuales = ingresosAnuales;
    }
    
    // Creamos lo getters y setters

    public String getNombreSede() {
        return nombreSede;
    }

    public void setNombreSede(String nombreSede) {
        this.nombreSede = nombreSede;
    }

    public float getIngresosAnuales() {
        return ingresosAnuales;
    }

    public void setIngresosAnuales(float ingresosAnuales) {
        this.ingresosAnuales = ingresosAnuales;
    }
    
    // Creamos To String

    @Override
    public String toString() {
        return "Sede | " + " Nombre Sede: " + nombreSede + " | Ingresos Anuales: " 
                + ingresosAnuales;
    }
    
    // Creamos compareTo
    
    @Override
    public int compareTo(Sede otra) {
        return (int)(this.getIngresosAnuales() - otra.ingresosAnuales);
    }
    

}
