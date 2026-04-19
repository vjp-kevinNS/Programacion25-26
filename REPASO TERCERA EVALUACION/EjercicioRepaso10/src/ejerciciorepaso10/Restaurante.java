
package ejerciciorepaso10;

import java.util.ArrayList;

/**
 * ID-Nombre-Tipo de cocina-Una lista de reseñas
 * 
 * @author KevinNS
 */
public class Restaurante implements Comparable<Restaurante>{
    
    // Creamos los atributos
    
    private int idRest;
    private String nombreRest;
    private String tipoCocina;
    private ArrayList<Reseña> listaReseñas; 
    
    // Creamos los contructores por defecto

    public Restaurante() {
        this.idRest = 0;
        this.nombreRest = "";
        this.tipoCocina = "";
        this.listaReseñas = new ArrayList<>();
    }
    
    // Creamos los contructores parametrizados

    public Restaurante(int idRest, String nombreRest, String tipoCocina, ArrayList<Reseña> reseñaRest) {
        this.idRest = idRest;
        this.nombreRest = nombreRest;
        this.tipoCocina = tipoCocina;
        this.listaReseñas = reseñaRest;
    }
    
    // Creamos los getters y setters

    public int getIdRest() {
        return idRest;
    }

    public void setIdRest(int idRest) {
        this.idRest = idRest;
    }

    public String getNombreRest() {
        return nombreRest;
    }

    public void setNombreRest(String nombreRest) {
        this.nombreRest = nombreRest;
    }

    public String getTipoCocina() {
        return tipoCocina;
    }

    public void setTipoCocina(String tipoCocina) {
        this.tipoCocina = tipoCocina;
    }

    public ArrayList<Reseña> getListaReseñas() {
        return listaReseñas;
    }

    public void setListaReseñas(ArrayList<Reseña> listaReseñas) {
        this.listaReseñas = listaReseñas;
    }
    
    // Creamos To String

    @Override
    public String toString() {
        return "Restaurante | " + " ID Restaurante: " + idRest + " | Nombre Restaurante: " 
                + nombreRest + " | Tipo de Cocina: " + tipoCocina + " | Reseñas Restaurante: " 
                + listaReseñas;
    }
    
       

    @Override
    public int compareTo(Restaurante otroRest) {
        return this.idRest - otroRest.idRest;
    }
    
    
}
