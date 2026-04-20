package ejerciciorepaso15;

import java.util.HashSet;
import java.util.Set;

/**
 * Ciudad tendrá: Nombre-Un conjunto de supermercados
 *
 * @author KevinNS
 */
public class Ciudad {
    
    // Creamos los atributos
    
    private String nombreCiudad;
    private Set<Supermercado>conjuntoSupermercado;
    
    // Creamos los cosntructores por defecto

    public Ciudad() {
        this.nombreCiudad = "";
        this.conjuntoSupermercado = new HashSet<>();
    }
    
    // Creamos los constructores parametrizados

    public Ciudad(String nombreSuper, Set<Supermercado> conjuntoSupermercado) {
        this.nombreCiudad = nombreSuper;
        this.conjuntoSupermercado = conjuntoSupermercado;
    }
    
    // Creamos los getters y setters

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public Set<Supermercado> getConjuntoSupermercado() {
        return conjuntoSupermercado;
    }

    public void setConjuntoSupermercado(Set<Supermercado> conjuntoSupermercado) {
        this.conjuntoSupermercado = conjuntoSupermercado;
    }
    
    // Creamos To String

    @Override
    public String toString() {
        return "Ciudad | " + " Nombre Ciudad: " + nombreCiudad + " | Conjunto Supermercado: "
                + conjuntoSupermercado;
    }
    
    

}
