package MetodosEstaticos;
import metodosestaticos.Calculadora;
import Utilidades.Utilidades;
/**
 * <b>QUÉ SON LOS MÉTODOS:</b>
 * Los métodos son fragmentos de código encapsulado para su reutilización.
 * Son como máquinas que realizan un proceso.
 * 
 * <b>PARÁMETROS Y RETURN:</b>
 * Esa máquina puede obtener datos de entrada
 * y dar datos de salida.
 * 
 * Los datos de entrada se pasan al método por parámetro (entre los paréntesis)
 * en la declaración del propio método.
 * 
 * Cuando un método da un dato de salida (devuelve un dato, con la sentencia return),
 * el método tiene que indicar en su decalaración el tipo de dato que devuelve.
 * 
 * <b>COMPORTAMIENTO DE LOS MÉTODOS:</b>
 * Estos métodos se cargan en la memoria del programa en la compilación,
 * por lo que se pueden usar en cualquier momento, independientemente
 * del orden del código.
 * 
 * En la clase principal, todos los métodos deben ser estáticos, porque el método main,
 * desde el que se llama a esos métodos, es estático. En un contexto estático, todo debe
 * ser estático.
 * 
 * @author d3stroya
 */
public class MetodosEstaticos {
    // Método que imprime un saludo -> tipo void
    public static void saludo() {
        System.out.println("Hola mundo con Java");
    }
    
    // Método que imprime un mensaje con un dato que recibe por parámetro -> tipo void
    public static void saludoConParametro(int num) {
        saludo();
        System.out.println("Hola mundo" + num);
    }    
    
    // Método que muestra la suma de dos números que recibe por parámetro -> tipo void
    public static void sumal(int num1, int num2) {
        System.out.println("La suma de " + num1 + " + " + num2 + " = " + (num1 + num2));
    }
    
    
    // Método que devuelve la suma de dos números que recibe por parámetro -> tipo int
    public static int sumaQueDevuelveElResultado(int num1, int num2, boolean enc) {
        int resultado = num1 + num2;
        return resultado;
    }
    
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
    
    
    // Método que devuelve true si la contraseña 
    // que pasamos por parámetro es correcta -> tipo boolean               
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 3;
        double resultado;
        
        // Llamamos a los métodos para que se ejecuten al lanzar el programa.
//        saludo();
        
//        saludoConParametro(num1);

//        suma(num1, num2);
        
//        resultado = sumaQueDevuelveElResultado(num1, num2);
//        System.out.println(resultado);
//        System.out.println(sumaQueDevuelveElResultado(num1, num2));
        
        
        
        
        // Llamamos a métodos estático de otra clase
        //System.out.println(Calculadora.suma(num1, num2));
        //System.out.println(Calculadora.resta(num1, num2));
        
        
        
        // Llamamos a un método estático de una clase de otro paquete
        // (debemos importar el paquete)
        num1 = Utilidades.pedirNumero();
        num2 = Utilidades.pedirNumero();
        
        System.out.println(num1 + "-" + num2);
        
        //Llamamos a los métodos, guardamos al resultado en una variable 
        //y mostramos dicha variable
        try {
        resultado = Calculadora.suma(num1,num2);
        System.out.println(num1 + "+" + num2 + "=" + resultado);
        resultado = Calculadora.resta(num1,num2);
        System.out.println(num1 + "-" + num2 + "=" + resultado);
        resultado = Calculadora.multiplicacion(num1,num2);
        System.out.println(num1 + "*" + num2 + "=" + resultado);
        resultado = Calculadora.division(num1,num2);
        System.out.println(num1 + "/" + num2 + "=" + resultado);
        resultado = Calculadora.raizCuadrada(num1);
        System.out.println("La raiz cuadrada de " + num1 + "=" + resultado);
        
        }catch(ArithmeticException e){
            System.out.println("Ha sucedido una excepción aritmética");
         } 
    }
}
