package ejerciciorepasoficheros7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Fichero: pedidos.txt
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
public class EjercicioRepasoFicheros7 {
    
    /**
     * Método que añade un pedido con los datos introducidos por el usuario
     * 
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public static void añadirPedido()throws FileNotFoundException,IOException{
        Scanner entrada = new Scanner(System.in);
        
        // Pedimos los datos del pedido
        System.out.println("Cliente: ");
        String nombreCliente = entrada.nextLine();
        System.out.println("Producto: ");
        String producto = entrada.nextLine();
        System.out.println("Cantidad: ");
        int cantidad = entrada.nextInt();
        entrada.nextLine();
        
        // Creamos un try with resources
        try(FileWriter fw = new FileWriter("pedidos.txt", true);
            PrintWriter pw = new PrintWriter(fw)){
            
            // Añadimos los datos linea a linea
            pw.println("Cliente: " + nombreCliente);
            pw.println("Producto: " + producto);
            pw.println("Cantidad: " + cantidad);
            
            System.out.println("-----------------------------------------------");
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
        try(FileReader fr = new FileReader("pedidos.txt");
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
     * Método que meustra los datos del pedido del cliente cuyo nombre lo introduce
     * el usuario
     * 
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public static void mostrarPedidosPorCliente()throws FileNotFoundException,IOException{
        Scanner entrada = new Scanner(System.in);
        
        // Pedimos el nombre del cliente para mostrar el pedido
        System.out.println("Introduce el nombre del cliente: ");
        String nombreCliente = entrada.nextLine();
        
        // Creamso un try with resources
        try(FileReader fr = new FileReader("pedidos.txt");
            BufferedReader br = new BufferedReader(fr)){
            
            // Creamos la variable linea
            String linea;
            System.out.println("---MOSTRANDO PEDIDO POR CLIENTE---");
            
            // Creamos un while
            while ((linea = br.readLine()) != null) {   
                
                    // Creamos las variables de los datos
                    String nomCliente = linea;
                    String producto = br.readLine();
                    String cantidad = br.readLine();
                
                // Comprobamos si contiene ese nombre
                if (nomCliente.toLowerCase().contains(nombreCliente.toLowerCase())) {
                    System.out.println(" | " + nomCliente + " | " + producto + " | " + cantidad);
                }
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
                        mostrarPedidosPorCliente();
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

