package ejerciciorepaso12;

import java.util.HashSet;
import java.util.Set;

/**
 * De cada ciudad, almacenaremos su nombre y un conjunto de sedes
 *
 * @author KevinNS
 */
public class Ciudad {
    
    // Creamos los atributos
    
    private String nombreCiudad;
    private Set<Sede>conjuntoSedes;
    
    // Creamos los constructores por defecto

    public Ciudad() {
        this.nombreCiudad = "";
        this.conjuntoSedes = new HashSet<>();
    }
    
    // Creamos los constructores parametrizados

    public Ciudad(String nombreCiudad, Set<Sede> conjuntoSedes) {
        this.nombreCiudad = nombreCiudad;
        this.conjuntoSedes = conjuntoSedes;
    }
    
    // Creamos los getters y setters

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public Set<Sede> getConjuntoSedes() {
        return conjuntoSedes;
    }

    public void setConjuntoSedes(Set<Sede> conjuntoSedes) {
        this.conjuntoSedes = conjuntoSedes;
    }
    
    // Creamos To String

    @Override
    public String toString() {
        return "Ciudad | " + " Nombre Ciudad: " + nombreCiudad + " | Conjunto Sedes: " 
                + conjuntoSedes;
    }
}
