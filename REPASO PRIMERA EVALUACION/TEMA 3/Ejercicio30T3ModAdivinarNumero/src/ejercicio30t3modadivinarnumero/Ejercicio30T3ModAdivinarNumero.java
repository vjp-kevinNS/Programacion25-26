package ejercicio30t3modadivinarnumero;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Mejora el ejercicio 29, de tal forma que si el usuario introduce algo que no
 * es un número (una letra, por ejemplo) se le avisará del error por pantalla y
 * se contará como un intento. 
 * 
 * • Pista: Necesitarás capturar excepciones
 *
 * @author KevinNS
 */
public class Ejercicio30T3ModAdivinarNumero {

    public static void main(String[] args) {
        
        //Creamos Scanner, generamos el número aleatorio y creamos las variables necesarias
        Scanner entrada = new Scanner(System.in);
        
        int numeroOculto = (int) (Math.random() * 100 + 1);
        int intento = 0;
        int contadorIntentos = 0; //Esta variable contará las veces que se intenta
        
        System.out.println("Intenta adivinar el número del 1 al 100");
        
        //Creamos un bucle do while que tendrá un try catch y a su vez un if else
        
                do {
            // Ponemos el incremento aquí para que cuente tanto aciertos como errores
            contadorIntentos++; 
            
            // 1. Protegemos el código con un bloque try 
            try {
                System.out.print("Intento " + contadorIntentos + " - Introduce un número: ");
                intento = entrada.nextInt(); // Aquí es donde puede saltar el error si meten una letra 

                if (intento < numeroOculto) {
                    System.out.println("Pista: Es MAYOR.");
                } else if (intento > numeroOculto) {
                    System.out.println("Pista: Es MENOR.");
                }

            // 2. Capturamos el error si no es un número entero
            } catch (InputMismatchException e) {
                System.out.println("¡ERROR! Eso no es un número válido. Se cuenta como intento igualmente.");
                
                // 3. LIMPIEZA DE BÚFER: Muy importante para que no entre en bucle infinito
                entrada.nextLine(); 
                
                // Ponemos intento en 0 para asegurar que el bucle no termine por error
                intento = 0; 
            }

        } while (intento != numeroOculto);

        System.out.println("¡ENHORABUENA! Lo lograste en " + contadorIntentos + " intentos.");
    }
}

