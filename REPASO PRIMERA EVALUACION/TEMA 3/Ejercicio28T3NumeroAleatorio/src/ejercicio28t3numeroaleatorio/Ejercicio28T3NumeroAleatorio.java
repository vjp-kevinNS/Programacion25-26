package ejercicio28t3numeroaleatorio;

/**
 * Realiza un programa que genere un número aleatorio (utiliza Math.random())
 * entre 1 y 100, que lo muestre por pantalla e indique si es par o impar
 *
 * @author KevinNS
 */
public class Ejercicio28T3NumeroAleatorio {

    public static void main(String[] args) {
        
        //Primero genereremos el número aleatorio
        //Math.random() da un decimal entre 0 y 0.99. 
        //Multiplicamos por 100 y sumamos 1 para el rango 1-100.
        int numero = (int) (Math.random() * 100 +1);
        
       //Mostramso el número por pantalla
        System.out.println("El número generado aleatoriamente es: " + numero);
        
        //Creamos un if else para saber si es par o impar
        if (numero % 2 == 0) { //Si el número es par
            System.out.println("El número " + numero + " es PAR");
            
        } else { //Si no es impar
            System.out.println("El número " + numero + " es IMPAR");
        }
       

    }

}
