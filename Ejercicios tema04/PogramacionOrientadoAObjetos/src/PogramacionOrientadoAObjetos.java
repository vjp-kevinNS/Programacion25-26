import java.util.Scanner;
/**
 *Esta clase es la principal del proyecto
 * y es en la que instanciaremos los objetos
 * y trabajaremos con ellos
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
            Coche tuCoche = new Coche("Michelin ", "Bajo", 3);
            System.out.println(tuCoche.toString());
            
        //Esto hace lo mismo que la linea anterior, porque detecta el toString() automáticamente
        System.out.println(tuCoche);
        
        System.out.println(tuCoche.getRuedas());
                   
    }
            
    
    
}
