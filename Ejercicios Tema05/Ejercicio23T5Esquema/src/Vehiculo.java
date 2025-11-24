/**
 *
 * @author KevinNS
 */
public class Vehiculo {
    
    //Creamos los atributos
    private String matricula;
    private String modelo;
    private int potencia;
    
    //Creamos los constructores por defecto
    public Vehiculo (){
        this.matricula = "";
        this.modelo = "";
        this.potencia = 0;
        
    }
    
    //Creamos los constructores con sus parámetros
    public Vehiculo (String matricula, String modelo, int potencia){
        this.matricula = matricula;
        this.modelo = modelo;
        this.potencia = potencia;
    }
    
    //Creamos los getter y setter

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    
    //Creamso To String

    @Override
    public String toString() {
        return "La matricula es: " + this.matricula + " el modelo es: "
                + this.modelo + " y la potencia es: " + this.potencia;
    }
    
    
}
