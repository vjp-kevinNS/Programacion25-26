//Enunciado: realiza un programa en el que tengas una variable entera llamada
//tiempo que contiene un tiemp o en segundos igual a 10000. Queremos conocer
//ese tiempo, pero expresado en horas, minutos y segundos.
/**
 *
 * @author kevin
 */
public class Ejercicio15 {

    public static void main(String[] args) {
        //declaramos la variable tiempo en segundos
        int tiempo = 10000;
        
        //1 hora son 3600 segundos
        int hora = tiempo / 3600; //division entera. cuantas H caben en 10000seg
        int resto = tiempo % 3600; //con % sabemos el resto que queda despues de dividir
        
        //1 minuto son = 60 segundos
        int minutos = resto / 60; //del resto cuantos minutos caben
        int segundos = resto % 60; //el resto final son los segundos
        System.out.println("10000 segundos hacen un total de "
        +hora+ " horas " +minutos+ " minutos " +segundos+ " segundos ");
                
        
    }
    
}
