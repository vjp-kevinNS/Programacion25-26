
import java.util.Scanner;


/**
 * La clase Videojuego, que no admite subclases, tiene como atributos
 * son horas estimadas y estudio. Estudio es objeto de la clase Estudio,
 * con los atributos nombre y último lanzamiento (String). Por defecto,
 * las horas estimadas serán de 10 horas y entregado false. El resto de
 * atributos serán valores por defecto según el tipo del atributo.
 * 
 * En los videojuegos se valorarán los contenidos exclusivos, el gameplay y la
 * innovación.
 * 
 * ○ Los constructores que se implementarán serán:
 * ■ Un constructor por defecto.
 * ■ Un constructor con el título y horas estimadas. El resto por defecto.
 * ■ Un constructor con todos los atributos, excepto entregado.
 * 
 * ○ Los métodos que se implementara serán los propios de la clase y:
 * ■ valorar: pide al usuario una valoración del 1 al 5 en las categorías contenidos exclusivos,
 * gameplay e innovación. Muestra la valoración media por pantalla y la devuelve.
 * ■ entregar: si el contenido no está entregado, pone su valor a true y muestra un mensaje al
 * usuario: “Has alquilado [título] de [nombre del estudio]”. En caso contrario, muestra un
 * mensaje indicando “[Título] no está disponible]”.
 * ■ devolver: si está entregado, pone su valor a false y muestra un mensaje: “[Título] de [nombre
 * del estudio] devuelto correctamente. Si te ha gustado, puedes probar el último lanzamiento
 * de [nombre del estudio]: [nombre del último lanzamiento]”. En caso contrario, muestra un
 * mensaje indicando que no puede devolver el videojuego.
 *
 * @author KevinNS
 */
public class Videojuegos extends Contenido{
    
    //Creamos los atributos
    private int horasEstimadas;
    private Estudio estudio;
    
    //Creamos los constructores por defecto añadiendo super
    public Videojuegos(){
        super("", false, "");
        this.estudio = new Estudio();
        this.horasEstimadas = 0;
    }
    
    //Creamos un constructor con el título y horas estimadas. El resto por defecto.
    
    public Videojuegos(int horasEstimadas, String titulo){
        super(titulo, false, "");
        this.horasEstimadas = horasEstimadas;
        this.estudio = new Estudio();
    }
    
    //Creamos los constructores parametrizado
    public Videojuegos(int horasEstimadas, Estudio estudio, String titulo, boolean entregado, String genero) {
        super(titulo, entregado, genero);
        this.horasEstimadas = horasEstimadas;
        this.estudio = estudio;
    }
    
    //Creamos los getters y setters

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public Estudio getEstudio() {
        return estudio;
    }

    public void setEstudio(Estudio estudio) {
        this.estudio = estudio;
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
        System.out.println("Dá una valoración del 1 al 5 para Contenidos exclusivos");
        float exclusivo = entrada.nextFloat();
        System.out.println("Dá una valoración del 1 al 5 para Gameplay");
        float gameplay = entrada.nextFloat();
        System.out.println("Dá una valoración del 1 al 5 para Innovación");
        float innovacion = entrada.nextFloat();
        
        return (exclusivo + gameplay + innovacion) / 3;
    }

    @Override
    public void entregar() {
        if (entregado == false) {
            entregado = true;
            System.out.println("Has alquilado: " + this.getTitulo() + " de " 
                    + this.estudio.getNombre());         
        }else{
            System.out.println("El titulo: " + this.getTitulo() 
                    + " no está disponible");
        }
    }

    @Override
    public void devolver() {
        if (entregado == true) {
            entregado = false;
            System.out.println("El titulo " + this.getTitulo() + " del estudio" 
                    + this.estudio.getNombre() + " devuelto correctamente" 
                    + "Si te ha gustado, puedes probar el último lanzamiento de " 
                    + this.estudio.getNombre() + " con éste titulo: " + this.getTitulo());
        } else {
            System.out.println("No se puede devolver el videojuego");
        }
    }

    @Override
    public boolean esEntregado() {
        return this.entregado;
    }
    
    //Creamos To String

    @Override
    public String toString() {
        return "Videojuegos{" + "horasEstimadas=" + horasEstimadas + ", estudio=" + estudio + '}';
    }
    
}
