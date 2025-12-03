
/**
 * La clase Radio tiene como atributos encendido (boolean), emisora (float) y 
 * volumen (int). Por defecto, la emisora se inicializa en 80.0 y el
 * volumen en 15. Añade todos los métodos propios de la clase, salvo los
 * get y set de encendido.
 * Después, implementa los métodos de la interfaz, de manera que:
 * 
 * • encender: si la radio no está encendida, se encienda.
 * • apagar: si la radio está encendida, se apague.
 * • bajarVolumen: si la radio está encendida, se decrementa en 5 el valor del 
 * volumen.
 * • subirVolumen: si la radio está encendida, se incrementa en 5 el valor del 
 * volumen.
 * • cambiarCanal: si la radio está encendida, le asigna al atributo emisora el 
 * valor pasado por parámetro.
 *
 * @author KevinNS
 */
public class Radio implements ControlRemoto{
    
    //Creamos los atributos
    private boolean encendido;
    private float emisora;
    private int volumen;
    
    //Creamos los constructores por defecto
    public Radio(){
        this.encendido = false;
        this.emisora = 80.0f;
        this.volumen = 15;
    }
    
    //Creamos los getter y setter

    public float getEmisora() {
        return emisora;
    }

    public void setEmisora(float emisora) {
        this.emisora = emisora;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }
    
    //Creamos los métodos que le ha implantado ControlRemoto
    
    public void mostrarInformacion() {
        String estado = this.encendido ? "Encendida" : "Apagada";
        System.out.println("Estado: " + estado);
        // Formateamos para mostrar la emisora con un decimal
        System.out.printf("Emisora: %.1f\n", this.emisora); 
        System.out.println("Volumen: " + this.volumen);

    }
    
    /**
     * Método que hace que si la radio está apagada se encienda
     */
    @Override
    public void encender(){
        if (!this.encendido) {
            this.encendido = true;
            System.out.println("Radio encendida " + this.emisora);
            
        }
    }
    
    /**
     * Método que hace que si la radio esta encendida se apague
     */
    @Override
    public void apagar(){
        if (this.encendido) {
            this.encendido = false;
            System.out.println("Radio apagada ");
            
        }
        
    }
    
    /**
     * Método que hace que si la radio está encendida, se incrementa en 5 el 
     * valor del volumen
     */
    @Override
    public void subirVolumen(){
        if (this.encendido) {
            this.volumen += 5;
            System.out.println("Volúmen actual de la radio: " + this.volumen);
            
        }
        
    }
    
    /**
     * Método que hace que si la radio está encendida se decrementa en 5 el
     * valor del volúmen
     */
    @Override
    public void bajarVolumen(){
        if (this.encendido) {
            this.volumen -= 5;
            System.out.println("Volúmen actual de la radio: " + this.volumen);
            
        }
    }
    
    /**
     * si la radio está encendida, le asigna al atributo emisora el valor pasado 
     * por parámetro
     * @param emisora 
     */
    @Override
    public void cambiarCanal(float emisora){
        if (this.encendido) {
            this.emisora = emisora;
            System.out.println("Emisora sintonizada: " + this.emisora);
            
        }
    }
    
    //Creamos To String

    @Override
    public String toString() {
        return "La Radio está encendida: " + encendido + " . En la emisora: " 
                + emisora + " . Al volumen: " + volumen;
    }
    

}
