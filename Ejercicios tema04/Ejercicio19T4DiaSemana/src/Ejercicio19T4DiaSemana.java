import java.util.Scanner; //Importamos Scanner

/**
 *Escribe un programa que lea un día de la
 *semana que introduzca el usuario (Lunes, Martes,
 *Miércoles, Jueves, Viernes, Sábado o Domingo) y, según
 *sea su valor, escriba en pantalla su posición en la semana.
 * @author KevinNS
 */
public class Ejercicio19T4DiaSemana {


    public static void main(String[] args) {
        
        //Pedimos al usuario que introduzca un dia de la semana
        String dia;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Por favor, introduzca un día de la semana: ");
        dia = entrada.nextLine();
        
        //Hacemos un switch case para saber que posición mostrar
        switch (dia){
            case "Lunes":
                System.out.print("El Lunes es el primer día de la semana");
                break;
            case "Martes":
                System.out.print("El Martes es el segundo día de la semana");
                break;
            case "Miercoles":
                System.out.print("El Miércoles es el tercer día de la semana");
                break;
            case "Jueves":
                System.out.println("El Jueves es el cuarto día de la semana");
                break;
            case "Viernes":
                System.out.println("El Viernes es el quinto día de la semana");
                break;
            case "Sábado":
                System.out.println("El Sábado es el sexto día de la semana");
                break;
            case "Domingo":
                System.out.println("El domingo es el séptimo día de la semana");
                break;              
            
        }
        
    }
    
}
