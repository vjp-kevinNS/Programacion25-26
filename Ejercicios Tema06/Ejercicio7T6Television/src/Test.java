
/**
 * Crea una clase Test en la que instancies un objeto de la clase
 * Televisor, la enciendas, muestres su información, subas el
 * volumen 3 veces, muestres el volumen actual, cambies de canal,
 * bajes el volumen, la apagues y muestres de nuevo su
 * información.
 * 
 * Haz lo mismo con un objeto de la clase Radio.
 *
 * @author KevinNS
 */
public class Test {

    public static void main(String[] args) {
        
        //Creamos los objetos
        
        System.out.println("--------------"+"TELEVISION"+"--------------");
        Televisor miTelevisor = new Televisor();
        
        // 1-La encendemos
        miTelevisor.encender();
        // 2-Mostramos la información actual
        miTelevisor.mostrarInformacion();
        // 3-Subimos el volúmen 3 veces
        miTelevisor.subirVolumen();
        miTelevisor.subirVolumen();
        miTelevisor.subirVolumen();
        // 4-Mostramos el volúmen actual
        System.out.println("Volúmen de la TV: " + miTelevisor.getVolumen());
        // 5-Cambiamos de canal
        miTelevisor.cambiarCanal(25.5f);
        // 6-Bajamos el volúmen
        miTelevisor.bajarVolumen();
        // 7-La apagamos 
        miTelevisor.apagar();
        // 8-Mostramos de nuevo la información
        miTelevisor.mostrarInformacion();
        System.out.println("---------------------------------------");
        
        System.out.println("--------------"+"RADIO"+"--------------");
        Radio miRadio = new Radio();
        
        // 1-La encendemos
        miRadio.encender();
        // 2-Mostramos la información actual
        miRadio.mostrarInformacion();
        // 3-Subimos el volúmen 3 veces
        miRadio.subirVolumen();
        miRadio.subirVolumen();
        miRadio.subirVolumen();
        // 4-Mostramos el volúmen actual
        System.out.println("Volúmen de la radio: " + miRadio.getVolumen());
        // 5-Cambiamos de canal
        miRadio.cambiarCanal(100.2f);
        // 6-Bajamos el volúmen
        miRadio.bajarVolumen();
        // 7-La apagamos 
        miRadio.apagar();
        // 8-Mostramos de nuevo la información
        miRadio.mostrarInformacion();
        System.out.println("---------------------------------------");
    }

}
