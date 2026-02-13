package ejercicio1t9probarmetodos;

/**
 * Escribe un sencillo programa en Java en el que utilices los 17 métodos vistos
 * en clase para la manipulación de cadenas (Strings) y vayas mostrando sus
 * resultados: 
 * 
 * •equals 
 * •compareTo 
 * •valueOf. 
 * •toCharArray. 
 * •length() 
 * •concat(cadena2) 
 * •charAt (indice) 
 * •substring (desde, hasta) 
 * •indexOf (…)
 * •lastIndexOf (…) 
 * •endsWith ( texto) 
 * •startsWith ( texto) 
 * •replace (carácter1, carácter2) 
 * •replaceAll ( cadena1, cadena2) 
 * •toUpperCase( )
 * •toLowerCase ( ) 
 * •split (patrón)
 *
 * @author KevinNS
 */
public class Ejercicio1T9ProbarMetodos {

    public static void main(String[] args) {
        
        // Creamos un par de variables con las que trabajaremos
        String ejemplo1 = "Buenos dias";
        String ejemplo2 = "buenos dias";    
        
        System.out.println("---DEMOSTRACION DE METODOS TO STRING---");
        
        // 1.Equals: Compara si dos textos son iguales
        System.out.println("1-equals: " + ejemplo1.equals(ejemplo2));
        
        // 2.CompareTo: Compara por orden alfabético (devuelve 0 si son iguales)
        System.out.println("2-compareTo: " + ejemplo1.compareTo("Buenos"));

    }

}
