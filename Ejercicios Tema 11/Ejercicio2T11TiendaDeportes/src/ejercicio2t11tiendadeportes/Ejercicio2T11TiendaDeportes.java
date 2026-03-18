package ejercicio2t11tiendadeportes;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Realizar un programa en JAVA en el realices la gestión de una pequeña tienda
 * de deportes. Ayudate de un HashMap, donde el campo Clave será un código de
 * producto (Integer o String, como prefieras), y el campo Value será un objeto
 * de la clase Producto.
 *
 * • La clase Producto tendrá 3 atributos: • Nombre del producto: de tipo
 * String. • Precio: de tipo float. • Stock: de tipo int.
 *
 * • Se le mostrarán al usuario un menú con 3 opciones:
 *
 * 1. MENU DE ADMINISTRACIÓN
 *
 * 2. MENÚ DE COMPRA
 *
 * 3. SALIR
 *
 * MENU DE ADMINISTRACIÓN:
 *
 * Se visualizará el siguiente submenú:
 *
 * 1. Introducir productos en la lista: Pediremos los datos de un producto al
 * usuario y lo introducimos en el HashMap.
 *
 * 2. Visualizar todos los productos.
 *
 * 3. Eliminar productos de la lista: Pediremos el código del producto y lo
 * eliminaremos.
 *
 * 4. Volver al menú principal.
 *
 * MENU DE COMPRA:
 *
 * 1. Comprar productos:
 *
 * • Mostramos una lista con los productos a comprar.
 *
 * • El usuario elegirá que producto comprar (el código) y luego le
 * preguntaremos cuantas unidades desea de él. Luego se le preguntará si desea
 * comprar otro producto o salir.
 *
 * • Por último, se le mostrará el importe total de la compra.
 *
 * • Date cuenta de que necesitarás actualizar el valor del stock de un producto
 * cuando el usuario lo compre. En caso de que el usuario pida más unidades de
 * las que quedan se le avisará por pantalla del error, se le comunicarán las
 * unidades restantes y le preguntará si desea comprar otro producto.
 *
 * 2. Volver al menú principal.
 *
 * @author KevinNS
 */
public class Ejercicio2T11TiendaDeportes {

