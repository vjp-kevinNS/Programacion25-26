
package ejerciciorepaso11;

import java.util.ArrayList;

/**
 * ID-Marca-Modelo-Una lista de revisiones
 * 
 * @author KevinNS
 */
public class Coche implements Comparable<Coche>{
    
    // Creamos los atributos
    
    private int idCoche;
    private String marcaCoche;
    private String modeloCoche;
    private ArrayList<Revision>listaRevisiones;
    
    // Creamos los constructores por defecto

    public Coche() {
        this.idCoche = 0;
        this.marcaCoche = "";
        this.modeloCoche = "";
        this.listaRevisiones = new ArrayList<>();
    }
    
    // Creamos los constructores parametrizados

    public Coche(int idCoche, String marcaCoche, String modeloCoche, ArrayList<Revision> listaRevisiones) {
        this.idCoche = idCoche;
        this.marcaCoche = marcaCoche;
        this.modeloCoche = modeloCoche;
        this.listaRevisiones = listaRevisiones;
    }
    
    // Creamos los getters y setters

    public int getIdCoche() {
        return idCoche;
    }

    public void setIdCoche(int idCoche) {
        this.idCoche = idCoche;
    }

    public String getMarcaCoche() {
        return marcaCoche;
    }

    public void setMarcaCoche(String marcaCoche) {
        this.marcaCoche = marcaCoche;
    }

    public String getModeloCoche() {
        return modeloCoche;
    }

    public void setModeloCoche(String modeloCoche) {
        this.modeloCoche = modeloCoche;
    }

    public ArrayList<Revision> getListaRevisiones() {
        return listaRevisiones;
    }

    public void setListaRevisiones(ArrayList<Revision> listaRevisiones) {
        this.listaRevisiones = listaRevisiones;
    }
    
    // Creamos To String

    @Override
    public String toString() {
        return "Coche| " + " ID Coche: " + idCoche + " | marca Coche: " + marcaCoche 
                + "  modelo Coche: " + modeloCoche + " | lista Revisiones: " 
                + listaRevisiones;
    }
    
    // Creamos compareTo
    
    @Override
    public int compareTo(Coche otro) {
        return this.idCoche - otro.idCoche;
    }
    
    
    
}
