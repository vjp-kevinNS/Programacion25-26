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
 *
 * 1-Rellenar la carta (pedir al usuario que lo rellene) 2-Mostrar la carta
 * entera 3-Mostrar platos vegatarianos 4-Mostrar platos mas caros 5-Mostrar
 * platos mas baratos 6-Mostrar plato con menos stock 7-Quitar stock 8-Añadir
 * stock 9-Añadir plato en una posición específica 10-Eliminar plato de una
 * posición especifica (null) 11- Buscar platos que contengan una palabra
 *
 * @author KevinNS
 */
public class EjercicioRepasoRestaurante {

    /**
     * Método que muestra las opciones del menú al usuario
     */
    public static void mostrarMenu() {
        System.out.println("--------------------------------------------------");
        System.out.println("-------------#OPCIONES DEL RESTAURANTE#-----------");
        System.out.println("----------------1.Rellenar la carta---------------");
        System.out.println("--------------2.Mostrar la carta entera-----------");
        System.out.println("----------3.Mostrar platos vegetarianos-----------");
        System.out.println("------------4.Mostrar platos mas caros------------");
        System.out.println("------------5.Mostrar platos mas baratos----------");
        System.out.println("--------6.Mostrar platos con menos stock----------");
        System.out.println("------------------7.Quitar stock------------------");
        System.out.println("------------------8.Añadir stock------------------");
        System.out.println("--------9.Añadir plato en una posición------------");
        System.out.println("--------10.Eliminar plato de una posición---------");
        System.out.println("----11.Buscar plato que contenga palabra/letra----");
        System.out.println("-------------12.SALIR DEL PROGRAMA----------------");
        System.out.println("--------------------------------------------------");
    }

    /**
     * Método que pide al usuario los datos de los platos
     *
     * @param carta
     */
    public static void rellenarCarta(Carta carta) {
        Scanner entrada = new Scanner(System.in);
        // Recorremos el array
        for (int i = 0; i < carta.getPlatos().length; i++) {

            // Pedimos al usuario los datos
            System.out.println("Introduce la descripción del plato: ");
            String descPlato = entrada.nextLine();

            System.out.println("¿El plato es vegetariano? true/false: ");
            boolean vegetariano = entrada.nextBoolean();

            System.out.println("¿Cual es el precio del plato?: ");
            float precioPlato = entrada.nextFloat();

            // Añadimos un objeto plato a la carta
            Plato miPlato = new Plato(descPlato, vegetariano, precioPlato);

            // Añadimos el plato al array
            carta.getPlatos()[i] = miPlato;
            entrada.nextLine();
        }
    }

    /**
     * Método que muestra la carta con los datos introducidos por el usuario
     *
     * @param carta
     */
    public static void mostrarCarta(Carta carta) {
        // Mostramos al inicio la carta del restaurante(con el nombre del restaurante) 
        System.out.println("Plato de la carta de: " + carta.getNombre());

        // Recorremos el array con los platos
        for (int i = 0; i < carta.getPlatos().length; i++) {
            // Controlamos no se muestren platos nulos
            if (carta.getPlatos()[i] != null) {
                // Mostramos la posición del plato y el plato en cuestión
                System.out.println("Posición: " + (i + 1) + ": " + carta.getPlatos()[i]);

            }
        }
    }

    /**
     * Método que muestra solo los platos que son vegetarianos
     *
     * @param carta
     */
    public static void mostrarPlatosVegetarianos(Carta carta) {
        // Mostramos al inicio la carta del restaurante(con el nombre del restaurante) 
        System.out.println("Plato/s vegetariano de: " + carta.getNombre());
        // Recorremos el array con los platos
        for (int i = 0; i < carta.getPlatos().length; i++) {

            // Creamos un if para saber que platos de la carta son vegetarianos
            // y además controlamos que no se muestren platos nulos
            if (carta.getPlatos()[i] != null && carta.getPlatos()[i].isVegetariano() == true) {
                System.out.println(carta.getPlatos()[i]);
            }

        }
    }

