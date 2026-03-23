package ejercicio6t11campañadonaciones;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

/**
 * • Clase Campania, que almacenará un conjunto de donaciones y el nombre de la
 * campaña.
 *
 * @author KevinNS
 */
public class Campania {

    // Creamos los atributos
    private String nombreCampania;
     private Set<Donacion> listaDonaciones;

    // Creamos los constructores parametrizados
    public Campania() {
        this.nombreCampania = "";
        this.listaDonaciones = new TreeSet<>();
    }
    
    // Creamos lso getters y setters

    public String getNombreCampania() {
        return nombreCampania;
    }

    public void setNombreCampania(String nombreCampania) {
        this.nombreCampania = nombreCampania;
    }

    public Set<Donacion> getListaDonaciones() {
        return listaDonaciones;
    }

    public void setListaDonaciones(Set<Donacion> listaDonaciones) {
        this.listaDonaciones = listaDonaciones;
    }
    
    
    // Creamos To String

    @Override
    public String toString() {
        return "Campaña | " + " Nombre Campaña: " + nombreCampania 
                + " | Lista Donaciones: " + listaDonaciones;
    }
    

}
