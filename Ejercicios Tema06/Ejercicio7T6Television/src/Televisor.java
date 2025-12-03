
/**
 * La clase Televisor tiene como atributos encendido (boolean), canal (int) y
 * volumen (int). Por defecto, el canal se inicializa en 1 y el volumen en 10.
 * Añade todos los métodos propios de la clase, salvo los get y set de encendido.
 *
 * Después, implementa los métodos de la interfaz, de manera que:
 *
 * • encender: si la tv no está encendida, se encienda y muestre el canal
 * actual.
 * • apagar: si la tv está encendida, muestre el mensaje “La TV se apagará
 * en 10s”.
 * • bajarVolumen: si la tv está encendida, se decrementa en 1 el valor del
 * volumen y muestra el volumen actual.
 * • subirVolumen: si la tv está encendida, se incrementa en 1 el valor del
 * volumen y muestra el volumen actual.
 * • cambiarCanal: si la tv está encendida, le asigna al atributo canal el
 * valor pasado por parámetro y muestra por pantalla el canal actual.
 *
 * @author KevinNS
 */
public class Televisor implements ControlRemoto{
    
    //Creamos los atributos
    private boolean encendido;
    private int canal;
    private int volumen;
    
    //Creamos los constructores por defecto
    public Televisor(){
        this.encendido = false;
        this.canal = 1;
        this.volumen = 10;
               
    }
    
    //Creamos los getter y setter

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }
    
    //Creamos los métodos que le ha implantado ControlRemoto
    
    /**
     * Método que nos muestra la información de la TV
     */
    public void mostrarInformacion() {
        String estado = this.encendido ? "Encendida" : "Apagada";
        System.out.println("Estado: " + estado);
        System.out.println("Canal: " + this.canal);
        System.out.println("Volumen: " + this.volumen);
    
    }
    /**
     * Método que hace que si la tv no está encendida, se encienda y muestre 
     * el canal actual
     */
    @Override
    public void encender(){
        if (!this.encendido) {
            this.encendido = true;
            System.out.println("TV Encendida. Canal actual: " + this.canal);
            
        }
    }
    
    /**
     * Método que hace que si la tv está encendida, muestre el mensaje “La TV 
     * se apagará en 10s”
     */
    @Override
    public void apagar(){
        if (this.encendido) {
            this.encendido = false;
            System.out.println("TV encendida. La TV se apagará en 10 seg");
            
        }
    }
    
    /**
     * Método que hace que si la tv está encendida, se incrementa en 1 el valor
     * del volumen y muestra el volumen actual
     */
    @Override
    public void subirVolumen(){
        if (this.encendido) {
            this.volumen++;
            System.out.println("Volúmen actual de la TV: " + this.volumen);
            
        }
    }
    
    /**
     * Método que hace que si la tv está encendida, se decrementa en 1 el valor 
     * del volumen y muestra el volumen actual
     */
    @Override
    public void bajarVolumen(){
        if (this.encendido) {
            this.volumen--;
            System.out.println("Volúmen actual de la TV: " + this.volumen);
            
        }
    }
    
    /**
     * Método que hace que si la tv está encendida, le asigna al atributo canal 
     * el valor pasado por parámetro y muestra por pantalla el canal actual
     * @param canal 
     */
    @Override
    public void cambiarCanal(float canal){
        if (this.encendido) {
            // Conversión de float (de la interfaz) a int (del atributo canal)
            this.canal = (int) canal;
            System.out.println("Canal de la TV cambiado a: " + this.canal);
            
        }
        
    }
    
    //Creamos To String

    @Override
    public String toString() {
        return "El televisor está encendido: " + encendido + " . En el canal: " 
                + canal + " . A éste volúmen:" + volumen;
    }
    

}
