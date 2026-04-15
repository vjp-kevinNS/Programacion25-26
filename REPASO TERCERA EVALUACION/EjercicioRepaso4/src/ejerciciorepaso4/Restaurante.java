
package ejerciciorepaso4;

/**
 * Nombre–Tipo de cocina–Número de mesas–Dirección
 * @author KevinNS
 */
public class Restaurante {
    
    // Creamos los atributos
    private String nombreRest;
    private String tipoCocina;
    private int numeroMesas;
    private String direccion;
    
    // Creamos los constructores por defecto

    public Restaurante() {
        this.nombreRest = "";
        this.tipoCocina = "";
        this.numeroMesas = 0;
        this.direccion = "";
    }
    
    // Creamos los constructores parametrizados

    public Restaurante(String nombreRest, String tipoCocina, int numeroMesas, String direccion) {
        this.nombreRest = nombreRest;
        this.tipoCocina = tipoCocina;
        this.numeroMesas = numeroMesas;
        this.direccion = direccion;
    }
    
    // Creamos los getters y setters

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

    public int getNumeroMesas() {
        return numeroMesas;
    }

    public void setNumeroMesas(int numeroMesas) {
        this.numeroMesas = numeroMesas;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    // Creamos To String

    @Override
    public String toString() {
        return "Restaurante | " + " Nombre Restaurante: " + nombreRest + " | Tipo de Cocina: " 
                + tipoCocina + " | Número de Mesas: " + numeroMesas + " | Dirección: " 
                + direccion;
    }
    
    
}
