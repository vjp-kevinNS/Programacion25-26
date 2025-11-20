import java.util.Scanner; //Importamos Scanner
/**
 *Realiza un programa en JAVA, ORIENTADO A OBJETOS, que lea tres números e
 *imprima por pantalla el mayor de ellos.
• Realiza el ejercicio a tu gusto, con los métodos que consideres necesarios.
• Pista: Necesitarás crear 3 objetos de una clase “Numero”
 con un atributo llamado “valor”.
 * @author KevinNS
 */
public class Test {


    public static void main(String[] args) {
        
        //Pedimos los 3 números al usuario
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce el primer número:");
        int num1 = entrada.nextInt();
        System.out.println("Introduce el segundo número:");
        int num2 = entrada.nextInt();
        System.out.println("Introduce el tercer número:");
        int num3 = entrada.nextInt();
        
        //Cremos los objetos
        Numeros numero1 = new Numeros(num1);
        Numeros numero2 = new Numeros(num2);
        Numeros numero3 = new Numeros(num3);
        
         //Creamos el número mayor y ponemos que el mayor es el primero
         //para luego comprar
        Numeros mayor = numero1;
        
        if (numero2.esMayorQue(mayor)) {
            mayor = numero2;
        }
        
        if (numero3.esMayorQue(mayor)) {
            mayor = numero3;
        }
        
        System.out.println("(El número mayor es: " + mayor.getValor());
        
        //Mostramos si cada uno es par o impar
        System.out.println("(Comprobación de par/impar:");
        numero1.esParOImpar();
        numero2.esParOImpar();
        numero3.esParOImpar();
    }
}
