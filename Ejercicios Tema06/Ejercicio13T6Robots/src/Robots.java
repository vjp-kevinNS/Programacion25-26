
/**
 * La clase Robot tiene los atributos activo (boolean), estadoSistemas (boolean)
 * y nivelBateria (int).
 *
 * Implementa el comportamiento definido en las siguientes interfaces:
 * ● Operable. ● Revisable.
 * 
 * En la clase Robot, debes implementar los métodos de la siguiente manera:
 * 
 * ● Activar. Si ya está activo el robot, muestra el mensaje “El robot ya estaba
 * activo”. Si no, comprueba si el estado de los sistemas es correcto y el nivel
 * de batería mayor al 20% para activar el robot y mostrar el mensaje “El robot
 * está activado”. En cambio, si el estado del sistema no es correcto o el nivel
 * de batería es menor al 20%, proporciona el feedback correspondiente al usuario
 * en cada caso.
 * 
 * ● Desactivar. Si está activo el robot, lo desactiva y muestra el mensaje 
 * “El robot está desactivado". En caso contrario, muestra el mensaje 
 * “El robot ya estaba desactivado”.
 * 
 * ● Realizar revisión. Comprueba el estado de los sistemas. Si no es correcto,
 * devuelve el mensaje “Fallos detectados en los sistemas del robot”. Si es 
 * correcto, comprueba que el nivel de batería no sea menor o igual del 20%.
 * Si es así, devuelve el mensaje “La batería del robot está baja. Nivel de 
 * batería … %”. En caso contrario, devuelve el mensaje “Todos los sistemas 
 * están operativos y el nivel de batería es adecuado”.
 *
 * @author KevinNS
 */
public class Robots implements Operable, Revisable{
    
    //Creamos los atributos
    private boolean activo;
    private boolean estadoSistemas;
    private int nivelBateria;
    
    //Creamos los constructores por defecto
    public Robots(){
        this.activo = false;
        this.estadoSistemas = false;
        this.nivelBateria = 0;
    }
    
    //Creamos los constructores parametrizados
    public Robots(boolean activo, boolean estadoSistemas, int nivelBateria){
        this.activo = activo;
        this.estadoSistemas = estadoSistemas;
        this.nivelBateria = nivelBateria;
    }
    
    //Creamos los getters y setters

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public boolean isEstadoSistemas() {
        return estadoSistemas;
    }

    public void setEstadoSistemas(boolean estadoSistemas) {
        this.estadoSistemas = estadoSistemas;
    }

    public int getNivelBateria() {
        return nivelBateria;
    }

    public void setNivelBateria(int nivelBateria) {
        this.nivelBateria = nivelBateria;
    }
    
    //Creamos los métodos que nos hace implementar Operable y Revisable
    
    /**
     * Método que nos muestra si el robot está activado o no
     */
    @Override
    public void activar(){
        if (activo) {
            System.out.println("El robot ya estaba activado");
            
        } else if (!estadoSistemas){
            System.out.println("Error. Los sistemas del robot no están funcionando correctamente");
        } else if(nivelBateria <= 20){
            System.out.println("Nivel de batería insuficiente. " + nivelBateria + "%");
        } else{
            activo = true;
            System.out.println("El robot está activado");
        }    
    }
    
    /**
     * Método que nos muestra si el robot está desactivado o no
     */
    @Override
    public void desactivar(){
        if (activo) {
            activo = false;
            System.out.println("El robot está desactivado");
            
        } else {
            System.out.println("El robot ya estaba desactivado");
        }
    }
    
    /**
     * Método que muestra el resultado de la revisión de los componentes del robot
     * @return la revisión de los componentes
     */
    @Override
    public String realizarRevision(){
        if (!estadoSistemas) {
            return "Fallos detectados en el sistema del robot";            
        } else if (nivelBateria <= 20){
            return "La batería del robot está baja. Nivel de batería: " 
                    + nivelBateria + "%";
        } else {
            return "Todos los sistemas están operativos y el nivel de batería es adecuado";
        }
    }
     
    //Creamos To String

    @Override
    public String toString() {
        return "El robot está: " + activo + " . El estado de sus sistemas: " 
                + estadoSistemas + " . Su nivel de batería es: " + nivelBateria;
    }
    

}
