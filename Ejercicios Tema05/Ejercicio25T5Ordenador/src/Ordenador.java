
/**
 *  La superclase Ordenador contiene los siguientes atributos: cantidad de memoria
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
    private String modeloGrafica;
    private int precioGrafica;

    //Creamos los constructores por defecto
    public Ordenador() {
        this.memoriaRam = 0;
        this.discoDuro = 0;
        this.modeloGrafica = "";
        this.precioGrafica = 0;
    }

    //Creamos los constructores con sus parámetros
    public Ordenador(int memoriaRam, int discoDuro, String modeloGrafica, int precioGrafica) {
        this.memoriaRam = memoriaRam;
        this.discoDuro = discoDuro;
        this.modeloGrafica = modeloGrafica;
        this.precioGrafica = precioGrafica;
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

    public int getPrecioGrafica() {
        return precioGrafica;
    }

    public void setPrecioGrafica(int precioGrafica) {
        this.precioGrafica = precioGrafica;
    }

    //Creamos To String
    @Override
    public String toString() {
        return "Cantidad de memoria RAM: " + this.memoriaRam
                + " ,la capacidad del disco duro es de: " + this.discoDuro
                + " ,el modelo de la tarjeta Gráfica es: " + this.modeloGrafica
                + " y su precio es de: " + this.precioGrafica;

    }

}
