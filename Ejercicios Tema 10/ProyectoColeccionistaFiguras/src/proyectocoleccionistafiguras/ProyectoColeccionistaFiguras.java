package proyectocoleccionistafiguras;

import java.util.Scanner; // Importamos Scanner

/**
 *
 * @author KevinNS
 */
public class ProyectoColeccionistaFiguras {

    /**
     * Método que rellena la vitrina de figuras con los datos que introduzca el
     * usuario
     *
     * @param figura
     */
    public static void rellenarFiguras(Vitrina figura) {
        Scanner entrada = new Scanner(System.in);
        // Creamos las variables que utilizaremos para pedir los datos de la figura
        int posicion;
        String nombrePersonaje;
        String coleccion;
        float valorPieza;

        // Pedimos la posición de la primera fila de la matriz
        System.out.println("En que hueco quieres poner la figura");
        posicion = entrada.nextInt();
        entrada.nextLine();
        
        // Pedimos al usuario los datos de la figura
        entrada.nextLine();
        System.out.println("¿Qúe nombre tiene la figura?");
        nombrePersonaje = entrada.nextLine();

        System.out.println("¿De que colección es la figura?");
        coleccion = entrada.nextLine();

        System.out.println("¿De que valor es la figura?");
        valorPieza = entrada.nextFloat();
        entrada.nextLine();
        
        // Creamos la figura
        Figura figuras = new Figura(nombrePersonaje, coleccion, valorPieza);

        // Guardamos la figura en la posicion que indique el usuario
        figura.getHuecoFigura()[posicion][posicion] = figuras;
    }

    /**
     * Método que pide al usuario una colección determinada y muestra las
     * figuras de dicha colección con su posición
     *
     * @param figura
     */
    public static void mostrarFiguraColeccion(Vitrina figura) {
        // Pedimos al usuario que introduzca la colección
        Scanner entrada = new Scanner(System.in);
        System.out.println("De que colección quieres buscar?");
        String coleccion = entrada.nextLine();

        // Recorremos las filas y columnas
        for (int i = 0; i < figura.getHuecoFigura().length; i++) {
            for (int j = 0; j < figura.getHuecoFigura().length; j++) {

                // Guardamos la figura
                Figura figuras = figura.getHuecoFigura()[i][j];

                // Si no es null mostramos la figura y la colección introducida
                if ((figuras != null) && (figuras.getColeccion().equalsIgnoreCase(coleccion))) {
                    System.out.println("Figura del hueco de la vitrina "
                            + i + j + " de esa colección -> " + figuras);
                }
            }
        }
    }

    /**
     * Método que muestra la figura más valiosa
     *
     * @param figura
     */
    public static void mostrarMasValiosa(Vitrina figura) {
        Figura figuraValiosa = new Figura();

        // Recorremos las filas y columnas
        for (int i = 0; i < figura.getHuecoFigura().length; i++) {
            for (int j = 0; j < figura.getHuecoFigura().length; j++) {

                // Guardamos la figura
                Figura figuras = figura.getHuecoFigura()[i][j];

                // Si no es null la mostramos y la guardamos si es más valiosa que la anterior
                if ((figuras != null) && (figuras.getValorPieza() > figuraValiosa.getValorPieza())) {
                    figuraValiosa = figuras;
                }

            }

        }

        System.out.println("La figura mas valiosa es: " + figuraValiosa);

    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Creamos la matriz de vitrina y figura
        Vitrina figura = new Vitrina();

        // Creamos el menú con las opciones que puede elegir el usuario
        int opcion;

        do {
            System.out.println("----------ELIJA UNA OPCION DEL MENU-----------");
            System.out.println("------1.Rellenar la vitrina de figuras--------");
            System.out.println("------2.Mostrar figuras de una colección------");
            System.out.println("------3.Mostrar figura más valiosa------------");
            System.out.println("------------4.SALIR DEL PROGRAMA--------------");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    rellenarFiguras(figura);
                    break;
                case 2:
                    mostrarFiguraColeccion(figura);
                    break;
                case 3:
                    mostrarMasValiosa(figura);
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("OPCION INCORRECTA");
            }

        } while (opcion != 4);
    }

}
