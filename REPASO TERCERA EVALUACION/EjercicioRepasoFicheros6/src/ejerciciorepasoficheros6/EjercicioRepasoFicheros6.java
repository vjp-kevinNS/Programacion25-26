package ejerciciorepasoficheros6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Fichero vehiculos.txt:
 *
 * Cada línea:
 *
 * Marca Modelo Año
 *
 * Opciones:
 *
 * Añadir vehículo
 *
 * Mostrar todos
 *
 * Buscar por marca
 *
 * Salir
 *
 * @author KevinNS
 */
public class EjercicioRepasoFicheros6 {
    
    /**
     * Método que añade un vehiculo con los datos proporcionados por el usuario
     * 
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public static void añadirVehiculo()throws FileNotFoundException, IOException{
        Scanner entrada = new Scanner(System.in);
        
        // Pedimos los datos del vehículo
        System.out.println("Marca del vehículo: ");
        String marca = entrada.nextLine();
        System.out.println("Modelo del vehículo: ");
        String modelo = entrada.nextLine();
        System.out.println("Año de matriculación: ");
        int añoMatriculación = entrada.nextInt();
        entrada.nextLine();
        
        // Creamos un try with resoruces
        try(FileWriter fw = new FileWriter("vehiculos.txt", true);
            PrintWriter pw = new PrintWriter(fw)){
            
            // Añadimos los datos linea a linea
            pw.println("Marca: " + marca);
            pw.println("Modelo: " + marca);
            pw.println("Año matriculación: " + marca);
            
            System.out.println("----------------------------------------------");
        }
    }
    
    /**
     * Método que muestra todo el fichero
     * 
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public static void mostrarTodos()throws FileNotFoundException, IOException{
        
        // Creamos un try with resources
        try(FileReader fr = new FileReader("vehiculos.txt");
            BufferedReader br = new BufferedReader(fr)){
            
            // Creamos la variable linea
            String linea;
            System.out.println("----MOSTRANDO TODO----");
            
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
    
    public static void mostrarPorMarca()throws FileNotFoundException, IOException{
        Scanner entrada = new Scanner(System.in);
        
        
    }

    /**
     * Método que muestra el menú
     */
    public static void mostrarMenu() {
        System.out.println("1.Añadir vehículo");
        System.out.println("2.Mostrar todas los vehículos");
        System.out.println("3.Mostrar vehículo por marca");
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
                        añadirVehiculo();
                        break;
                    case 2:
                        mostrarTodos();
                        break;
                    case 3:
                        mostrarPorMarca();
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
