
/**
 * Suma: Tiene un atributo llamado sumando. El método realizarOperacion calcula la
 * suma de los atributos sumando y numero y muestra el resultado por pantalla.
 *
 * @author KevinNS
 */
public class Suma extends Calculadora {
    
    //Creamos los atributos
    private int sumando;
    
    //Creamos el constructor por defecto y con la herencia
    public Calculadora(){
        super();
        this.sumando = 0;
    }
    
    //Creamos el constructor parametrizado con la herencia
    public Claculadora(int sumando, int numero){
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



    
    
    
    

}
