package ejerciciorepasoficheros8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * CON SEPARADORES!!!!!!!!
 * 
 * Fichero: pedidos2.txt
 *
 * Cada línea:
 *
 * Cliente Producto Cantidad
 *
 * Opciones:
 *
 * Añadir pedido
 *
 * Mostrar todos
 *
 * Mostrar pedidos de un cliente
 *
 * Salir
 *
 * @author KevinNS
 */
public class EjercicioRepasoFicheros8 {
    
    /**
     * Método que añade los datos del pedido con los datos introducidos por el
     * usuario y los separamos con | en una misma línea
     * 
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public static void añadirPedido()throws FileNotFoundException,IOException{
        Scanner entrada = new Scanner(System.in);
        
        // Pedimos los datos del pedido
        System.out.println("Cliente: ");
        String cliente  =entrada.nextLine();
        System.out.println("Producto: ");
        String producto = entrada.nextLine();
        System.out.println("Cantidad: ");
        int cantidad = entrada.nextInt();
        entrada.nextLine();
        
        // Creamos un try with resources
        try(FileWriter fw = new FileWriter("pedidos2.txt", true);
            PrintWriter pw = new PrintWriter(fw)){
            
            // Añadimos las variables con el separador
            pw.println(cliente + ";" + producto + ";" + cantidad);
            
            System.out.println("Pedido añadido con éxito");
        }
    }
    
    /**
     * Método que muestra el contenido del fichero con los separadores
     * 
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public static void mostrarTodos()throws FileNotFoundException, IOException{
        
        // Creamos un try with resources
        try(FileReader fr = new FileReader("pedidos2.txt");
            BufferedReader br = new BufferedReader(fr)){
            
            // Creamos la variable line
            String linea;
            
            System.out.println("---MOSTRANDO TODO EL FICHERO---");
            
            // Creamos un while
            while ((linea = br.readLine()) != null) {     
                
                // Creamos un array de String para mostrar con separador
                String[]lineaArr = linea.split(";");
                
                System.out.println("Cliente: " + lineaArr[0]);
                System.out.println("Producto: " + lineaArr[1]);
                System.out.println("Cantidad: " + lineaArr[2]);
                System.out.println("-------------------------------------------");
            }
        }
    }
    
    /**
     * Método que muestra los datos del pedido según el nombre que introduzca
     * el cliente
     * 
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public static void mostrarPedidosCliente()throws FileNotFoundException,IOException{
        Scanner entrada = new Scanner(System.in);
        
        // Pedimos el nombre del cliente
        System.out.println("Introduce el nombre del cliente: ");
        String nombreBuscado = entrada.nextLine();
        
        // Creamos un try with resources
        try(FileReader fr = new FileReader("pedidos2.txt");
            BufferedReader br = new BufferedReader(fr)){
            
            // Creamos la variable linea
            String linea;
            
            System.out.println("---MOSTRANDO DATOS DEL CLIENTE---");
            
            //Creamos un while
            while ((linea = br.readLine()) != null) {                
                
                // Creamos las variables de los datos
                String cliente = linea;
                String producto = br.readLine();
                String cantidad = br.readLine();
                
                // Creamos un if para ver si contiene ese nombre
                if (cliente.toLowerCase().contains(nombreBuscado.toLowerCase())) {
                    
                    // Creamos un array de String
                    String[]lineaArr = linea.split(";");
                    System.out.println("Cliente: " + lineaArr[0]);
                    System.out.println("Producto: " + lineaArr[1]);
                    System.out.println("Cantidad: " + lineaArr[2]);
                    System.out.println("--------------------------------------");
                }
                
                linea = br.readLine();
            }
        }
    }

    /**
     * Método que muestra el menú
     */
    public static void mostrarMenu() {
        System.out.println("1.Añadir pedido");
        System.out.println("2.Mostrar todas los pedidos");
        System.out.println("3.Mostrar pedidos de un cliente");
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
                        añadirPedido();
                        break;
                    case 2:
                        mostrarTodos();
                        break;
                    case 3:
                        mostrarPedidosCliente();
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
