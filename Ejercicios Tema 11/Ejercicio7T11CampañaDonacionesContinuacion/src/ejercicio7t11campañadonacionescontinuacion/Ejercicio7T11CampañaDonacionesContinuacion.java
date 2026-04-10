package ejercicio7t11campañadonacionescontinuacion;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 * Vamos a crear ahora la versión beta del software anterior. En esta versión,
 * debemos gestionar las donaciones de varias campañas (no sabemos cuántas
 * habrá).
 *
 * Opciones de menú:
 *
 * 1. Añadir campaña (En esta opción SÓLO pediremos el nombre de la campaña).
 *
 * 2. Añadir donación (Las insertará de una en una y preguntaremos al usuario el
 * nombre de la campaña donde insertar la donación).
 *
 * 3. Mostrar campañas junto con donaciones.
 *
 * 4. Mostrar campaña por nombre(Pediremos un nombre y mostraremos la campaña
 * junto con las donaciones).
 *
 * 5. Mostrar total dinero recaudado.
 *
 * 6. Mostrar mayor donación.
 *
 * 7. Salir
 *
 * @author KevinNS
 */
public class Ejercicio7T11CampañaDonacionesContinuacion {

    /**
     * Método que muestra el menú
     */
    public static void mostrarMenu() {
        System.out.println("---------------------------------------------------");
        System.out.println("---------------GESTION BETA CORONAVIRUS------------");
        System.out.println("----------------1. Añadir campaña------------------");
        System.out.println("----------------2. Añadir donacion-----------------");
        System.out.println("----------------3. Mostrar campaña y donaciones----");
        System.out.println("----------------4. Mostrar campaña por nombre------");
        System.out.println("----------------5. Mostrar total dinero recaudado--");
        System.out.println("----------------6. Mostrar mayor donacion----------");
        System.out.println("----------------7. SALIR DEL MENU------------------");
        System.out.println("---------------------------------------------------");
    }

    /**
     * Método que pide al usuario el nombre de la campaña para crearla en el
     * mapa
     *
     * @param mapa
     */
    public static void añadirCampania(Map<String, Campania> mapa) {
        Scanner entrada = new Scanner(System.in);

        // Pedimos al usuario el nombre de la campaña
        System.out.println("Nombre de la nueva campaña: ");
        String nombre = entrada.nextLine();

        // Insertamos en el mapa: clave-> nombre, valor-> nuevo objeto Campania
        mapa.put(nombre, new Campania(nombre));

        System.out.println("Campaña registrada correctamente");
        
    }

    /**
     * Método que inserta una donación en una campaña específica
     *
     * @param mapa
     */
    public static void añadirDonacion(Map<String, Campania> mapa) {
        Scanner entrada = new Scanner(System.in);
        
        // Preguntamos al usuario a qué campaña va la donación
        System.out.println("¿A que campaña va la donación?");
        String buscada = entrada.nextLine();

        // Creamos un bucle while y usamos un iterador sobre las llaves del mapa
        Iterator<String> it = mapa.keySet().iterator();
        boolean encontrada = false;

        while (it.hasNext() && !encontrada) {
            if (it.next().equalsIgnoreCase(buscada)) {
                encontrada = true; // Ponemos a true si existe
            }
        }
        // Ponemos la información del donante, etc, si existe
        if (encontrada) {
            System.out.println("Nombre donante: ");
            String nombreDon = entrada.nextLine();
            System.out.println("Importe en euros: ");
            double importeDon = entrada.nextDouble();
            entrada.nextLine();

            // Accedemos al objeto Campania y añadimos la donación a su Set interno
            mapa.get(buscada).getListaDonaciones().add(new Donacion(nombreDon, importeDon));
        } else {
            System.out.println("Error. Esa campaña no existe");
        }
    }

    /**
     * Método que muestra todas las campañas y todas las donaciones
     *
     * @param mapa
     */
    public static void mostrarCampaniaYDonaciones(Map<String, Campania> mapa) {
        // Comprobamos si está vacío
        if (mapa.isEmpty()) {
            System.out.println("No hay campañas");
            return;
        }

        // Recorremos los valores
        for (Campania camp : mapa.values()) {
            System.out.println("Campaña: " + camp.getNombreCampania());

            // Recorremos el Set de donaciones de cada campaña
            for (Donacion donacion : camp.getListaDonaciones()) {
                System.out.println("Donante: " + donacion.getDonante() + " | Importe: "
                        + donacion.getImporte() + "€");
            }
        }
    }

