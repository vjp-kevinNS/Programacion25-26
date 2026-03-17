package ejercicio1t11temperaturasmes;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Diseña programa que almacene las temperaturas medias de un mes. Para ello
 * crearemos una HashMap de 31 posiciones relleno, el campo Clave, con el número
 * del día, y el campo Valor con objetos de la clase Día.
 *
 * Hasta que el usuario pulse 5, mostrar un menú que nos permita:
 *
 * 1. Rellenar de forma aleatoria las temperaturas. Además el día 1 del mes no
 * tiene porqué ser un Lunes, será un día aleatorio de la semana.
 *
 * 2. Mostrar las temperaturas. Ejemplo: Jueves día 1: 40 grados, Viernes día 2:
 * 35 grados, Sábado día 3: 38 grados…
 *
 * 3. Visualizar la temperatura media del mes.
 *
 * 4. Día o días más calurosos del mes. Ejemplo: El día o días más calurosos
 * fueron: • El Jueves día 1 con 40 grados. • El Sábado día 18 con 40 grados.
 *
 * 5. Salir del programa.
 *
 * • Fíjate que necesitarás un array con el nombre de los días de la semana.
 *
 * @author KevinNS
 */
public class Ejercicio1T11TemperaturasMes {

    /**
     * Método que rellena las temperaturas de cada día del mes con aleatorios
     *
     * @param mapa
     * @param diaSem
     */
    public static void rellenarMes(HashMap<Integer, Dia> mapa, String[] diaSem) {
        mapa.clear(); // Borramos datos anteriores para empezar de 0
        // Elegimos un número al azar entre 0 y 6 para el primer día del mes
        int indiceSemana = (int) (Math.random() * 7);

        // Recorrenos los 31 día del mes
        for (int i = 0; i <= 31; i++) {
            // Generamos una temp aleatoria entra 10 y 45 grados
            int temp = (int) (Math.random() * 36) + 10;

            // Guardamos en el HashMap: i es la Clave y el objeto Dia es el valor
            mapa.put(i, new Dia(diaSem[indiceSemana], temp));

            // Avanzamos al siguiente día de la semana
            indiceSemana = (indiceSemana + 1) % 7;

        }
        System.out.println("Mes rellenado con éxito");
    }

    /**
     * Método que muestra el día y la temperatura que ha echo
     *
     * @param mapa
     */
    public static void mostrarMes(HashMap<Integer, Dia> mapa) {
        if (mapa.isEmpty()) { // Si no hay datos, salimos
            return;
        }
        for (int i = 0; i <= 31; i++) {
            // Sacamos el objeto del mapa usando la clave (el número del día)
            Dia dia = mapa.get(i);
            System.out.println(dia.getNombreDia() + " día " + i + ": "
                    + dia.getTemperatura() + " grados");
        }
    }

    /**
     * Método que muestra la temperatura media del mes
     *
     * @param mapa
     */
    public static void mostrarMedia(HashMap<Integer, Dia> mapa) {
        if (mapa.isEmpty()) { // Si no hay datos, salimos
            return;
        }
        float suma = 0;
        for (int i = 0; i <= 31; i++) {
            // Sumamos la temperatura de cada día accediendo al objeto valor
            suma += mapa.get(i).getTemperatura();
        }
        System.out.println("Temperatura media del mes: " + (suma / 31) + " grados");
    }

    /**
     * Método que muestra el mes más caluroso
     * 
     * @param mapa 
     */
    public static void buscarMaximos(HashMap<Integer, Dia> mapa) {
        if (mapa.isEmpty()) { // Si no hay datos, salimos
            return;
        }
        
        // Buscamos cuál es la temperatura más alta
        int max = -100;
        for (int i = 0; i <= 31; i++) {
            if (mapa.get(i).getTemperatura() > max) {
                max = mapa.get(i).getTemperatura();
            }
        }
        
        // Buscamos todos los días que tengan ese máximo(empates)
        int j = 1;
        while (j <= 31) {
            if (mapa.get(j).getTemperatura() == max) {
                System.out.println("El " + mapa.get(j).getNombreDia() + " día " 
                        + j + " con " + max + " grados" );
            }
            j++; // Incremento manual del índice
        }
    }

    /**
     * Método que muestra el menú
     */
    public static void mostrarMenu() {
        System.out.println("---------------------------------------------------");
        System.out.println("--------------GESTION DE TEMPERATURAS--------------");
        System.out.println("----------1. Rellenar aletoriamente temp-----------");
        System.out.println("----------2. Mostrar temperaturas------------------");
        System.out.println("----------3. Mostrar temperaturas medias mes-------");
        System.out.println("----------4. Día/Días mas calurosos/ss-...---------");
        System.out.println("----------5. SALIR DEL PROGRAMA--------------------");
        System.out.println("---------------------------------------------------");

    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Creamos el HasMap: La clave es el día (1-31) y el valor es el objeto día
        HashMap<Integer, Dia> mes = new HashMap<>();

        // Creamos el array con los nombre de la semana para poder rotarlos
        String[] semana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};

        // Creamos el menú controlando nulos
        int opcion = 0;

        do {
            try {
                mostrarMenu();
                opcion = entrada.nextInt();
                switch (opcion) {
                    case 1:
                        rellenarMes(mes, semana);
                        break;
                    case 2:
                        mostrarMes(mes);
                        break;
                    case 3:
                        mostrarMedia(mes);
                        break;
                    case 4:
                        buscarMaximos(mes);
                        break;
                    case 5:
                        System.out.println("Saliendo del programa");
                        break;
                    default:
                        System.out.println("Opción incorrecta");

                }

            } catch (InputMismatchException e) {
                System.out.println("Error. Has introducido una letras");
            }

        } while (opcion != 5);
    }

}
