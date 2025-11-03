
import java.util.Scanner; //Improtamos Scanner

/**
 *
 * @author KevinNS
 */
public class Ejercicio20T4EspañaAmerica {

    //Declaramos las constantes ya que son datos que no cambiaran 
    public final static String RESPUESTA1 = "Madrid";
    public final static String RESPUESTA2 = "Colón";

    public final static String PREGUNTA1 = "¿Cuál es la capital de España?";
    public final static String PREGUNTA2 = "¿Quién descubrió América?";

    public final static int PUNTUACION = 5;

    /**
     * Método que le pide al usuario la respuesta a la pregunta
     *
     * @return la respuesta del usuario
     */
    public static String pedirRespuesta() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextLine();
    }
    /**
     * Método que compara que la respuesta del usuario
     * con la respuesta correcta y devuelve true o false.
     * 
     * @param respuestaalUsuario
     * @param respuestaCorrecta
     * 
     * @return true si la respuesta es correcta y false en caso contrario
     */
    public static boolean comprobarRespuesta(String respuestaalUsuario, String respuestaCorrecta) {
        boolean correcto;

        if (respuestaalUsuario.equalsIgnoreCase(respuestaCorrecta)) {
            correcto = true;
        } else {
            correcto = false;
        }
        return correcto;
    }


    public static void main(String[] args) {
        int puntuacionFinal = 0;
        String respuesta;
        
        System.out.println("EXAMEN DE CULTURA GENERAL");
        
        //Primera pregunta
        System.out.println(PREGUNTA1);
        respuesta = pedirRespuesta();
        
        if(comprobarRespuesta(respuesta, RESPUESTA1)){
            System.out.println("Muy bien, respuesta correcta");
            puntuacionFinal += PUNTUACION;
        }else {
            System.out.println("No es correcto. la respuesta correcta sería " + RESPUESTA1);
        }
        //Segunda pregunta
            System.out.println(PREGUNTA2);
        respuesta = pedirRespuesta();
        
        if(comprobarRespuesta(respuesta, RESPUESTA2)){
            System.out.println("Muy bien, respuesta correcta");
            puntuacionFinal += PUNTUACION;
        }else {
            System.out.println("No es correcto. la respuesta correcta sería " + RESPUESTA2);
        }
        
        System.out.println("NOTA DEL EXAMEN: " + puntuacionFinal);

    }
}
