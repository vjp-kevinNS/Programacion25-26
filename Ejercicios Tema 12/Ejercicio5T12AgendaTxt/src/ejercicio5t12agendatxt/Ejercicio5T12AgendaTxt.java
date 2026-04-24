package ejercicio5t12agendatxt;

import java.io.*;
import java.util.*;

/**
 * Realiza un programa en JAVA en el que muestres un menú que te permita 3
 * opciones:
 *
 * 1. Añadir un contacto a un fichero de texto (“agenda.txt”) en el que indiques
 * en cada línea:
 *
 * • Un Nombre. • Una Edad. • Un número de teléfono.
 *
 * 2. Mostrar por pantalla el contenido del fichero de texto creado.
 *
 * 3. Salir del Programa.
 *
 * • Captura las excepciones que veas necesarias.
 *
 * @author KevinNS
 */
public class Ejercicio5T12AgendaTxt {
    
    /**
     * Método que añade contactos pidiendole los datos al usuario y que escribe 
     * en agenda.txt usando try-with-resources
     * 
     * Ademas delegamos las excpeciones al main
     * 
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public static void añadirContacto() throws FileNotFoundException, IOException{
        Scanner entrada = new Scanner(System.in);
        
        // Pedimos los datos del contacto al usuario
        System.out.println("Introduce nombre: ");
        String nombreCont = entrada.nextLine();
        System.out.println("Introduce edad: ");
        String edad = entrada.nextLine();
        System.out.println("Introduce teléfono: ");
        String telefono = entrada.nextLine();
        
        // Creamos un try catch
        try(FileWriter fw = new FileWriter("agenda.txt", true);
            PrintWriter pw = new PrintWriter(fw)){
            
            // Escribimos los datos línea a línea
            pw.println("Nombre: " + nombreCont);
            pw.println("Edad: " + edad);
            pw.println("Teléfono: " + telefono);
            pw.println("---------------------");
            
            System.out.println("Contacto guardado con éxito");
        }catch(IOException e){
            // Capturamos cualquier error de escritura
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
  
    }
    
    /**
     * Método que muestra el contenido del fichero
     */
    public static void mostrarContenido()throws FileNotFoundException, IOException{
        // Apuntamos al fichero
        File archivo = new File("agenda.txt");
        
        // Comprobamos si el archivo existe antes de abrirlo
        if (!archivo.exists()) {
            System.out.println("La agenda todavía no existe");
            return;
        }
        
        // Creamos un try catch y declaramos FileReader y BufferedReader
        try (FileReader fr = new FileReader(archivo);
             BufferedReader br = new BufferedReader(fr)){
            
            String linea;
            System.out.println("---CONTENIDO DE LA AGENDA---");
            
            // Leemos línea a línea hasta nos devuelva null
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
        System.out.println("-----------------1.Añadir contacto-----------------");
        System.out.println("-----------------2.Visualizar contactos------------");
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
                        añadirContacto();
                        break;
                    case 2:
                        mostrarContenido();
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
