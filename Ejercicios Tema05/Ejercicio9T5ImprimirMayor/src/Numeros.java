/**
 *
 * @author KevinNS
 */
public class Numeros {
    
    //Creamos los atributos
    private int valor;
    
    //Creamos el constructor por defecto
    public Numeros(){
    this.valor = 0;
    }
    
    //Creamos el constructor con su parámetro
    public Numeros(int valor){
        this.valor = valor;
    }
    
    //Creamos el getter y setter

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    //Creamos los métodos
    
    /**
     * Método que nos dice si el númnero es par o impar
     */
    public void esParOImpar() {
        if (this.valor % 2 == 0) {
            System.out.println("El número " + this.valor + " es par.");
        } else {
            System.out.println("El número " + this.valor + " es impar.");
        }
    }
    
    /**
     * Método que compara cual es mayor que otro
     * @param otro
     * @return el número mayor
     */
    public boolean esMayorQue(Numeros otro) {
        return this.valor > otro.valor;
    }
    
    /**
     * Método que compara cual es menor que otro
     * @param otro
     * @return el número menor
     */
    public boolean esMenorQue(Numeros otro) {
        return this.valor < otro.valor;
    }
    
    
    //Creamos To String

    @Override
    public String toString() {
        return "Valor del número: " + this.valor;
    }
    
    
}
