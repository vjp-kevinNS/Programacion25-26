package ejerciciorepaso14;

import java.util.HashSet;
import java.util.Set;

/**
 * País tendrá: Nombre-Un conjunto de hoteles(SET)
 *
 * @author KevinNS
 */
public class Pais {
    
    // Creamos los atributos
    
    private String nombrePais;
    private Set<Hotel>conjuntoHoteles;
    
    // Creamos los constructores por defecto

    public Pais() {
        this.nombrePais = "";
        this.conjuntoHoteles = new HashSet<>();
    }
    
    // Contructores parametrizados

    public Pais(String nombrePais, Set<Hotel> conjuntoHoteles) {
        this.nombrePais = nombrePais;
        this.conjuntoHoteles = conjuntoHoteles;
    }
    
    // Creamos los getters y setters

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public Set<Hotel> getConjuntoHoteles() {
        return conjuntoHoteles;
    }

    public void setConjuntoHoteles(Set<Hotel> conjuntoHoteles) {
        this.conjuntoHoteles = conjuntoHoteles;
    }
    
    // Creamos To String

    @Override
    public String toString() {
        return "Pais | " + " Nombre Pais: " + nombrePais + " | Conjunto Hoteles: " 
                + conjuntoHoteles;
    }
       
}
