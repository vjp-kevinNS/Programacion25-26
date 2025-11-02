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
    public static double suma(double num1, double num2) {
        return num1 + num2;
    }
    /**
     * Método que resta dos números pasados por parámetro
     * @param num1
     * @param num2
     * @return la resta de los dos números
     */
    public static double resta (double num1, double num2){
        return num1 - num2;
    }    
    /**
     * Método que multiplica dos números pasados por parámetro
     * @param num1
     * @param num2
     * @return la multiplicación de los números
     */
    public static double multiplicacion (double num1, double num2){
        return num1 * num2;
    }
    /**
     * Método que divide dos números pasados por parámetro
     * @param num1
     * @param num2
     * @return la división de los números
     */
    public static double division (double num1, double num2){
        return num1 / num2;
    }
    /**
     * Método que calcula la raiz cuadrada del número pasado por parámetro
     * @param num1
     * @return la raiz cuadrada
     */
    public static double raizCuadrada (double num1){
        return Math.sqrt(num1);
    }
    /**
     * Método que calcula el cuadrado de un número
     * @param num1
     * @return el cuadrado del número
     */
    public static double cuadrado (double num1){
        return Math.pow(num1, 2);
    }
    /**
     * Método que calcula el cubo de un número
     * @param num1
     * @return el cubo número
     */
    public static double cubo (double num1){
        return Math.pow(num1, 3);
    }
    /**
     * Método que calcula el logaritmo de un número
     * @param num1
     * @return el logaritmo del número
     */
    public static double logaritmo (double num1){
        return Math.log(num1);
    }
    /**
     * Método que calcula el máximo de los dos valores
     * @param num1
     * @param num2
     * @return el mayor de los dos valores
     */
    public static double maximo (double num1, double num2){
        return Math.max(num1, num2);
    }
    /**
     * Método que calcula el mínimo de los dos valores
     * @param num1
     * @param num2
     * @return el mínimo de los dos valores
     */
    public static double minimo (double num1, double num2){
        return Math.min(num1, num2);
    }
    /**
     * Método que redondea al alza el número introducido
     * @param num1
     * @return el redondeo al alza
     */
    public static double redondeoAlza(double num1){
        return Math.ceil(num1);
    }
    /**
     * Método que redondea a la baja el número introducido
     * @param num1
     * @return el redondeo a la baja
     */
    public static double redondeoBaja (double num1){
        return Math.floor(num1);
    }
            
}
