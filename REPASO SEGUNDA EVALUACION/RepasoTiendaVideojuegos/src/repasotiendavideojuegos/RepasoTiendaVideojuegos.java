package repasotiendavideojuegos;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Crearemos una clase Videojuego que tendrá como atributos: nombre, plataforma
 * y precio.
 *
 * Crearemos una matriz que representará una tienda de videojuegos.
 *
 * Crearemos un menú con las siguientes opciones:
 *
 * 1- Rellenar la tienda de videojuegos (rellenar la matriz en orden celda por
 * celda).
 *
 * 2- Mostrar los videojuegos de una plataforma concreta.
 *
 * 3- Mostrar el videojuego más caro.
 *
 * 4- Mostrar videojuegos que contengan una palabra o letra en su nombre.
 *
 * 5- Eliminar todos los videojuegos de una plataforma concreta.
 *
 * 6- Mostrar el precio medio de todos los videojuegos.
 *
 * 7- Contar cuántos videojuegos hay de una plataforma concreta.
 *
 * 8- Salir del programa.
 *
 * @author KevinNS
 */
public class RepasoTiendaVideojuegos {

    public static void rellenarTiendaJuegos(Videojuego[][] nuevoVidejuego) {
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < nuevoVidejuego.length; i++) {
            for (int j = 0; j < nuevoVidejuego[i].length; j++) {

                System.out.println("Introduce los datos del juego: ");
                System.out.println("");
                System.out.println("¿Què nombre tiene el juego?: ");
                String nombre = entrada.nextLine();
                System.out.println("¿De qué plataformas es?: ");
                String plataforma = entrada.nextLine();
                System.out.println("¿Què precio tiene?: ");
                float precio = entrada.nextFloat();
                entrada.nextLine();

                nuevoVidejuego[i][j] = new Videojuego(nombre, plataforma, precio);
            }

        }

    }

    public static void mostrarJuegosPlataforma(Videojuego[][] nuevoVidejuego) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿De qué plataforma quieres mostrar el juego?");
        String plataforma = entrada.nextLine();
  
        boolean hayJuego = false;
        
        for (int i = 0; i < nuevoVidejuego.length; i++) {
            for (int j = 0; j < nuevoVidejuego[i].length; j++) {
                
                
                if (nuevoVidejuego[i][j] != null) {

                    if (nuevoVidejuego[i][j].getPlataforma().contains(plataforma)) {
                        System.out.println("Plataforma: " + plataforma + " "
                                + nuevoVidejuego[i][j]);
                        hayJuego = true;
                    }
                }

            }
        }
        if (hayJuego == false) {
            System.out.println("No hay juegos");
        }
    }

    public static void mostrarMasCaro(Videojuego[][] nuevoVidejuego) {
        Videojuego juegoMasCaro = new Videojuego("", "", 0);

        for (int i = 0; i < nuevoVidejuego.length; i++) {
            for (int j = 0; j < nuevoVidejuego[i].length; j++) {

                if (nuevoVidejuego[i][j] != null) {

                    if (nuevoVidejuego[i][j].getPrecio() > juegoMasCaro.getPrecio()) {
                        juegoMasCaro = nuevoVidejuego[i][j];
                    }
                }

            }

        }
        System.out.println("El juego mas caro es: " + juegoMasCaro);
    }

    public static void mostrarJuegoConPlabraOLetra(Videojuego[][] nuevoVidejuego) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Qué palabra/letra lleva el juego que quieres mostrar?: ");
        String letraOPalaUsu = entrada.nextLine();
        int contador = 0;

        for (int i = 0; i < nuevoVidejuego.length; i++) {
            for (int j = 0; j < nuevoVidejuego[i].length; j++) {

                if (nuevoVidejuego[i][j] != null) {

                    if (nuevoVidejuego[i][j].getNombre().contains(letraOPalaUsu)) {
                        System.out.println("Palabra/letra elejida por el usuario "
                                + letraOPalaUsu + " del juego" + nuevoVidejuego[i][j]);
                        contador++;
                    }
                }

            }

        }
        if (contador > 0) {
            System.out.println("Con la palabra " + letraOPalaUsu + " hemos encontrado "
                    + contador + " juegos");
        } else {
            System.out.println("No se ha encontrado ningún juego");
        }

    }

    public static void eliminarJuegosPlataforma(Videojuego[][] nuevoVidejuego) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Què plataforma (y todos sus juegos) quieres eliminar?");
        String plataUsu = entrada.nextLine();
        
        int contador = 0;
        
        for (int i = 0; i < nuevoVidejuego.length; i++) {
            for (int j = 0; j < nuevoVidejuego[i].length; j++) {
                
                if (nuevoVidejuego[i][j] != null) {
                    
                    if (nuevoVidejuego[i][j].getPlataforma().equalsIgnoreCase(plataUsu)) {
                        System.out.println("Se va a eliminar el siguiente juegos: " + nuevoVidejuego[i][j]);
                        nuevoVidejuego[i][j] = null;
                        contador++;
                        
                    }
                }
                
            }
            
        }
        if (contador > 0) {
            System.out.println("Se han eliminado: " + contador + " juegos");
        }

    }

    public static void mostrarPrecioMedio(Videojuego[][] nuevoVidejuego) {
        float media= 0;
        int contador = 0;
        
        for (int i = 0; i < nuevoVidejuego.length; i++) {
            for (int j = 0; j < nuevoVidejuego[i].length; j++) {
                
                if (nuevoVidejuego[i][j] != null) {
                    
                    media = media + nuevoVidejuego[i][j].getPrecio();
                    contador++;
                }
                                
            }
            
        }
        media = media / contador;
        System.out.println("La media del precio de todos los juegos: " + media);
    }

    public static void contarJuegosPlataforma(Videojuego[][] nuevoVidejuego) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Qúe plataforma quieres contar?: ");
        String plataUsu = entrada.nextLine();
        
        int contador = 0;
        
        for (int i = 0; i < nuevoVidejuego.length; i++) {
            for (int j = 0; j < nuevoVidejuego[i].length; j++) {
                
                if (nuevoVidejuego[i][j] != null) {
                    
                    if (nuevoVidejuego[i][j].getPlataforma().equalsIgnoreCase(plataUsu)) {
                        contador++;
                    }
                }
                
            }
            
        }
        System.out.println("De la plataforma " + plataUsu + " hay " + contador 
                + " juegos");
    }

    /**
     * Método que muestra el menú al usuario
     */
    public static void mostrarMenu() {
        System.out.println("--------------------------------------------------");
        System.out.println("-----------------GESTION DE TIENDA----------------");
        System.out.println("------------1.Rellenar tienda de juegos-----------");
        System.out.println("-------2.Mostrar juegos de una plataforma---------");
        System.out.println("--------------3.Mostrar juego más caro------------");
        System.out.println("--------4.Mostrar juego con palabra/letra---------");
        System.out.println("--5.Eliminar todos los juegos de una plataforma---");
        System.out.println("----6.Mostrar precio medio de todos los juegos----");
        System.out.println("---------7.Contar juegos de una plataforma--------");
        System.out.println("--------------8.SALIR DEL PROGRAMA----------------");
        System.out.println("--------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Creamos una matriz de videojuego
        Videojuego[][] nuevoVidejuego = new Videojuego[1][2];

        // Creamos el menu controlando InputMi...
        int opcion = 0;

        do {
            mostrarMenu();
            opcion = entrada.nextInt();
            try {
                switch (opcion) {
                    case 1:
                        rellenarTiendaJuegos(nuevoVidejuego);
                        break;
                    case 2:
                        mostrarJuegosPlataforma(nuevoVidejuego);
                        break;
                    case 3:
                        mostrarMasCaro(nuevoVidejuego);
                        break;
                    case 4:
                        mostrarJuegoConPlabraOLetra(nuevoVidejuego);
                        break;
                    case 5:
                        eliminarJuegosPlataforma(nuevoVidejuego);
                        break;
                    case 6:
                        mostrarPrecioMedio(nuevoVidejuego);
                        break;
                    case 7:
                        contarJuegosPlataforma(nuevoVidejuego);
                        break;
                    case 8:
                        System.out.println("Saliendo del programa....");
                        break;
                    default:
                        System.out.println("Opción incorrecta");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error. Has introducido una letra");
            }

        } while (opcion != 8);
    }

}
