package repasorestauranterepeticion;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase Plato (String nombre, boolean vegetariano, int stock , float precio)
 *
 * Clase Restaurante (String nombre, Plato[] platos)
 *
 * 1- Rellenar Toda la carta
 *
 * 2- Rellenar Carta en posición indicada por el usuario
 *
 * 3- Borrar Plato de la Carta (pedir el índice)
 *
 * 4- Mostrar toda la carta
 *
 * 5- Mostrar platos vegetariano
 *
 * 6- Mostrar plato pedido por el usuario (pedir nombre y buscar por nombre)
 * (importante usar el bucle apropiado)
 *
 * 7- Mostrar el plato con mas stock
 *
 * 8- Mostrar el plato con menos stock
 *
 * 9- Mostrar el plato mas caro
 *
 * 10- Mostrar el plato mas barato
 *
 * 11- Pedir plato (pedir al usuario el INDICE del plato y bajarle 1 el stock)
 *
 * 12- Reestablecer stock(pedir al usuario el INDICE del plato y decirle cuanto
 * stock quieres sumarle)
 *
 * IMPORTANT: control de excepciones y nulos
 *
 * @author KevinNS
 */
public class RepasoRestauranteRepeticion {

    /**
     * Método que rellena toda la carta pidiendo los datos del plato al usuario
     *
     * @param miCarta
     */
    public static void rellenarTodaCarta(Restaurante miCarta) {
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < miCarta.getPlato().length; i++) {

            // Pedimos al usuario los datos del plato
            System.out.println("Nombre del plato: ");
            String nombrePlato = entrada.nextLine();
            System.out.println("¿Cuánto stock tiene?: ");
            int stockPlato = entrada.nextInt();
            System.out.println("¿Qué precio tiene?: ");
            float precioPlato = entrada.nextFloat();
            System.out.println("¿Es un plato vegetariano? true/false: ");
            boolean platoVegetariano = entrada.nextBoolean();
            entrada.nextLine();

            // Creamos el objeto plato con los datos introducidos
            Plato platoUsu = new Plato(nombrePlato, platoVegetariano, stockPlato, precioPlato);

            // Añadimos el plato al array
            miCarta.getPlato()[i] = platoUsu;

        }

    }

    /**
     * Método que rellena toda la carta pidiendo los datos del plato al usuario
     * y además pide también la posición
     *
     * @param miCarta
     */
    public static void rellenarCartaPosicion(Restaurante miCarta) {
        Scanner entrada = new Scanner(System.in);

        // Creamos un try catch para controlar el desborde 
        try {
            // Pedimos al usuario que introduzca la posición
            System.out.println("Indica la fila: ");
            int filaUsu = entrada.nextInt();

            // Pedimos al usuario los datos del plato
            System.out.println("Nombre del plato: ");
            String nombrePlato = entrada.nextLine();
            System.out.println("¿Cuánto stock tiene?: ");
            int stockPlato = entrada.nextInt();
            System.out.println("¿Qué precio tiene?: ");
            float precioPlato = entrada.nextFloat();
            System.out.println("¿Es un plato vegetariano? true/false: ");
            boolean platoVegetariano = entrada.nextBoolean();

            // Creamos el objeto plato con los datos introducidos
            Plato platoUsu = new Plato(nombrePlato, platoVegetariano, stockPlato, precioPlato);

            // Añadimos el plato del usuario a la posición indicada
            miCarta.getPlato()[filaUsu] = platoUsu;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error. Posición fuera de rango");
        }

    }

    /**
     * Método que borra una posición que introduzca el usuario y con ello el
     * plato que contenía
     *
     * @param miCarta
     */
    public static void borrarPlato(Restaurante miCarta) {
        Scanner entrada = new Scanner(System.in);

        // Pedimos al usuario la posición del plato que quiere borrar
        System.out.println("¿Qué posición quieres borrar?: ");
        int posición = entrada.nextInt();

        if (miCarta.getPlato()[posición] != null) {

            System.out.println("Plato " + miCarta.getPlato()[posición]
                    + " en la posición " + posición);

            miCarta.getPlato()[posición] = null;

            System.out.println("Se ha borrado la posición " + posición);

        } else {
            System.out.println("En ésta posición no hay ningún plato que mostrar");
        }

    }

    /**
     * Método que muestra la carta de platos
     *
     * @param miCarta
     */
    public static void mostrarCarta(Restaurante miCarta) {
        // Recorremos el array
        for (int i = 0; i < miCarta.getPlato().length; i++) {

            if (miCarta.getPlato()[i] != null) { // Controlamos nulos

                // Simplemente los mostramos
                System.out.println("Mostrando la carta: " + miCarta.getPlato()[i]);
            }
        }

    }

    /**
     * Método que muestras los platos vegetarianos
     *
     * @param miCarta
     */
    public static void mostrarVegetarianos(Restaurante miCarta) {

        int contador = 0; // Para mostrar cuántos platos vegetarianos hay
        //Recorremos el array
        for (int i = 0; i < miCarta.getPlato().length; i++) {

            if (miCarta.getPlato()[i] != null) { //Controlamos nulos

                // Si el plato es vegetariano es true, lo mostramos
                if (miCarta.getPlato()[i].isVegetariano() == true) {
                    System.out.println("Platos vegetarianos: " + miCarta.getPlato()[i].getNombre());
                    contador++; // Incrementamos el contador
                }

            }

        }
        // Mostramos el total de platos vegetarianos
        if (contador > 0) {
            System.out.println("Total de platos vegetarianos: " + contador);
        }

    }

    /**
     * Método que muestra el plato elegido por el usuario
     *
     * @param miCarta
     */
    public static void mostrarPlatoUusario(Restaurante miCarta) {
        Scanner entrada = new Scanner(System.in);

        //Pedimos al usuario el plato que quiera mostrar
        System.out.println("¿Qué plato quieres mostrar?: ");
        String platoUsu = entrada.nextLine();

        // Recorremos el array
        for (int i = 0; i < miCarta.getPlato().length; i++) {

            if (miCarta.getPlato()[i] != null) {

                if (miCarta.getPlato()[i].getNombre().equalsIgnoreCase(platoUsu)) {
                    System.out.println("Mostrando plato elegido por el usuario: "
                            + miCarta.getPlato()[i]);
                }
            }

        }

    }

    /**
     * Método que muestra el plato con más stock
     *
     * @param miCarta
     */
    public static void mostrarMasStock(Restaurante miCarta) {
        // RECORDAR!!!! CREAMOS UN OBJETO PLATO
        Plato masStock = new Plato("", true, 0, 0);

        // Recorremos el array
        for (int i = 0; i < miCarta.getPlato().length; i++) {

            if (miCarta.getPlato()[i] != null) {

                // Comparamos el stock que teniamos con la variable que hemos creado
                if (miCarta.getPlato()[i].getStock() > masStock.getStock()) {
                    masStock = miCarta.getPlato()[i];
                }
            }
        }
        System.out.println("El plato con más stock es: " + masStock);
    }

    /**
     * Método que muestra el plato con más stock
     *
     * @param miCarta
     */
    public static void mostrarMenosStock(Restaurante miCarta) {
        // RECORDAR!!!! CREAMOS UN OBJETO PLATO
        Plato menosStock = new Plato("", true, 0, 0);

        // Recorremos el array
        for (int i = 0; i < miCarta.getPlato().length; i++) {

            if (miCarta.getPlato()[i] != null) {

                // Comparamos el stock que teniamos con la variable que hemos creado
                if (miCarta.getPlato()[i].getStock() < menosStock.getStock()) {
                    menosStock = miCarta.getPlato()[i];
                }
            }
        }
        System.out.println("El plato con más stock es: " + menosStock);
    }

    /**
     * Método que muestra el plato más caro
     * 
     * @param miCarta 
     */    
    public static void mostrarMasCaro(Restaurante miCarta) {
        // Creamos un objeto plato
        Plato masCaro = new Plato("", true, 0, 0);

        // Recorremos el array
        for (int i = 0; i < miCarta.getPlato().length; i++) {

            if (miCarta.getPlato()[i] != null) { // Controlamos nulos

                if (miCarta.getPlato()[i].getPrecio() > masCaro.getPrecio()) {
                    masCaro = miCarta.getPlato()[i];
                }

            }

        }
        System.out.println("El plato mas caro es: " + masCaro);
    }

    /**
     * Método que muestra el plato más barato
     * 
     * @param miCarta 
     */    
    public static void mostrarMasBarato(Restaurante miCarta) {
        // Creamos un objeto plato
        Plato masBarato = new Plato("", true, 0, 0);

        // Recorremos el array
        for (int i = 0; i < miCarta.getPlato().length; i++) {

            if (miCarta.getPlato()[i] != null) { // Controlamos nulos

                if (miCarta.getPlato()[i].getPrecio() < masBarato.getPrecio()) {
                    masBarato = miCarta.getPlato()[i];
                }

            }

        }
        System.out.println("El plato mas caro es: " + masBarato);

    }

    /**
     * Método pide al usuario el INDICE del plato y baja 1 el stock
     *
     * @param miCarta
     */
    public static void pedirPlato(Restaurante miCarta) {
        Scanner entrada = new Scanner(System.in);

        // Pedimos la posición del plato al usuario
        System.out.println("¿Qué posición del plato quieres pedir?: ");
        int posicionUsu = entrada.nextInt();

        if (miCarta.getPlato()[posicionUsu] != null) { // Controlamos nulos

            // Guardamos en una variable el stock actual y restamos uno
            int stockActual = miCarta.getPlato()[posicionUsu].getStock();
            stockActual--;

            // Usamos el set para obtener el valor
            miCarta.getPlato()[posicionUsu].setStock(stockActual);
            System.out.println("Actualizado " + miCarta.getPlato()[posicionUsu]);

        } else {
            System.out.println("No hay ningún plato en esa posición");
        }
    }

    /**
     * Método que restablece el stock de un plato
     *
     * @param miCarta
     */
    public static void restablecerStock(Restaurante miCarta) {
        Scanner entrada = new Scanner(System.in);

        // Recorremos el array
        for (int i = 0; i < miCarta.getPlato().length; i++) {

            if (miCarta.getPlato()[i] != null) { // Controlamos nulos

                // Pedimos al usuario el plato y el stock actual
                System.out.println("¿Cuánto stock quieres añadir a los platos?: " + miCarta.getPlato()[i]
                        + " | Stock actual: " + miCarta.getPlato()[i].getStock());
                int sumarStock = entrada.nextInt();

                // Sumamos el stock introducido por el usuario al stock actual
                sumarStock += miCarta.getPlato()[i].getStock();

                // Ahora seteamos el nuevo valor (actualizamos el stock)
                miCarta.getPlato()[i].setStock(sumarStock);
            }

        }

    }

    /**
     * Método que muestra el menú al usuario
     */
    public static void mostrarMenu() {
        System.out.println("--------------------------------------------------");
        System.out.println("----------------GESTION DE VIDEOCLUB--------------");
        System.out.println("--------------1.Rellenar Toda la carta------------");
        System.out.println("------2.Rellenar carta indicando posición---------");
        System.out.println("------------3.Borrar Plato de la Carta------------");
        System.out.println("--------------4.Mostrar toda la carta-------------");
        System.out.println("------------5.Mostrar platos vegetariano----------");
        System.out.println("-------6.Mostrar plato pedido por el usuario------");
        System.out.println("---------7.Mostrar el plato con mas stock---------");
        System.out.println("---------8.Mostrar el plato con menos stock-------");
        System.out.println("-------------9.Mostrar el plato mas caro----------");
        System.out.println("----------10. Mostrar el plato mas barato---------");
        System.out.println("-----------------11.Pedir plato-------------------");
        System.out.println("--------------12.Reestablecer stock---------------");
        System.out.println("--------------13.SALIR DEL PROGRAMA---------------");
        System.out.println("--------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Creamos el objeto de restaurante
        Restaurante miCarta = new Restaurante();

        // Creamos el menu controlando excepciones
        int opcion = 0;
        do {
            mostrarMenu();
            opcion = entrada.nextInt();
            try {
                switch (opcion) {
                    case 1:
                        rellenarTodaCarta(miCarta);
                        break;
                    case 2:
                        rellenarCartaPosicion(miCarta);
                        break;
                    case 3:
                        borrarPlato(miCarta);
                        break;
                    case 4:
                        mostrarCarta(miCarta);
                        break;
                    case 5:
                        mostrarVegetarianos(miCarta);
                        break;
                    case 6:
                        mostrarPlatoUusario(miCarta);
                        break;
                    case 7:
                        mostrarMasStock(miCarta);
                        break;
                    case 8:
                        mostrarMenosStock(miCarta);
                        break;
                    case 9:
                        mostrarMasCaro(miCarta);
                        break;
                    case 10:
                        mostrarMasBarato(miCarta);
                        break;
                    case 11:
                        pedirPlato(miCarta);
                        break;
                    case 12:
                        restablecerStock(miCarta);
                        break;
                    case 13:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción incorrecta");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error. Has introducido una letra");
            }

        } while (opcion != 13);
    }

}
