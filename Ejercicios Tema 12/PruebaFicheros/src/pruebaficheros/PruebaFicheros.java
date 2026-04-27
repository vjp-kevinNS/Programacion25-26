package pruebaficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author KevinNS
 */
public class PruebaFicheros {

    /**
     * NOTA: Aunque este método no lo haya utilizado al menos que se sepa que vea
     * hacerlo
     * 
     * Método que rellena el inventario de productos con los datos introducidos
     * por el usuario
     *
     * @param lista
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static void rellenarInventario(ArrayList<Producto> lista) throws FileNotFoundException, IOException {
        Scanner entrada = new Scanner(System.in);

        // Pedimos los datos del producto
        System.out.println("Nombre producto: ");
        String nombreProd = entrada.nextLine();
        System.out.println("Cantidad: ");
        int cantidad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Precio: ");
        float precio = entrada.nextFloat();
        entrada.nextLine();

        // Creamos el producto
        Producto nuevoProducto = new Producto(nombreProd, cantidad, precio);

        // Añadimos el producto a la lista
        lista.add(nuevoProducto);

    }

    /**
     * NOTA: No he practicado los suficiente objetos con ficheros con lo cual no 
     * recuerdo cómo utilizar los getter aquí, probablemente sea super sencillo 
     * pero no me sale ahora mismo. Aun así te muestro que al menos sé crear un
     * fichero con los datos que se piden.
     * 
     * Método que guarda los datos del producto en un fichero.
     * 
     * @param lista
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public static void guardarDatosEnFichero() throws FileNotFoundException, IOException {
        Scanner entrada = new Scanner(System.in);

        // Pedimos los datos del producto
        System.out.println("Nombre producto: ");
        String nombre = entrada.nextLine();
        System.out.println("Cantidad: ");
        int cantidad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Precio: ");
        float precio = entrada.nextFloat();
        entrada.nextLine();

        // Creamos un try with resources
        try (FileWriter fw = new FileWriter("inventario.txt", true); 
             PrintWriter pw = new PrintWriter(fw)) {
            
            
            // Añadimos los datos del producto con el separador #
            pw.println(nombre + "#" + cantidad + "#" + precio);
            
            // Esto nos dara el formato: nombre#cantidad#precio
            
            System.out.println("----------------------------------------------");

        }

    }
    /**
     * Método que lee el contenido del fichero y lo muestra por pantalla
     * 
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public static void leerYProcesarLosDatos()throws FileNotFoundException,IOException{
        
        // Creamos un try with resources
        try(FileReader fr = new FileReader("inventario.txt");
            BufferedReader br = new BufferedReader(fr)){
            
            // Creamos la variable línea para usarla en el while
            String linea;
            
            System.out.println("---MOSTRANDO CONTENIDO DEL FICHERO---");
            
            // Creamos un bucle while para mostrar línea a línea el contenido
            while ((linea = br.readLine()) != null) {                
                    
                    String[]lineaArray = linea.split("#");
                    System.out.println("Producto: " + lineaArray[0]);
                    System.out.println("Cantidad: " + lineaArray[1]);
                    System.out.println("Precio: " + lineaArray[2]);
                
                System.out.println("------------------------------------------");
            }
            
            
        }
    }

    public static void mostrarMenu() {
        System.out.println("--------------------------------------------------");
        System.out.println("----------------GESTION DE FICHEROS---------------");
        System.out.println("----------------1.Rellenar inventario-------------");
        System.out.println("------------2.Guardar datos en un fichero---------");
        System.out.println("----3.Leer y procesar los datos del inventario----");
        System.out.println("----------------4.SALIR DEL MENU------------------");
        System.out.println("--------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Creamos el ArrayList de productos
        ArrayList<Producto> listaProductos = new ArrayList<>();

        // Creamos el menú controlando las excepciones que se han lanzado desde los métodos
        int opcion = 0;

        do {
            try {
                mostrarMenu();
                opcion = entrada.nextInt();

                switch (opcion) {
                    case 1:
                        rellenarInventario(listaProductos);
                        break;
                    case 2:
                        guardarDatosEnFichero();
                        break;
                    case 3:
                        leerYProcesarLosDatos();
                        break;
                    case 4:
                        System.out.println("Saliendo del programa....");
                        break;
                    default:
                        System.out.println("Opción incorrecta...");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error. Has introducido una letra");
                entrada.nextLine();
            } catch (FileNotFoundException e) {
                System.out.println("Error. No se ha encontrado el archivo");
                entrada.nextLine();
            } catch (IOException e) {
                System.out.println("Error al leer el fichero");
                entrada.nextLine();
            } catch (Exception e) {
                System.out.println("Error desconocido...");
                entrada.nextLine();
            }

        } while (opcion != 4);
    }
}
