/**
 *
 * @author kevinNS
 */
public class Ejercicio26T3 {

    public static void main(String[] args) {
        //Usando Do While crear un bucle que muestre los impares entre 111 y 222 y después sumarlos
        int i = 111; //Declaramos la variable i que en este caso es 111, por que queremos que empiece desde ahi
        int suma = 0; //Declaramos la variable suma para la suma de los impares
        //bucle do while
        do{ 
            if (i % 2 != 0) { //Si el número es impar
            System.out.println(i);
            suma += i;
            } 
            i++; //para aumentar el contador
            
        } while (i <= 222); //como queremos que sea hasta el 222 se quedaría ahi
        System.out.println("La suma de los números impares entre 111 y 222 es: " + suma);
    }
    
}