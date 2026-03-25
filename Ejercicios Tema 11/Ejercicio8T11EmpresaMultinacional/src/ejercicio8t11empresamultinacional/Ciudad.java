package ejercicio8t11empresamultinacional;

import java.util.Set;
import java.util.TreeSet;

/**
 * De cada ciudad, almacenaremos su nombre y un conjunto de sedes (elige el tipo
 * de conjunto que prefieras).
 *
 * @author KevinNS
 */
public class Ciudad {
    
    // Creamos los atributos
    private String nombreCiudad;
    private Set<Sede> conjuntoSedes; // Elegimos set para evitar sedes duplicadas
    
    // Creamos los constructores por defecto

    public Ciudad() {
        this.nombreCiudad = "";
        this.conjuntoSedes = new TreeSet<>(); // Usamos TreeSet para que cada ciudad tenga sus sedes ordenadas
    }
    
    // Creamos el constructor para el nombre solamente

    public Ciudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
        this.conjuntoSedes = new TreeSet<>(); // Usamos TreeSet para que cada ciudad tenga sus sedes ordenadas
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
