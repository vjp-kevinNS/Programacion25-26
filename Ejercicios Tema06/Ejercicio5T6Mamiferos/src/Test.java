
/**
 *
 * @author KevinNS
 */
public class Test {

    public static void main(String[] args) {

        //Creamos los objetos, primero sin polimorfismo
        System.out.println("-----------------------------------------------------");
        Ornitorrinco orni1 = new Ornitorrinco("Perri", "Hembra", "Marron", 5, 9);
        System.out.println(orni1.toString());
        System.out.println(orni1.obtenerMensajeOviparo());
        orni1.ponerHuevo();
        orni1.incubarHuevo();
        orni1.mostrarNumHuevos();

        System.out.println("-----------------------------------------------------");
        Murcielago murci1 = new Murcielago("Batman", "Macho", "Negro", 3, 30);
        System.out.println(murci1.toString());
        System.out.println(murci1.obtenerMensajeVolador());
        murci1.aumentarAlturaVuelo();
        murci1.bajarAlturaVuelo();
        murci1.mostrarAlturaVuelo();

        //Creamos los objetos, ahora con polimorfismo
        //Declaramos las variables de los tipos de las interfaces
        Oviparo oviparo;
        Volador volador;

        oviparo = new Ornitorrinco("Orni", "Macho", "Blanco", 8, 13);
        System.out.println("Tipo Ovíparo");
        System.out.println(oviparo.obtenerMensajeOviparo());
        oviparo.ponerHuevo();
        oviparo.incubarHuevo();
        oviparo.mostrarNumHuevos();

        System.out.println("----------------------------------------------------");

        volador = new Murcielago("Batgirl", "Hembra", "Azul", 4, 40);
        System.out.println("Tipo Volador");
        System.out.println(volador.obtenerMensajeVolador());
        volador.aumentarAlturaVuelo();
        volador.bajarAlturaVuelo();
        volador.mostrarAlturaVuelo();
    }

}
