package ejercicio11t9modificarcaracteres;

import java.util.Scanner; // Importamos Scanner

/**
 * Crea un programa que contenga un método llamado transforma, que reciba como
 * parámetro una cadena de caracteres, y la modifique cambiando las minúsculas
 * por mayúsculas, las mayúsculas por minúsculas y los dígitos por puntos.
 *
 * Ejemplo de ejecución: Por favor, introduzca la cadena a transformar: Vivo en
 * la Calle Olivo numero 3 y tengo 21 años
 *
 * Cadena transformada: vIVO EN LA cALLE oLIVO NUMERO. Y TENGO .. AÑOS
 *
 * @author KevinNS
 */
public class Ejercicio11T9ModificarCaracteres {
    
    /**
     * Método que modifica una cadena de carácteres
     * @param cadena
     * @return 
     */
    public static String transforma(String cadena) {
        // Como los Strings no se pueden cambiar directamente construimos una 
        // cadena nueva vacía
        String nuevaCadena = "";

        // Usamos un bucle para ver cada letra de la frase
        for (int i = 0; i < cadena.length(); i++) {
            char letraActual = cadena.charAt(i);

            // Regla 1: si es mayúscula la pasamos a minúscula
            if (Character.isUpperCase(letraActual)) {
                nuevaCadena += Character.toLowerCase(letraActual);
            
            // Regla 2: si es minúscula la pasamos a mayúscula
            } else if(Character.isLowerCase(letraActual)){
                nuevaCadena += Character.toUpperCase(letraActual);
            
            // Regla 3: si es un número ponemos un punto
            } else if (Character.isDigit(letraActual)){
                nuevaCadena += ".";
                
            }else {
                // Si es un espacio o cualquier otra cosa lo dejamos tal cual
                nuevaCadena += letraActual;
            }
        }       
        return nuevaCadena; // Devolvemos la frase ya transformada
    }    
    

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Pedimos al usuario que introduzca la cadena a transformar
        System.out.println("Por favor, introduzca la cadena a transformar: ");
        String textoUsuario = entrada.nextLine();
        
        // LLamamos al método y mostramos el resultado
        String resultado = transforma(textoUsuario);
        
        System.out.println("Cadena transformada: ");
        System.out.println(resultado);

    }

}
