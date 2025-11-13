import java.util.Scanner; //Importamos Scanner
/**
 *Para probar el funcionamiento de la clase Numero, crea una
  nueva clase llamada Test donde le pidas al usuario un
  número por teclado. Luego, crea un objeto, siendo el
  número introducido por el usuario el valor del atributo valor.
  Posteriormente, le pasarás el objeto a un método que le dirá
  al usuario si el número introducido es par o impar
 * @author KevinNS
 */
public class Test {


    public static void main(String[] args) {
        
        //Pedimos un número al usuario
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int numUsuario = entrada.nextInt();
        
        
        //Creamos el objeto
        
        Numero numero = new Numero(numUsuario);
        
        //LLamamos al método
        esParOImpar(numero);
    }
    
    //Creamos el método para saber si el número introducido es para o impar
    
    public static void esParOImpar(Numero n){
        if(n.getValor() % 2 == 0){
            System.out.println("El número es par");
        }else{
            System.out.println("El número es impar");
        }
       
    }
    
    
}
