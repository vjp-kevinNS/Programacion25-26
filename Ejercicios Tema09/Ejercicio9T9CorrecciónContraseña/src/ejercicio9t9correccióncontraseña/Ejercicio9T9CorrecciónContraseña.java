package ejercicio9t9correccióncontraseña;
import java.util.Scanner; // Importamos Scanner
/**
 * Realiza un programa en JAVA que le pida al usuario un usuario y una
 * contraseña. El programa debe verificar la corrección de esa contraseña, que
 * deberá satisfacer las condiciones siguientes: 
 * 
 * • La contraseña no puede tener menos de seis caracteres. 
 * • Al menos dos de esos caracteres deben ser dígitos. 
 * • El nombre del usuario no puede formar parte de la contraseña.
 *
 * @author KevinNS
 */
public class Ejercicio9T9CorrecciónContraseña {


    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        // Pedimos los datos iniciales
        System.out.println("Introduce tu nombre de usuario: ");
        String nombreUsuario = entrada.nextLine();
        System.out.println("Introduce tu contraseña: ");
        String contraseña = entrada.nextLine();
        
        // Variables psra verificar las condiciones
        boolean longitud = contraseña.length() >= 6; // ¿Tiene 6 o mas carácteres?
        boolean nombreEnContraseña = contraseña.indexOf(nombreUsuario) == -1; // ¿El nombre de usuario no está dentro de la contrasdeña?
        int contadorDigitos = 0;
        
        // Contamos cuántos dígitos hay usando un bucle y charAt
        for (int i = 0; i < contraseña.length(); i++) {
            if (Character.isDigit(contraseña.charAt(i))) {
                contadorDigitos++;
            }
            
        }
        
        boolean digitosOK = contadorDigitos >= 2; // ¿Tiene al menos 2 números?
        
        // Comprobamos si se cumplen todas las reglas
        if (longitud && nombreEnContraseña && digitosOK) {
            System.out.println("Has configurado tu acceso con éxito");
        }else{
            System.out.println("Contraseña INCORRECTA");
            if (!longitud) {
                System.out.println("Debe tener al menos 6 caracteres");              
            }
            if (!digitosOK) {
                System.out.println("Debe contener al menos 2 números");
            }
            if (!nombreEnContraseña) {
                System.out.println("El nombre de usuario no puede estar en la contraseña");
            }
        }
        
    }

}
