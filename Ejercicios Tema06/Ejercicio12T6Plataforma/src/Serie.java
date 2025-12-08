import java.util.Scanner; //Improtamos Scanner
/**
 * La clase Serie, que no admite subclases, tiene como atributos: número de
 * temporadas y creador. Por defecto, el número de temporadas es de 3
 * temporadas y entregado false. El resto de atributos serán valores por
 * defecto según el tipo del atributo.
 * 
 * En las series se valorarán las categorías guion, interpretación y fotografía
 * 
 * ○ Los constructores que se implementarán serán:
 * ■ Un constructor por defecto.
 * ■ Un constructor con título y creador. El resto por defecto.
 * ■ Un constructor con todos los atributos, excepto entregado.
 * 
 * ○ Los métodos que se implementarán serán los propios de la clase y:
 * ■ valorar: pide al usuario una valoración del 1 al 5 en las categorías guion,
 * interpretación y fotografía. Muestra la valoración media por pantalla y la devuelve.
 * ■ entregar: si el contenido no está entregado, pone su valor a true y muestra un
 * mensaje al usuario: “Has alquilado [título] de [creador]”. En caso contrario, muestra
 * un mensaje indicando que no se puede prestar el contenido.
 * ■ devolver: si está entregado, pone su valor a false y muestra un mensaje: “[Título] de
 * [creador] devuelta correctamente”. En caso contrario, muestra un mensaje indicando
 * que no se puede devolver la serie.
 *
 * @author KevinNS
 */
public class Serie extends Contenido {
    
    //Creamos los atributos
    private int numeroTemporadas;
    private String creador;
    
    //Creamos el constructor por defecto añadiendo super
    public Serie(){
        super("", false, "");
        this.numeroTemporadas = 3;
        this.creador = "";
    }
    
    //Creamos un constructor con título y creador. El resto por defecto.
    public Serie(String titulo, String creador){
        super(titulo, false, "");
        this.creador = creador;
    }
    
    
    //Creamos los constructores parametrizados añadiendo super
    public Serie(int numeroTemporadas, String creador, String titulo, String genero){
        super(titulo, false, genero);
        this.numeroTemporadas = numeroTemporadas;
        this.creador = creador;
    }
    
    //Creamos los getters y settters

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }
    
    //Creamos el método abstracto heredado de Contenido
    
    /**
     * Método que pide al usuario una valoración del 1 al 5 y luego nos muestra
     * la media
     * @return la media de las valoraciones
     */
    @Override
    public float valoracion(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dá una valoración del 1 al 5 para Guión");
        float guion = entrada.nextFloat();
        System.out.println("Dá una valoración del 1 al 5 para Interpretación");
        float interpretacion = entrada.nextFloat();
        System.out.println("Dá una valoración del 1 al 5 para Fotografía");
        float fotografia = entrada.nextFloat();
        
        return (guion + interpretacion + fotografia) / 3;
    }
    
    //Creamos los métodos que nos hace implementar FuncionalidadContenido

    @Override
    public void entregar() {
        if (entregado == false) {
            entregado = true;
            System.out.println("Has alquilado: " + this.getTitulo() + " de " 
                    + this.getCreador());         
        }else{
            System.out.println("El titulo: " + this.getTitulo() 
                    + " no está disponible");
        }
    }

    @Override
    public void devolver() {
        if (entregado == true) {
            entregado = false;
            System.out.println("El titulo " + this.getTitulo() + " del creador" 
                    + this.getCreador() + " devuelto correctamente" 
                    + "Si te ha gustado, puedes probar el último lanzamiento de " 
                    + this.getCreador() + " con éste titulo: " + this.getTitulo());
        } else {
            System.out.println("No se puede devolver la serie");
        }
    }

    @Override
    public boolean esEntregado() {
        return this.entregado;
    }
    
    

}
