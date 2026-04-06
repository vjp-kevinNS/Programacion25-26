
package ejercicioampliacion2t10;

import java.util.ArrayList;

/**
 *
 * @author KevinNS
 */
public class Vivienda {
    // Creamos los atributos
    private String direccion;
    private ArrayList<Actividad> listaActividades; // La colección de objetos
    
    // Creamos el constructor de direccion e inicializamos el ArrayList aquí para evitar nulos

    public Vivienda(String direccion) {
        this.direccion = direccion;
        this.listaActividades = new ArrayList<>();
    }
    
    // Creamos los getters y setters

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Actividad> getListaActividades() {
        return listaActividades;
    }

    public void setListaActividades(ArrayList<Actividad> listaActividades) {
        this.listaActividades = listaActividades;
    }
    
    // Creamos To String

    @Override
    public String toString() {
        return "Vivienda | " + " Dirección: " + direccion + " | Lista Actividades: " 
                + listaActividades;
    }
    

}

