
package examentemas10y11clubdeportivo;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author KevinNS
 */
public class Deporte {
    
    // Creamos los atributos
    
    private String nombreDeporte;
    private Set<Equipo>conjuntoEquipos;
    
    // Creamos los constructores por defecto

    public Deporte() {
        this.nombreDeporte = "";
        this.conjuntoEquipos = new HashSet<>();
    }
    
    // Creamos los constructores parametrizados

    public Deporte(String nombreDeporte, Set<Equipo> conjuntoEquipos) {
        this.nombreDeporte = nombreDeporte;
        this.conjuntoEquipos = conjuntoEquipos;
    }
    
    // Creamos loa getters y setters

    public String getNombreDeporte() {
        return nombreDeporte;
    }

    public void setNombreDeporte(String nombreDeporte) {
        this.nombreDeporte = nombreDeporte;
    }

    public Set<Equipo> getConjuntoEquipos() {
        return conjuntoEquipos;
    }

    public void setConjuntoEquipos(Set<Equipo> conjuntoEquipos) {
        this.conjuntoEquipos = conjuntoEquipos;
    }
    
    // Creamos To String

    @Override
    public String toString() {
        return "Deporte | " + " Nombre Deporte: " + nombreDeporte + " | Conjunto Equipos: " 
                + conjuntoEquipos;
    }
    
    
    
}
