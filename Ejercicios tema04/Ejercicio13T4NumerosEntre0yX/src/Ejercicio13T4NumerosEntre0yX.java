
import java.util.Scanner; //Importamos Scanner
import ContadorNumeros.ContadorNumeros; //Importamos el método

/**
 *
 * @author kevinNS
 */
public class Ejercicio13T4NumerosEntre0yX {

    public static void main(String[] args) {
        int i; //Creamos esta variable para incicializarla y operar con ella
        do {
            i = ContadorNumeros.devuelveNum(); //LLamamos al metodo para que nos muestre el número
        } while (ContadorNumeros.devuelveBoolean(i) == false);
        
        ContadorNumeros.mostrarNum(i);
        
    }
    
}
