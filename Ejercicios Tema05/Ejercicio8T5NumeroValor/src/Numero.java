/**
 * Crea una clase llamada Numero que contendrá un único atributo privado,
 * llamado valor, de tipo entero.
 * @author KevinNS
 */
public class Numero {
    
    //Creamos el atributo
    private int valor;
    
    //Creamos el constructor por defecto
    
    public Numero(){
        this.valor = 0;
    }
    
    //Creamos el constructor con su parámetro
    
    public Numero (int valor){
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
    public String toString(){
        return "Este es el valor del número: " + valor;
    
}
            
}
