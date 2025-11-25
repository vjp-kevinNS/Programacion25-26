
/**
 * Potencia: Tiene un atributo llamado exponente. El método realizarOperacion calcula la
 * potencia de numero elevado a exponente y muestra el resultado por pantalla.
 *
 * @author KevinNS
 */
public class Potencia extends Calculadora {
    
    //Creamos el atributo
    private double exponente;
    
    //Creamos el constructor por defecto con la herencia
    public Potencia(){
        super();
        this.exponente = 0;
    }
    
    //Creamos el constructor parametrizado con la herencia
    public Potencia(int numero, double exponente){
        super(numero);
        this.exponente = exponente;
    }
    
    //Creamos los getter y setter

    public double getExponente() {
        return exponente;
    }

    public void setExponente(double exponente) {
        this.exponente = exponente;
    }
    
    //Creamos el método con el Override
    
    /**
     * Método que usa el método de la super clase que hace su función propia
     */
    public void realizarOperacion(){
    //Utilizamos la clase Math para la potencia (Math.pow(base, exponente))
        double resultado = Math.pow(getNumero(), exponente);
        System.out.println("Potencia " + getNumero() + " elevado a " + exponente
        + " = " + resultado);
    }
    
    //Creamos To String

    @Override
    public String toString() {
        return "Potencia{" + "exponente=" + exponente + '}';
    }
    
           

}
