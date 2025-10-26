package Calificacion;

/**
 *
 * @author kevinNS
 */
public class Calificacion {
/**
 * Queremos que nos muestre la nota que ha introducido el usuario en main y
 * saber si esta aprobado o suspenso. Nos dara un error si el valor no está
 * entre 0 y 10
 * @param num 
 */
        public static void calificacion(int nota) {
        //Hacemos un switch para saber que calificación corresponde en cada caso
        switch (nota){
            case 0, 1, 2, 3, 4:
                System.out.println("Suspenso");
                break;
            case 5, 6:
                System.out.println("Bien");
                break;
            case 7, 8:
                System.out.println("Notable");
                break;
            case 9, 10:
                System.out.println("Sobresaliente");
                break;
            default:
                System.out.println("Error: la nota introducida debe estar entre 0 y 10");
                break;
        
        }
            
    }
    
}
