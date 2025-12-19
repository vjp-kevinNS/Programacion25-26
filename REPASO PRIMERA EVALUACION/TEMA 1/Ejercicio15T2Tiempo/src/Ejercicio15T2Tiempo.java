
/**
 * Realiza un programa en el que tengas una variable entera llamada tiempo que 
 * contiene un tiempo en segundos igual a 10000 (diez mil). Queremos conocer
 * ese tiempo, pero expresado en horas, minutos y segundos.
 * 
 * • Muestra por pantalla el resultado de la siguiente forma:
 * 10.000 segundos hacen un total de: xxx horas, xxx minutos y xxx segundos.
 *
 * @author KevinNS
 */
public class Ejercicio15T2Tiempo {

    public static void main(String[] args) {
        
        //Declaramos la variable
        int tiempo = 10000;
        
        //Ahora desglosamos esos segundos en horas, minutos y segundos
        
        //1 hora son 3600 segundos, entonces declaramos esa variable para ultilzarla
        //y guardamos el resto
        
        int horas = tiempo / 3600;
        int resto = tiempo % 3600;
        
        //1 minuto son 60 segundos, hacemos lo mismo
        int minutos = tiempo / 60;
        int segundos = tiempo % 60;
        
        //Mostramos el resultado por pantalla
        System.out.println("10000 segundos hacen un total de " + horas + " horas " 
                + minutos + " minutos y " + segundos + " segundos.");
        
    }

}
