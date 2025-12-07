
/**
 * Crea una clase Test donde instancies diferentes electrodomésticos y calcules 
 * su consumo y su factura. Imprime los resultados por pantalla.
 *
 * @author KevinNS
 */
public class Test {

    public static void main(String[] args) {
        
        //Creamos los objetos
        Electrodomestico lavadora = new Electrodomestico(1.5f, 0.2f, "A++");
        Electrodomestico horno = new Electrodomestico(2.0f, 0.2f, "A");
        Electrodomestico nevera = new Electrodomestico(0.8f, 0.2f, "B");
        
        float horasLavadora = 3;
        float horasHorno = 2;
        float horasNevera = 24;
        
        System.out.println("----LAVADORA----");
        System.out.println(lavadora.toString());
        System.out.println("Consumo lavadora: " + lavadora.calcularConsumo(horasLavadora)
                + "Kwh");
        System.out.println("Factura lavadora: " + lavadora.calcularFactura(horasLavadora));
        
        System.out.println("----HORNO----");
        System.out.println(horno.toString());
        System.out.println("Consumo horno: " + horno.calcularConsumo(horasHorno)
                + "Kwh");
        System.out.println("Factura horno: " + horno.calcularFactura(horasHorno));
        
        System.out.println("----NEVERA----");
        System.out.println(nevera.toString());
        System.out.println("Consumo nevera: " + nevera.calcularConsumo(horasNevera)
                + "Kwh");
        System.out.println("Factura nevera: " + nevera.calcularFactura(horasNevera));
    }

}
