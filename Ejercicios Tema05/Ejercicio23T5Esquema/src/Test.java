
/**
 * Crea un programa en Java de tal forma que cada clase debe disponer de constructor
 * y permitir establecer (set) y recuperar (get) el valor de sus atributos.
 * También crea un método que permita mostrar la información del objeto cuando sea
 * procedente.
 * Por otro lado, crea una clase test que contenga el método main. En ella crea
 * un objeto taxi y un objeto autobús utilizando un constructor que reciba como
 * parámetros los valores de los atributos..
 * Crea otros 2 objetos, uno por cada clase, utilizando el constructor por defecto
 * y, luego, utiliza los métodos creados para asignarle valores a sus atributos.
 * • Por último muestra la información de cada objeto por pantalla.
 *
 * @author KevinNS
 */
public class Test {

    public static void main(String[] args) {

        //Creamos los objetos parametrizados
        Taxi taxiParametrizado = new Taxi(1234, "5678AA", "Polo", 23134234);
        System.out.println(taxiParametrizado.toString());
        Autobus autobusParametrizado = new Autobus(56, "3456KGB", "Mercedes", 250);
        System.out.println(autobusParametrizado);
        
        //Creamos los objetos por defecto
        Taxi taxiPorDefecto = new Taxi();  
        taxiPorDefecto.setModelo("Megane");
        taxiPorDefecto.setMatricula("111VVV");
        taxiPorDefecto.setPotencia(130);
        taxiPorDefecto.setNumeroLicencia(32423432);
        
        Autobus autobusPorDefecto = new Autobus();   
        autobusPorDefecto.setNumeroPlazas(89);
        autobusPorDefecto.setMatricula("5678CBD");
        autobusPorDefecto.setModelo("Opel");
        autobusPorDefecto.setPotencia(300);
        
        //Mostramos
        System.out.println(taxiPorDefecto.toString());
        System.out.println(autobusPorDefecto.toString());
        

        
    }

}
