/**
 * Crea una clase “Numero”, con un solo atributo llamado valor, que se inicializará en
   el constructor con el valor que te introduzca el usuario.
 * 
 * @author KevinNS
 */
public class Numero {
    
    //Creamos el atributo
    private int valor;
    
    //Creamos el constructor
    
    public Numero(int valor){
        this.valor = valor;
    }
    
    //Creamos el getter y el setter

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    //Creamos To String

    @Override
    public String toString() {
        return "El valor del número es: " + this.valor;
    }
    
}
