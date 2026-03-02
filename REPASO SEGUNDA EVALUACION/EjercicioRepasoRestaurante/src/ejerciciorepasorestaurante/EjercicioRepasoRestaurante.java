package ejerciciorepasorestaurante;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Tendremos la clase Plato(Descripción String, boolean vegetariano, precio
 * float y stock int 20)
 *
 * Tendremos la clase Carta(Array de 4 platos y el nombre del restaurante)
 *
 * Menu con opciones: 
 * 1-Rellenar la carta 
 * 2-Mostrar la carta entera 
 * 3-Mostrar platos vegatarianos 
 * 4-Mostrar platos mas caros 
 * 5-Mostrar platos mas baratos
 * 6-Mostrar plato con menos stock 
 * 7-Añadir stock y quitar stock
 *
 * @author KevinNS
 */
public class EjercicioRepasoRestaurante {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int opcion = 0;
        
        do {
            
            try {
                System.out.println("--------------------------------------------------");
                System.out.println("-------------#OPCIONES DEL RESTAURANTE#-----------");
                System.out.println("----------------1.Rellenar la carta---------------");
                System.out.println("--------------2.Mostrar la carta entera-----------");
                System.out.println("----------3.Mostrar platos vegatarianos-----------");
                System.out.println("------------4.Mostrar platos mas caros------------");
                System.out.println("------------5.Mostrar platos mas baratos----------");
                System.out.println("---------6.Mostrar plato con menos stock----------");
                System.out.println("----------7.Añadir stock y quitar stock-----------");
                System.out.println("--------------8.SALIR DEL PROGRAMA----------------");
                System.out.println("--------------------------------------------------");
                opcion = entrada.nextInt();

                switch (opcion) {
                    case 1:

                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:

                        break;
                    case 5:

                        break;
                    case 6:

                        break;
                    case 7:

                        break;
                    case 8:

                        break;
                    default:
                        System.out.println("Opción incorrecta.....");
                }

            } catch (InputMismatchException e) {
            }

        } while (true);

    }

}
