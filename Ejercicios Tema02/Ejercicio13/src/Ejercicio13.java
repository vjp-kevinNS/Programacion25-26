//ENUNCIADO: realiza un programa en el que tengas dos variables de tipo entero,
//num1 que contiene un 1 y num2 que contiene un 2. ¿Cómo pasarías el contenido
//de una variable a otra de forma que num1 contenga el 2 y num2 contenga el 1?
/**
 *
 * @author kevin
*/
public class Ejercicio13 { //CLASE
    public static void main(String[] args) { //METODO
        //usamos int (tipo de dato entero)con num1 y 2 que son VARIABLES
        int num1 = 1;
        int num2 = 2;
        //para concatenar (pegar) el texto con el valor de las variables se usa +
        System.out.println("Antes num1 = " +num1+ " , num2 = " +num2 );
        //creamos una variable con temp para no perder uno de los valores. Es
        //como una cajita para guardarlo. Sería de tipo int
        int temp = num1; //guardamos el valor de 1 en temp
        num1 = num2;     //ahora num1 toma el valor de num2
        num2 = temp;     //ahora num2 toma el valor de temp
        System.out.println("Despues num1 = " +num1+ " , num2 = " +num2);
        
        
        
    }
    
}
