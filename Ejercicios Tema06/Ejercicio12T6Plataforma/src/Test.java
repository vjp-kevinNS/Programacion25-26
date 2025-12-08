
/**
 * Crea una clase Test donde crees, al menos, una serie, un estudio y un
 * videojuego. Prueba sus métodos para comprobar que todo funcione
 * correctamente.
 * 
 * Declara una variable de tipo contenido y asígnale el valor de una serie de
 * las que has creado previamente. Muestra su información por pantalla.
 * Llama a sus métodos entregar y valorar. Muestra el estado del atributo
 * entregado. Después, devuelve la serie y muestra de nuevo el estado de
 * entregado. Haz lo mismo con un videojuego
 *
 * @author KevinNS
 */
public class Test {

    public static void main(String[] args) {
        
        //Creamos los objetos
        Serie mandalorian = new Serie(5, "Jon Favreau", "The Mandalorian", "Ciencia Ficción");
        Estudio rockstar = new Estudio("Rockstar", "Red Dead Redemption 2");
        Videojuegos gta = new Videojuegos(500, rockstar, "GTA VI", true, "Acción y violencia");
        
        Contenido contenido = mandalorian;
        System.out.println(mandalorian.toString());
        contenido.entregar();
        contenido.valoracion();
        System.out.println("Está entregado: " + contenido.esEntregado());
        
        System.out.println(rockstar.toString());
        contenido.entregar();
        contenido.valoracion();
        System.out.println("Está entregado: " + contenido.esEntregado());
        
        System.out.println(gta.toString());
        contenido.entregar();
        contenido.valoracion();
        System.out.println("Está entregado: " + contenido.esEntregado());

    }

}
