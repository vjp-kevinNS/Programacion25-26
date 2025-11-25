
/**
 * Suma: Tiene un atributo llamado sumando. El método realizarOperacion calcula la
 * suma de los atributos sumando y numero y muestra el resultado por pantalla.
 *
 * @author KevinNS
 */
public class Suma extends Calculadora {

    //Creamos los atributos
    private int sumando;

    //Creamos el constructor por defecto con la herencia
    public Suma() {
        super();
        this.sumando = 0;
    }

    //Creamos el constructor parametrizado con la herencia
    public Suma(int sumando, int numero) {
        super(numero);
        this.sumando = sumando;
    }

    //Creamos el getter y setter
    public int getSumando() {
        return sumando;
    }

    public void setSumando(int sumando) {
        this.sumando = sumando;
    }

    //Creamos el método con el Override

    /**
     * Método que usa el método de la super clase que hace su función propia
     */
    @Override
    public void realizarOperacion() {
        int resultado = super.getNumero() + this.sumando;
        System.out.println("La suma del número " + super.getNumero()
                + " y el número " + this.sumando + " es: " + resultado);
    }

    //Creamos To String
    @Override
    public String toString() {
        return "La suma del número " + super.getNumero() + " y el número "
                + this.sumando;
    }

}
