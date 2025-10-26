package Ordenador;

/**
 *
 * @author kevinNS
 */
public class Ordenador {
        
    public static void ordenarNumeros(int num1, int num2, int num3, int num4){
        
        int auxiliar; //Creamos ésta variable para guardar el valor temporalmente
        //Vamos a crear un bucle por que tenemos que repetirlo 2 veces más
        for (int i = 0; i < 3; i++) {
        //Creamos un if else dentro del bucle
            if (num1 > num2){
                auxiliar = num1;
                num1 = num2;
                num2 = auxiliar;    
            }if (num2 > num3){
                auxiliar = num2;
                num2 = num3;
                num3 = auxiliar;
            }if (num3 > num4){
                auxiliar = num3;
                num3 = num4;
                num4 = auxiliar;
            }        
        }
            System.out.println("El orden de los número es " + num1 + " " + num2 +
            " " + num3 + " " + num4);
    }
}
