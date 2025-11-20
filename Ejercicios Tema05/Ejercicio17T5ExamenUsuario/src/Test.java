import java.util.Scanner; //Importamos Scanner
/**
 * Realiza un programa, orientado a objetos, que le
 * haga un examen al usuario, haciéndole 4 preguntas (por ejemplo:
 * ¿cuál es la capital de España?, ¿quién descubrió América?…) Le dirá
 * si ha respondido correctamente o no, cual sería la respuesta
 * correcta, y por último le dirá su nota (Cada pregunta acertada vale 2,5).
 *
 * Clase Test donde crearás 4 objetos e implementarás los métodos necesarios
 * para preguntar al usuario, y para darle la nota del examen.
 *
 * @author KevinNS
 */
public class Test {
    
    //Creamos los métodos
    
    /**
     * Método que muestra si es correcta la respuesta del usuario
     * @param respuestaUusario
     * @param pregunta
     * @return si la respuesta es correcta o no
     */
    public static boolean esCorrecta(String respuestaUusario, Enunciado pregunta){
        return respuestaUusario.equalsIgnoreCase(pregunta.getRespuesta());
    }
    
    /**
     * Método que pide al usuario la respuesta y muestra si es correcta o no
     * @param p1
     * @param p2
     * @param p3
     * @param p4 
     */
    public static void hacerExamen(Enunciado p1, Enunciado p2, Enunciado p3, Enunciado p4){
        Scanner entrada = new Scanner(System.in);
        double nota = 0;
        
        System.out.println(p1.getPregunta());
        System.out.println("Tu respuesta:");
        String r1 = entrada.nextLine();
        
        if (esCorrecta(r1, p1)){
            System.out.println("¡Respuesta Correcta!");
            nota += 2.5;
            
        } else {
            System.out.println("¡Respuesta incorrecta! La respuesta correcta es: "
            + p1.getRespuesta());
        }
        
        System.out.println(p2.getPregunta());
        System.out.println("Tu respuesta:");
        String r2 = entrada.nextLine();
        
        if (esCorrecta(r2, p2)){
            System.out.println("¡Respuesta Correcta!");
            nota += 2.5;
            
        } else {
            System.out.println("¡Respuesta incorrecta! La respuesta correcta es: "
            + p2.getRespuesta());
            
        }
        System.out.println(p3.getPregunta());
        System.out.println("Tu respuesta:");
        String r3 = entrada.nextLine();
        
        if (esCorrecta(r3, p3)){
            System.out.println("¡Respuesta Correcta!");
            nota += 2.5;
            
        } else {
            System.out.println("¡Respuesta incorrecta! La respuesta correcta es: "
            + p3.getRespuesta());
            
        }
        System.out.println(p4.getPregunta());
        System.out.println("Tu respuesta:");
        String r4 = entrada.nextLine();
        
        if (esCorrecta(r4, p4)){
            System.out.println("¡Respuesta Correcta!");
            nota += 2.5;
            
        } else {
            System.out.println("¡Respuesta incorrecta! La respuesta correcta es: "
            + p4.getRespuesta());
        }
        System.out.println("Tu nota final es: " + nota);
 
    }

    public static void main(String[] args) {

        //Creamos los objetos
        Enunciado pregunta1 = new Enunciado("¿A que civilización pertenecian los Espartanos?",
                "A la civilización Griega");
        Enunciado pregunta2 = new Enunciado("Quienes se enfrentaron contra los Espartanos?",
                "Los persas");
        Enunciado pregunta3 = new Enunciado("¿Quién fue el rey Espartano que luchó en las Termopilas?",
                "El rey Leonidas");
        Enunciado pregunta4 = new Enunciado("Quién fue el rey que lidero a los Persas?",
                "El rey Jerjes");
        
        //LLamamos al método para hacer el exámen
        hacerExamen(pregunta1, pregunta2, pregunta3, pregunta4);
    }

}
