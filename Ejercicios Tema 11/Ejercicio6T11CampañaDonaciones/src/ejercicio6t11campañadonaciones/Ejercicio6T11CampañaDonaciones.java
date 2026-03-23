package ejercicio6t11campañadonaciones;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Debido a la avalancha de campañas de donaciones para la compra de material
 * para hospitales y residencias contra el coronavirus, el Ministerio de Sanidad
 * ha decidido crear un software que gestione todo el dinero donado. En la
 * versión alfa del software debemos gestionar las donaciones de una única
 * campaña. Para ello, debemos implementar las siguientes clases:
 *
 * • Clase Donacion, que almacenará el nombre de la persona que dona y la
 * cantidad donada.
 *
 * • Clase Campania, que almacenará un conjunto de donaciones y el nombre de la
 * campaña.
 *
 * El programa mostrará un menú con las siguientes opciones:
 *
 * 1. Añadir donación.
 *
 * 2. Mostrar donaciones.
 *
 * 3. Mostrar donaciones por nombre de donante (Pediremos un nombre y
 * mostraremos las donaciones cuyo donante coincida con el nombre dado).
 *
 * 4. Mostrar número de donaciones.
 *
 * 5. Mostrar total dinero recaudado.
 *
 * 6. Ordenar donaciones (de mayor a menor importe de las donaciones)
 *
 * 7. Salir.
 *
 * NOTA: No se puede utilizar el método de la Burbuja para realizar la
 * ordenación de las donaciones.
 *
 * PISTA: Podéis utilizar un vector de Donaciones donde ir insertándolas de
 * manera ordenada.
 *
 * @author KevinNS
 */
public class Ejercicio6T11CampañaDonaciones {

    /**
     * Método que muestra el menú
     */
    public static void mostrarMenu() {
        System.out.println("---------------------------------------------------");
        System.out.println("---------------GESTION ALFA CORONAVIRUS------------");
        System.out.println("----------------1. Añadir donación-----------------");
        System.out.println("----------------2. Mostrar donaciones--------------");
        System.out.println("----------------3. Donaciones por donante----------");
        System.out.println("----------------4. Mostrar Nº donaciones-----------");
        System.out.println("----------------5. Mostrar total dinero recaudado--");
        System.out.println("----------------6. Ordenar donaciones--------------");
        System.out.println("----------------7. SALIR DEL MENU------------------");
        System.out.println("---------------------------------------------------");
    }
    
    public static void añadirDonacion(Campania camp){
        Scanner entrada = new Scanner(System.in);
        
        // Pedimos al usuario los datos del donante y la cantidad donada
        System.out.println("Nombre del donante: ");
        String nombreDon = entrada.nextLine();
        System.out.println("Cantidad donada: ");
        double cantidadDon = entrada.nextDouble();
        
        // Añadimos la nueva donación
        Donacion nueva = new Donacion(nombreDon, cantidadDon);
        ArrayList<Donacion> lista = camp.getListaDonaciones();
        
        // Buscamos el hueco donde debe ir
        int i = 0;
        
        while (i < lista.size() && lista.get(i).getImporte() > cantidadDon) {            
            i++;
        }
        
        // Insertamos en la posición i, desplazando el resto automáticamente
        lista.add(i, nueva);
        System.out.println("Donación guardada correctamente");
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Creamos el objeto de la campaña
        Campania miCampania = new Campania("Ayuda coronavirus");

        // Creamos el menú controlando excepciones
        int opcion = 0;

        do {
            try {
                mostrarMenu();
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
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción incorrecta");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error. Has introducido una letra");

            }catch(NullPointerException e){
                System.out.println("Error. Hay posiciones nulas");
                
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Error. Posición fuera de rango");
                
            }catch(Exception e){
                System.out.println("Error desconocido");
                
                entrada.nextLine();
            }

        } while (opcion != 7);

    }

}
