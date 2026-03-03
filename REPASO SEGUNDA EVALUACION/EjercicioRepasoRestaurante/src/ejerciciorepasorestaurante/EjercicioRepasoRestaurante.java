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
 * 1-Rellenar la carta (pedir al usuario que lo rellene)
 * 2-Mostrar la carta entera 
 * 3-Mostrar platos vegatarianos 
 * 4-Mostrar platos mas caros 
 * 5-Mostrar platos mas baratos 6-Mostrar plato con menos stock 
 * 7-Añadir stock y quitar stock
 *
 * @author KevinNS
 */
public class EjercicioRepasoRestaurante {

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
            System.out.println(carta.getPlatos()[i]);

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
            if (carta.getPlatos()[i].isVegetariano() == true) {
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
    }

    /**
     * Método que muestra los platos más baratos de los introducidos por el
     * usuario
     *
     * @param carta
     */
    public static void mostrarMasBaratos(Carta carta) {
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
    }

    /**
     * Método que muestra los platos con menos stock
     *
     * @param carta
     */
    public static void platoConMenosStock(Carta carta) {
        System.out.println("Mostrando los platos con menos stock: ");
        Plato platoMenosStock = new Plato("", true, 0); // Creamos un objeto de plato para ir guardando el que tenga menos stock

        //Recorremos los platos
        for (int i = 0; i < carta.getPlatos().length; i++) {

            if (carta.getPlatos()[i].getStock() < platoMenosStock.getStock()) {
                platoMenosStock = carta.getPlatos()[i];
            }
        }
        System.out.println("Los platos con menos stock son: " + platoMenosStock);
    }
    
    /**
     * Método que quita stock a los platos
     * @param carta 
     */
    public static void quitarStock(Carta carta) {
        System.out.println("Añadiendo o quitando stock...");

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
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Carta cartaRest = new Carta("La Cantina Restaurant");

        int opcion = 0;

        do {

            try {
                System.out.println("--------------------------------------------------");
                System.out.println("-------------#OPCIONES DEL RESTAURANTE#-----------");
                System.out.println("----------------1.Rellenar la carta---------------");
                System.out.println("--------------2.Mostrar la carta entera-----------");
                System.out.println("----------3.Mostrar platos vegetarianos-----------");
                System.out.println("------------4.Mostrar platos mas caros------------");
                System.out.println("------------5.Mostrar platos mas baratos----------");
                System.out.println("--------6.Mostrar platos con menos stock----------");
                System.out.println("----------7.Añadir stock y quitar stock-----------");
                System.out.println("--------------8.SALIR DEL PROGRAMA----------------");
                System.out.println("--------------------------------------------------");
                opcion = entrada.nextInt();

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
                        System.out.println("Saliendo del programa....");
                        break;
                    default:
                        System.out.println("Opción incorrecta.....");
                }

            } catch (InputMismatchException e) {
            }

        } while (opcion != 8);

    }

}

// FALTA AÑADIR MENSAJE INFORMATIVO DE LISTA VACIA
// BUSQUEDA DE PLATOS POR PALABRA(QUE CONTENGA LA PALABRA) EQUALS, ETC...
// ACTUALIZAR METODO QUITAR STOCK PARA QUE SEA PEDIR PLATO
// + CONTROL DE EXCEPCIONES
// NULOS Y DEMAS
// CONTROL DE PLATOS VEGETARIANOS
// HACER ALGO DE MATRICES(EN OTRO EJERCICIO)