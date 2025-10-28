
package Mostrar1y2;

/**
 * Aquí crearemos el método que nos muestre el menor número de los introducidos
 * en el método 1
 *
 * @author kevinNS
 */
public class Mostrar2 {

    public static void mostrarNum(int num1, int num2, int num3) {
   
        int menor;

        //Realizamos un if else
        if (num1 <= num2 && num1 <= num3) { //si num1 es menor que num2 y num3 se mostrará
            menor = num1;
        } else if (num2 <= num1 && num2 <= num3) { //si num2 es menor que num1 y num3 se mostrará
            menor = num2;
        } else {                   // si el menor es num3 se mostrará
            menor = num3;    
        }System.out.println("El menor número es: " +menor);
    }
}
