
import java.util.Scanner; //Importamos Scanner

/**
 * Añade una clase principal donde crees un objeto de cada tipo de suscripción.
 * Después, crea un menú en el que muestres los datos de las dos suscripciones y
 * pregunta al usuario qué suscripción quiere seleccionar. Finalmente, procesa
 * el pago.
 *
 * @author KevinNS
 */
public class Test {

    public static void main(String[] args) {

        //Creamos los objetos
        SuscripcionPeriodico periodico = new SuscripcionPeriodico(10, 20);
        SuscripcionTv television = new SuscripcionTv(21, 15);

        //Mostramos el detalle de las suscripciones y creamos un menú para que 
        //el usuario elija de que forma quiere pagar
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("Este es el detalle de las suscripciones:");
            System.out.println("----Suscripción Periódico----");
            System.out.println(periodico.toString());
            System.out.println("----Suscripción Televisión----");
            System.out.println(television.toString());
            System.out.println("Elija una opcción");
            int opcion = entrada.nextInt();
            Suscripcion seleccionada = periodico;

            switch (opcion) {
                case 1:
                    System.out.println("Ha elegido la suscripción al periódico");
                    seleccionada = periodico;
                    break;
                case 2:
                    System.out.println("Ha elegido la suscripción a la televisión");
                    seleccionada = television;
                default:
                    System.out.println("No ha elegido una opción disponible. Por defecto se selecciona Periódico");
                    break;
            }
            //Creamos el carrito con el total de la  suscripcion seleccionada
            Carrito carrito = new Carrito(seleccionada.calcularPrecio());
            carrito.procesarPago();
        } while (true);

    }

}
