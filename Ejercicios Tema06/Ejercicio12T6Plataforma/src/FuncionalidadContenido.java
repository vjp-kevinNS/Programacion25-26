
/**
 * • Todos los contenidos deben implementar mediante una interfaz 3
 * funcionalidades, que son comunes a cualquier objeto alquilable:
 * • entregar: pone el valor de entregado a true
 * • devolver: pone el valor de entregado a false
 * • esEntregado: devuelve el valor de entregado.
 *
 * @author KevinNS
 */
public interface FuncionalidadContenido {
    
    //Creamos los métodos que implementara Contenido
    public void entregar();
    public void devolver();
    public boolean esEntregado();

}
