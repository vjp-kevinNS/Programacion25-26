
/**
 * Hereda de Mamifero y tiene como atributo la altura de vuelo del murciélago
 * en metros
 *
 * El murciélago implementa el siguiente comportamiento:
 * • obtenerMensajeVolador: Devuelve el mensaje “El murciélago es un animal volador”.
 * • aumentarAlturaVuelo.Aumenta la altura de vuelo del murciélago en 5 metros.
 * • bajarAlturaVuelo. Disminuye la altura de vuelo del murciélago en 5 metros.
 * • mostrarAlturaVuelo. Muestra los metros de altura a los que está volando el
 * murciélago.
 *
 * @author KevinNS
 */
public class Murcielago extends Mamifero implements Volador {

    //Creamos el atributo
    private double altura;

    //Creamos el constructor por defecto añadiendo super
    public Murcielago() {
        super();
        this.altura = 0;
    }

    //Creamos el constructor parametrizado añadiendo super
    public Murcielago(String nombre, String sexo, String color, int edad, double altura) {
        super(nombre, sexo, color, edad);
        this.altura = altura;
    }

    //Creamos el getter y setter
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //Creamos los métodos que implementamos de Volador
    /**
     * Método que nos muestra el mensaje
     * @return el mensaje
     */
    @Override
    public String obtenerMensajeVolador() {
        return "El Murciélago es un animal volador";
    }
    
    /**
     * Método que aumenta la altura de vuelo del murciélago en 5 metros
     */
    @Override
    public void aumentarAlturaVuelo() {
        this.altura += 5;
        System.out.println(getNombre() + " ha ascendido 5 metros");
    }
    
    /**
     * Método que disminuye la altura de vuelo del murciélago en 5 metros
     */
    @Override
    public void bajarAlturaVuelo() {
        this.altura -= 5;
        System.out.println(getNombre() + " ha descendido 5 metros");
    }
    
    /**
     * Método que nos muestra el total
     */
    @Override
    public void mostrarAlturaVuelo() {
        System.out.println("La altura de vuelo de: " + getNombre() + " es: "
                + altura);

    }
    
    //Creamos To String

    @Override
    public String toString() {
        return "El murciélago vuela a una altura de: " + altura;
    }
    

}
