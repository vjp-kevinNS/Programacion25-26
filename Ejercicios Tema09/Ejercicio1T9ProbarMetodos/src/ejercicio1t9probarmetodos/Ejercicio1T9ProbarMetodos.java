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
        
        // 1.equals: Compara si dos textos son iguales
        System.out.println("1-equals: " + ejemplo1.equals(ejemplo2));
        
        // 2.compareTo: Compara por orden alfabético (devuelve 0 si son iguales)
        System.out.println("2-compareTo: " + ejemplo1.compareTo("Buenos"));
        
        // 3.valueOF: Convierte cualqueir cosa (por ejemplo un número) a texto
        double pi = 3.14;
        String piEjemplo1 = String.valueOf(pi);
        System.out.println("3-valueOf: " + piEjemplo1);
        
        // 4.toCharArray: Rompe el texto con un array de letras sueltas
        char[]letras = ejemplo1.toCharArray();
        System.out.println("4-toCharArray (primera letra): " + letras);
        
        // 5.length(): Nos dice cuántas letras tiene el texto(incluyendo espacios)+
        System.out.println("5-length: " + ejemplo1.length());
        
        // 6.concat: Pega un texto al final de otro
        System.out.println("6-concat: " + ejemplo1.concat(ejemplo2));
        
        // 7.charAt: Muestra que letra hay en una posición concreta(empezando desde 0)
        System.out.println("7-charAt (pos 9): " + ejemplo1.charAt(9));
        
        // 8.substring: Corta un trozo del texto
        System.out.println("8-substring (5-10): " + ejemplo1.substring(5, 10));
        
        // 9.indexOf: Busca la primera vez que aparece algo y te da su posición
        System.out.println("9-indexOf ('Buenos'): " + ejemplo2.indexOf("Buenos"));
        
        // 10-lastIndexOf: Como el anterior pero empieza a buscar por el final
        String repetida = "hola hola";
        System.out.println("10-lasIndexOf ('hola') " + repetida.lastIndexOf("hola"));
        
        // 11-endsWith: ¿El texto termina con ésta palabra?
        System.out.println("11-endsWith ('dias'): " + ejemplo1.endsWith("dias"));
        
        // 12-startsWidth: ¿El texto empieza con ésta palabra?
        System.out.println("12-startsWith ('buenos'): " + ejemplo2.startsWith("buenos"));
        
        // 13-replace: Cambia una letra por otro en todo el texto
        System.out.println("13-replace('e' por 'i'): " + ejemplo1.replace('e', 'i'));
        
        // 14-replaceAll: Cambia una palabra o patrón por otro
        System.out.println("14-replaceAll ('buenos' por 'bonitos'): " + ejemplo2.replaceAll("buenos", "bonitos"));
        
        // 15-toUpperCase: Lo pone todo en mayusculas
        System.out.println("15-toUpperCsae " + ejemplo2.toUpperCase());
        
        // 16-toLowerCase: Lo pone todo en minúsculas
        System.out.println("15-toLowerCase " + ejemplo1.toLowerCase());
        
        // 17-split: Corta el texto en trozos cada vez que encuentre un patrón(un espacio por ejemplo)
        String[]palabras = ejemplo2.split(" ");
        System.out.println("17-split (primera palabra): " + palabras);
    }

}
