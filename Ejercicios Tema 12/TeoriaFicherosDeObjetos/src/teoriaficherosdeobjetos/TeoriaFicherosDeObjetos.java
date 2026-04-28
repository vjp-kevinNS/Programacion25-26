package teoriaficherosdeobjetos;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/**
 *  * Los ficheros de objetos nos permiten escribir objetos en ficheros .obj.
 *
 * Para ello, los objetos de Java se convierten en bytes que se guardan en los
 * ficheros. Para leerlos, esos bytes se reconvierten a objetos Java. Este
 * proceso se llama serialización y deserialización.
 *
 * Para ello, necesitamos:
 *
 * 1) CLASE Para crear objetos de dicha clase y escribirlos en el fichero. Esta
 * clase debe implementar la interfaz Serializable para convertir los objetos en
 * bytes. Usaremos el modificador transient si queremos que algún atributo no se
 * escriba en el fichero: private transient String password.
 *
 * 2) FLUJOS 2.1) DE LECTURA FileInputStream es el iniciador que lee bytes del
 * fichero. ObjectInputStream es el filtro que lee los objetos. Usaremos el
 * método .readObject(objeto).
 *
 * 2.2) DE ESCRITURA FileOutputStream es el iniciador que escribe bytes en el
 * fichero. ObjectOutputStream es el filtro que escribe objetos. Usaremos el
 * método writeObject(objeto).
 *
 * 3) CONFIGURACIÓN DE CABECERA El objeto de la clase ObjectOutputStream escribe
 * una cabecera en el fichero con la información necesaria, y lo hace cada vez
 * que ejecutamos el programa. Esto genera un problema: intercala cabecera -
 * objetos - nueva cabecera - más objetos ... Lo cual genera la excepción
 * StreamCorruptedException.
 *
 * 3.1) SOLUCIÓN Creamos la clase MiObjectOutputStream que hereda de
 * ObjectOutputStream y sobreescribimos el método writeStreamHeader(), dejando
 * el cuerpo vacío, para que no haga nada.
 *
 * @author KevinNS
 */
public class TeoriaFicherosDeObjetos {

    // Creamos una constante con la ruta del fichero. IMPORTANTE .obj
    public final static String FICHERO = "usuarios.obj";

    // FLUJOS. Creamos el méotdo que escribe objetos en el fichero
    public static void escribirUsuarios() throws FileNotFoundException, ClassNotFoundException, IOException {

        try (
                FileOutputStream fos = new FileOutputStream(FICHERO); ObjectOutputStream oos = new ObjectOutputStream(fos);) {

            oos.writeObject(new Usuario("Juan", "juan@mail.com", "1234"));
            oos.writeObject(new Usuario("María", "maria@mail.com", "afjei92"));
            oos.writeObject(new Usuario("Paula", "paula@mail.com", "38dk/c$ñ30"));
        }
    }

    // Creamos el método que lee los objetos del fichero
    public static void leerUsuarios() throws FileNotFoundException, ClassNotFoundException, IOException {

        try (FileInputStream fis = new FileInputStream(FICHERO); 
            ObjectInputStream ois = new ObjectInputStream(fis);) {
            
            Usuario usuario;

            while (true) { // Leemos mientras haya objetos
                usuario = (Usuario) ois.readObject();
                System.out.println(usuario);
                System.out.println("*********************");
            }
        }catch(EOFException e){ // Salta cuando llegamos al final del fichero
            System.out.println("Fin de lectura");  
        }            
    }

    public static void main(String[] args) {

        // Llamamos a los métodos capturando las excepciones que hemos lanzado previamente.
        try {

            escribirUsuarios();
            leerUsuarios();

        } catch (FileNotFoundException e) {
            System.out.println("ERROR: Archivo no encontrado.");
        } catch (ClassNotFoundException e) {
            System.out.println("ERROR: Clase no encontrado.");
        } catch (IOException e) {
            System.out.println("ERROR: Error de escritura o lectura.");
        }
    }

}
