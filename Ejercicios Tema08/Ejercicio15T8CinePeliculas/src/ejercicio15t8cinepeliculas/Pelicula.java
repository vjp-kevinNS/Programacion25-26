package ejercicio15t8cinepeliculas;

/**
 * De cada película almacenaremos su título, coste de la licencia y un vector
 * de socios, donde almacenaremos los socios que acuden a la proyección (en esa
 * primera versión, vamos a suponer que el aforo de la sala de proyección es de 4)
 * 
 * @author KevinNS
 */
public class Pelicula {
    
    // Creamos los atributos
    private String titulo;
    private double costeLicencia;
    private Socio[]socios;
    
    // Creamos los contructores por defecto
    public Pelicula(){
        this.titulo = "";
        this.costeLicencia = 0;
        this.socios = new Socio[4];
    }
    
    // Creamos los constructores parametrizados
    public Pelicula(String titulo, double costeLicencia, Socio[]socio){
        this.titulo = titulo;
        this.costeLicencia = costeLicencia;
        this.socios = new Socio[4];
    }
    
    // Creamos los getters y setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getCosteLicencia() {
        return costeLicencia;
    }

    public void setCosteLicencia(double costeLicencia) {
        this.costeLicencia = costeLicencia;
    }

    public Socio[] getSocios() {
        return socios;
    }

    public void setSocios(Socio[] socios) {
        this.socios = socios;
    }
    
    // Creamos To String

    @Override
    public String toString() {
        return "Pelicula{" + " Titulo: " + titulo + " | Coste Licencia: " + costeLicencia + " | Socios: " + socios + '}';
    }
    
    public double obtenerBeneficioNeto(){
        double sumaTotalEntradas = 0;
        
        // Usamos un bucle for-each para leer cada socio sin usar indices
        for (Socio socioQueAcude : socios) {
            if (socioQueAcude != null) {
                sumaTotalEntradas = sumaTotalEntradas + socioQueAcude.getPrecioAbonado();
            }
        }
        return sumaTotalEntradas - costeLicencia;
    }
}
