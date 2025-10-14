/**
 *
 * @author KevinNS
 */
public class Ejercicio12T3 {

    public static void main(String[] args) {
    //Usando Do While crear un bucle que muestre los pares entre 11 y 133
        int i = 11; //Declaramos la variable i que en este caso es 11, por que queremos que empiece desde ahi
        
        do{ 
            if (i % 2 == 0) {
            System.out.println(i);
            }
            i++; //para aumentar el contador
        } while (i<=133);
    }
    
}
