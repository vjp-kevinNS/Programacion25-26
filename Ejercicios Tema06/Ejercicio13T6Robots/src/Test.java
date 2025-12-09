
/**
 * Implementa una clase Test en la que realices las siguientes operaciones:
 * 
 * ○ Crea un Robot desactivado, con los sistemas funcionando y el nivel de 
 * batería 15%. Para probar el robot, actívalo, realiza una revisión y 
 * desactívalo finalmente.
 * 
 * ○ Crea un Microondas activado, con el calentador funcionando y la puerta 
 * abierta. Para probar el microondas, actívalo, realiza una revisión y
 * desactívalo finalmente.
 * 
 * ○ Posteriormente, prueba el polimorfismo creando un Robot a partir de la
 * interfaz Operable y otro a partir de la interfaz Revisable. Comprueba que 
 * únicamente puedes invocar a los métodos del objeto que están definidos en la
 * interfaz a partir de la cual se instancia.
 *
 * @author KevinNS
 */
public class Test {

    public static void main(String[] args) {
        
        //Creamos los objetos, primero sin polimorfismo
        Robots roomba = new Robots(false, true, 15);
        System.out.println("----Probando Robot----");
        roomba.activar();
        System.out.println(roomba.realizarRevision());
        roomba.desactivar();
        
        Microondas siemens = new Microondas(true, true, false);
        System.out.println("----Probando Microondas----");
        siemens.activar();
        System.out.println(siemens.realizarRevision());
        siemens.desactivar();
        
        //Creamos los objetos usando polimorfismo
        System.out.println("----ROBOT POLIMORFISMO----");
        Operable robotOperable = new Robots(true, true, 50);
        robotOperable.activar();
        System.out.println(robotOperable.toString());
        robotOperable.desactivar();
        Revisable robotRevisable = new Robots(false, true, 30);
        System.out.println(robotRevisable.realizarRevision());
        
        System.out.println("----MICROONDAS POLIMORFISMO----");
        Operable microondasOperable = new Microondas(true, true, true);
        microondasOperable.activar();
        System.out.println(microondasOperable.toString());
        microondasOperable.desactivar();
        Revisable microondasRevisable = new Microondas(false, true, false);
        System.out.println(microondasRevisable.realizarRevision());

    }

}
