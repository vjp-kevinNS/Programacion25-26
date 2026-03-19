
package ejercicio3t11busesplasencia;

import java.util.HashMap;

/**
 *
 * @author KevinNS
 */
public class Autobus {
    
    // Creamos los atributos
    private String matricula;
    // Mapa donde la Clave e4s el DNI y el Valor el Nombre del conductor
    private HashMap<String, String> conductores;
    
    // Cremaos los contructores por defecto

    public Autobus() {
        this.matricula = "";
        this.conductores = new HashMap<>();
    }
    
    // Creamos los contructores parametrizados

    public Autobus(String matricula, HashMap<String, String> conductores) {
        this.matricula = matricula;
        this.conductores = conductores;
    }
    
    // Creamos los getters y setters

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public HashMap<String, String> getConductores() {
        return conductores;
    }

    public void setConductores(HashMap<String, String> conductores) {
        this.conductores = conductores;
    }
    
    // Creamos To String

    @Override
    public String toString() {
        return "Autobus | " + " Matricula: " + matricula + " | Conductores: " 
                + conductores;
    }
    
    /**
     * Metodo para añadir conductores de este bus
     * @param dni
     * @param nombre 
     */
    public void asignarConductor(String dni, String nombre){
        conductores.put(dni, nombre);
    }
    
    
    
}
