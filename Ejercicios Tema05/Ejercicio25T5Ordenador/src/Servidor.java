/**
 *  La subclase Servidor contiene los siguientes atributos: tamaño del monitor,
    modelo de teclado y modelo de ratón. A la hora de que el usuario cree un objeto,
    en la clase Test, deberemos controlar que el tamaño del monitor sea mayor que 14.
    (en caso de que el usuario no lo cumpla deberemos volvérselo a pedir, tantas veces
    como sea necesario.)
 * 
 * @author KevinNS
 */
public class Servidor extends Ordenador {
    
    //Creamos los atributos
    private int tamañoMonitor;
    private String modeloTeclado;
    private String modeloRaton;
    
    //Creamos los constructores por defecto
    public Servidor(){
        super();
        this.tamañoMonitor = 0;
        this.modeloTeclado = "";
        this.modeloRaton = "";
    }
    
    //Creamos los constructores con sus parámetros
    public Servidor(int tamañoMonitor, String modeloTeclado, String modeloRaton){
        super();
        this.tamañoMonitor = tamañoMonitor;
        this.modeloTeclado = modeloTeclado;
        this.modeloRaton = modeloRaton;
    }
    
    //Creamos los getter y setter

    public int getTamañoMonitor() {
        return tamañoMonitor;
    }

    public void setTamañoMonitor(int tamañoMonitor) {
        this.tamañoMonitor = tamañoMonitor;
    }

    public String getModeloTeclado() {
        return modeloTeclado;
    }

    public void setModeloTeclado(String modeloTeclado) {
        this.modeloTeclado = modeloTeclado;
    }

    public String getModeloRaton() {
        return modeloRaton;
    }

    public void setModeloRaton(String modeloRaton) {
        this.modeloRaton = modeloRaton;
    }
    
    //Creamos To String

    @Override
    public String toString() {
        return "El tamaño del monitor es: " + this.tamañoMonitor +
                " , el modelo del teclado es:  " + this.modeloTeclado +
                " y el modelo del raton es: " + this.modeloRaton;
    }
    
}
