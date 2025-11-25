/**
 *
 * @author KevinNS
 */
public class Taxi extends Vehiculo{
    
    //Creamos los atributos
    private int numeroLicencia;
    
    //Creamos los constructores por defecto
    public Taxi(){
        super();
        this.numeroLicencia = 0;
        
    }
    
    //Creamos el constructor con su parametro y el heredado
    public Taxi(int numeroLicencia, String matricula, String modelo, int potencia){
        super(matricula, modelo, potencia);
        this.numeroLicencia = numeroLicencia;
    }
    
    //Creamos los getter y setter

    public int getNumeroLicencia() {
        return numeroLicencia;
    }

    public void setNumeroLicencia(int numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }
    
    //Creamos To String

    @Override
    public String toString() {
        return super.toString() + ". TAXI con número de licencia " + numeroLicencia;
    }
    
}
