
import java.util.Scanner; //Importamos Scanner

/**
 * Diseñar una clase Coche que contenga atributos privados métodos publicos y
 * una clase main llamada test
 *
 * @author kevinNS
 */
public class Test {

    public static void main(String[] args) {
        //Creamos los objetos que utilizaremos en el main (miCoche y cochePadre)
        Coche miCoche = new Coche();
        Coche cochePadre = new Coche();

        //Establecemos la marca y los modelos de los coches
        miCoche.establecerMarca("Peugeot");
        miCoche.establecerModelo("308");
        miCoche.establecerColor("Azul");

        cochePadre.establecerMarca("Audi");
        cochePadre.establecerModelo("A3");
        cochePadre.establecerColor("Negro");

        //Arrancamos los coches
        miCoche.arrancarCoche();
        cochePadre.arrancarCoche();
        
        //Aceleramos 5 veces miCoche
        System.out.println("Aceleramos y frenamos miCoche");
        for (int i = 0; i < 5; i++) {
            miCoche.acelerarCoche();
        }
        //Frenamos 2 veces miCoche
        for (int i = 0; i < 2; i++) {
            miCoche.frenarCoche();
        }
        //Aceleramos 3 veces cochePadre
        System.out.println("Aceleramos cochePadre");
        for (int i = 0; i < 3; i++) {
            cochePadre.acelerarCoche();
        }
        //Apagamos cochePadre
        cochePadre.apagarCoche();
        
        //Mostramos el estado de miCoche y cochePadre
        System.out.println("Estado de miCoche: ");
        miCoche.mostrarEstado();
        
        System.out.println("Estado de cochePadre: ");
        cochePadre.mostrarEstado();
    }

}
