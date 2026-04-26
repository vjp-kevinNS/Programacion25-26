package ejerciciorepasoficheros5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Fichero peliculas.txt:
 *
 * Cada línea:
 *
 * Título Año Género
 *
 * Opciones:
 *
 * Añadir película
 *
 * Mostrar todas
 *
 * Buscar por género
 *
 * Salir
 *
 * @author KevinNS
 */
public class EjercicioRepasoFicheros5 {
    
    /**
     * Método que añade peliculas con los datos que introduzca el usuario
     * 
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public static void añadirPelicula()throws FileNotFoundException, IOException{
        Scanner entrada = new Scanner(System.in);
        
        // Pedimos los datos de la película
        System.out.println("Titulo de la película: ");
        String nombrePeli = entrada.nextLine();
        System.out.println("Año de estreno: ");
        int añoEstreno = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Género de la película: ");
        String generoPeli = entrada.nextLine();
        
        // Creamos un try with resources
        try(FileWriter fw = new FileWriter("peliculas.txt", true);
            PrintWriter pw = new PrintWriter(fw)){
            
            // Añadimos los datos separados por lineas
            pw.println("Titulo: " + nombrePeli);
            pw.println("Año Estreno: " + añoEstreno);
            pw.println("Género: " + generoPeli);
            
            System.out.println("-----------------------------------------------");
        }
    }
    
    /**
     * Método que muestra el contenido del fichero
     * 
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public static void mostrarTodas()throws FileNotFoundException,IOException{
        
        // Creamos un try with resources
        try(FileReader fr = new FileReader("peliculas.txt");
           BufferedReader br = new BufferedReader(fr)){
           
            
            // Creamos la variable linea
            String linea;
            
            System.out.println("----MOSTRANDO PELICULAS----");
            
            // Creamos un while
            while((linea = br.readLine()) != null){
                System.out.println(linea);
                linea = br.readLine();
                System.out.println(linea);
                linea = br.readLine();
                System.out.println(linea);
                
                System.out.println("------------------------------------------");
            }
        }
    }
    
    /**
     * Método que muestra las películas por el género que introduzca el usuario
     * 
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public static void mostrarPorGenero()throws FileNotFoundException,IOException{
        Scanner entrada = new Scanner(System.in);
        
        // Pedimos el género de la pelicula
        System.out.println("Introduce el género de la película: ");
        String generoBuscado = entrada.nextLine();
        
        // Creamos try with resources
        try(FileReader fr = new FileReader("peliculas.txt");
            BufferedReader br = new BufferedReader(fr)){
            
            
            // Creamos la variable linea
             String linea;
             System.out.println("----BUSCANDO POR GENERO----");
             
             // Creamos un while
             while((linea = br.readLine()) != null){
                 
                 // Creamos las variables para guardar los datos
                 String nombrePeli = linea;
                 String añoEstreno = br.readLine();
                 String generoPeli = br.readLine();
                 
                 // Si el genéro de la película existe imprimimos por pantalla
                 if (generoPeli.toLowerCase().contains(generoBuscado.toLowerCase())) {
                     System.out.println(" | " + nombrePeli + " | " + añoEstreno 
                             + " | " + generoPeli);
                 }
             }
        }
    }

    /**
     * Método que muestra el menú
     */
    public static void mostrarMenu() {
        System.out.println("1.Añadir pelicula");
        System.out.println("2.Mostrar todas las peliculas");
        System.out.println("3.Mostrar pelicula por género");
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
                        añadirPelicula();
                        break;
                    case 2:
                        mostrarTodas();
                        break;
                    case 3:
                        mostrarPorGenero();
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