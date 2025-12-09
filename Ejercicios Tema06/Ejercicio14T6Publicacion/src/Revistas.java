
/**
 * Hereda de Publicación
 * 
 * Las revistas tienen un número.
 * 
 * @author KevinNS
 */
public class Revistas extends Publicacion{
    
    //Creamos el atributo
    private int numero;
    
    //Creamos el constructor por defecto añadiendo super
    public Revistas() {
        super();
        this.numero = 0;
    }

    public Revistas(int numero, String codigo, String titulo, int anio) {
        super(codigo, titulo, anio);
        this.numero = numero;
    }
    
    //Creamos los getters y setters

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    //Creamos To String

    @Override
    public String toString() {
        return "La revista con el: " + getCodigo() + ". Con el título: " 
                + getTitulo() + ". Del año: " + getAnio() + ", tiene éste número: "
                + numero;
    }
    
    
    
}