    /**
     * Método que muestra los platos más caros de los introducidos por el
     * usuario
     *
     * @param carta
     */
    public static void mostrarMasCaros(Carta carta) {
        // Creamos un try catch para controlar NullPointerException
        try {
            System.out.println("Mostrando platos más caros de la carta...");
            Plato platoMasCaro = new Plato("", true, 0); // Creamos un objeto de plato para ir guardando el mas caro

            // Recorremos la carta con los platos
            for (int i = 0; i < carta.getPlatos().length; i++) {

                // Creamos un if para saber que platos son mas caros y los vamos guardando
                if (carta.getPlatos()[i].getPrecio() > platoMasCaro.getPrecio()) {
                    platoMasCaro = carta.getPlatos()[i];
                }

            }
            System.out.println("El plato más caro es: " + platoMasCaro);

        } catch (NullPointerException e) {
            System.out.println("Hay platos vacíos en la carta");
        }
    }

    /**
     * Método que muestra los platos más baratos de los introducidos por el
     * usuario
     *
     * @param carta
     */
    public static void mostrarMasBaratos(Carta carta) {
        // Creamos un try catch para controlar NullPointerException
        try {
            System.out.println("Mostrando platos más baratos de la carta...");
            Plato platoMasBarato = new Plato("", true, 0); // Creamos un objeto de plato para ir guardando el mas caro

            // Recorremos la carta con los platos
            for (int i = 0; i < carta.getPlatos().length; i++) {

                // Creamos un if para saber que platos son mas caros y los vamos guardando
                if (carta.getPlatos()[i].getPrecio() < platoMasBarato.getPrecio()) {
                    platoMasBarato = carta.getPlatos()[i];
                }

            }
            System.out.println("El plato más barato es: " + platoMasBarato);

        } catch (NullPointerException e) {
            System.out.println("Hay platos vacíos en la carta");
        }
    }

    /**
     * Método que muestra los platos con menos stock
     *
     * @param carta
     */
    public static void platoConMenosStock(Carta carta) {
        // Creamos un try catch para controlar NullPointerException
        try {
            System.out.println("Mostrando los platos con menos stock: ");
            Plato platoMenosStock = new Plato("", true, 0); // Creamos un objeto de plato para ir guardando el que tenga menos stock

            //Recorremos los platos
            for (int i = 0; i < carta.getPlatos().length; i++) {

                if (carta.getPlatos()[i].getStock() < platoMenosStock.getStock()) {
                    platoMenosStock = carta.getPlatos()[i];
                }
            }
            System.out.println("Los platos con menos stock son: " + platoMenosStock);
        } catch (NullPointerException e) {
            System.out.println("Hay platos vacíos en la carta");
        }
    }

    /**
     * Método que quita stock a los platos (de uno en uno)
     *
     * @param carta
     */
    public static void quitarStock(Carta carta) {
        // Creamos un try catch para controlar NullPointerException
        try {
            System.out.println("Quitando stock...");

            // Recorremos los platos
            for (int i = 0; i < carta.getPlatos().length; i++) {
                // Guardamos en una variable el stock de cada plato
                int stockPlato = carta.getPlatos()[i].getStock();
                stockPlato--; // Aquí hemos restado 1 stock al plato

                // Ahora usamos set.Stock para actualizar el stock del plato
                carta.getPlatos()[i].setStock(stockPlato);
            }
            // LLamamos al método mostrar carta para ver que se ha actualizado el stock
            mostrarCarta(carta);

        } catch (NullPointerException e) {
            System.out.println("Hay platos vacíos en la carta");
        }
    }

    /**
     * Método que añade stock a los platos (de uno en uno)
     *
     * @param carta
     */
    public static void añadirStock(Carta carta) {
        // Creamos un try catch para controlar NullPointerException
        try {
            System.out.println("Añadiendo stock...");

            // Recorremos los platos
            for (int i = 0; i < carta.getPlatos().length; i++) {
                // Guardamos en una variable el stock de cada plato
                int stockPlato = carta.getPlatos()[i].getStock();
                stockPlato++; // Aquí hemos sumado 1 stock al plato

                // Ahora usamos set.Stock para actualizar el stock del plato
                carta.getPlatos()[i].setStock(stockPlato);
            }
            // LLamamos al método mostrar carta para ver que se ha actualizado el stock
            mostrarCarta(carta);

        } catch (NullPointerException e) {
            System.out.println("Hay platos vacíos en la carta");
        }
    }

