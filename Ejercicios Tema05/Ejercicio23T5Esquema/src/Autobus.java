
/**
 *
 * @author KevinNS
 */
public class Autobus extends Vehiculo {

    //Creamos los atributos
    private int numeroPlazas;

    //Creamos el constructor por defecto y el super
    public Autobus() {
        super();
        this.numeroPlazas = 0;
    }

    //Creamos el constructor con los parametros y los heredados
    public Autobus(int numeroPlazas, String matricula, String modelo, int potencia) {
        super(matricula, modelo, potencia);
        this.numeroPlazas = numeroPlazas;

    }

    //Creamos el getter y setter
    public int getNumeroPlazas() {
        return numeroPlazas;
    }

    public void setNumeroPlazas(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }

    //Creamos To String
    @Override
    public String toString() {
        return super.toString() + ". AUTOBUS con número de plazas: "
                + this.numeroPlazas;
    }

}
