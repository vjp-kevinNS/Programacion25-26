
/**
 * Crea una interfaz Transformable que contenga las siguientes operaciones 
 * sobre cadenas:
 * 
 * • concatenarTodo. Devuelve una cadena resultado de concatenar todas las 
 * cadenas de un objeto separadas con el carácter ‘#’.
 * 
 * • obtenerIniciales. Devuelve una cadena resultado de concatenar las iniciales
 * de todas las cadenas de un objeto.
 * 
 * • contarVocales. Cuenta todas las vocales de todas las cadenas de un objeto y
 * muestra el resultado por pantalla.
 * 
 * • obtenerCadenaMasLarga. Devuelve la cadena mas larga de todas las cadenas de 
 * un objeto.
 * 
 * • buscarCadena. Recibe una cadena por parámetros. Devuelve true si el objeto
 * tiene una cadena con ese valor y false en caso contrario.
 *
 * @author KevinNS
 */
public interface Transformable {
    
    // Creamos los métodos que estarán obligados a usar la clase Libro y Persona
    
    public String concatenarTodo();
    public String obtenerIniciales();
    public void contarVocales();
    public String obtenerCadenaMasLarga();
    public boolean buscarCadena(String cadenaBusqueda);
    
}
