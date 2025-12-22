import java.util.Scanner; //Importamos Scanner
/**
 * Diseña un programa que solicite al usuario el tamaño del lado de un triángulo
 * equilátero y su altura.
 * 
 * Luego, debe calcular su perímetro y su área.
 * 
 * • Muestra por pantalla el resultado de la siguiente forma:
 * Por favor, introduzca la medida de un lado: XXXXX
 * El área de un triángulo de lado: xxx es: xxx
 * El perímetro de un triángulo de lado: xxx es: xxx
 *
 * @author KevinNS
 */
public class Ejercicio22T2Triangulo {

    public static void main(String[] args) {
        
        //Primero pedimos al usuario que introduzca el tamaño del lado
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, introduzca la medida de un lado");
        int lado = entrada.nextInt();
        
        //Le pedimos que introduzca la altura
        System.out.println("Introduzca la altura del triángulo");
        int altura = entrada.nextInt();
        
        //Hacemos las operaciones usando double por que tendrá decimales
        double area = (lado * altura) / 2;
        double perimetro = lado * 3;
        
        //Ahora mostramos por pantalla los resultados
        System.out.println("El área de un triángulo de lado: " + lado + " es: " 
                + area);
        System.out.println("El perímetro de un triángulo de lado: " + lado + " es: " 
                + perimetro);

    }

}
