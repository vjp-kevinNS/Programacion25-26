/**
 * Clase Enunciado que tendrá dos atributos de tipo String, pregunta y respuesta.
 * 
 * @author KevinNS
 */
public class Enunciado {
    
    //Creamos los atributos
    private String pregunta;
    private String respuesta;
    
    //Creamos los constructores por defecto
    public Enunciado(){
        this.pregunta = pregunta;
        this.respuesta = respuesta;
    }
    
    //Creamos los constructores con sus parámetros
    public Enunciado(String pregunta, String respuesta){
        this.pregunta = pregunta;
        this.respuesta = respuesta;
    }
    
    //Creamos los getter y setter

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
    
    //Creamos To String

    @Override
    public String toString() {
        return "Esta es la pregunta: " + this.pregunta + " y ésta la respuesta: "
                + this.respuesta;
    }
    
}
