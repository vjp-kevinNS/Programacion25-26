package ejercicioejemploteoriat12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * * Programa que escribe en un fichero nombres que nos da el usuario separados
 * por punto y coma y luego lee el fichero mostrando un nombre en cada fila, sin
 * los puntos y coma.
 *
 * Usaremos throws en los métodos y capturaremos las excepciones en el método
 * main.
 *
 * @author KevinNS
 */
public class EjercicioEjemploTeoriaT12 {
    
    public final static String FICHERO = "nombres.txt";
    
    /**
     * Método para pedir nombre(lanza InputMismatchException)
     * 
     * @return
     * @throws InputMismatchException 
     */
    public static String pedirNombre() throws InputMismatchException{
        System.out.println("Nombre: ");
        Scanner entrada = new Scanner(System.in);
        return entrada.nextLine();
    }
    
    /**
     * Método que añade nombres a la lista hasta que el usuario quiera
     * 
     * @return
     * @throws InputMismatchException 
     */
    public static String pedirSeguir() throws InputMismatchException{
        System.out.println("¿Quieres añadir otro nombre?(s/n): ");
        Scanner entrada = new Scanner(System.in);
        return entrada.nextLine();
    }
    
    public static void insertarNombres(ArrayList<String>nombres){
        System.out.println("-INSERTANDO NOMBRES-");
        do {
            nombres.add(pedirNombre());
            System.out.println("Nombre añadido correctamente");           
        } while (pedirSeguir().equalsIgnoreCase("s"));
    }
    
    /**
     * Método para escribir el fichero (lanza FilNotFoundExcpetion e IOException)
     * 
     * @param fichero
     * @param nombres
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public static void escribirFichero(String fichero, ArrayList<String>nombres)throws FileNotFoundException, IOException{
        System.out.println("-ESCRIBIENDO FICHERO-");
        
        try(
                FileWriter fw = new FileWriter(fichero);
                PrintWriter pw = new PrintWriter(fichero);
                ){
            // Se puede encapsular esto en un método "escribir"
            for (String nombre : nombres) {
                pw.println(nombre + ";");
            }
        }
    }
    
    /**
     * Método para leer fichero (lanza FileNotFounException e IOException)
     * @param fichero
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public static void leerFichero(String fichero)throws FileNotFoundException, IOException{
        System.out.println("-LEYENDO FICHERO-");
        
        try(
                FileReader fr = new FileReader(fichero);
                BufferedReader br = new BufferedReader(fr);
                ){
            // Se puede encapsular esto en un método "leer"
            String linea = br.readLine();
            
            while(linea != null){
                linea = linea.replace(";", "");
                System.out.println(linea);
                
                linea = br.readLine();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        // Creamos una lista donde añadir los nombre
        ArrayList<String> lNombres = new ArrayList<>();
        
        // LLamamos a los métodos manejando las excepciones que hemos lanzado
        
        try{
            
            insertarNombres(lNombres);
            escribirFichero(FICHERO, lNombres);
            leerFichero(FICHERO);
            
        }catch(InputMismatchException e){
            System.out.println("Error. Has escrito un tipo de dato incorrecto");
        }catch(FileNotFoundException e){
            System.out.println("Error. Archivo no encontrado");
        }catch(IOException e){
            System.out.println("Error. Ha ocurrido un error en la escritura o lectura del fichero");
        }catch(Exception e){
            System.out.println("Error. Ha ocurrido un error desconocido");
        }

    }

}
