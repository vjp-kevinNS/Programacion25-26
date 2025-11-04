import java.util.Scanner; //Importamos Scanner
/**
 *Escribir un programa que contenga un
 *método donde le pidamos al usuario su nombre, otro
 *método donde le pidamos su edad y otro método
 *llamado mayorDeEdad, que reciba la edad como entero
 *por parámetro y muestre un mensaje por pantalla de si el
 *usuario llamado XXX es mayor de edad o no.
 * 
 * @author KevinNS
 */
public class Ejercicio24T4NombreyEdad {
    
    /**
     * Método que le pide al usuario introducir su nombre
     * @return el nombre del usuario
     */
    public static String introduceNombre(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce tu nombre");
        
        return entrada.nextLine(); 
    }
    /**
     * Método que pide la edad al usuario
     * @param edad 
     * @return la edad introducida
     */
    public static int introduceEdad (int edad){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce tu edad");
        edad = entrada.nextByte(); 
        
        return edad;
    }
    
    /**
     * Método que nos dice si el usuario es mayor o menor de 18
     * @param nombre
     * @param edad 
     */
    public static void mayorDeEdad(String nombre, int edad){
        if(edad >= 18){
            System.out.println(nombre + " Es mayor de edad");
        }else{
            System.out.println(nombre + " Es menor de edad");
        }  
    }

    public static void main(String[] args) {
        String nombre = introduceNombre();
        int edad = introduceEdad(0);
        mayorDeEdad(nombre, edad);
    }
    
}
