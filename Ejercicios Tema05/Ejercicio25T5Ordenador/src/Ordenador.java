
/**
 * La superclase Ordenador contiene los siguientes atributos: cantidad de memoria
 * RAM, capacidad del disco duro, modelo de procesador, modelo de tarjeta gráfica y
 * precio. A la hora de que el usuario cree un objeto, en la clase Test, deberemos
 * controlar que la capacidad del disco duro sea múltiplo de 5, el modelo de
 * procesador lo permitirá elegir entre una lista, y el precio siempre sea mayor que 0.
 *
 * @author KevinNS
 */
public class Ordenador {

    //Creamos los atributos
    private int memoriaRam;
    private int discoDuro;
    private String modeloProcesador;
    private String modeloGrafica;
    private double precio;

    //Creamos los constructores por defecto
    public Ordenador() {
        this.memoriaRam = 0;
        this.discoDuro = 0;
        this.modeloProcesador = "";
        this.modeloGrafica = "";
        this.precio = 0;
    }

    //Creamos los constructores con sus parámetros
    public Ordenador(int memoriaRam, int discoDuro, String modeloProcesador, String modeloGrafica, double precio) {
        this.memoriaRam = memoriaRam;
        this.discoDuro = discoDuro;
        this.modeloProcesador = modeloProcesador;
        this.modeloGrafica = modeloGrafica;
        this.precio = precio;
    }

    //Creamos los getter y setter
    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public int getDiscoDuro() {
        return discoDuro;
    }

    public void setDiscoDuro(int discoDuro) {
        this.discoDuro = discoDuro;
    }

    public String getModeloGrafica() {
        return modeloGrafica;
    }

    public void setModeloGrafica(String modeloGrafica) {
        this.modeloGrafica = modeloGrafica;
    }

    public String getModeloProcesador() {
        return modeloProcesador;
    }

    public void setModeloProcesador(String modeloProcesador) {
        this.modeloProcesador = modeloProcesador;
    }
    

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    

    //Creamos To String
    @Override
    public String toString() {
        return "Cantidad de memoria RAM: " + this.memoriaRam
                + " ,la capacidad del disco duro es de: " + this.discoDuro
                + ", el modelo del procesador es: " + this.modeloProcesador 
                + ", el modelo de la tarjeta Gráfica es: " + this.modeloGrafica
                + " y su precio es de: " + this.precio;

    }

}
