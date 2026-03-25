package ejercicio8t11empresamultinacional;

/**
 * De cada sede almacenaremos el nombre de la sede y sus ingresos anuales.
 *
 * @author KevinNS
 */
public class Sede implements Comparable<Sede>{
    
    // Creamos los atributos
    private String nombreSede;
    private double ingresos;
    
    // Creamos los constructores por defecto

    public Sede() {
        this.nombreSede = "";
        this.ingresos = 0;
    }
    
    // Creamos los contructores parametrizados

    public Sede(String nombreSede, double ingresos) {
        this.nombreSede = nombreSede;
        this.ingresos = ingresos;
    }
    
    // Creamos los getters y setters

    public String getNombreSede() {
        return nombreSede;
    }

    public void setNombreSede(String nombreSede) {
        this.nombreSede = nombreSede;
    }

    public double getIngresos() {
        return ingresos;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }
    
    // Creamos To String

    @Override
    public String toString() {
        return "Sede | " + " Nombre Sede: " + nombreSede + " | Ingresos: " 
                + ingresos;
    }
    
    // Creamos el método compareTo
    @Override
    public int compareTo(Sede otra){
        if (this.ingresos < otra.ingresos) 
            return 1;    
        if (this.ingresos > otra.ingresos) 
            return -1;
        return this.nombreSede.compareTo(otra.nombreSede); // Si empetan en €, decide el nombre
    }
    

}
