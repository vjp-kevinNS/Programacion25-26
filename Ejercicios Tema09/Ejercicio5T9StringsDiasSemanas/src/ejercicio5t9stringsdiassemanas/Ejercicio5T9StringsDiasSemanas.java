package ejercicio5t9stringsdiassemanas;
import java.util.Scanner; // Importamos Scanner
/**
 * Escribir un programa que lea un día de la semana que le introduzca el usuario
 * (Lunes, Martes, Miércoles, Jueves, Viernes, Sábado o Domingo) y, según sea su
 * valor, escriba en pantalla su posición en la semana. 
 * 
 * (Ejemplo: “Es el tercer día de la semana”) 
 * 
 * • En vez de utilizar una estructura switch, utiliza un array de Strings donde
 * tengas los días de la semana guardados previamente
 *
 * @author KevinNS
 */
public class Ejercicio5T9StringsDiasSemanas {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        // Creamos el array con los días de la semana predefinidos
        String[]dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes" , "Sábado", "Domingo"};
        
        // Pedimos el día al usuario
        System.out.println("Introduzca un día de la semana: ");
        String diaUsuario = entrada.nextLine();
        
        int i = 0; 
        boolean encontrado = false;
       
        // La condición dice: sigue buscando mientras no lo hayas encontrado
        // y todavía queden días en la lista
        while (i < dias.length && !encontrado) {            
            if (dias[i].equalsIgnoreCase(diaUsuario)) {
                System.out.println("Es el " + (i + 1) + " º día de la semana");
                encontrado = true;
            }
            i++; // Pasamos al siguiente día
        }
        
        if (!encontrado) {
            System.out.println("Ese día no existe");
        }
    }    


}
