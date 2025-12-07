import java.util.Scanner; //Importamos Scanner
/**
 * Crea una clase Carrito con los atributos total (precio total de la
 * compra). Esta clase implementa las 2 interfaces que has creado
 * antes: Descontable y Pagable.
 * 
 * ○ Si la compra es superior a 50€, se aplica un descuento del 10%.
 * ○ El pago con tarjeta suma al total una comisión de 5€. El pago en
 * efectivo no tiene comisión. El pago con Paypal suma una comisión del
 * 3% sobre el total.
 * ○ Al procesar el pago, se aplica, en su caso, el descuento y se pregunta al
 * usuario el sistema de pago que quiere utilizar.
 *
 * @author KevinNS
 */
public class Carrito implements Descontable, Pagable{
    
    //Creamos el atributo
    private double total;
    
    //Creamos el constructor por defecto
    public Carrito(){
        this.total = 0.0;
    }
    
    //Creamos el constructor parametrizado
    public Carrito(double total){
        this.total = total;
    }
    
    //Creamos el getter y setter

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    //Creamos los métodos que obligan a implementar Descontable y Pagable

    @Override
    public void aplicarDescuento(float descuento) {
        
        this.total = this.total + (this.total * (descuento / 100));
    }

    @Override
    public void pagoTarjeta() {
        
        this.total = this.total + 5;
        System.out.println("Has pagado con Tarjeta. El precio es: " + total);
    }

    @Override
    public void pagoEfectivo() {
        
       System.out.println("Has pagado en Efectivo. El precio es: " + total);
    }

    @Override
    public void pagoPaypal() {
        
        aplicarDescuento(3);
        System.out.println("Has pagado con PayPal. El precio es: " + total);
    }

    @Override
    public void procesarPago() {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Qué sistema de pago quiere utilizar?");
        System.out.println("1- Pago con Tarjeta");
        System.out.println("2- Pago con Efectivo");
        System.out.println("3- pago con PayPal");
        int opcion = entrada.nextInt();
        
        switch (opcion) {
            case 1:
                System.out.println("Procesando pago con Tarjeta...");
                pagoTarjeta();
                break;
            case 2:
                System.out.println("Procesando pago con Efectivo...");
                pagoEfectivo();
                break;
            case 3:
                System.out.println("Procesando pago con PayPal...");
                pagoPaypal();
                break;
            default:
                System.out.println("No has introducido una opción valida");
                break;
        }

    }
    
    //Creamos To String

    @Override
    public String toString() {
        return "Carrito{" + " total: " + total + '}';
    }
    
    

}
