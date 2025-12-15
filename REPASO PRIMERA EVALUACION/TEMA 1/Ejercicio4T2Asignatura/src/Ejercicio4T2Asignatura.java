
/**
 * Realiza un programa en JAVA que escriba por pantalla el nombre de una 
 * asignatura, la nota del primer examen, la nota del segundo examen y la
 * nota media de la asignatura. Para ello deberás, previamente, almacenar las 
 * notas en variables que sean del tipo más óptimo posible (aprovechando la
 * memoria).
 *
 * @author KevinNS
 */
public class Ejercicio4T2Asignatura {

    public static void main(String[] args) {
        
        //Creamos las variables
        double nota1 = 5.3;
        double nota2 = 6.5;
        double media = nota1 + nota2 / 2;
        double resultado;
        
        resultado = nota1 + nota2 / media;
        System.out.println("----Notas de PROGRAMACION----");
        System.out.println("Nota del primer examen: " + nota1);
        System.out.println("Nota del segundo examen: " + nota2);
        System.out.println("NOTA MEDIA: " + resultado);
    }

}
