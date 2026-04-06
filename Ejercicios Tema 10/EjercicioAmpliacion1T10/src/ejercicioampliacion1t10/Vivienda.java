package ejercicioampliacion1t10;

import java.util.ArrayList;

/**
 * Clase Vivienda, que almacenará un String dirección y las actividades que se
 * realicen en esa vivienda (Elige la estructura de datos que creas más
 * conveniente para almacenar las actividades de la vivienda).
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
