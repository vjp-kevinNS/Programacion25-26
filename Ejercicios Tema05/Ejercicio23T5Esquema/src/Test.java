/**
 *
 * @author KevinNS
 */
public class Test {


    public static void main(String[] args) {
        
        //Creamos los objetos
        
        Taxi taxiParametrizado = new Taxi(1234, "5678AA", "Polo", 23134234);
        System.out.println(taxiParametrizado);
        
        Taxi taxiPorDefecto = new Taxi();
        System.out.println(taxiPorDefecto);
        taxiPorDefecto.setModelo("Megane");
        taxiPorDefecto.setMatricula("111VVV");
        taxiPorDefecto.setPotencia(130);
        taxiPorDefecto.setNumeroLicencia(32423432);
    }
    
}