    /**
     * Método que muestra el nombre de la campaña introducida por el usuario
     *
     * @param mapa
     */
    public static void buscarCampaniaPorNombre(Map<String, Campania> mapa) {
        Scanner entrada = new Scanner(System.in);

        // Pedimos al usuario el nombre de la campaña a buscar
        System.out.println("Nombre de campaña a buscar: ");
        String nombreCamp = entrada.nextLine();

        // Creamos un bucle while e iteramos sobre los valores del mapa
        Iterator<Campania> it = mapa.values().iterator();
        Campania encontrada = null;

        while (it.hasNext() && encontrada == null) {
            Campania actual = it.next();
            if (actual.getNombreCampania().equalsIgnoreCase(nombreCamp)) {
                encontrada = actual; // Almacenamos el objeto si coincide el nombre
            }
        }
        // Si la campaña es econtrada mostramos los datos
        if (encontrada != null) {
            for (Donacion donacion : encontrada.getListaDonaciones()) {
                System.out.println("- " + donacion.getDonante() + ": " + donacion.getImporte() + "€");
            }
        } else {
            System.out.println("Campaña no localizada");
        }
    }

    /**
     * Método que calcula todo el dinero recaudado
     *
     * @param mapa
     */
    public static void totalDineroRecaudado(Map<String, Campania> mapa) {
        double total = 0;

        // Recorremos todas las campañas
        for (Campania camp : mapa.values()) {
            // Recorremos todas las donaciones de cada campaña
            for (Donacion donacion : camp.getListaDonaciones()) {
                total += donacion.getImporte(); // Acumulamos los importes
            }
        }
        System.out.println("DINERO TOTAL RECAUDADO: " + total + "€");
    }

    /**
     * Método que muestra la mayor donación realizada
     *
     * @param mapa
     */
    public static void mostrarMaximaDonacion(Map<String, Campania> mapa) {
        double max = -1; // Lo ponemos en negativo para que la primera donacion ya sea la mayor
        String nombreMax = ""; // Para indicar al ganador

        // Pasamos por todas las campañas y donaciones para comparar
        for (Campania camp : mapa.values()) {
            for (Donacion donacion : camp.getListaDonaciones()) {
                if (donacion.getImporte() > max) {
                    max = donacion.getImporte(); // Actualizamos el mayor
                    nombreMax = donacion.getDonante();
                }
            }
        }

        if (max != -1) {
            System.out.println("LA MAYOR DONACION REGISTRADA: " + nombreMax + " con "
                    + max + "€");
        } else {
            System.out.println("No hay donaciones en el sistema todavía");
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // MAPA GLOBAL: La clave es el nombre (String) y el valor el objeto Campania
        Map<String, Campania> mapaCampanias = new HashMap<>();

        // Creamos el menú controlando excepciones
        int opcion = 0;

        do {
            try {
                mostrarMenu();
                opcion = entrada.nextInt();
                entrada.nextLine();

                switch (opcion) {
                    case 1:
                        añadirCampania(mapaCampanias);
                        break;
                    case 2:
                        añadirDonacion(mapaCampanias);
                        break;
                    case 3:
                        mostrarCampaniaYDonaciones(mapaCampanias);
                        break;
                    case 4:
                        buscarCampaniaPorNombre(mapaCampanias);
                        break;
                    case 5:
                        totalDineroRecaudado(mapaCampanias);
                        break;
                    case 6:
                        mostrarMaximaDonacion(mapaCampanias);
                        break;
                    case 7:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción incorrecta");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error. Has introducido una letra");

//            } catch (NullPointerException e) {
//                System.out.println("Error. Hay posiciones nulas");

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error. Posición fuera de rango");

//            } catch (Exception e) {
//                System.out.println("Error desconocido");
//                entrada.nextLine();
            }

        } while (opcion != 7);

    }

}
