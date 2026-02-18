package ejercicio4t9examenusuario;
import java.util.Scanner; // Importamos Scanner
/**
 * Realiza un programa que le haga un examen al usuario, preguntándole cuál es
 * la capital de España y quién “descubrió” América. 
 * 
 * • Las respuestas correctas las guardaras en dos constantes de tipo String 
 * llamadas RESPUESTA1 y RESPUESTA2.
 * 
 * • Le dirá si ha respondido correctamente o no, cuál sería la respuesta correcta 
 * y, por último, le dirá su nota (Un 0, un 5 o un 10)
 *
 * @author KevinNS
 */
public class Ejercicio4T9ExamenUsuario {
    
    // Creamos las constantes
    final static String RESPUESTA1 = "Madrid";
    final static String RESPUESTA2 = "Colón";

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int nota = 0; // Variable para ir sumando los puntos
        String respuestaUsuario;
        
        System.out.println("---- EXAMEN DE CULTURA GENERAL ----");
        
        // 1ª PREGUNTA
        System.out.println("1ª PREGUNTA: ¿Cuál es la capital de España?: ");
        respuestaUsuario = entrada.nextLine();
        
        // Comparamos usando equalsIgnoreCase para que no importen mayús/minús
        if (respuestaUsuario.equalsIgnoreCase(RESPUESTA1)) {
            System.out.println("Respuesta correcta");
            nota = nota + 5; // Sumamos 5 puntos
        }else{
            System.out.println("Respuesta incorrecta. La respuesta correcta es: " 
                    + RESPUESTA1);
        }
        
        // PREGUNTA 2
        System.out.println("2ª PREGUNTA: ¿Quién descubrió América?");
        respuestaUsuario = entrada.nextLine();
        
        // Comparamos usando lo mismo que en la anterior
        if (respuestaUsuario.equalsIgnoreCase(RESPUESTA2)) {
            System.out.println("Respuesta correcta");
            nota = nota + 5; // Sumamos otros 5 puntos
        }else{
            System.out.println("Respuesta incorrecta. La respuesta correcta es: " 
                    + RESPUESTA2);
        }
        
        // RESULTADO FINAL
        System.out.println("NOTA DEL EXAMEN: " + nota);

    }

}
