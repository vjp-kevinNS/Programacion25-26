package ejerciciorepasoficheros9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Fichero: juegos.txt
 *
 * Cada línea:
 *
 * Nombre Plataforma Precio
 *
 * Opciones:
 *
 * Añadir juego
 *
 * Mostrar todos
 *
 * Mostrar juegos de una plataforma
 *
 * Salir
 *
 * @author KevinNS
 */
public class EjercicioRepasoFicheros9 {
    
    public static void añadirJuego()throws FileNotFoundException,IOException{
        Scanner entrada = new Scanner(System.in);
        
        // Pedimos los datos del juego
        System.out.println("Nombre: ");
        String nombre = entrada.nextLine();
        System.out.println("Plataforma: ");
        String plataforma = entrada.nextLine();
        System.out.println("Precio: ");
        float precio = entrada.nextFloat();
        entrada.nextLine();
        
        // Cremos un try with resources
        try(FileWriter fw = new FileWriter("juegos.txt", true);
            PrintWriter pw = new PrintWriter(fw)){
            
            // Añadimos los datos linea a linea
            pw.println("Nombre: " + nombre);
            pw.println("Plataforma: " + plataforma);
            pw.println("Precio: " + precio);
            
            System.out.println("----------------------------------------------");
        }
                
    }
    
    /**
     * Método que muestra el contenido del fichero
     * 
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public static void mostrarTodos()throws FileNotFoundException,IOException{
        
        // Creamos un try with resources
        try(FileReader fr = new FileReader("juegos.txt");
            BufferedReader br = new BufferedReader(fr)){
            
            // Creamos la variable linea
            String linea;
            
            System.out.println("---MOSTRANDO CONTENIDO DEL FICHERO---");
            
            // Creamos un while
            while ((linea = br.readLine()) != null) {                               
                System.out.println(linea);
                linea = br.readLine();
                System.out.println(linea);
                linea = br.readLine();
                System.out.println(linea);

                System.out.println("-------------------------------------------");
            }
        }
    }
    
    /**
     * Método que muestra los datos del juego por la plataforma introducida por 
     * el usuario
     * 
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public static void mostrarPorPlataforma()throws FileNotFoundException,IOException{
        Scanner entrada = new Scanner(System.in);
        
        // Pedimos el nombre de la plataforma
        System.out.println("Introduce el nombre de la plataforma: ");
        String nombrePlat = entrada.nextLine();
        
        // Creamos un try with resources
        try(FileReader fr = new FileReader("juegos.txt");
            BufferedReader br = new BufferedReader(fr)){
            
            // Creamos la variable linea
            String linea;
            
            System.out.println("---MOSTRANDO CONTENIDO DEL FICHERO---");
            
            // Creamos un while
            while ((linea = br.readLine()) != null) {

                // Creamos las variables de los datos
                String nombreJuego = linea;
                String plataforma = br.readLine();
                String precio = br.readLine();
                
                // Creamos un if para introducir el nombre
                if (plataforma.toLowerCase().contains(nombrePlat)) {
                    
                    System.out.println("|" + nombreJuego + "|" + plataforma 
                            + "|" + precio);
                }
            }
        }
    }

    /**
     * Método que muestra el menú
     */
    public static void mostrarMenu() {
        System.out.println("1.Añadir juego");
        System.out.println("2.Mostrar todas los juegos");
        System.out.println("3.Mostrar juegos de una plataforma");
        System.out.println("4.Salir");
    }

    public static void main(String[] args) {  
        Scanner entrada = new Scanner(System.in);

        // Creamos el menú controlando excepciones
        int opcion = 0;

        do {
            try {
                mostrarMenu();
                opcion = entrada.nextInt();
                switch (opcion) {
                    case 1:
                        añadirJuego();
                        break;
                    case 2:
                        mostrarTodos();
                        break;
                    case 3:
                        mostrarPorPlataforma();
                        break;
                    case 4:
                        System.out.println("Salir del programa....");
                        break;
                    default:
                        System.out.println("Opción incorrecta");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error. Has introducido una letra");
            } catch (FileNotFoundException e) {
                System.out.println("No se ha encontrado el fichero");
            } catch (IOException e) {
                System.out.println("Error al escribir en el archivo");
            } catch (Exception e) {
                System.out.println("Error desconocido");
            }

        } while (opcion != 4);

    }

}
