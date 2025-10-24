package metodosestaticos;

/**
 *
 * @author KevinNS
 */
public class Calculadora {
    /**
     * Método que suma dos números pasados por parámetro
     * @param num1
     * @param num2
     * @return la suma de los dos números
     */
    public static int suma(int num1, int num2) {
        return num1 + num2;
    }
    /**
     * Método que resta dos números pasados por parámetro
     * @param num1
     * @param num2
     * @return la resta de los dos números
     */
    public static int resta (int num1, int num2){
        return num1 - num2;
    }    
    /**
     * Método que multiplica dos números pasados por parámetro
     * @param num1
     * @param num2
     * @return la multiplicación de los números
     */
    public static int multiplicacion (int num1, int num2){
        return num1 * num2;
    }
    /**
     * Método que divide dos números pasados por parámetro
     * @param num1
     * @param num2
     * @return la división de los números
     */
    public static int division (int num1, int num2){
        return num1 / num2;
    }
    /**
     * Método que calcula la raiz cuadrada del número pasado por parámetro
     * @param num1
     * @return la raiz cuadrada
     */
    public static double raizCuadrada (int num1){
        return Math.sqrt(num1);
    }
}
