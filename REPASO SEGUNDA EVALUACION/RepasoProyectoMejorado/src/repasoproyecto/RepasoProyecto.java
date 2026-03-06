package repasoproyecto;

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
 * 4-Mostrar figura que contenga una palabra o letra
 * 5-Eliminar una colección 
 * 6-Salir del programa
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
public class RepasoProyecto {
    
    /**
     * Método que rellena la vitrina de figuras con los datos que proporciona el
     * usuario
     * 
     * @param nuevaFigura 
     */
    public static void rellenarVitrina(Figura[][] nuevaFigura) {
        Scanner entrada = new Scanner(System.in);
        
        // Por si nos piden que introduzca el usuario la posición
        // En este caso si seria necesario un try catch controlando que no desborde la matriz o array
//        int i = 0;
//        int j = 0;
//        System.out.println("Introduce la fila");
//        i = entrada.nextInt();
//        System.out.println("Introduce la columna");
//        j = entrada.nextInt()
                
        // Recorremos la matriz
        for (int i = 0; i < nuevaFigura.length; i++) {
            for (int j = 0; j < nuevaFigura[i].length; j++) {
                
                // Pedimos al usuario que introduzca los datos de las figuras
                System.out.println("Introduce los datos de las figuras ");
                System.out.println();
                System.out.println("¿Qué nombre tiene la figura?: ");
                String nombreFigura = entrada.nextLine();
                System.out.println("¿A qué colección pertenece la figura?: ");
                String coleccFigura = entrada.nextLine();
                System.out.println("¿Cuál es el valor de la figura?: ");
                float valorFigura = entrada.nextFloat();
                entrada.nextLine();
                
                // Creamos el objeto de figura con los datos introducidos
                nuevaFigura[i][j] = new Figura(nombreFigura, coleccFigura, valorFigura);
            }
            
        }
        
    }
    
    /**
     * Método que muestra las figuras de una coleccion elejida por el usuario
     * 
     * @param nuevaFigura 
     */
    public static void mostrarFigurasDeUnaColeccion(Figura[][] nuevaFigura) {
        Scanner entrada = new Scanner(System.in);
        
        // Preguntamos al usuario que colección quiere mostrar
        System.out.println("¿Qué colección quieres mostrar?: ");
        String coleccUsuario = entrada.nextLine();
        
        // Creamos un booleano incialmente en false
        boolean hayFigura = false;
        
        // Recorremos la matriz
        for (int i = 0; i < nuevaFigura.length; i++) {
            for (int j = 0; j < nuevaFigura[i].length; j++) {
                
                if (nuevaFigura != null) { // Controlamos que esté vacío
                    
                    if (nuevaFigura[i][j].getColeccion().equalsIgnoreCase(coleccUsuario)) {
                        System.out.println(" | Nombre " + nuevaFigura[i][j] 
                                + " de la colección " + coleccUsuario);
                        hayFigura = true;
                    }
                }
                
            } 
        }
        if (hayFigura == false) {
            System.out.println("No se ha encontrado figuras en la colección");
        }
    }
    
    /**
     * Método que meustra la figura más valiosa
     * @param nuevaFigura 
     */
    public static void mostrarMasValiosa(Figura[][] nuevaFigura) {
        // Creamos una variable para usarla como figura mas valiosa
         Figura figuraMasValiosa = new Figura("", "", 0);
        
        // Recorremos la matriz
        for (int i = 0; i < nuevaFigura.length; i++) {
            for (int j = 0; j < nuevaFigura[i].length; j++) {
                
                if (nuevaFigura != null) {
                    
                    if (nuevaFigura[i][j].getValor() > figuraMasValiosa.getValor()) {
                        figuraMasValiosa = nuevaFigura[i][j];
                    }
                }
            }
            
        }
        System.out.println("La figura mas valiosa: " + figuraMasValiosa);
    }
    
    /**
     * Método que muestra la figura con la letra o palabra introducida por el
     * usuario
     * 
     * @param nuevaFigura 
     */
    public static void figuraConPalabraOLetra(Figura[][] nuevaFigura) {
        Scanner entrada = new Scanner(System.in);
        
        // Pedimos al usuario la letra o palabra de la figura que quiera mostrar
        System.out.println("¿Què palabra o letra lleva la figura que quieres encontrar?: ");
        String palabraOLetraUsuario = entrada.nextLine();
        
        // Recorremos la matriz
        for (int i = 0; i < nuevaFigura.length; i++) {
            for (int j = 0; j < nuevaFigura[i].length; j++) {
                
                if (nuevaFigura != null) {
                    
                    if (nuevaFigura[i][j].getNombre().contains(palabraOLetraUsuario)) {
                        System.out.println("La palabra o letra elegida por el usuario " 
                                + palabraOLetraUsuario + " es la figura: " + nuevaFigura);
                    }
                }
                
            }
            
        }
    }
    
    /**
     * Método que eliminar una colección introducida por el usuario y sus 
     * correspondientes figuras
     * 
     * @param nuevaFigura 
     */
    public static void eliminarColeccion(Figura[][] nuevaFigura) {
        Scanner entrada = new Scanner(System.in);
        
        // Pedimos al usuario la colección que desea eliminar
        System.out.println("¿Qué colección deseas eliminar?: ");
        String eliminarColeccion = entrada.nextLine();
        
        // Creamos un contador para informar de cuantas figuras se eliminan al borrar esa colección
        int contador = 0;
        
        // Recorremos la matriz
        for (int i = 0; i < nuevaFigura.length; i++) {
            for (int j = 0; j < nuevaFigura[i].length; j++) {
                
                if (nuevaFigura != null) {
                    
                    if (nuevaFigura[i][j].getColeccion().equalsIgnoreCase(eliminarColeccion)) {
                        nuevaFigura[i][j] = null; // Lo ponemos a null para borrar una figura de la matriz
                        contador ++; // Contabilizamos el contador
                    }
                }
                
            }
            
        }
        // Mostramos un mensaje si se ha borrado algo o no
        if (contador > 0) {
            System.out.println("Se han borrado: " + contador + " figuras");
        }else{
            System.out.println("No se ha borrado ninguna figura");
        }
    }
    
    /**
     * Método que muestra el menú al usuario
     */
    public static void mostrarMenu() {
        System.out.println("--------------------------------------------------");
        System.out.println("---------------GESTION DE VITRINA-----------------");
        System.out.println("-----------1.Rellenar vitrina de figuras----------");
        System.out.println("---------2.Mostrar figuras de una colección-------");
        System.out.println("-----------3.Mostrar figura más valiosa-----------");
        System.out.println("-------4.Mostrar figura con palabra/letra---------");
        System.out.println("------------5.Eliminar una coleccion--------------");
        System.out.println("--------------6.SALIR DEL PROGRAMA----------------");
        System.out.println("--------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Creamos la matriz de figura que sera 3x3
        Figura[][] nuevaFigura = new Figura[1][3];

        // Creamos el menú controlando Input....
        int opcion = 0;

        do {
            mostrarMenu();
            opcion = entrada.nextInt();

            try {
                switch (opcion) {
                    case 1:
                        rellenarVitrina(nuevaFigura);
                        break;
                    case 2:
                        mostrarFigurasDeUnaColeccion(nuevaFigura);
                        break;
                    case 3:
                        mostrarMasValiosa(nuevaFigura);
                        break;
                    case 4:
                        figuraConPalabraOLetra(nuevaFigura);
                        break;
                    case 5:
                        eliminarColeccion(nuevaFigura);
                        break;
                    case 6:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción incorrecta");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error. Has introducido una letra");
            }

        } while (opcion != 6);
    }
}
