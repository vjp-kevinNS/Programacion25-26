
/**
 * La clase Microondas tiene los atributos activo (boolean), estadoCalentador
 * (boolean) y puertaCerrada (boolean).
 *
 * Implementa el comportamiento definido en las siguientes interfaces:
 * ● Operable. ● Revisable.
 *
 * En la clase Microondas, debes implementar los métodos de la siguiente manera:
 * 
 * ● Activar. Si ya está activo el microondas, muestra el mensaje “El microondas
 * ya estaba activo”. Si no, comprueba si el estado del calentador es correcto y
 * la puerta está cerrada para activar el microondas y mostrar el mensaje “El 
 * microondas está activado”. En cambio, si el estado del calentador no es 
 * correcto o la puerta está abierta, proporciona el feedback correspondiente 
 * al usuario en cada caso.
 * 
 * ● Desactivar. Si está activo el microondas, lo desactiva y muestra el mensaje
 * “El microondas está desactivado". En caso contrario, muestra el mensaje “El 
 * microondas ya estaba desactivado”.
 * 
 * ● Realizar revisión. Comprueba el estado del calentador. Si no es correcto,
 * devuelve el mensaje “Fallos detectados en el calentador del microondas”. Si 
 * es correcto, comprueba que la puerta no esté abierta. Si es así, devuelve el 
 * mensaje “La puerta está abierta. Por favor, ciérrela”. En caso contrario, 
 * devuelve el mensaje “El calentador funciona correctamente y la puerta está 
 * cerrada”.
 *
 * @author KevinNS
 */
public class Microondas implements Operable, Revisable{
    
    //Creamos los objetos
    private boolean activo;
    private boolean estadoCalentador;
    private boolean puertaCerrada;
    
    //Creamos los constructores por defecto
    public Microondas(){
        this.activo = false;
        this.estadoCalentador = false;
        this.puertaCerrada = false;
    }
    
    //Creamos los constructores parametrizados
    public Microondas(boolean activo, boolean estadoCalentador, boolean puertaCerrada){
        this.activo = activo;
        this.estadoCalentador = estadoCalentador;
        this.puertaCerrada = puertaCerrada;
    }
    
    //Creamos los getters y setters

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public boolean isEstadoCalentador() {
        return estadoCalentador;
    }

    public void setEstadoCalentador(boolean estadoCalentador) {
        this.estadoCalentador = estadoCalentador;
    }

    public boolean isPuertaCerrada() {
        return puertaCerrada;
    }

    public void setPuertaCerrada(boolean puertaCerrada) {
        this.puertaCerrada = puertaCerrada;
    }
    
    //Creamos los métodos que nos hace implementar Operable y Revisable
    
    /**
     * Método que nos muestra si el microondas está activado o no
     */
    @Override
    public void activar() {
        if (!activo) {
            System.out.println("El microondas ya estaba activo");
        } else if(!estadoCalentador) {
            System.out.println("Error. El calentador no funciona correctamente");
        } else if(!puertaCerrada){
            System.out.println("Error. La puerta del microondas está abierta");
        } else{
            activo = true;
            System.out.println("El microondas está activado");
        }
        
    }
    
    /**
     * Método que nos muestra si el microondas está desactivado o no
     */
    @Override
    public void desactivar() {
        if (activo) {
            activo = false;
            System.out.println("El microondas está desactivado");
            
        } else {
            System.out.println("El microondas ya estaba desactivado");
        }
        
    }
    
    /**
     * Método que nos muestra el resultado de la revisión de los componentes del
     * microondas
     * @return la revisión de los componentes
     */
    @Override
    public String realizarRevision() {
        if (!estadoCalentador) {
            return "Fallos detectados en el calentador del microondas";
        } else if(!puertaCerrada) {
            return "La puerta está abierta. Por favor ciérrela";
        }else{
            return "El calentador funciona correctamente y la puerta está cerrada";
        }
    }
    
    //Creamos To String

    @Override
    public String toString() {
        return "El microondas está: " + activo + " . Este es el estado del calentador: "
                + estadoCalentador + " . La puerta del microondas está: "
                + puertaCerrada;
    }
    
    
   

}
