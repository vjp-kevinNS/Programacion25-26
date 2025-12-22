import java.util.Scanner; //Importamos Scanner
/**
 * Implementa un programa que solicite al usuario una cantidad en segundos y la 
 * convierta a días, horas, minutos y segundos.
 * 
 * • Muestra por pantalla el resultado de la siguiente forma:
 * Por favor, introduzca un número de segundos:
 * XXXXXXX
 * xxx segundos hacen un total de : xxx días, xxx horas, xxx minutos y xxx segundos.
 *
 * @author KevinNS
 */
public class Ejercicio21T2SegundosADias {

    public static void main(String[] args) {
        
        //Pedimos al usuario que introduzca un número, que serán los segundos
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca los segundos");
        int totalSeg = entrada.nextInt();
        
        //Declaramos las variables que usaremos y hacemos las operaciones
        int dias = totalSeg / 86400;  // 1 día tiene 86400 segundos
        int horas = (totalSeg % 86400) / 3600; //1 hora tiene 3600 segundos
        int minutos = (totalSeg % 86400) / 60; //1 minuto tiene 60 segundos
        int segundo = totalSeg % 60;
        
        //Ahora imprimimos el resultado por pantalla
        System.out.println(totalSeg + " Segundos hacen un total de " + dias 
                + " días, " + horas + " horas, " + minutos + " minutos y " 
                + segundo + " segundos.");
        
        

    }

}
