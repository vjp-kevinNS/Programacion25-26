package tema09clasestring;

import java.util.Arrays;

/**
 *
 * @author KevinNS
 */
public class Tema09ClaseString {

    public static void main(String[] args) {
        System.out.println("- STRING: OBJETOS INMUTABLES -");
        // Declarar e inicializar un String
        String nombre = "Pepe";

        // Los Strings son cadenas inmutables; 
        // cualquier cambio devuelve un nuevo objeto
        String nombreMayus = nombre.toUpperCase();
        System.out.println(nombreMayus + " -> HashCode de nombreMayus: " + nombreMayus.hashCode());
        System.out.println(nombre + " -> HashCode de nombre: " + nombre.hashCode());

        /* MÉTODOS DE LA CLASE STRING */
        System.out.println("\n- MÉTODOS -");

        // Comparar dos cadenas
//        System.out.println("\n· cadena1.equals(cadena2):");
//        System.out.println(nombre.equals(nombreMayus));

        // Comparar dos cadenas ignorando mayúsculas y minúsculas
//        System.out.println("\n· cadena1.equalsIgnoreCase(cadena2):");
//        System.out.println(nombre.equalsIgnoreCase(nombreMayus));

        // Comparar dos cadenas alfabéticamente 
        /* 
            * Devuelve un número  < 0 si cadena1 es mayor
            *                       0 si son iguales
            *                     > 0 si cadena 1 es menor
         */
//        System.out.println("\n· cadena1.compareTo(cadena2):");
//        System.out.println(nombre.compareTo(nombreMayus));
//        
//        System.out.println("\n· cadena1.compareToIgnoreCase(cadena2):");
//        System.out.println(nombre.compareToIgnoreCase(nombreMayus));

        // Convertir a cadena algo que no lo es
//        System.out.println("\n· String.valueOf(dato)");
//        int edad = 20;
//        System.out.print("edad como int: ");
//        System.out.println(edad + 2);        
//        System.out.println("edad como String: " + String.valueOf(edad) + 2);       
//        System.out.println("¿De qué clase es edad?: " + String.valueOf(edad).getClass());

        // Convertir una cadena a un array de caracteres
//        System.out.println("\n· cadena.toCharArray()");
//        char[] arrayNombre = nombre.toCharArray();
//        System.out.println(Arrays.toString(arrayNombre));

        // Obtener la longitud de una cadena
//        System.out.println("\n· cadena.length()");
//        System.out.println(nombre.length());

        // Concatenar dos cadenas
//        System.out.println("\n· cadena1.concat(cadena2)");
//        System.out.println(nombre.concat(nombreMayus));

        // Extraer una subcadena de la cadena original
//        System.out.println("\n· cadena.substring(desdeIncluido, hastaSinIncluir)");
//        System.out.println(nombre.substring(0,2));

        // Obtener el caracter en el índice indicado
//        System.out.println("\n· cadena.charAt(indice)");
//        System.out.println(nombre.charAt(0));

        // Obtener el índice del caracter indicado
//        System.out.println("\n· cadena.indexOf(subcadena)");
//        System.out.println("Cadena original: " + nombre);
//        System.out.println("Índice de 'P': " + nombre.indexOf("P"));
//        System.out.println("Índice de 'P': " + nombre.indexOf("X"));
//        System.out.println("Índice de 'pe': " + nombre.indexOf("pe"));
//        System.out.print("Índice de 'e' a partir del índice 2: ");
//        System.out.println(nombre.indexOf("e", 2));
//        System.out.print("Último índice de e: ");
//        System.out.println(nombre.lastIndexOf("e"));

        // Comprobar si una cadena empieza o termina por una subcadena indicada
//        System.out.println("\n· cadena.startsWith(subcadena) y cadena.endsWith(cadena)");
//        System.out.print("¿Empieza 'Pepe' por 'Pe'?: ");
//        System.out.println(nombre.startsWith("Pe"));
//        System.out.print("¿Termina 'Pepe' por 'Z'?: ");
//        System.out.println(nombre.endsWith("Z"));

        // Remplazar todas las concurrencias de un caracter por otro
//        System.out.println("\n· cadena.replace(caracter1, caracter2)");
//        System.out.println(nombre.replace("e", "u"));

        // replaceAll() acepta como primer parámetro una expresión regular
//        System.out.println("\n· cadena.replaceAll(regEx, caracter2)");
        String numCuenta = "ES01 0000 1111 2222 3333";
//        System.out.println(numCuenta.replaceAll("\\d", "*"));
//        System.out.println(numCuenta.replace("\\d", "*"));

        // Convertir una cadena a mayúsculas o minúsculas
//        System.out.println("\n· cadena.toUpperCase() y cadena.toLowerCase()");
//        System.out.println(nombre.toLowerCase());
//        System.out.println(nombre.toUpperCase());

        // Dividir una cadena según un patrón -> crea un array de Strings
        System.out.println("\n· cadena.split(patrón)");
        String[] n = numCuenta.split(" ");
        System.out.println(Arrays.toString(n));
        
        
        
        
        
        
        
        

        // Ejemplo: Organizar productos de una tienda por categorias utilizando su código
        System.out.println("- EJEMPLO -");
        Producto producto = new Producto("HOG5429", 29.99, 30);
        String codigoProducto = "HOG5429";
        String categoria = codigoProducto.trim().substring(0, 3);
        String codigo = codigoProducto.trim().substring(3);
        System.out.println(categoria);
        System.out.println(codigo);
        
        if (categoria.equalsIgnoreCase("HOG")) {
            System.out.println("Categoria: HOGAR");
            productosHogar[i] = producto;
            
        }

    }
}
