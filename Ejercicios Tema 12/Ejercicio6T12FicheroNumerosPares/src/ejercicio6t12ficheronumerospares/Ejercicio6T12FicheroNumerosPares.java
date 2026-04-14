package ejercicio6t12ficheronumerospares;

import java.io.*;
import java.util.*;

/**
 * Realiza un programa en JAVA en el que muestres un menú que te permita 3
 * opciones:
 *
 * 1. Volcado de un array con los 100 primeros números pares a un fichero de
 * texto. El nombre del fichero lo elegirá el usuario.
 *
 * 2. Mostrar por pantalla el contenido del fichero de texto creado.
 *
 * 3. Salir del Programa.
 *
 * • Captura las excepciones que veas necesarias.
 *
 * @author KevinNS
 */
public class Ejercicio6T12FicheroNumerosPares {
    
    /**
     * Método que pide los números al usuario, comprueba los números que son
     * pares y los mete en el fichero creado
     * 
     * Además delegamos las excepciones al main
     * 
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public static void volcarParesAFichero()throws FileNotFoundException, IOException{
        Scanner entrada = new Scanner(System.in);
        
        // Creamos un array de 100 posiciones
        int[] pares = new int[100];
        int numero = 2; // El primer número par es el 2
        
        // Rellenamos el array con los 100 primeros pares
        for (int i = 0; i < pares.length; i++) {
            pares[i] = numero; // Guardamos el número en la posición actual
            numero += 2; // Aumentamos de 2 en 2 para obtener el siguiente par            
        }
        entrada.nextLine();
        // Pedimos al usuario el nombre del fichero
        System.out.println("Introduce el nombre del fichero: ");
        String nombreFichero = entrada.nextLine();
        
        // Usamos un try-with-resources para que se cierre el fichero solo
        try (FileWriter fw = new FileWriter(nombreFichero); // Prepara el acceso al fichero
             PrintWriter pw = new PrintWriter(fw)){ // Permite usar .println para escribir
            
            // Recorremos el array de números
            for (int num : pares) {
                pw.println(num); // Escribimos cada número par en una línea distinta
            }
            System.out.println("Array de pares volcado con éxito");
            
        } catch (IOException e) {
            System.out.println("Hubo un error al escribir el fichero: " + e.getMessage());
        }
    }
    
    /**
     * Método que muestra el contenido del fichero
     * 
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public static void mostrarFichero()throws FileNotFoundException, IOException{
        Scanner entrada = new Scanner(System.in);
        
        // Preguntamos al usuario qué fichero quiere leer
        System.out.println("¿Qué fichero deseas leer?: ");
        String nombreFich = entrada.nextLine();
        
        // Apuntamos al fichero
        File archivo = new File(nombreFich);
        
        // Comprobamos si el archivo existe antes de abrirlo
        if (!archivo.exists()) {
            System.out.println("El fichero no existe");
            return;
        }
        
        // Usamos Try-with-resources: Abre FileReader y BufferedReader y los cierra al acabar       
        try (FileReader fr = new FileReader(archivo);
             BufferedReader br = new BufferedReader(fr)){
            
            String linea; // Variable para almacenar cada línea leída
            System.out.println("---CONTENIDO DEL FICHERO---");
            
            // Bucle while para leer mientras no readline() no devuelva null
            while((linea = br.readLine()) != null){
                System.out.println(linea);
            }
            
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    /**
     * Método que muestra el menú
     */
    public static void mostrarMenu() {
        System.out.println("---------------------------------------------------");
        System.out.println("-----------------AGENDA TELEFONICA-----------------");
        System.out.println("---1.Volcar 100 primeros números pares a fichero---");
        System.out.println("----------2.Mostrar contenido del fichero----------");
        System.out.println("-----------------3.SALIR DEL PROGRAMA--------------");
        System.out.println("---------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Creamos el menú controlando excpeciones
        int opcion = 0;
        do {
            try {
                mostrarMenu();
                opcion = entrada.nextInt();

                switch (opcion) {
                    case 1:
                        volcarParesAFichero();
                        break;
                    case 2:
                        mostrarFichero();
                        break;
                    case 3:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción incorrecta");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error. Has intruducido una letra");
                entrada.nextLine();
            } catch (Exception e) {
                System.out.println("Error desconocido");
                entrada.nextLine();
            }

        } while (opcion != 3);

    }
}
