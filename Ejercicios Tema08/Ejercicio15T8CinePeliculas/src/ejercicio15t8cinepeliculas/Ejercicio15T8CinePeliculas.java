package ejercicio15t8cinepeliculas;

import java.util.Scanner; // Importamos Scanner

/**
 * La Asociación “Nos gusta el cine” nos ha pedido que desarrollemos un software
 * antes de final de mes. En un principio desarrollaremos una primera versión
 * del software, donde la Asociación quiere almacenar las películas que
 * proyectan (utilizaremos un vector de películas) junto con los socios que
 * asisten a las proyecciones.
 *
 * De cada película almacenaremos su título, coste de la licencia y un vector de
 * socios, donde almacenaremos los socios que acuden a la proyección (en esa
 * primera versión, vamos a suponer que el aforo de la sala de proyección es de
 * 4).
 *
 * De los socios almacenaremos los siguientes datos: nombre y precio abonado (al
 * ser una Asociación, los socios aportan “la voluntad”).
 *
 * El menú del software tendrá las siguientes opciones: 
 * 1. Rellenar las películas junto con los socios que han acudido a verla. 
 * 2. Mostrar las películas y los socios que la han visto. 
 * 3. Mostrar película más rentable (el beneficio neto de una película será la 
 * venta de entradas menos el coste de la licencia). 
 * 4. Mostrar película menos rentable. 
 * 5. Pedir el nombre de una película y mostrar el beneficio neto y toda la 
 * información de los socios que han asistido a verla. 
 * 6. Contar el número de socios que han abonado una cantidad mayor a la pedida 
 * por pantalla. 
 * 7. Salir del programa. 
 * Hasta que el usuario no pulse 7 no saldremos del programa y se volverá a mostrar el menú.
 *
 * NOTA IMPORTANTE: El beneficio neto de una película será la venta de entradas
 * menos el coste de la licencia. Y RECUERDA: El programa principal debe ser un
 * "esquema" de lo que hace un programa
 *
 * @author KevinNS
 */
public class Ejercicio15T8CinePeliculas {

