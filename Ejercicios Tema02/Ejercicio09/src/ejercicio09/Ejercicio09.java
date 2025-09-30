package ejercicio09;
//ENUNCIADO: realiza un programa que calcule la longitud de una circunferencia 
//de radio 3,55 metros. Para ello utiliza la constante PI:
//Como soy muy malo en matematicas he buscado como calcular eso
/**
 *
 * @author kevin
 */
public class Ejercicio09 { //CLASE
     final static double PI = 3.14; //para que sea constante tiene que ir al inicio
     //con final static double, por que es decimal

    public static void main(String[] args) { //METODO 
        //definimos el radio en metros
        double radio = 3.55; //VARIABLE, usamos double por que son decimales y  
                             //es mas preciso que float
        //ponemos el valor de pi, que es 3,14, tambien con double
        //ponemos la operación que hay que hacer que sería la formula 2 por pi por radio
        double formula = 2*PI*radio;
        System.out.println(" La longitud de una circunferencia cuyo radio vale " 
        +3.55+ " seria igual a " +formula+ " metros ");
    }
    
}