    /**
     * Método que añade un plato a una posición específica
     *
     * @param carta
     */
    public static void añadirPlatoEnPosicion(Carta carta) {
        Scanner entrada = new Scanner(System.in);
        // En este caso añadimos un try catch para controlar ArrayIndexOutOfBoundsException
        try {
            // Pedimos al usuario los datos del plato 
            System.out.println("Añade un plato a la posición que quieras: ");

            System.out.println("Añade la descripción del plato: ");
            String nombrePlato = entrada.nextLine();

            System.out.println("¿El plato es vegetariano? true/false: ");
            boolean platoVegetariano = entrada.nextBoolean();

            System.out.println("¿Qué precio tiene el plato?: ");
            float precioPlato = entrada.nextFloat();

            // Creamos el plato
            Plato miPlato = new Plato(nombrePlato, platoVegetariano, precioPlato);

            // Creamos la variable i para preguntar al usuario en que posición quiere el plato
            int i = 0;
            System.out.println("¿En qué posición quieres añadir el plato?: ");
            i = entrada.nextInt();

            // Añadimos el plato al array
            carta.getPlatos()[i - 1] = miPlato;

            System.out.println(miPlato + " | Añadido en la posición: " + i);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Posición fuera del array");
        }
    }

    /**
     * Método que elimina un plato de una posición específica
     *
     * @param carta
     */
    public static void eliminarPlatoDePosicion(Carta carta) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Elimina un plato de la posición que quieras: ");
        System.out.println();
        System.out.println("¿Qué posición del plato quieres borrar?: ");
        System.out.println();
        // Mostramos la carta
        mostrarCarta(carta);

        int posicionUsuario = entrada.nextInt();
        // Añadimos la posición que ha elejido el usuario a carta.getPlatos y lo ponemos vacío
        carta.getPlatos()[posicionUsuario - 1] = null;
    }

    /**
     * Método que muestra el plato/os que contengan una palabra o letra, añadida
     * por el usuario
     *
     * @param carta
     */
    public static void mostrarPlatoQueContengaUnaPalabraOLetra(Carta carta) {
        Scanner entrada = new Scanner(System.in);
        // Controlamos con el try que la carta no esté vacía
        try {
            System.out.println("¿Qué palabra o letra tiene que contener el plato para mostrarse?");
            String letraOPalabraUusuario = entrada.nextLine();
            
            // Recorremos el array
            for (int i = 0; i < carta.getPlatos().length; i++) {
                if (carta.getPlatos()[i].getDescripcion().contains(letraOPalabraUusuario)) {
                    System.out.println(carta.getPlatos()[i]);
                }         
            }

        } catch (NullPointerException e) {
            System.out.println("Hay platos vacios en la carta");
        }

    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Carta cartaRest = new Carta("La Cantina Restaurant");

        int opcion = 0;

        do {
            mostrarMenu();
            opcion = entrada.nextInt();

            try {

                switch (opcion) {
                    case 1:
                        rellenarCarta(cartaRest);
                        break;
                    case 2:
                        mostrarCarta(cartaRest);
                        break;
                    case 3:
                        mostrarPlatosVegetarianos(cartaRest);
                        break;
                    case 4:
                        mostrarMasCaros(cartaRest);
                        break;
                    case 5:
                        mostrarMasBaratos(cartaRest);
                        break;
                    case 6:
                        platoConMenosStock(cartaRest);
                        break;
                    case 7:
                        quitarStock(cartaRest);
                        break;
                    case 8:
                        añadirStock(cartaRest);
                        break;
                    case 9:
                        añadirPlatoEnPosicion(cartaRest);
                        break;
                    case 10:
                        eliminarPlatoDePosicion(cartaRest);
                        break;
                    case 11:
                        mostrarPlatoQueContengaUnaPalabraOLetra(cartaRest);
                        break;
                    case 12:
                        System.out.println("Saliendo del programa....");
                        break;
                    default:
                        System.out.println("Opción incorrecta.....");
                }

            } catch (InputMismatchException e) {
            }

        } while (opcion != 12);

    }

}

