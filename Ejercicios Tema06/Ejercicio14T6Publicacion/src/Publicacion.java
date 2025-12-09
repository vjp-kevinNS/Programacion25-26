
/**
 * Superclase Publicacion
 *
 * Crea una clase Publicación que contenga las características comunes código, 
 * título y año de publicación.
 *
 * @author KevinNS
 */
public class Publicacion {
    
    //Creamos los atributos
    private String codigo;
    private String titulo;
    private int anio;
    
    //Creamos los constructores por defecto
    public Publicacion(){
        this.codigo = "";
        this.titulo = "";
        this.anio = 0;
    }
    
    //Creamos los constructores parametrizados
    public Publicacion(String codigo, String titulo, int anio){
        this.codigo = codigo;
        this.titulo = titulo;
        this.anio = anio;
    }
    
    //Creamos los getter y setter

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    //Creamos To String

    @Override
    public String toString() {
        return "La publicación con el código: " + codigo + ", con el tíulo: "
                + titulo + ", es del año " + anio;
    }
    

}
