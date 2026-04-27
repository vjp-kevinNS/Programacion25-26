package ejerciciorepasoficheros12;

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
 * CON SEPARADORES!!!!!!
 *
 * @author KevinNS
 */
public class EjercicioRepasoFicheros12 {
    
    /**
     * Método que añade reigstros
     * 
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public static void añadirRegistro()throws FileNotFoundException,IOException{
        Scanner entrada = new Scanner(System.in);
        
        // Pedimos los datos
        System.out.println("Ciudad: ");
        String ciudad = entrada.nextLine();
        System.out.println("Provincia: ");
        String provincia = entrada.nextLine();
        System.out.println("Temperatura: ");
        double temperatura = entrada.nextDouble();
        entrada.nextLine();
        
        // Creamos un try
        try(FileWriter fw = new FileWriter("temperaturas.txt", true);
            PrintWriter pw = new PrintWriter(fw)){
            
            
            // Añadimos los datos con las variables y el separador
            pw.println(ciudad + ";" + provincia + ";" + temperatura);
        }
    }
    
    /**
     * Método que muestra el contenido del fichero
     * 
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public static void mostrarTodos()throws FileNotFoundException,IOException{
        
        // Creamos un try
        try(FileReader fr = new FileReader("temperaturas.txt");
            BufferedReader br = new BufferedReader(fr)){
                       
            // Creamos la variable linea
            String linea;
            
            System.out.println("---MOSTRANDO CONTENIDO DEL FICHERO---");
            
            // Creamos un while
            while ((linea = br.readLine()) != null) {                
                
                // Creamos un array de String
                String[]lineaArr = linea.split(";");
                System.out.println("Ciudad: " + lineaArr[0]);
                System.out.println("Provincia: " + lineaArr[1]);
                System.out.println("Temperatura: " + lineaArr[2]);
                
                System.out.println("------------------------------------------");
            }
        }
    }
    
    /**
     * Método que muestra los datos por ciudad
     * 
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public static void buscarPorCiudad()throws FileNotFoundException,IOException{
        Scanner entrada = new Scanner(System.in);
        
        // Pedimos el nombre de la ciudad
        System.out.println("Introduce el nombre de la ciudad: ");
        String ciudadBuscada = entrada.nextLine();
        
        // Creamos un try
        try(FileReader fr = new FileReader("temperaturas.txt");
            BufferedReader br = new BufferedReader(fr)){
            
            // Creamos la variable linea
            String linea;
            
            System.out.println("---MOSTRANDO CONTENIDO DEL FICHERO---");
            
            // Creamos un while
            while ((linea = br.readLine()) != null) {                
                
                // Creamos un array de String y las variables
                String[]lineaArr = linea.split(";");
                String nombreCiudad = lineaArr[0];
                String nombreProvincia = lineaArr[1];
                String temperatura = lineaArr[2];
                
                // Creamos un if
                if (nombreCiudad.toLowerCase().contains(ciudadBuscada.toLowerCase())) {
                    
                    System.out.println("Nombre ciudad: " + nombreCiudad 
                            + " Nombre provincia: " + nombreProvincia + " Temperatura: " 
                            + temperatura);
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
        System.out.println("3.Buscar ciudades por provincia");
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
                        buscarPorCiudad();
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
