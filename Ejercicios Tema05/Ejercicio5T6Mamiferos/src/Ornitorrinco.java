
/**
 * Hereda de Mamifero y tiene como atributo el número de huevos del ornitorrinco
 *
 * El Ornitorrinco implementa el siguiente comportamiento:
 * • obtenerMensajeOviparo. Devuelve el mensaje “El ornitorrinco es un mamífero
 * ovíparo”.
 * • ponerHuevo. Aumenta el número de huevos del ornitorrinco en una unidad.
 * • incubarHuevo. Disminuye el número de huevos del ornitorrinco en una unidad.
 * • mostrarNumHuevos. Muestra el número de huevos del ornitorrinco.
 *
 * @author KevinNS
 */
public class Ornitorrinco extends Mamifero implements Oviparo {

    //Creamos el atributo
    private int huevos;

    //Creamos el constructor por defecto y añadimos super
    public Ornitorrinco() {
        super();
        this.huevos = 0;
    }

    //Creamos el constructor parametrizado y añadimos super
    public Ornitorrinco(String nombre, String sexo, String color, int edad, int huevos) {
        super(nombre, sexo, color, edad);
        this.huevos = huevos;
    }

    //Creamos el getter y setter
    public int getHuevos() {
        return huevos;
    }

    public void setHuevos(int huevos) {
        this.huevos = huevos;
    }

    //Creamos los métodos que implementamos de Oviparo
    /**
     * Método que nos muestra el menssaje
     *
     * @return el mensaje
     */
    @Override
    public String obtenerMensajeOviparo() {
        return "El Ornitorrinco es un mamífero Ovíparo";
    }

    /**
     * Método que aumenta el número de huevos del ornitorrinco en una unidad y
     * nos muestra el total que tiene
     */
    @Override
    public void ponerHuevo() {
        this.huevos++;
        System.out.println(getNombre() + " ha puesto un huevo. Total: "
                + huevos);
    }

    /**
     * Método que disminuye el número de huevos del ornitorrinco en una unidad y
     * nos muestra el total que tiene
     */
    @Override
    public void incubarHuevo() {
        if (huevos > 0) {
            this.huevos--;
            System.out.println(getNombre() + " ha incubado un huevo. Restantes: "
                    + this.huevos);

        } else {
            System.out.println(getNombre() + " No tiene huevos para incubar");
        }
    }
    
    /**
     * Método que muestra el número total de huevos 
     */
    @Override
    public void mostrarNumHuevos() {
        System.out.println("El número de huevos de " + getNombre() + " es: "
                + huevos);

    }
    
    //Creamos To String

    @Override
    public String toString() {
        return "El Ornitorrinco tiene: " + huevos + " Huevos" ;
    }
    

}
