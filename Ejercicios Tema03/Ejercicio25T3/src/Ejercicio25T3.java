/**
 *
 * @author kevinNS
 */
public class Ejercicio25T3 {

    public static void main(String[] args) {
        //Usando Do While crear un bucle que muestre los pares entre 17 y 139 y después sumarlos
        int i = 17; //Declaramos la variable i que en este caso es 17, por que queremos que empiece desde ahi
        int suma = 0; //Declaramos la variable suma para la suma de los pares
        //bucle do while
        do{ 
            if (i % 2 == 0) { //Si el número es par
            System.out.println(i);
            suma += i;
            } 
            i++; //para aumentar el contador
            
        } while (i <= 139); //como queremos que sea hasta el 139 se quedaría ahi
        System.out.println("La suma de los números pares entre 17 y 139 es: " + suma);
    }
    
}
