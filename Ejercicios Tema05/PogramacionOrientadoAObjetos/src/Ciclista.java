/**
 *
 * @author KevinNS
 */
public class Ciclista {
    
    //ATRIBUTOS
    private String nombre;
    private int dorsal;
    private String tipo;
    
    //CONSTRUCTORES POR DEFECTO
    public Ciclista(){
        this.nombre = "";
        this.dorsal = 0;
        this.tipo = "";
    }
    
    //CONSTRUCTORES CON PARAMETROS
    public Ciclista (String nombre, int dorsal, String tipo){
        this.nombre = nombre;
        this.dorsal = dorsal;
        this.tipo = tipo;
    }

    //CREAMOS LOS GETTERS Y SETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    //CREAMOS LOS METODOS
    
    
    //CREAMOS TO STRING
    @Override
    public String toString(){
        return this.nombre + "(Dorsal " + this.dorsal +") - " + this.tipo;
    }
}
