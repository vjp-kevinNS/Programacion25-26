package ejercicio14t12datosbeca2;
import java.io.*;
/**
 * Realizar un programa que partiendo del fichero “DatosBeca.txt” calcule la
 * cuantía de la beca (en caso de que la haya). 
 * 
 * El total de la beca se calcula como sigue: 
 * 
 * • Base fija de 1500€ 
 * 
 * • Si los ingresos anuales de la familia son menores o iguales a la media 
 * (12.000€), la beca se incrementa en 500€, en caso contrario no lleva 
 * complementos. 
 * 
 * • Si la edad de la persona es inferior a 23 años, 200€ de gratificación, si es 
 * mayor no hay gratificación. 
 * 
 * • Si no hay suspensos en el curso anterior, hay una gratificación de 500€, 1 
 * suspenso 200€, si hay 2 suspensos o más no hay beca. 
 * 
 * • Si vive de alquiler (no residencia familiar), 1000€ más de gratificación. 
 * 
 * • Visualizar el nombre de cada uno de los becarios y su cuantía total (sólo 
 * los que tienen beca).
 *
 * @author KevinNS
 */
public class Ejercicio14T12DatosBeca2 {
    
    public static void procesarBecarios(String[] lista)throws FileNotFoundException,IOException{
        String ruta = "DatosBeca.txt";
        int contador = 0; // Para saber en qué posición del array guardar cada becario
        
        // Creamos un try...
        try(FileReader fr = new FileReader(ruta);
            BufferedReader br = new BufferedReader(fr)){
            
            String linea;
            System.out.println("---LISTADO DE BECARIOS ADMITIDOS---");
            
            //Leemos el fichero mientras queden datos
            while((linea = br.readLine()) != null) {                
                // Extraemos el nombre
                String nombre = linea.split(": ")[3];
                
                // Extraemos sexo y edad
                String linea2 = br.readLine();
                int edad = Integer.parseInt(linea2.split("Edad: ")[3].split(" "));
                
                // Extraemos suspensos y residencia
                String linea3 = br.readLine();
                int suspensos = Integer.parseInt(linea3.split("Suspensos: ")[3].split(" "));
                // Cogemos lo que hay después de residencia familiar:
                String residencia = linea3.split("Residencia Familiar: ")[3];
                
                // Extrameos ingresos
                String linea4 = br.readLine();
                // Quitamos los símbolos para que sea un número válido
                double ingresos = Double.parseDouble(linea4.split(": ")[3].replace("€", ""));
                
                // Saltamos el separador
                br.readLine();
                
                // LLamamos al método del cálculo
                double totalBeca = calcularBeca(edad,suspensos,residencia,ingresos);
                
                // Si tiene derecho a beca lo guardamos en el array
                if (totalBeca > 0) {
                    lista[contador] = "Becario: " + nombre + " | Beca: " + totalBeca + "€";
                    contador++; // Incrementamos para el siguien becario
                }
            }
            System.out.println("Se han encontrado " + contador + " becarios con derecho a ayuda");
        }
    }
    
    public static double calcularBeca(int edad, int suspensos, String residencia, double ingresos){
        // Si tiene 2 o más suspensos no hay beca
        if (suspensos >=2) {
            return 0;
        }
    }

    public static void main(String[] args) {
        
        // Creamos un array de Strings
        String[] resultados = new String[10];

    }

}
