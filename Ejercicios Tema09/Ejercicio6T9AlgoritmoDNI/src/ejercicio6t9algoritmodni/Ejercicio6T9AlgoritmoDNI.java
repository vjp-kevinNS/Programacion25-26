package ejercicio6t9algoritmodni;
import java.util.Scanner; // Importamos Scanner
/**
 * Escribir un programa en JAVA al que le introduzcas tu DNI (números y letra,
 * todo junto) y te diga si el DNI introducido es correcto. 
 * 
 * • Nota: Algoritmo para el cálculo del NIF: Se calcula el módulo de 23 (resto 
 * de la división) del número del DNI.
 *
 * @author KevinNS
 */
public class Ejercicio6T9AlgoritmoDNI {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        // Pedimos el DNI completo
        System.out.println("Introduzca su DNI (números y letra): ");
        String dniUsuario = entrada.nextLine().toUpperCase(); // Lo pasamos a mayúsculas por si acaso
        
        // Extraemos las partes del String
        // Los números son desde el principio hasta el penúltimo carácter
        String parteNumerica = dniUsuario.substring(0, dniUsuario.length() - 1);
        // La letra es el último carácter
        char letraDNI = dniUsuario.charAt(dniUsuario.length() - 1);
        
        // Convertimos el texto de los números en un int para poder operar
        int numero = Integer.parseInt(parteNumerica);
        
        // Aplicamos el algoritmo: módulo 23
        int resto = numero % 23;
        
        // Definimos la cadena con el orden de letras de la tabla
        String tablaLetras = "TRWAGMYFPDXBNJZSQVHLCKE";
        
        // Extraemos la letra que corresponde a nuestro resto
        char letraCorrecta = tablaLetras.charAt(resto);
        
        // Comparamos la letra del usuario con la calculada
        if (letraDNI == letraCorrecta) {
            System.out.println("El DNI introducido es correcto");
        }else{
            System.out.println("El DNI es incorrecto");
            System.out.println("Para el número " + numero + " , la letra debería ser la " 
                    + letraCorrecta);
        }
        

    }

}
