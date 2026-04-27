package ejerciciorepasoficheros13;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Fichero: temperaturas.txt
 *
 * Cada línea:
 *
 * Ciudad Temperatura Provincia
 *
 * Opciones:
 *
 * Añadir registro
 *
 * Mostrar todos
 *
 * Mostrar ciudades por nombre
 *
 * Salir
 *
 * @author KevinNS
 */
public class EjercicioRepasoFicheros13 {

    public static void añadirRegistro() throws FileNotFoundException, IOException {
        Scanner entrada = new Scanner(System.in);

        // Pedimos los datos
        System.out.println("Ciudad: ");
        String ciudad = entrada.nextLine();
        System.out.println("Provincia: ");
        String provincia = entrada.nextLine();
        System.out.println("Temperatura: ");
        double temperatura = entrada.nextDouble();
        entrada.nextLine();
        
        try(FileWriter fw = new FileWriter("temperaturas.txt", true);
            PrintWriter pw = new PrintWriter(fw)){
            
            pw.println("Nombre ciudad: " + ciudad);
            pw.println("Nombre provincia: " + provincia);
            pw.println("Temperatura: " + temperatura);
            
            System.out.println("----------------------------------------------");
        }
    }
    
    public static void mostrarTodos()throws FileNotFoundException,IOException{
        
        try(FileReader fr = new FileReader("temperaturas.txt");
            BufferedReader br = new BufferedReader(fr)){
            
            String linea;
            
            while ((linea = br.readLine()) != null) {                
                System.out.println(linea);
                linea = br.readLine();
                System.out.println(linea);
                linea = br.readLine();
                System.out.println(linea);
                
                System.out.println("------------------------------------------");
            }
        }
    }
    
    public static void mostrarPorCiudad()throws FileNotFoundException,IOException{
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce el nombre de la ciudad: ");
        String ciudadBuscada = entrada.nextLine();
        
        try(FileReader fr = new FileReader("temperaturas.txt");
            BufferedReader br = new BufferedReader(fr)){
            
            String linea;
            
            while ((linea = br.readLine()) != null) {                
                
                String nombreCiudad = linea;
                String nombreProvincia = br.readLine();
                String temperatura = br.readLine();
                
                if (nombreCiudad.toLowerCase().contains(ciudadBuscada.toLowerCase())) {
                    
                        System.out.println("|" + nombreCiudad + "|" + nombreProvincia 
                        + "|" + temperatura);
                }
            }
        }
    }

    /**
     * Método que muestra el menú
     */
    public static void mostrarMenu() {
        System.out.println("1.Añadir registro");
        System.out.println("2.Mostrar todas los registros");
        System.out.println("3.Buscar ciudades por nombre");
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
                        añadirRegistro();
                        break;
                    case 2:
                        mostrarTodos();
                        break;
                    case 3:
                        mostrarPorCiudad();
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
