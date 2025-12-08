
/**
 * Una clase Contenido con las características comunes a todos los
 * contenidos de la plataforma: Título, Entregado (indica si el
 * contenido está entregado o no) y Género.
 * 
 * • OJO: no implementaremos get y set del atributo entregado.
 * 
 * Esta clase incluye una funcionalidad para valorar los contenidos.
 * Pregunta al usuario una valoración del 1 al 5 en diferentes categorías,
 * dependiendo del tipo de contenido.
 *
 * @author KevinNS
 */
public abstract class Contenido implements FuncionalidadContenido{
    
    //Creamos los atributos
    private String titulo;
    public boolean entregado;
    private String genero;
    
    //Creamos los contructores por defecto
    public Contenido(){
        this.titulo = "";
        this.entregado = false;
        this.genero = "";
    }
    
    //Creamos los cosntructores parametrizados
    public Contenido(String titulo, boolean entregado, String genero){
        this.titulo = titulo;
        this.entregado = entregado;
        this.genero = genero;
    }
    
    //Creamos los getter y setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    //Creamos el método que heredaran las subclases
    public abstract float valoracion();
    
    //Creamos To String

    @Override
    public String toString() {
        return "Contenido{" + "titulo=" + titulo + ", entregado=" + entregado + ", genero=" + genero + '}';
    }
    

}
