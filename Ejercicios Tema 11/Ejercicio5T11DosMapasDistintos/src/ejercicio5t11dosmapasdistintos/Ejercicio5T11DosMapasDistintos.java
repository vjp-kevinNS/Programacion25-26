package ejercicio5t11dosmapasdistintos;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Crea un programa con dos mapas distintos: TreeMap y LinkedHashMap. Inserta en
 * ambos los meses de un año del revés asociándoles a cada uno su
 * correspondiente número entero ([12, Diciembre], [11, Noviembre], [10,
 * Octubre], … [1, Enero])
 *
 * Posteriormente recorre los conjuntos mostrando su contenido. Estudia sus
 * diferencias.
 *
 * • Pista: Necesitarás un vector de String para almacenar los meses.
 *
 * @author KevinNS
 */
public class Ejercicio5T11DosMapasDistintos {
    
    /**
     * Método que recorre el mapa usando unb for each sobre el conjunto de claves
     * 
     * @param mapa 
     */
    public static void mostrarMapa(Map<Integer, String> mapa){
        // Obtenemos el conjunto de claves con KeySet y lo recorremos
        for (Integer clave : mapa.keySet()) {
            // Sacamos el valor (el mes) usando la clave con get
            System.out.println("Nº " + clave + ": " + mapa.get(clave));
        }
    }

    public static void main(String[] args) {

        // Creamos un vector con los meses del año
        String[] mesesAnio = {"Enero", "Febrero", "Marzo", "Abril", "Mayo",
            "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre",
            "Diciembre"};
        
        // CREACION DE MAPAS:
        
        // TreeMap ordena los valores según sus claves de forma ascendente
        Map<Integer, String> mapaArbol = new TreeMap<>();
        
        // LinkedHashMap mantiene el orden en que los insertamos
        Map<Integer, String> mapaEnlazado = new LinkedHashMap<>();
        
        // Inserción al reves: Empezamos por el 12(Diciembre) hasta el 1(Enero)
        for (int i = 11; i >= 0; i--) {
            int numeroMes = i + 1; // Para que sea del 12 al 1
            String nombreMes = mesesAnio[i];
            
            // Usamos put (Clave, Valor) para guardar en ambos mapas
            mapaArbol.put(numeroMes, nombreMes);
            mapaEnlazado.put(numeroMes, nombreMes);
        }
        
        // Recorrido y diferencias
        System.out.println("---CONTENIDO DEL TREEMAP(Orden natural)---");
        mostrarMapa(mapaArbol); // Sale del 1 al 12
        
        System.out.println("---CONTENIIDO DEL LINKEDHASHMAP(Orden de inserción)---");
        mostrarMapa(mapaEnlazado); // Sale del 12 al 1
    }

}
