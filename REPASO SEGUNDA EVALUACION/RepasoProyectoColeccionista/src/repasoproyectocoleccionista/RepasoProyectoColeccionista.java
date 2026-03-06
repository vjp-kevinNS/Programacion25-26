package repasoproyectocoleccionista;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Crearemos una clase Figura que tendrá como atributos: nombre, colección y
 * valor
 *
 * Crearemos un menú con las siguientes opciones:
 *
 * 1-Rellenar la vitrina de figuras (rellenar la matriz en orden celda por
 * celda) 
 * 2-Mostrar figuras de una colección en concreto 
 * 3-Mostrar figura mas valiosa 
 * 4-Salir del programa
 *
 * Crear un booleano que controle si hay o no figuras. Si las hay, lo pones a
 * true. Si no hay, muestras un mensaje.
 *
 * Hay que acordarse de controlar nulos, InputMismatchExcepcion,
 * IndexOutOfBoundsException, etc
 *
 * Crear matriz en main, no en otra clase como hice en el proyecto
 *
 * @author KevinNS
 */
public class RepasoProyectoColeccionista {

    public static void rellenarVitrina(Figura[][] nuevaFigura) {
        Scanner entrada = new Scanner(System.in);

        // Rellenamos la matriz celda por celda
        for (int i = 0; i < nuevaFigura.length; i++) {
            for (int j = 0; j < nuevaFigura[i].length; j++) {

                // Pedimos al usuario los datos de la figura
                System.out.println("Rellena la vitrina con tus figuras: ");
                System.out.println();
                System.out.println("¿Qué nombre tiene la figura?: ");
                String nombreFigura = entrada.nextLine();
                System.out.println("¿A qué colección pertenece la figura?");
                String coleccFigura = entrada.nextLine();
                System.out.println("¿Qúe precio tiene la figura?");
                float precioFigura = entrada.nextFloat();
                entrada.nextLine();

                // Creamos un objeto de figura en la posición actual
                nuevaFigura[i][j] = new Figura(nombreFigura, coleccFigura, precioFigura);

            }

        }

    }

    public static void mostrarFigurasColeccion(Figura[][] nuevaFigura) {
        Scanner entrada = new Scanner(System.in);
        // Preguntamos al usuario que colección quiere mostrar
        System.out.println("¿Qué colección quieres mostrar?: ");
        String coleccion = entrada.nextLine();

        // Recorremos la matriz
        for (int i = 0; i < nuevaFigura.length; i++) {
            for (int j = 0; j < nuevaFigura[i].length; j++) {

                // Guardamos la figura
                Figura figuraActual = nuevaFigura[i][j];

                // Controlamos que no sea nulo
                if (figuraActual != null) {

                    if (figuraActual.getColeccion().equalsIgnoreCase(coleccion)) {
                        System.out.println("Figura " + figuraActual
                                + " | Posición -> " + i + " " + j);

                    }

                }

            }

        }

    }

    public static void mostrarMasValiosa(Figura[][] nuevaFigura) {
        // Controlamos que no desborde
        try {

            // Creamos uin objeto de figura para guardar la mas valiosa
            Figura figuraValiosa = new Figura();

            // Recorremos la matriz
            for (int i = 0; i < nuevaFigura.length; i++) {
                for (int j = 0; j < nuevaFigura[i].length; j++) {

                    // Guardamos la figura
                    Figura figuraActual = nuevaFigura[i][j];

                    // Controlamos que no sea nulo
                    if (figuraActual != null) {

                        if (figuraActual.getValor() > figuraValiosa.getValor()) {
                            figuraValiosa = figuraActual;

                        }

                    }

                }

            }

            System.out.println("La figura más valiosa es: "
                    + figuraValiosa);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Posicion fuera de rango");
        }

    }

    public static void mostrarMenu() {
        System.out.println("--------------------------------------------------");
        System.out.println("---------------GESTION DE VITRINA-----------------");
        System.out.println("-----------1.Rellenar vitrina de figuras----------");
        System.out.println("---------2.Mostrar figuras de una colección-------");
        System.out.println("-----------3.Mostrar figura más valiosa-----------");
        System.out.println("--------------4.SALIR DEL PROGRAMA----------------");
        System.out.println("--------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Creamos la matriz de figura, que sera 3x3 (pondremos 1x1 para probar)
        Figura[][] miFigura = new Figura[1][2];

        // Creamos el menú controlando Input...
        int opcion = 0;
        do {
            mostrarMenu();
            opcion = entrada.nextInt();
            try {
                switch (opcion) {
                    case 1:
                        rellenarVitrina(miFigura);
                        break;
                    case 2:
                        mostrarFigurasColeccion(miFigura);
                        break;
                    case 3:
                        mostrarMasValiosa(miFigura);
                        break;
                    case 4:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción incorrecta");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error. Has introducido una letra");
            }

        } while (opcion != 4);
    }
}
