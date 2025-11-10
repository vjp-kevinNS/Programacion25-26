
import java.util.Scanner;

/**
 * Esta clase es la principal del proyecto y es en la que instanciaremos los
 * objetos y trabajaremos con ellos
 *
 * @author KevinNS
 */
public class PogramacionOrientadoAObjetos {

    public static void main(String[] args) {
        //1. Instancio un objeto del tipo que he creado
        //1.1. Con constructor parametrizado  y estableciendo valores con Setters

        //AQUI IRIA Scanner entrada = new Scanner(System.in)
        // Coche miCoche = new Coche();
        //System.out.println(miCoche.toString());
        //miCoche.setEspejos(5);
        //System.out.println(miCoche.toString());
        //System.out.println(miCoche.getEspejos());
        //miCoche.acelerar();
        //Coche tuCoche = new Coche("Michelin ", "Bajo", 3);
        //System.out.println(tuCoche.toString());
        //Esto hace lo mismo que la linea anterior, porque detecta el toString() automáticamente
        // System.out.println(tuCoche);
        // System.out.println(tuCoche.getRuedas());
        
        
        
        //MODIFICADORES DE ACCESO
        Bicicleta bicicleta = new Bicicleta();
        System.out.println(bicicleta.getRuedas());
        System.out.println(bicicleta.getNumBicicletas());

        Bicicleta bicicleta2 = new Bicicleta();
        System.out.println("¿Cuántas bicis hemos creado?");
        System.out.println(bicicleta.getNumBicicletas());

        //PASO DE PARAMETROS POR VALOR O POR REFERENCIA
        int num1 = 4;
        System.out.println(suma(num1));

        Bicicleta bici = new Bicicleta();
        empezarAPedalear(bici);
    }

    public static int suma(int num1) {
        int num2 = 3;
        return num1 + num2;

    }

    public static void empezarAPedalear(Bicicleta bici) {
        bici.setEstaPedaleando(true);
    }

}