    /**
     * Método para rellenar los datos de las peliculas y los socios. Tiene dos
     * búcles, uno para rellenar los datos de las películas y otro para los
     * socios
     *
     * @param rellenar
     */
    public static void rellenarPeliculas(Pelicula[] rellenar) {
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < rellenar.length; i++) {
            System.out.println("---- DATOS DE LA PELICULA " + (i + 1) + " ----");
            System.out.println("Introduzca el título de la película: ");
            String tituloPeli = entrada.nextLine();
            System.out.println("Introduzca el coste de la licencia: ");
            double coste = entrada.nextDouble();
            entrada.nextLine();

            // Creamos el objeto Película en la posición i del array principal
            rellenar[i] = new Pelicula(tituloPeli, coste);

            // Bucle interno para los 4 socios de ésta película
            for (int j = 0; j < 4; j++) {
                System.out.println("---- DATOS DEL ASISTENTE " + (j + 1) + " ----");
                String nombreSocio = entrada.nextLine();
                System.out.println("¿Cúanto aporta?");
                double pago = entrada.nextDouble();
                entrada.nextLine();

                // Guardamos el socio en el array que está dentro de Película
                rellenar[i].getSocios()[j] = new Socio(nombreSocio, pago);
            }

        }
    }

    /**
     * Método que muestra los datos de las películas y los socios
     *
     * @param mostrar
     */
    public static void mostrarPeliYSocios(Pelicula[] mostrar) {
        for (Pelicula peliculaActual : mostrar) {
            if (peliculaActual != null) { // Solo si el hueco no está vacío
                System.out.println("Película " + peliculaActual.getTitulo());
                for (Socio socioActual : peliculaActual.getSocios()) {
                    if (socioActual != null) { // Solo si  el hueco no está vacío
                        System.out.println("El socio " + socioActual.getNombre()
                                + " aportó " + socioActual.getPrecioAbonado());
                    }
                }
            }
        }
    }

    /**
     * Método que busca la película mas rentable
     *
     * @param rentable
     */
    public static void peliMasRentable(Pelicula[] rentable) {
        // Empezamos comparando con la primera película del array
        Pelicula peliMasRentable = rentable[1];

        for (int i = 0; i < rentable.length; i++) {
            if (rentable != null) { // Solo si el hueco no está vacío
                // Comparamos el beneficio neto calculado por el método que creamso en Películas
                if (rentable[i].obtenerBeneficioNeto() > peliMasRentable.obtenerBeneficioNeto()) {
                    peliMasRentable = rentable[i];
                }
            }
        }
        // Imprimimos el resultado por pantalla
        System.out.println("La película más rentable es: " + peliMasRentable.getTitulo()
                + " con un beneficio de " + peliMasRentable.obtenerBeneficioNeto());
    }

    /**
     * Método que busca la película menos rentable
     *
     * @param rentable
     */
    public static void peliMenosRentable(Pelicula[] rentable) {
        // Empezamos comparando con la primera película del array
        Pelicula peliMenosRentable = rentable[1];

        for (int i = 0; i < rentable.length; i++) {
            if (rentable != null) { // Solo si el hueco no está vacío
                // Comparamos el beneficio neto calculado por el método que creamso en Películas
                if (rentable[i].obtenerBeneficioNeto() < peliMenosRentable.obtenerBeneficioNeto()) {
                    peliMenosRentable = rentable[i];
                }
            }
        }
        // Imprimimos el resultado por pantalla
        System.out.println("La película menos rentable es: " + peliMenosRentable.getTitulo()
                + " con un beneficio de " + peliMenosRentable.obtenerBeneficioNeto());
    }
    
    /**
     * Método que busca el la película introducida y muestra su beneficio neto
     * junto con la información de los socios que asistieron a verla
     * @param buscar 
     */
    public static void buscarPelicula(Pelicula[] buscar) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el título de la película a buscar: ");
        String nombrePeli = entrada.nextLine();
        // Creamos un bucle while hasta que hayamos mirado todos los huecos y no lo hayamos encontrado

        // Creamos las variables que usaremos en el bucle
        int i = 0;
        boolean peliEncontrada = false;

        while (i < buscar.length && peliEncontrada == false) {
            // Verificamos que el hueco actual no esté vacío
            if (buscar[i] != null) {

                // Sacamos el nombre de la película de esa posición usando el getter
                String nombrePeliEnEsaPosicion = buscar[i].getTitulo();
                // Comparamos los nombres ignorando mayúsculas y minúsculas
                if (nombrePeliEnEsaPosicion.equalsIgnoreCase(nombrePeli)) {
                    
                    // Calculamos y mostramos el beneficio neto
                    double beneficio = buscar[i].obtenerBeneficioNeto();
                    System.out.println("El beneficio neto de " + nombrePeliEnEsaPosicion 
                            + " es: " + beneficio + " Euros");
                    
                    // Mostramos toda la información de los socios
                    System.out.println("---- Listado de socios ----");
                    
                    for (int j = 0; j < buscar[i].getSocios().length; j++) {
                        // Accedemos al socio de la posición j
                        Socio socioActual = buscar[i].getSocios()[j];
                        
                        if (socioActual != null) { // Si no está el hueco vacío
                            System.out.println("Socio " + socioActual.getNombre() 
                                    + " | Aportó: " + socioActual.getPrecioAbonado() + " Euros");                          
                        }
                    }
                    
                    peliEncontrada = true; // Esto hará que el bucle se detenga
                }
            }
            // Miramos la siguiente posicion
            i = i + 1;
        }
        
        // Si al terminar el bucle la variable sigue siendo false, es que no estaba
        if (peliEncontrada == false) {
            System.out.println("La película " + nombrePeli + " no ha sido encontrada");
        }
    }
    
    /**
     * Método que muestra los socios que aprotan más de la cantidad introducida
     * @param abonan 
     */
    public static void sociosQueAbonanMas(Pelicula[] abonan) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce la cantidad mínima: ");
        double minima = entrada.nextDouble();
        int contador = 0;
        
        for (Pelicula pelicula : abonan) {
            if (pelicula != null) {
                for (Socio socio : pelicula.getSocios()) {
                    if (socio != null && socio.getPrecioAbonado() > minima) {
                        contador++;
                    }
                }
            }
            System.out.println("Socios que superan esa cantidad: " + contador);
        }

    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        // Creamos el array de películas (por ejemplo para 2 películas)
        Pelicula[] listaPeliculas = new Pelicula[2];
            
        // Creamos el menú
        int opcion;
        do {
            System.out.println("=============================================");
            System.out.println("======= ASOCIACION NOS GUSTA EL CINE ========");
            System.out.println("========= 1.Rellenar pelis y socios =========");
            System.out.println("============ 2.Mostrar listado ==============");
            System.out.println("======== 3.Ver película MAS rentable ========");
            System.out.println("======== 4.Ver película MENOS rentable ======");
            System.out.println("======= 5.Buscar detalle de una peli ========");
            System.out.println("====== 6.Contar socios que aportan mas ======");
            System.out.println("=========== 7. SALIR DEL PROGRAMA ===========");
            System.out.println("=============================================");
            opcion = entrada.nextInt();
            
            switch (opcion) {
                case 1:
                    rellenarPeliculas(listaPeliculas);
                    break;
                case 2:
                    mostrarPeliYSocios(listaPeliculas);
                    break;
                case 3:
                    peliMasRentable(listaPeliculas);
                    break;
                case 4:
                    peliMenosRentable(listaPeliculas);
                    break;
                case 5:
                    buscarPelicula(listaPeliculas);
                    break;
                case 6:
                    sociosQueAbonanMas(listaPeliculas);
                    break;
                case 7:
                    System.out.println("Saliendo del programa....");
                    break;
                default:
                    System.out.println("Opción no válida");
            }           
        } while (opcion != 7);
    }
    
}
