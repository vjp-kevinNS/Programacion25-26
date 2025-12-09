
/**
 * Hereda de Publicación e implementa de la interfaz Prestable
 *
 * Los libros tienen, además, un atributo prestado de tipo booleano.
 *
 * Los libros deben implementar el comportamiento de Prestable de la siguiente
 * manera:
 * ○ prestar. Muestra el mensaje “Prestando libro…” y pone a true el atributo
 * prestado.
 * ○ devolver. Muestra el mensaje “Devolviendo libro…” y pone a false el 
 * atributo prestado.
 * ○ mostrarPrestado. Si el libro está prestado, muestra el mensaje “El libro
 * está prestado”. En caso contrario, muestra el mensaje “El libro no está 
 * prestado”.
 *
 * @author KevinNS
 */
public class Libros extends Publicacion implements Prestable{
    
    //Creamos el atributo
    private boolean prestado;
    
    //Creamos el constructor por defecto añadiendo super
    public Libros(){
        super();
        this.prestado = false;        
    }
    
    //Creamos el constructor parametrizado añadiendo super
    public Libros(boolean prestado, String codigo, String titulo, int anio) {
        super(codigo, titulo, anio);
        this.prestado = prestado;
    }
    
    //Creamos los getters y setters

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }
    
    //Creamos los métodos que nos hace implementar Prestable

    @Override
    public void prestar() {
        System.out.println("Prestando libro...");
        prestado = true;
        
    }

    @Override
    public void devolver() {
        System.out.println("Devolviendo libro...");
        prestado = false;
        
    }

    @Override
    public void mostrarPrestado() {
        if (prestado) {
            System.out.println("El libro está prestado"); 
        } else {
            System.out.println("El libro no está prestado");
        } 
    }
    
    //Creamos To String

    @Override
    public String toString() {
        return "El libro con el código: " + getCodigo() + ". Con el título: " 
                + getTitulo() + ". Del año: " + getAnio() + ", ha sido: "
                + prestado;
    }
    
    

}
