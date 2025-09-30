//Enunciado: suponemos que llevas en tu cartera 130 euros en billetes de 50 y 10
//Realiza un programa que sea capaz de decirte cuantos billetes de cada.
//130 euros hacen un total de: x billetes de 50 y x billetes de 10

/**
 *
 * @author kevii
 */
public class Ejercicio16 {

    public static void main(String[] args) {
        int euros = 130;
        int billetesde50 = euros / 50;
        int billetesde10 = (euros - billetesde50 * 50) / 10;
        System.out.println("130 euros hacen un total de: " + billetesde50 + 
                " billetes de 50 euros " + billetesde10+ " billetes de 10 euros ");
    }
    
}
