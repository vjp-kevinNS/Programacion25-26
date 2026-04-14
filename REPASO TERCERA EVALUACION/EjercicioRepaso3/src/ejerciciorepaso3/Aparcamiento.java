
package ejerciciorepaso3;

/**
 * Modelo-Matrícula-Planta-Número de aparcamiento
 * 
 * @author KevinNS
 */
public class Aparcamiento {
    
    // Creamos los atributos
    private String modeloCoche;
    private String matricula;
    private int planta;
    private int numAparcamiento;
    
    // Creamos los constructores por defecto

    public Aparcamiento() {
        this.modeloCoche = "";
        this.matricula = "";
        this.planta = 0;
        this.numAparcamiento = 0;
    }
    
    // Creamos los constructores parametrizados

    public Aparcamiento(String modeloCoche, String matricula, int planta, int numAparcamiento) {
        this.modeloCoche = modeloCoche;
        this.matricula = matricula;
        this.planta = planta;
        this.numAparcamiento = numAparcamiento;
    }
    
    // Creamos los getters y setters

    public String getModeloCoche() {
        return modeloCoche;
    }

    public void setModeloCoche(String modeloCoche) {
        this.modeloCoche = modeloCoche;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getPlanta() {
        return planta;
    }

    public void setPlanta(int planta) {
        this.planta = planta;
    }

    public int getNumAparcamiento() {
        return numAparcamiento;
    }

    public void setNumAparcamiento(int numAparcamiento) {
        this.numAparcamiento = numAparcamiento;
    }
    
    // Creamos To String 

    @Override
    public String toString() {
        return "Aparcamiento | " + " Modelo Coche: " + modeloCoche + " | Matricula: " 
                + matricula + " | Planta: " + planta + " | Numero Aparcamiento: " 
                + numAparcamiento;
    }
    
    
    
}
