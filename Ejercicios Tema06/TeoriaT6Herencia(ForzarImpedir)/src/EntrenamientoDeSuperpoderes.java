
/**
 *
 * @author KevinNS
 */
public class EntrenamientoDeSuperpoderes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1. CREAR OBJETOS DE LA CLASE
        // Creamos un objeto de Flash
//        Flash flash = new Flash("Flash", 1000);
        
        // Llamamos a los métodos de la interfaz
//        flash.atravesarObjetos("Edificio");
//        flash.correrRapido(800);
        
        // Llamamos a los métodos de la clase
//        flash.dejarEstela();
        
        
        
        // 2. CREAR OBJETOS A PARTIR DE LA INTERFAZ
        /* Podemos guardar objetos en variables del tipo de la interfaz
         * ...pero NO podemos instanciar objetos de la interfaz 
         *(porque no es una clase, no tiene constructores... y no es su cometido)
         */
//        SuperVelocidad flashVelocista = new SuperVelocidad(); -> MAL
//        SuperVelocidad flashVelocista = new Flash("Flash Velocista", 1000); // -> BIEN
        
        // Llamamos a los métodos de la interfaz
//        flashVelocista.atravesarObjetos("Coche");
//        flashVelocista.correrRapido(2000);
        
        // No tenemos acceso a los métodos de la clase, solo a los de la interfaz
//        flashVelocista.dejarEstela();
        
        // 3. POLIMORFISMO
        // Creamos una variable del tipo de la interfaz 
        // y guardamos objetos de distinto tipo (Flash y Hulk).
        // El mismo método se comporta de manera distinta (adopta múltiples formas).
//        Defensa superheroeDefensivo = flash;
//        superheroeDefensivo.defenderse();
        
//        superheroeDefensivo = new Hulk("Hulk Defensivo", 500);
//        superheroeDefensivo.defenderse();

        
        
        // 4. EL OPERADOR INSTANCEOF: nos dice de qué tipo es un objeto
        
//        System.out.println("\n¿Qué superhéroe tenemos guardado en superheroeDefensivo?");
//        if(superheroeDefensivo instanceof Hulk) {
//            System.out.println("Es Hulk");
//        } else if(superheroeDefensivo instanceof Flash) {
//            System.out.println("Es Flash");
//        } else {
//            System.out.println("Es un superhéroe desconocido");
//        }
        
//        System.out.println("\n¿Qué superpoder tiene el superheroeDefensivo?");
//        if(superheroeDefensivo instanceof SuperVelocidad) {
//            System.out.println("Supervelocidad");
//        } else if(superheroeDefensivo instanceof Defensa) {
//            System.out.println("Defensa");
//        } else {
//            System.out.println("Ningua");
//        }
        
    }    

}
