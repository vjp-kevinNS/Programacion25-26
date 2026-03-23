package ejercicio6t11campañadonaciones;

import java.util.ArrayList;

/**
 * • Clase Campania, que almacenará un conjunto de donaciones y el nombre de la
 * campaña.
 *
 * @author KevinNS
 */
public class Campania {

    // Creamos los atributos
    private String nombreCampania;
    private ArrayList<Donacion> listaDonaciones;

    // Creamos los contructores por defecto
    public Campania() {
        this.nombreCampania = "";
        this.listaDonaciones = new ArrayList<>();
    }
    
    public Campania(String nombreCampania) {
        this.nombreCampania = nombreCampania;
        this.listaDonaciones = listaDonaciones;
    }
    
    // Creamos los constructores parametrizados
    
    public Campania(String nombreCampania, ArrayList<Donacion> listaDonaciones) {
        this.nombreCampania = nombreCampania;
        this.listaDonaciones = listaDonaciones;
    }
    
    // Creamos los getters y setters

    public String getNombreCampania() {
        return nombreCampania;
    }

    public void setNombreCampania(String nombreCampania) {
        this.nombreCampania = nombreCampania;
    }

    public ArrayList<Donacion> getListaDonaciones() {
        return listaDonaciones;
    }

    public void setListaDonaciones(ArrayList<Donacion> listaDonaciones) {
        this.listaDonaciones = listaDonaciones;
    }
    
    // Creamos To String

    @Override
    public String toString() {
        return "Campaña | " + " Nombre Campaña: " + nombreCampania 
                + " | Lista Donaciones: " + listaDonaciones;
    }
    

}