    /**
     * Método que muestra el submenú administración
     *
     * @param mapa
     */
    public static void menuAdministracion(HashMap<Integer, Producto> mapa) {
        Scanner entrada = new Scanner(System.in);

        // Creamos el menú controlando excepciones
        int opcion = 0;
        do {
            try {
                System.out.println("---------------------------------------------------");
                System.out.println("--------BIENVENIDO AL MENU DE ADMINISTRACION-------");
                System.out.println("------------1. Introducir productos----------------");
                System.out.println("------------2. Visualizar productos----------------");
                System.out.println("------------3. Eliminar productos------------------");
                System.out.println("------------4. SALIR DEL MENU----------------------");
                System.out.println("---------------------------------------------------");
                opcion = entrada.nextInt();

                switch (opcion) {
                    case 1:
                        añadirProducto(mapa);
                        break;
                    case 2:
                        mostrarInventario(mapa);
                        break;
                    case 3:
                        eliminarProducto(mapa);
                        break;
                    case 4:
                        System.out.println("Saliendo del menú.....");
                        break;
                    default:
                        System.out.println("Opción incorrecta");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error. Has introducido una letra");
                entrada.nextLine();
            }

        } while (opcion != 4);

    }
    
    /**
     * Método que pide los datos del producto
     * 
     * @param mapa 
     */
    public static void añadirProducto(HashMap<Integer, Producto> mapa){
        Scanner entrada = new Scanner(System.in);
        
        // Pedimos los datos del producto
        System.out.println("Código único del producto: ");
        int codProd = entrada.nextInt();
        entrada.nextLine();
        
        System.out.println("Introduce los datos del producto: ");
        System.out.println("Nombre del producto: ");
        String nombreProd = entrada.nextLine();
        System.out.println("Precio del producto: ");
        float precioProd = entrada.nextFloat();
        System.out.println("Stock del producto: ");
        int stockProd = entrada.nextInt();
        
        // Metemos el producto en el mapa
        mapa.put(codProd, new Producto(nombreProd, precioProd, stockProd));
        System.out.println("Producto registrado");
    }
    
    /**
     * Método que muestra el inventario
     * 
     * @param mapa 
     */
    public static void mostrarInventario(HashMap<Integer, Producto> mapa){
        // Comprobamos si el almacén está vacío
        if (mapa.isEmpty()) {
            System.out.println("Almacén vacío");
            return;
        }
        
        // Recorremos las claves para mostrar los productos
        for (Integer codigo : mapa.keySet()) {
            Producto prod = mapa.get(codigo);
            System.out.println("ID: " + codigo + " | " + prod.getNombreProducto() 
                    + " (" + prod.getPrecio() + "€) Stock: " + prod.getStock());
        }
    }
    
    /**
     * Método que elimina el producto elegido
     * 
     * @param mapa 
     */
    public static void eliminarProducto(HashMap<Integer, Producto> mapa){
        Scanner entrada = new Scanner(System.in);
        
        // Pedimos el producto a eliminar
        System.out.println("Código a eliminar: ");
        int borrado = entrada.nextInt();
        
        if (mapa.remove(borrado) != null) {
            System.out.println("Eliminado con éxito");
        }else{
            System.out.println("Código no encontrado");
        }
    }

    /**
     * Método que muestra el submenú compra
     *
     * @param mapa
     */
    public static void menuCompra(HashMap<Integer, Producto> mapa) {
        Scanner entrada = new Scanner(System.in);

        // Creamos el menú controlando excepciones
        int opcion = 0;
        do {
            try {
                System.out.println("---------------------------------------------------");
                System.out.println("------------BIENVENIDO AL MENU DE COMPRA-----------");
                System.out.println("------------1. Comprar productos-------------------");
                System.out.println("------------2. Volver al menú principal------------");
                System.out.println("---------------------------------------------------");
                opcion = entrada.nextInt();

                switch (opcion) {
                    case 1:
                        realizarCompra(mapa);
                        break;
                    case 2:
                        System.out.println("Volviendo al menú principal");
                        break;
                    default:
                        System.out.println("Opción incorrecta");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error. Has introducido una letra");
                entrada.nextLine();
            }

        } while (opcion != 2);

    }
    
    public static void realizarCompra(HashMap<Integer, Producto> mapa){
        Scanner entrada = new Scanner(System.in);
        
        // Comprobamos si hay productos
        if (mapa.isEmpty()) {
            System.out.println("No hay productos en la tienda todavía");
            return;
        }
        
        float importeTotal = 0;
        String continuar = "si";
        
        // Creamos un bucle para permitiar comprar varios productos seguidos
        while (continuar.equalsIgnoreCase("si")) {
            // Mostramos la lista de productos para que vea los códigos
            System.out.println("----PRODUCTOS EN STOCK----");
            for (Integer id : mapa.keySet()) {
                Producto prod = mapa.get(id); // Sacamos el objeto del mapa usando la clave
                System.out.println("CODIGO: " + id + " | " + prod.getNombreProducto() 
                        + " PRECIO: " + prod.getPrecio() + "€ (STOCK: " + prod.getStock() + ")");
            }
            
            // Elegir producto y unidades
            System.out.println("Introduce el código del producto a comprar: ");
            int codigo = entrada.nextInt();
            
            // Verificamos si ese código existe
            if (mapa.containsKey(codigo)) {
                Producto prod = mapa.get(codigo);
                System.out.println("¿Cuántas unidades de: " + prod.getNombreProducto() 
                        + " quieres?");
                int cantidad = entrada.nextInt();
                
                // Controlamos el stock
                if (cantidad <= prod.getStock()) {
                    importeTotal += (prod.getPrecio() * cantidad); // Sumamos al ticket
                    prod.setStock(prod.getStock() - cantidad); // Actualizamos el stock del producto
                    System.out.println("Añadido al carrito con éxito");
                }else{
                    // Si no hay suficiente avisamos y decimos cuánto queda
                    System.out.println("Error. No hay suficiente stcok. Solo quedan " 
                            + prod.getStock() + " unidades");
                }
                // Preguntamos si desea otro producto
                System.out.println("¿Quieres comprar otro producto? (si/no): ");
                continuar = entrada.next();
            }
            // Mostramos el improte final
            System.out.println("EL IMPORTE TOTAL DE SU COMPRA ES: " + importeTotal + " Eeuros");
        }
        
    }

    /**
     * Método que muestra el menú principal
     */
    public static void mostrarMenu() {
        System.out.println("---------------------------------------------------");
        System.out.println("------------GESTION TIENDA DE DEPORTES-------------");
        System.out.println("--------------1. MENU ADMINISTRACION---------------");
        System.out.println("--------------2. MENU DE COMPRA--------------------");
        System.out.println("--------------3- SALIR DEL PROGRAMA----------------");
        System.out.println("---------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Creamos el mapa
        HashMap<Integer, Producto> inventario = new HashMap<>();

        // Creamos el menu controlando excepciones
        int opcion = 0;

        do {
            try {
                mostrarMenu();
                opcion = entrada.nextInt();
                switch (opcion) {
                    case 1:
                        menuAdministracion(inventario);
                        break;
                    case 2:
                        menuCompra(inventario);
                        break;
                    case 3:
                        System.out.println("Saliendo del programa....");
                        break;
                    default:
                        System.out.println("Opción incorrecta");
                }

            } catch (InputMismatchException e) {
                System.out.println("ERROR. Has introducido una letra");
                entrada.nextLine();
            }

        } while (opcion != 3);

    }

}
