/**
 *Después de intentarlo por varias horas decidí buscar un poco de ayuda pero no iba mal encaminado con la ayuda de los otros ejercicios
 * @author kevinNS
 */
import java.util.Scanner; 

public class Ejercicio27T3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0; //Declaramos esta variable para que el usuario elija una opción
        
        //Creamos un bucle while para que, mientras el usuario no pulse 5, se sigan repitiendo las operaciones
        while (opcion !=5){
            
        try {  
        System.out.println("Introduzca el primer número "); //Pedimos al usuario que introduzca un número
        int num1 = entrada.nextInt(); //Guardamos el primer número
        System.out.println("Introduzca el segundo número "); //Pedimos al usuario un segundo número
        int num2 = entrada.nextInt(); //Guardamos el segundo número
        int resultado; //Declaramos la variable para que nos dé un resultado
        
        //Pedimos al usuario que elija la operación que desea realizar:
            System.out.println("Seleccione la operación a realizar: ");
            System.out.println("1. suma");
            System.out.println("2. resta");
            System.out.println("3. multiplicación");
            System.out.println("4. división");
            System.out.println("5. salir del programa");
            
            opcion = entrada.nextInt();
        
        if (opcion ==1){
            resultado = num1 + num2;
            System.out.println("El resultado de la suma es: " + resultado);
        }else if (opcion ==2){
            resultado = num1 - num2;
            System.out.println("El resultado de la resta es: " + resultado);
        }else if (opcion ==3){
            resultado = num1 * num2;
            System.out.println("El resultado de la multiplicacion es: " + resultado);
        }else if (opcion ==4){
            try { //Aquí controlamos el caso de división entre 0
            resultado = num1 / num2;
            System.out.println("El resultado de la división es: " + resultado);
            } catch (ArithmeticException e){
            System.out.println("Error; " + e.getMessage());
            resultado = 0; //Si el resultado es 0 el programa dará un error
            }    
        }else if (opcion ==5){
            System.out.println("Cancelando programa");
        }
        } catch (Exception e) { //Dejamos el exception vacio ya que solo es para cerrar el primer try
                           
       
        }
    }
}
}

